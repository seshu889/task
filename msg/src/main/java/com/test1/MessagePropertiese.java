package com.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("message")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessagePropertiese extends  RuntimeException{

    public String message;

}
