package com.example.converterxml;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.converterxml.metodos.EnviaMensagem;
import com.example.converterxml.metodos.XMLParaObjeto;

@SpringBootApplication
//@EnableScheduling
public class Main {

	
	
	public static void main(String[] args) {
		//new XMLParaObjeto().transformXMLToObject(); 
		SpringApplication.run(Main.class, args);
	}

//	@Scheduled(fixedRate  = 1000)
//	public void fixedRate() {
	
//	@Scheduled(cron = "0/1 * 10-18 ? * TUE-FRI") 
//	public void cronJobDemo() {		 
//		new XMLParaObjeto().transformXMLToObject(); 
//		
//	}
//	
}
