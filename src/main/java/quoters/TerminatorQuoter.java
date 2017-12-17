package quoters;

/**
 * Created by Tatiana_Maslova on 12/14/2017.
 */

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }


    public void sayQuote(){
        for (int i = 0; i< repeat; i++){
            System.out.println(message);
        }

    }

}