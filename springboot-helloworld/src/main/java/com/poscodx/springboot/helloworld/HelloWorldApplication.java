package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. Bootstraping class : Spring Application의 Bootstraping 역할 
 * 2. 컨테이너의 설정 클래스 역할 : Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일
		 * 
		 * 1. Application Context(Spring Container) 생성 
		 * 2. 만약 Web Application이라면, Web Application 타입을 결정(Spring MVC, Reactive) 
		 * 3. Annotaion Scanning(Component Scanning) + Configuration Class를 통한
		 * 	  Bean 생성, 등록, 와이어링 작업 
		 * 4. 만약 Web Application이고 타입이 Spring MVC이면, 
		 * 	  - 내장(embeded)된 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성 
		 * 	  - 서버 인스턴스 웹 어플리케이션 배포(MVC, AOP, security, JPA, ... Auto Configuration) 
		 * 	  - 서버 인스턴스 스타트 
		 * 5. ApplicationRunner 인터페이스를 구현한 Bean을 Application Context 찾아서 실행
		 */

//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		} finally {
//			if (ac != null) {
//				ac.close();
//			}
//		}

		// try ~ with ~ resource 구문
		try (ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)) {
			// web application인 경우
			// SpringApplication.run(HelloWorldApplication.class, args);
			System.out.println("some code...");
			System.out.println("some code...");
			System.out.println("some code...");
			System.out.println("some code...");
		}
	}

}
