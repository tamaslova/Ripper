package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tatiana_Maslova on 12/15/2017.
 */
public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.getBean(TerminatorQuoter.class).sayQuote();

    }

}
