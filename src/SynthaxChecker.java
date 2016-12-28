/**
 * Created by Mark Verschuuren on 28-12-2016.
 */
import java.util.*;
public class SynthaxChecker {
    public SynthaxChecker(String Syntax){
        Stack Box = new Stack();
        int roundbracket = 0;
        int squarebracket = 0;
        int curlybracket = 0;

        for(char c: Syntax.toCharArray()){
            if(Character.toString(c).equals("(")){
                roundbracket++;
            }
            if(Character.toString(c).equals(")")){
                roundbracket--;
            }
            if(Character.toString(c).equals("[")){
                squarebracket++;
            }
            if(Character.toString(c).equals("]")){
                squarebracket--;
            }
            if(Character.toString(c).equals("{")){
                curlybracket++;
            }
            if(Character.toString(c).equals("}")){
                curlybracket--;
            }

        }
        if(roundbracket < 0){
            Box.push("To much ')'");
        }
        if(roundbracket > 0){
            Box.push("To much '('");
        }
        if(squarebracket < 0){
            Box.push("To much ']'");
        }
        if(squarebracket > 0){
            Box.push("To much '['");
        }
        if(curlybracket < 0){
            Box.push("To much '}'");
        }
        if(curlybracket > 0){
            Box.push("To much '{'");
        }
        System.out.println(Box);

    }
}
