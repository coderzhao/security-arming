package cn.anytec.app.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Produce {

//    private static final Logger logger = LoggerFactory.getLogger(Produce.class);
//
//    @Autowired
//    private KafkaTemplate<?, String> kafkaTemplate;
//
//    @Value("${server.port}")
//    private String port;
//    @Scheduled(fixedDelay = 5000)
//    public void send() {
//        logger.info("生产者 :{}",
//                "gaha_hero" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
//        kafkaTemplate.send("test-topic",
//                "gaha_hero" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")) +" handle port:"+port);
//        //send参数 1：topic,2:key,3:参数
//        // 默认情况下，Kafka根据传递消息的key来进行分区的分配，即hash(key) % numPartitions,没有指定key就随机分配一个分区
//    }

}