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

// Casos de Erro:
Error1: Numl(Identifier);
Error2: 'abtract';
Error3: 'etends' | 'estends';
Error4: 'privte';
Error5: 'cass';
Error6: 'proted' | 'procted';
Error7: 'iff' | 'iif';
Error8: 'wile' | 'whille';
Error9: 'instancof';
Error10: 'bool';
Error11: (WORD | Numl)*(ABS | EXT | PRI | PRO | PUB | CLA | THIS | NEW | NUL | IMP | PAC | RET | SUP | WHI | ELS | INS | CHA | VOI | BOO | STA | FAL | TRU)(Identifier)+;


Identifier: (WORD | '_' | '$')(Numl | '_' | WORD )*;
NumR: Numl'.'Numl | NNuml'.'Numl;

//Operadores:
Atrib: '=';
AtrArit: '+=';
OpBool: EQL | LT | AND | LTE;
OpUni: NOT| PPL | SSB;
OpArit: SUB | PLU | TIM;

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

NEWLINE: ('\r'? '\n' | '\r')+;
WS : ( '\t' | ' ' | '\r' | '\n' | '\u000c')+ -> skip;
Comment: '//' ~[\r\n]* -> skip;

LOWW: 'a'..'z';
UPPW: 'A'..'Z';
Numl: ('+' |' -')?('0'..'9')+;
NNuml: '-'Numl;
WORD: (LOWW | UPPW)+;
MODV: PRI | PUB | PRO;
