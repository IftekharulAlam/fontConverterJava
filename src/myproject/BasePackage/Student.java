/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject.BasePackage;

/**
 *
 * @author Iftekharul Alam
 */
public class Student {

    private String name;
    private String ID;
    private String Age;
    private String PhoneNumber;
    private String Address;

    public Student() {
    }

    public String getAge() {
        return Age;
    }

    public String getID() {
        return ID;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

}
