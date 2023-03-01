/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Hp
 */
public class checkout {
     private String name;
    private String phoneName;
    private String age;
    private String roomNumer;
    private String gender;
    private String roomMates;
    private String checkin;
 private String checkoutdate;
 private String roomtype;
  private String Amount;
     private String Payementstatus;
    public checkout() {
    }

    public checkout(String name, String phoneName, String age, String roomNumer, String gender, String roomMates,String checkin,String checkoutdate,String roomtype,String Payementstatus,String Amount) {
        this.name = name;
        this.phoneName = phoneName;
        this.age = age;
        this.roomNumer = roomNumer;
        this.gender = gender;
        this.roomMates = roomMates;
        this.checkin=checkin;
        this.checkoutdate=checkoutdate;
        this.roomtype=roomtype;
         this.Payementstatus=Payementstatus;
         this.Amount=Amount;
    }
}
