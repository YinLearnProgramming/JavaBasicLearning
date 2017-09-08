import java.util.*;
import java.io.*;
/**
 * Write a description of class Raffle here.
 * this class is analysis the ticket from user and compare with the winning ticket from system.
 * @author (YIN HANG KWOK) 
 * @version (1/22/2016)
 */
public class Raffle
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int number; //number for generate random number
        String winningTicket; //the winning ticket
        int playerNumber; //number of player
        String userName; //player name
        String userTicket; //player ticket
        
        number = rand.nextInt(999998)+100000;//set the range of ticket
        winningTicket = Integer.toString(number);//convert to string for comparing
        System.out.println("The winning ticket is " + winningTicket);
        System.out.println("Welcome! Please enter number of player.");
        playerNumber = input.nextInt();
        Ticket[] player = new Ticket[playerNumber];
        
        System.out.println("==================================================");
        for(int i=0; i<playerNumber;i++)
        {
            System.out.println("Please enter ticket holder’s name.");
            userName = input.next();
            System.out.println("Please enter 6 digit numbers.");
            userTicket = input.next();
            
            player[i] = new Ticket(userName,userTicket);
            System.out.println("Name: " + player[i].getName() +" Ticket number: "+ player[i].getRaffleTicket());
        }
        //System.out.println("The winning ticket is " + winningTicket);
        System.out.println("Checking tickets");
        System.out.println("==================================================");
        for(int g = 0; g<playerNumber;g++)
        {
            boolean checkWin = false;
            if((player[g].getRaffleTicket()).equals(winningTicket))
            {
                System.out.println(player[g].getName()+" win the First Prize!");
                checkWin = true;
            }
            else
            {
                String reverseTicket;
                int index,len = player[g].getRaffleTicket().length();
                StringBuilder de = new StringBuilder(len);
                for (index = (len - 1); index >= 0; index--)
                {
                    de.append(player[g].getRaffleTicket().charAt(index));
                }
                reverseTicket = de.toString();
                if(reverseTicket.equals(winningTicket))
                {
                    System.out.println(player[g].getName()+" win the Second Prize!");
                    checkWin = true;
                }
                else
                {
                    String userTicketForCheck =  player[g].getRaffleTicket();
                    for(int t = 0; t< 4;t++)
                    {
                        String subWinningTicket = winningTicket.substring(t,t+3);
                        String subPlayerTicket = userTicketForCheck.substring(t,t+3);
                        
                        if(subPlayerTicket.equals(subWinningTicket))
                        {
                            System.out.println(player[g].getName()+" win the Third Prize!");
                            checkWin = true;
                        }
                    }
                }
            }

            if(checkWin = false)
            {
                System.out.println(player[g].getName()+" lose!");
            }
        }
        
        
        
    }
}
