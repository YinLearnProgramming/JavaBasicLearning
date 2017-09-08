/**
 * Write a description of class Ticket here.
 * This class is storing user trckets.
 * @author (YIN HANG KWOK) 
 * @version (1/22/2016)
 */
public class Ticket
{
    private String name;//save player name
    private String raffleTicket;//save player ticket
    /*
     * @param n - this is the name of ticket holder
     * @param t - this is the ticket
     */
    public Ticket(String n, String t)
    {
        name = n;
        raffleTicket = t;
    }
    /*
     * this is get method of getting the name of ticket holder
     * @return name
     */
    public String getName()
    {
        return name;
    }
    /*
     * this is get method of getting the ticket
     * @return ticket
     */
    public String getRaffleTicket()
    {
        return raffleTicket;
    }

}
