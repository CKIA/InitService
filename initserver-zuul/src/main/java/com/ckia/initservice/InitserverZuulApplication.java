package com.ckia.initservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class InitserverZuulApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(InitserverZuulApplication.class).run(args);
	}
}
