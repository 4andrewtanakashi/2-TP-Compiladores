#ETAPA 1 : Trabalho de Compiladores :

O analisador léxico deverá ser implementado usando o gerador ANTLR . Ele deverá retornar, a cada cha-
mada, o token reconhecido.
Além de reconhecer os tokens da linguagem, o analisador léxico deverá detectar possı́veis erros e reportá-los
ao usuário. Além disso, deve-se também criar uma Tabela de Sı́mbolos (TS). Lembra-se que apenas ID são
armazenados na TS. O programa deverá informar o erro e seu local (linha e coluna).
Lembre-se que espaços em branco (espaços, tabulações, quebras de linha, etc.) e comentários não são tokens.
Portanto, devem ser descartados.
Faça também um programa para testar o analisador léxico. Este programa deve imprimir a linha, a coluna,
o lexema e o tipo do token que foi identificado.
Lembre-se também de criar e mostrar a Tabela de Simbolos similar a tabela apresentada em aula.
