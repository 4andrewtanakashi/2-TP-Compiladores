lexer grammar javalessless;
//
//// Casos de Erro:
//Error1: Numl(Var);
//Error2:

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

Var: (WORD | '_' | '$')(Numl | '_' | WORD )*;
NumR: Numl'.'Numl | NNuml'.'Numl;

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

Str: '"' (~('\\'|'"') ) * '"';
EndL: ';';
PTR: '.';
COMA: ',';

NEWLINE: ('\r'? '\n' | '\r')+;
WS : ( '\t' | ' ' | '\r' | '\n' | '\u000c')+ -> skip;
Comment: '//' ~[\r\n]* -> skip;

LOWW: 'a'..'z';
UPPW: 'A'..'Z';
Numl: ('0'..'9')+;
NNuml: '-'Numl;
WORD: (LOWW | UPPW)+;
MODV: PRI | PUB | PRO;
