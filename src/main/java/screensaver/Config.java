package screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "screensaver")

public class Config {
    @Bean
    @Scope("prototype") //еще м.б. "singleton"
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame frame(){
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color(); //если синглтон - возвращает старый бин, если прототип - новый
            }
        };

    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while(true){
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(50);
        }
    }
}
