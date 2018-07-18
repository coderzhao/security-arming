package cn.anytec.servicemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMonitorApplication.class, args);
	}
}
