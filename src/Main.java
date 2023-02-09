import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        String PartyAffiliation = "i"; //this is the simulated input since we don't know how to do input yet
        String partyChoice = "R - Republican D - Democrat I - Independent"; // this the string that creates the menu look
        System.out.println(partyChoice); //output's party choice as a menu
        if (PartyAffiliation.equalsIgnoreCase("R")) // if statement that says if the input equals R it will run the code in the block
        {
            System.out.println("You get a Republican Elephant"); //output statement if the if statement is true
        }
        else if (PartyAffiliation.equalsIgnoreCase("D")) //else if statement that says if the input is equal to D it will run the code in the block
        {
            System.out.println("You get a Democratic Donkey"); //output statement if the else if condition is true
        }
        else if (PartyAffiliation.equalsIgnoreCase("I")) // else if statement that says if the input is equal to I it will run the code in the block statement
        {
            System.out.println("You are an Independent Person"); //output statement if the else if condition is true
        }
        else // this is the last resort of the if statement that runs if nothing else above holds true
        {
            System.out.println("You are a party not listed"); //output statement if none of the above conditions hold true
        }

    }
}