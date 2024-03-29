package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java
{
  //@Autowired not recommended
  OfficeHours officeHours;

  @Autowired //constructor injection
  public Java(OfficeHours officeHours)
  {
    this.officeHours = officeHours;
  }

  public void getTeachingHours(){
    System.out.println("Weekly teaching hours of Java: " + (20 + officeHours.getHours()));
  }

}
