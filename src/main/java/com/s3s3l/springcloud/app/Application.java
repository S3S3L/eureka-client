/** 
 * Project Name:eureka-client 
 * File Name:Application.java 
 * Package Name:com.s3s3l.springcloud.app 
 * Date:Dec 12, 20164:25:17 PM 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * </p>
 * ClassName:Application <br>
 * Date: Dec 12, 2016 4:25:17 PM <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.s3s3l")
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
