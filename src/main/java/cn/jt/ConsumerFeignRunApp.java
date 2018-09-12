package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ConsumerFeignRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignRunApp.class, args);
		
	}
}
