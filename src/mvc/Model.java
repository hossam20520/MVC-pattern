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
public class Model {
    private String Student;
    private String age;
    
    public String getName(){
        return Student;
    }
    public void setName(String name){
        this.Student = name;
    }
          
    public String getNumber(){
        return this.age;
    }
    
    
    public void setNumber(String number){
        this.age = number;
    }
    
    
    
}
