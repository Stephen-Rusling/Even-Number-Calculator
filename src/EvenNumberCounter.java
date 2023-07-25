// ****************************************************************************************************************
// EvenNumberCounter.java
//
// Program that counts any even digits of 0, 2, 4, 6 & 8 in a given string. Also counts other characters given in
// user input.
// ****************************************************************************************************************
import java.util.Scanner;


public class EvenNumberCounter
{
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.print("Hello and welcome, please enter some text (Q to quit): ");
            int zeroCount = 0, twoCount = 0, fourCount = 0, sixCount = 0, eightCount = 0, otherCount = 0;
            Scanner scan = new Scanner(System.in);
            String userInput = scan.next();
            if (userInput.equalsIgnoreCase("Q"))
                break;
            else
            {
                int length = userInput.length();
                char userIn;
                for (int i = 0; length > i; i++)
                {
                    userIn = userInput.charAt(i);
                    switch (userIn)
                    {
                        case '0':
                            zeroCount++;
                            break;
                        case '2':
                            twoCount++;
                            break;
                        case '4':
                            fourCount++;
                            break;
                        case '6':
                            sixCount++;
                            break;
                        case '8':
                            eightCount++;
                            break;
                        default:
                            otherCount++;
                            break;
                    }
                }
                System.out.println("Zeros:  |" + zeroCount + "|");
                System.out.println("Twos:   |" + twoCount + "|");
                System.out.println("Threes: |" + fourCount + "|");
                System.out.println("Sixes:  |" + sixCount + "|");
                System.out.println("Eights: |" + eightCount + "|");
                System.out.println("Other:  |" + otherCount + "|");
            }
        }
    }
}