parser grammar javalessParser;

options { tokenVocab=javalessLexer; }

compilationUnit: packageSyntax? importSyntax* typeDeclaration* EOF;

packageSyntax: PAC qualifiedIdentifier ';' ;

importSyntax: IMP STA? qualifiedIdentifier PTR?  ';' ;

typeDeclaration: modifiers* classDeclaration;

classDeclaration: CLA Identifier (EXT qualifiedIdentifier)? classBody;

classBody: KOP memberDecl* KCL;

memberDecl: STA? block;

block: KOP blockStatement KCL;

blockStatement: localVariableDeclarationStatement ';' | statement;

statement: blockLabel=block
           | IF parExpression statement (ELS statement)?
           | WHI parExpression statement
           | RET expression? ';'
           | ';'
           | statementExpression=expression ;

formalParameters: AP formalParameter? FP ;

formalParameter: parameter (',' parameter)* ;

parameter: type Identifier ;

parExpression: AP expression FP ;

localVariableDeclarationStatement: type variableDeclarators ;

variableDeclarators: variableDeclarator (COMA variableDeclarator)* ;

variableDeclarator: variableDeclaratorId (Atrib variableInitializer)? ;

variableDeclaratorId: Identifier (VOP VCL)* ;

variableInitializer: arrayInitializer | expression ;

arrayInitializer: KOP (variableInitializer (COMA variableInitializer)* (COMA)? )? KCL;

arguments: AP (expression  (COMA expression)* )? FP;

type: referenceType | basicType;

basicType: BOO | CHA | INT;

referenceType: basicType VOP VCL (VOP VCL)* | qualifiedIdentifier (VOP VCL)* ;

expression: assignmentExpression ;

assignmentExpression: conditionalAndExpression ( (Atrib | AtrArit) assignmentExpression)? ;

conditionalAndExpression: equalityExpression (AND equalityExpression)* ;

equalityExpression: relationalExpression ( relationalExpression)* ;

relationalExpression: additiveExpression ( (LT | LTE) additiveExpression | INS referenceType)? ;

additiveExpression: multiplicativeExpression ( (PLU | )  multiplicativeExpression )* ;

multiplicativeExpression: unaryExpression (TIM unaryExpression)*;

unaryExpression: PPL unaryExpression
               | SSB unaryExpression
               | simpleUnaryExpression;

simpleUnaryExpression: NOT unaryExpression
                     | '(' basicType ')' unaryExpression //CAST
                     | '(' referenceType ')' simpleUnaryExpression //CAST
                     | postfixExpression;

postfixExpression: primary (selector)* postfix=('++' | '--');

selector: bop='.' qualifiedIdentifier (arguments)? | VOP expression VCL;

primary: parExpression
       | THIS (arguments)?
       | SUP (arguments | bop='.' Identifier (arguments)? )
       | literal
       | NEW creator
       | qualifiedIdentifier (arguments)? ;

creator: (basicType | qualifiedIdentifier)  ( arguments
                                            | '[' ']' ('[' ']')* (arrayInitializer)?
                                            | newArrayDeclarator ) ;

newArrayDeclarator: '[' expression ']' ('[' expression ']')*  ('['']')* ;

modifiers: MODV | STA | ABS;

qualifiedIdentifier: Identifier (PTR Identifier)*;

literal: INT | CHA | TRU | FAL | NUL | Str ;
