package quoters;

/**
 * Created by Tatiana_Maslova on 12/14/2017.
 */

public class TerminatorQuoter implements Quoter {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }


    public void sayQuote(){
        System.out.println(message);

    }

}