
package br.com.unitymanager.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DataSistema{
    
    
    public String dataAtual(){
        Calendar data = Calendar.getInstance(); 
        Date d = data.getTime(); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        String dataAtual = dateFormat.format(d);
        
      return dataAtual;
    }
}
