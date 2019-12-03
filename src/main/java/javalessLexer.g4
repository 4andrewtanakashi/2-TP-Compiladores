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

Identifier: (WORD | '_' | '$')(Numl | '_' | WORD )*;
NumR: (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
                   |       Digits (ExponentPart [fFdD]? | [fFdD])
                   ;

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
Numl:   ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
WORD: (LOWW | UPPW)+;
MODV: (PRI | PUB | PRO);

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;