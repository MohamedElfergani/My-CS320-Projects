grammar tree;

// parser rules
program: declaration* statement* clazz*;

declaration: TYPE VAR (';'declaration)* ';' ;

statement: assignstmt   
        | printstmt
        | ifstmt
        | returnstmt
        ;

clazz: 'class' identifier '{' body '}' ;

identifier: STRING 
    	| VAR
    	;

body: statement* block 
	| statement clazz 
	| block* 
	| declaration method ;

method: TYPE identifier '()' block;

block: '{'block'}'
     | '{'statement'}' ;

printstmt: 'print' term ';' ;
  
assignstmt: VAR assignstmt
	| VAR '=' expression ';'
   	| 'identifier' assignstmt
	;    

ifstmt: 'if' '(' identifier '==' expression ')' statement* 'endif'
;

returnstmt: 'return' expression ';' ;

expression: term | (term (OPERATOR) term)* ;

term: identifier 
    | integer	
    ; 

integer: NUMBER ;


// Toxens/Lexer 
STRING: '"'[a-zA-Z0-9,' /:.]+'"';
NUMBER: [0-9]+;
TYPE: 'int';
SIGN:[=]+;
VAR: [a-zA-Z][a-zA-Z0-9]*;
OPERATOR: [*/+-]+;
WS:[ \n\t\r]+->skip;