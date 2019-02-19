/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Hossam
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Model model = data();
       
        StudenView view = new StudenView();
        Controller controller = new Controller(model ,view );
        controller.setNameC("ahmed");
        controller.setNameCC("24");
        controller.updateView();
        
    }
    
    public static Model data(){
         Model model = new Model();
         model.setName("hossam");
         model.setNumber("22");
         return model;
    }
    
}
