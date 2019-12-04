parser grammar javalessParser;

options { tokenVocab=javalessLexer; }

compilationUnit: packageSyntax? importSyntax* typeDeclaration* EOF;

packageSyntax: PAC qualifiedIdentifier ';' ;

importSyntax: IMP STA? qualifiedIdentifier (PTR TIM)?  ';' ;

typeDeclaration: modifiers* (classDeclaration) | ';' ;

classDeclaration: CLA Identifier (EXT typeType)? classBody;

classBody: KOP classBodyDeclaration*  KCL;


classBodyDeclaration: ';'
                    | STA? block
                    | modifiers* memberDecl
                          ;


memberDecl: methodDeclaration
            | constructorDeclaration
            | fieldDeclaration
            | classDeclaration;

methodDeclaration: typeTypeOrVoid Identifier formalParameters ('[' ']')*  methodBody ;

block: KOP blockStatement* KCL;

blockStatement: localVariableDeclarationStatement ';'
              | statement
              | localTypeDeclaration;

methodBody
    : block
    | ';'
    ;

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
                | SUP '(' expressionList? ')'
                ;

expressionList: expression (',' expression)* ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    :  typeType variableDeclaratorId
    ;


localVariableDeclarationStatement: typeType variableDeclarators ;

variableDeclarators: variableDeclarator (COMA variableDeclarator)* ;

variableDeclarator: variableDeclaratorId (Atrib variableInitializer)? ;

variableDeclaratorId: Identifier (VOP VCL)* ;

variableInitializer: arrayInitializer | expression ;

arrayInitializer: '{' (variableInitializer (',' variableInitializer)* (',')? )? '}' ;

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

constructorDeclaration: Identifier formalParameters  constructorBody=block ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

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
    | Identifier
    ;

modifiers: PRI | PUB | PRO | STA | ABS;

typeType: (basicType) (VOP VCL)* ;

superSuffix
    : arguments
    | '.' Identifier arguments?
    ;

qualifiedIdentifier: Identifier (PTR Identifier)*;

literal: Numl
       | CharLiteral
       | StringLiteral
       | BoolLiteral
       | NUL
     ;
