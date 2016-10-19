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

//Random math problem of any kind
public static String Rand(){
	int mathSymbol = 0;
	String Mathematics = " ";
	mathSymbol = (int)(Math.random()*100)%4;
	if (mathSymbol == 0){
		return "x";
	}
	else if(mathSymbol == 1){
		return "/";	
	}
	else if(mathSymbol == 2){
		return "+";	
	}
	else{
		return "-";
	}
}

//Decides if the problem is correct
public static boolean MathChecker(int guess){
	for(int i = 0; i< 3; i++){
		if (guess == Questions[current]){//Supposed to check to see if the users guess is equal to to the result of the math problem
			return true;
		}
	}
}


//Creates and holds the problems in an array Questions
public static void main(String[]args){
	int numfamily = 0;//holds num family number for problem creation 0-12 from user input
	ArrayList<String> Questions = new ArrayList<String>();//holds the questions to add to the game by frame numbers
	for (int i= 0; Questions.size() <= 15;i++){// 3 will be changed to gameMOde based on the number of squares
		int problemPiece = (int)(Math.random()*100);
		String callMath = " ";
		callMath = Rand();//Change for user input when one or both clicked
		Questions.add(numfamily + callMath + problemPiece);//Adds math problems to and array
	}
	System.out.print(Questions);
	
	}
}