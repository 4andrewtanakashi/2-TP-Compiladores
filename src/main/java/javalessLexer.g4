lexer grammar javalessLexer;

// Palavras Reservadas:
ABS: 'abstract';
EXT: 'extends';
PRI: 'private';
PRO: 'protected';
PUB: 'public';
CLA: 'class';
THIS: 'this';
NEW: 'new';
NUL: 'null';
IMP: 'import';
PAC: 'package';
RET: 'return';
SUP: 'super';
IF: 'if';
WHI: 'while';
ELS: 'else';
INS: 'instanceof';
INT: 'int';
CHA: 'char';
VOI: 'void';
BOO: 'boolean';
STA: 'static';
FAL: 'false';
TRU: 'true';

Identifier: Letter LetterOrDigit* ;
Numl:   ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
CharLiteral: '\'' (~['\\\r\n] | EscapeSequence) '\'';
StringLiteral: '"' (~["\\\r\n] | EscapeSequence)* '"';
BoolLiteral: TRU | FAL ;

//Operadores:
Atrib: '=';
AtrArit: '+=';

AND: '&&';
EQL: '==';
LT: '>';
LTE: '<=';
PLU: '+';
SUB: '-';
TIM: '*';
PPL : '++';
SSB: '--';
NOT: '!';

//Separadores:
VOP: '[';
VCL: ']';
KOP: '{';
KCL: '}';
AP: '(';
FP: ')';

Str: '"' (~('\\'|'"') ) * '"';
EndL: ';';
PTR: '.';
COMA: ',';

WS: [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT: '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);

LOWW: 'a'..'z';
UPPW: 'A'..'Z';
WORD: (LOWW | UPPW)+;
//MODV: (PRI | PUB | PRO);

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;

fragment LetterOrDigit
    : Letter
    | [0-9]
    ;

fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    ;