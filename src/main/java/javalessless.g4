lexer grammar javalessless;

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

//Operadores:
Atrib: '=';
AtrArit: '+=';
OpBool: '==' | '>' | '&&' | '<=';
OpUni: '!'| '++' | '--';
OpArit: '-' | '+' | '*';

//Separadores:
VOP: '[';
VCL: ']';
KOP: '{';
KCL: '}';
AP: '(';
FP: ')';

WORD : 'a'..'z'|'A'..'Z';
Numl: '0'..'9';
NumR: Numl'.'Numl;
OBJ: Var'.'Var;
Var: WORD (WORD|Numl|'_')*;
Str: '"' (~('\\'|'"') ) * '"';
EndL: ';';
PTR: '.';

NEWLINE: 'r'?'\n';
WS : [ \t]+ -> skip;
Comment: '//'.+;