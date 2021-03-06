package com.auditManagement.auditchecklist.configuration;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.core.Ordered;
	import org.springframework.web.servlet.ViewResolver;
	import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
	import org.springframework.web.servlet.config.annotation.EnableWebMvc;
	import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

	@Configuration
	@EnableWebMvc
	public class WebConfiguration implements WebMvcConfigurer{
		
	 @Bean
	     public ViewResolver getViewResolver() {
	      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	      //resolver.setViewClass(JstlView.class);
	         resolver.setPrefix("/WEB-INF/jsp/");
	         resolver.setSuffix(".jsp");
	         return resolver;
	     }
		

		
	}
