/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan60.akatsuki;

/**
 *
 * @author ryzen
 */
public class Akatsuki {
    protected String name,origin,status;
    
    public Akatsuki(String name, String origin, String status){
        this.name=name;
        this.origin=origin;
        this.status=status;
    }
    public String getName(){
        return name;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public String getStatus(){
        return status;
    }
    
}
