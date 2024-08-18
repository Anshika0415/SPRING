package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name = {"com","com1"}) //we can pass an array of name
//    public Desktop desktop()
//    {   //it created object for Desktop class using new Desktop() like we do manually
//        return new Desktop();
//    }
    @Bean
    @Scope("prototype")//we can pass an array of name
    public Desktop desktop()
    {   //it created object for Desktop class using new Desktop() like we do manually
        return new Desktop();
    }
    @Bean
    public Laptop laptop()
    {   //it created object for Desktop class using new Desktop() like we do manually
        return new Laptop();
    }
    @Bean
    public Alien alien(@Qualifier ("laptop") Computer com) //alien is name of bean..also this is a constructor
    {   //we used qualifier annotation because there are 2 implementations of type computer
        //return new Alien();
        Alien obj=new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;

    }
}
