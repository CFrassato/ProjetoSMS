/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bean.Sms;
import java.util.concurrent.TimeUnit;
import smsClasses.*;

/**
 *
 * @author Usuer
 */
public class envia {
  
Sms n = new Sms();

    public void enviaClickatell(Sms n) throws Exception{
        
    ClickatellHttp click = new ClickatellHttp("cfrassato", "3621599", "fgNZgLZUgXCgMZ");
    ClickatellRest clickRest = new ClickatellRest("SMS-API");
    

         ClickatellHttp.Message response = click.sendMessage(n.getNumero(), n.getMensagem());
         //   TimeUnit.SECONDS.sleep(5);
       
    
}
    
}
