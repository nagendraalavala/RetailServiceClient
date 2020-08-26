package com.example.retailservice.Exception;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

    Logger logger = LoggerFactory.getLogger(FeignErrorDecoder.class);

    @Override
    public Exception decode(String s, Response response) {
        logger.info("Entered exception class");
        switch (response.status())
        {
            case 404:
                logger.error("Entered case 404");
                return new BadRequestException("Exception from Feign");


            default:
                logger.error("Entered Default");
                return (BadRequestException) new Exception("Generic error");
        }



    }
}
