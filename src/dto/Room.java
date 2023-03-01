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
public class Room {
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
    public Room() {
    }

    public Room(String name, String phoneName, String age, String roomNumer, String gender, String roomMates,String checkin,String checkoutdate,String roomtype,String Payementstatus,String Amount) {
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

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }
    

    public void setPayementstatus(String Payementstatus) {
        this.Payementstatus = Payementstatus;
    }

    public String getPayementstatus() {
        return Payementstatus;
    }
    

    public String getCheckin() {
        return checkin;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRoomNumer() {
        return roomNumer;
    }

    public void setRoomNumer(String roomNumer) {
        this.roomNumer = roomNumer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomMates() {
        return roomMates;
    }

    public void setRoomMates(String roomMates) {
        this.roomMates = roomMates;
    }

    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
    }
    
    
}
