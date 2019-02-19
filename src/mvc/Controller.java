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
public class Controller {
    private Model model;
    private StudenView studView;
    
    public Controller(Model model , StudenView studenView){
        this.model = model;
        this.studView = studenView;
    }
    
    public void setNameC(String name){
        model.setName(name);
    }
    
    public String getNameC(){
        return model.getName();
    }
    
    public String getNum(){
        return model.getNumber();
    }
    
    
    public void setNameCC(String number){
        this.model.setNumber(number);
    }
    
     public void updateView(){				
      this.studView.getAlldatels(model.getName(), model.getNumber());
   }	
    
    
    
}
