package mathGame;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Quiz{
//Random Addition or Subtraction
public static String MathSymbol(){
	int mathSymbol = 0;
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

public static String getMath(String string){
	String Oper = string;
	return Oper;
}

public static ArrayList<String> Equations(int X, int numfamily){
		ArrayList<String> Questions = new ArrayList<String>();//holds the questions to add to the game by frame numbers
		for (int i = 0; Questions.size() <= X;i++){
			int problemPiece = (int)(Math.random()*100);
			String callMath = " ";
			try{
			callMath = getMath("+");
			} catch (Exception e) {
				e.printStackTrace();
			}

			Questions.add(numfamily + callMath + problemPiece);//Adds math problems to and array
		}
	return Questions;
}
//Decides if the problem is correct
public static boolean MathChecker(String[] Quiz){ 
	String guess = JOptionPane.showInputDialog("Guess: ?");
	int gParse = Integer.parseInt(guess);
	int Answers[] = new int[Quiz.length];
	for(int z = 0; Quiz.length<z;z++){
		String value = Quiz[z];
		int newValue = Integer.parseInt(value);
		System.out.println(newValue);
		Answers[z]= newValue;
	}
	boolean result = false;
	for(int i = 0; i< 3; i++){
		if (gParse == Answers[i]){//Supposed to check to see if the users guess is equal to to the result of the math problem
			result = true;
		}
		else{
			result = false;
			guess = JOptionPane.showInputDialog("Guess Again: ?");
			gParse = Integer.parseInt(guess);
		}
	}
System.out.println(Answers);
return result;
}

//Creates and holds the problems in an array Questions
public static void main(String[]args){
	ArrayList<String> Questions = Equations(7,0);
	System.out.print(Questions);
	Image[] imgs = null;
	imgs = MathViewer.splitImage("bear.jpg", 4, 4, false);
	MathViewer mv = new MathViewer(imgs);
	

		}
	}
