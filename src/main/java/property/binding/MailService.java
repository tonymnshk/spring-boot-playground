package property.binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailService {
  
  @Autowired
  private MailProperties mailProperties;

  public void print() {
    System.out.println("Mail TO = " + mailProperties.getTo());
    System.out.println("HOST = " + mailProperties.getHost());
    System.out.println("PORT = " + mailProperties.getPort());
    System.out.println();
    
    //Print list or array
    System.out.println("Mail CC = " + String.join(", ", mailProperties.getCc()));
    System.out.println("Mail BCC = " + mailProperties.getBcc());
    System.out.println();
    
    //Print nested bean's properties
    System.out.println("User Name = " + mailProperties.getCredential().getUserName());
    System.out.println("Password = " + mailProperties.getCredential().getPassword());
  }
}