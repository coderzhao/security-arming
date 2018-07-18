package cn.anytec.handler.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;



//@Slf4j
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(java.util.function.Consumer.class);

    /**
     *消费逻辑编写处
     */
    @KafkaListener(topics = {"test-topic"})
    public void consumer(String message){

        logger.info("消费者: {}", message);
    }
}