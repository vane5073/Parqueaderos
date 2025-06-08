
package condicionales;


public class Condicionales {

   
    public static void main(String[] args) {
      int hora = 32;
              
      
     if (hora >= 1 && hora <12) {
         System.out.println("Buenos dias");          
     }  else if(hora >= 12 && hora < 18 ){
         System.out.println("Buenas tardes");   
    }   else if(hora >= 18 && hora < 24){
         System.out.println("Buenas noches");   
    }else{
         System.out.println("no existe");
    }System.out.println("");
        
    
    }
    
}
