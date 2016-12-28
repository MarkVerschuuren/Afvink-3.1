import java.util.*;

/**
 * Created by Mark Verschuuren on 28-12-2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your syntax here! \n");
        String Syntax = Input.nextLine();
        SynthaxChecker SynthaxObJ = new SynthaxChecker(Syntax);


    }
}
