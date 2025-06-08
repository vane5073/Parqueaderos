
package mein;

import views.LoginView;
import views.SystemViews;


public class mein {
    
    public static void main(String[] args) {
        
     //intancia de login 
     LoginView login = new LoginView();
     login.setVisible(true);
     
     
     //instancia de pagina principal 
     SystemViews system = new SystemViews();
     system.setVisible(true);

        
    }
    
}
