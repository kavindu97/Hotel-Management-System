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
public class Customer {

    private String name;
    private int phone;
    private int age;
    private String room;
    private String gender;
    private String roommate;
    private String Payementstatus;

    public Customer(String name, int phone, int age, String room, String gender, String roommate,String Payementstatus) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.room = room;
        this.gender = gender;
        this.roommate = roommate;
        this.Payementstatus=Payementstatus;
    }

    public String getPayementstatus() {
        return Payementstatus;
    }

    public void setPayementstatus(String Payementstatus) {
        this.Payementstatus = Payementstatus;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setRoommate(String roommate) {
        this.roommate = roommate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public String getRoom() {
        return room;
    }

    public String getRoommate() {
        return roommate;
    }

}
