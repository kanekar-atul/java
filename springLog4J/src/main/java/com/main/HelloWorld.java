package com.main;


public class HelloWorld {
   private String message;
   
   HelloWorld(){}
   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage() {
      System.out.println("Your Message : " + message);
   }
}