package com.example.retailservice.Feign.FallBack;

import com.example.retailservice.Feign.feignClient;
import com.example.retailservice.Service.RetailService;
import com.example.retailservice.types.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class feignFallBack implements feignClient {

    Logger logger = LoggerFactory.getLogger(feignFallBack.class);

    @Override
    public ProductEntity productRespone(Long id)
    {
        logger.info("FallBack method Executed");
        ProductEntity productEntity = new ProductEntity();
        return productEntity;
    }

}
