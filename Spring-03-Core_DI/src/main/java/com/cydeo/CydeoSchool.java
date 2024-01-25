package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoSchool
{

  public static void main(String[] args)
  {
    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

    Java java = context.getBean(Java.class);
    java.getTeachingHours();
  }

}
