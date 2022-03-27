grammar JSON1; 

//Parser Rules

object:'{'pair (',' pair)*'}' | '{' '}';
pair: STRING ':' value; 

value:STRING 
	| NUMBER
	| array
	| object;


array: '['value (','value)*']'
		| '['']';

//Tokens Rules
STRING: '"'[a-zA-Z,'/:.]+'"';
NUMBER: [0-9]+;
WS:[ \n\t\r]+->skip;

