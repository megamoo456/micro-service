package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ManageProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageProjectApplication.class, args);
	}
	


}
