/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.converterxml.metodos;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author operador
 */
public class EnviaMensagem {   
  public static void enviaMensagem(String assunto, String mensagem) {
  Properties props = new Properties();
    /** Parâmetros de conexão com servidor Gmail */
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
      
           protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication("joaocleber450@gmail.com","douglasd");
           }
      });

    session.setDebug(true);

    try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("joaocleber450@gmail.com"));//remetende

      Address[] toUser = InternetAddress
              .parse("emailAleatorio@gmail.com");

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject(assunto);//Assunto
      message.setText(mensagem);
      /**Método para enviar a mensagem criada*/
      Transport.send(message);


     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
  
  
  public static void printarErro(String e) {
      String mensagem = e;
                       String assunto = "Conversor de XML : ";
			EnviaMensagem.enviaMensagem(assunto, mensagem );	
   }
}
