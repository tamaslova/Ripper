package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by Tatiana_Maslova on 12/14/2017.
 */

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public TerminatorQuoter(){
        System.out.println("Phase1");
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase2");
        System.out.println(repeat);
    }

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