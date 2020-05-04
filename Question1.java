import java.util.Scanner;
import java.lang.*;

public class Question1 {
	/*Global Decs*/
	int charClass;
	char lexeme[];
	char nextChar;
	int lexLen;
	int token;
	int nextToken;
	Scanner input = new Scanner(System.in);
	/*Function Stuff*/
	void lookup(char ch){
		
	}
	void addChar (){
		
		
	}
	void getChar (){
		
	}
	void getNonBlank(){
		
	}
	int lex(){
		
	}
	
	/*Classes*/
	final char LETTER = 0;
	final int DIGIT = 1;
	final int  UNKNOWN = 99;
	
	/*TOKENS*/
final int INTL_IT= 10;
final int IDENT = 11;
final int ASSIGN_OP = 20;
final int ADD_OP = 21;
final int SUB_OP = 22;
final int MULT_OP =23;
final int DIV_OP = 24;
final int Left_PARA = 25;
final int Right_PARA = 26;

 


	
	
		
		
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 {
		/* Open the input data file and process its contents */
		if
		 ((input = fopen("front.in", "r")) == NULL)
		    System.out.println("ERROR - cannot open front.in \n");
		else
		 {
		    getChar();
		do
		 {
		      lex();
		    } 
		while
		 (nextToken != EOF);
		  }
		return
		 0;
		}
		/******************************************************/
		/* lookup - a function to look up operators and
		            parentheses and return the token */
		int
		 lookup(
		char
		 ch) {
		switch
		 (ch) {
		case
		 '(':
		      addChar();
		      nextToken = LEFT_PAREN;
		break
		;
		case
		 ')':
		      addChar();
		      nextToken = RIGHT_PAREN;
		break
		;
		case
		 '+':
		      addChar();
		      nextToken = ADD_OP;
		break
		;
		case
		 '-':
		      addChar();
		      nextToken = SUB_OP;
		break
		;
		case
		 '*':
		      addChar();
		      nextToken = MULT_OP;
		break
		;
		case
		 '/':
		      addChar();
		      nextToken = DIV_OP;
		break
		;
		default
		:
		      addChar();
		      nextToken = EOF;
		break
		;
		  }
		return
		 nextToken	
		
			
		

	

}
}