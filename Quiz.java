package mathGame;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quiz{
//Random Addition or Subtraction
public static String MathSymbol(){
	int mathSymbol = 0;
	String Mathematics = " ";
	mathSymbol = (int)(Math.random()*100)%2;
	if (mathSymbol == 0){
		return "+";
	}
	else{
		return "-";	
	}
}
//Random Multiplication or Division
public static String MultDiv(){
	int mathSymbol = 0;
	String Mathematics = " ";
	mathSymbol = (int)(Math.random()*100)%2;
	if (mathSymbol == 0){
		return "x";
	}
	else{
		return "/";	
	}
}
//Creates and holds the problems in an array Questions
public static void main(String[]args){
	int numfamily = 0;//holds num family number for problem creation 0-12
	ArrayList<String> Questions = new ArrayList<String>();//holds the questions to add to the game by frame numbers
	/*int mathSymbol = 0;
	mathSymbol = (int)(Math.random()*100)%2;
	if (mathSymbol == 0){
		String Mathematics = "+";
	}
	else{
		String Mathematics = "-";	
	}*/
	for (int i= 0; Questions.size() <= 15;i++){// 3 will be changed to gameMOde based on the number of squares
		int problemPiece = (int)(Math.random()*100);
		String callMath = " ";
		callMath = MultDiv();
		Questions.add(numfamily + callMath + problemPiece);
	}
	System.out.print(Questions);
	
	}
}