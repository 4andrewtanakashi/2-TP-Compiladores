parser grammar javalessParser;

options { tokenVocab=javalessLexer; }

compilationUnit: packageSyntax? importSyntax* typeDeclaration* EOF;

packageSyntax: PAC qualifiedIdentifier ';' ;

importSyntax: IMP STA? qualifiedIdentifier (PTR TIM)?  ';' ;

typeDeclaration: modifiers* (classDeclaration) | ';' ;

classDeclaration: CLA Identifier (EXT typeType)? classBody;

classBody: KOP memberDecl* KCL;

memberDecl: ';' | STA? block | modifiers* classDeclaration;

block: KOP blockStatement* KCL;

blockStatement: localVariableDeclarationStatement ';'
              | statement
              | localTypeDeclaration;

localTypeDeclaration: modifiers* (classDeclaration) | ';' ;

statement: blockLabel=block
           | IF parExpression statement (ELS statement)?
           | WHI parExpression statement
           | RET expression? ';'
           | statementExpression=expression
           | EndL ;

parExpression: AP expression FP ;

methodCall: Identifier '(' expressionList? ')'
                | THIS '(' expressionList? ')'
                | SUPER '(' expressionList? ')'
                ;

expressionList: expression (',' expression)* ;

localVariableDeclarationStatement: typeType variableDeclarators ;

variableDeclarators: variableDeclarator (COMA variableDeclarator)* ;

variableDeclarator: variableDeclaratorId (Atrib variableInitializer)? ;

variableDeclaratorId: Identifier (VOP VCL)* ;

variableInitializer: arrayInitializer | expression ;

arrayInitializer: KOP (variableInitializer (COMA variableInitializer)* (COMA)? )? KCL;

arguments: AP (expression  (COMA expression)* )? FP;

//type: referenceType | basicType;

basicType: BOO | CHA | INT;

//referenceType: basicType VOP VCL (VOP VCL)* | qualifiedIdentifier (VOP VCL)* ;

expression: primary
            | expression bop='.'
                  ( Identifier
                  | methodCall
                  | THIS
                  | SUP superSuffix
                  )
            | expression VOP expression VCL
            | methodCall
            | NEW creator
            | '(' typeType ')' expression
            | expression postfix=('++' | '--')
            | prefix=('+'|'-'|'++'|'--') expression
            | prefix='!' expression
            | expression '*' expression
            | expression bop=('+'|'-') expression
            | expression bop=('<=' | '>') expression
            | expression bop=INS typeType
            | expression '==' expression
            | expression bop='&&' expression
            | <assoc=right> expression
              bop=('=' | '+=')  expression ;

//expression: assignmentExpression ;
//
//assignmentExpression: conditionalAndExpression ( (Atrib | AtrArit) assignmentExpression)? ;
//
//conditionalAndExpression: equalityExpression (AND equalityExpression)* ;
//
//equalityExpression: relationalExpression ( relationalExpression)* ;
//
//relationalExpression: additiveExpression ( (LT | LTE) additiveExpression | INS referenceType)? ;
//
//additiveExpression: multiplicativeExpression ( (PLU | )  multiplicativeExpression )* ;
//
//multiplicativeExpression: unaryExpression (TIM unaryExpression)*;
//
//unaryExpression: PPL unaryExpression
//               | SSB unaryExpression
//               | simpleUnaryExpression;
//
//simpleUnaryExpression: NOT unaryExpression
//                     | '(' basicType ')' unaryExpression //CAST
//                     | '(' referenceType ')' simpleUnaryExpression //CAST
//                     | postfixExpression;
//
//postfixExpression: primary (selector)* postfix=('++' | '--');

//formalParameters: AP formalParameter? FP ;
//
//formalParameter: parameter (',' parameter)* ;
//
//parameter: type Identifier ;

//selector: bop='.' qualifiedIdentifier (arguments)? | VOP expression VCL;

primary: parExpression
       | THIS
       | SUP
       | literal
       | Identifier
       | typeTypeOrVoid '.' CLA ;

creator: basicType
       | basicType (arrayCreatorRest | classCreatorRest);

arrayCreatorRest:
    '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
                      ;
classCreatorRest
    : arguments classBody?
    ;

//newArrayDeclarator: '[' expression ']' ('[' expression ']')*  ('['']')* ;

typeTypeOrVoid
    : typeType
    | VOI
    ;

modifiers: PRI | PUB | PRO | STA | ABS;

typeType: basicType (VOP VCL)* ;

superSuffix
    : arguments
    | '.' IDENTIFIER arguments?
    ;

qualifiedIdentifier: Identifier (PTR Identifier)*;

literal: Numl
       | CharLiteral
       | StringLiteral
       | BoolLiteral
       | NUL
     ;
