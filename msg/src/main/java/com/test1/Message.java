package com.test1;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(MessagePropertiese.class)
public class Message {

private final MessagePropertiese   msgpropertiese;

    public Message(MessagePropertiese msgpropertiese) {
        this.msgpropertiese = msgpropertiese;
    }

    public String message()
        {
           if (this.msgpropertiese.getMessage() == null)  {
                //	ConfigurableApplicationContext ctx = SpringApplication.run(MyService.class);
                throw new MessagePropertiese("propertiese are missing in propertiese file");
                //System.out.println("property missing in application propertiese");
                //ctx.close();

            }

            return this.msgpropertiese.getMessage();

        }

        }



