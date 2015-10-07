# LexSyntactics

Departamento de Ciência da Computação, UNIVALI

Disciplina de Linguagens formais e autômatos

Professor Rafael de Santiago, MSc.

Acadêmicos Aílton Cardoso Júnior e João Felipe Gonçalves


Objetivo: exercitar os conteúdos vistos em sala sobre linguagens livres de contexto, sob perspectiva de compiladores.

--
| Comando  | Instrução |
| ------------- | ------------- |
| Pular linha  | \| |
| Titulo | [titulo] |
| Negrito | +palavra+ |
| Tachado | \~~palavra\~~ |
| Italico | /palavra/ |

--
###Definições regulares

variavel:[a-zA-Z0-9\s]*

ponto: \.

ignoraveis:[\n\t]+

###Tokens
:{ignoraveis}

variavel:{variavel}

ponto: {ponto}

pula:"|"

A_titulo:"["

F_titulo:"]"

negrito:"+"

risca:"~~"

italico:"/"

###Gramática
\<A> ::= A_titulo variavel#1 F_titulo <A> | negrito variavel#2 negrito <A>| italico variavel#3 italico <A> | risca variavel#4 risca <A>| variavel#5<A> | pula#6<A> | ponto#7 | î;
 
