package cn.anytec.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/camera")
    public String cameras(){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Authorization","token F3Pv-TNLh");
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        ResponseEntity<String> response = restTemplate.exchange("http://192.168.10.212:8000/v1/camera", HttpMethod.GET, requestEntity, String.class);
        String sttr = response.getBody();

//        restTemplate.getForObject("http://192.168.10.212")
        return sttr;
    }


    @PostMapping("/test")
    public String test(String gender, String emotions, String age, String cam_id, String timestamp, String bbox, @RequestParam("photo") MultipartFile photo, @RequestParam("face0") MultipartFile face0){
        logger.info("enter test api");
        return "test api";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello api";
    }




}
