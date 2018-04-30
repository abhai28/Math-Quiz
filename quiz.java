import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class quiz
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("How many question would you like to answer? ");
        int qAmt = userIn.nextInt();
        System.out.println("For division please round your answer to two decimal places.");
        int mark = 0;

        for(int i=0; i< qAmt; i++)
        {
            int n1 = (int)(Math.random()*100+1);
            int n2 = (int)(Math.random()*(n1+1));
            int operator = (int)(Math.random()*4);
            int answer;
            if(operator == 1)
            {
                //adition
                //Computing the answer and assigning it to the variable answer
                answer = (n1 + n2);

                //Asking the user to determine the question
                System.out.println("What is the answer of " + n1 + " + " + n2 + "?");

                //Storing the users input in variable userAns
                int userAns = userIn.nextInt();

                //If-Else statement to check if users answer is correct
                if (answer == userAns)
                {
                    System.out.println("You are Correct!");
                    mark += 1;
                }
                else
                {
                    System.out.println("Sorry, the correct answer is " + answer);
                }
            }
            else if(operator == 2)
            {
                //subtraction
                answer = (n1 - n2);

                System.out.println("What is the answer of " + n1 + " - " + n2 + "?");

                int userAns = userIn.nextInt();

                if (answer == userAns)
                {
                    System.out.println("You are Correct!");
                    mark += 1;
                }
                else
                {
                    System.out.println("Sorry, the correct answer is " + answer);
                }
            }
            else if(operator == 3)
            {
                //multiplication
                answer = (n1 * n2);

                System.out.println("What is the answer of " + n1 + " x " + n2 + "?");

                int userAns = userIn.nextInt();

                if (answer == userAns)
                {
                    System.out.println("You are Correct!");
                    mark += 1;
                }
                else
                {
                    System.out.println("Sorry, the correct answer is " + answer);
                }
            }
            else
            {
                //division
                double d1 = (int)((Math.random()*100)+1);
                double d2 = (int)((Math.random()*(n1+1)+1));
                double answerD = d1/d2;

                answerD = Math.round(answerD*100.0)/100.0;
                NumberFormat f = new DecimalFormat("0");

                System.out.println("What is the answer of " + f.format(d1) + " / " + f.format(d2) + "?");

                double userAns = userIn.nextDouble();

                if (answerD == userAns)
                {
                    System.out.println("You are Correct!");
                    mark += 1;
                }
                else
                {
                    System.out.println("Sorry, the correct answer is " + answerD);
                }
            }
        }
    }
}
