package quoters.javaconfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class JavaConfig {}
/*
    @Bean
    public CoolDao dao() {
        return new CoolDaoImpl();
    }

    @Bean(initMethod = "init")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CoolService coolService(){
        CoolServiceimpl service = new CoolServiceImpl();
        service.setDao(dao());
        return service;
    }

}
*/