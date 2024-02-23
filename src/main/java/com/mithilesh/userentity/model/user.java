package com.mithilesh.userentity.model;

public class user {

    private int userId; 
    private String username;
    private String address;
    private String Email;
    private int  phoneNumber;


    public user() { //  default constructor
    }

    public user(int userId, String username, String address, String Email,int phoneNumber) {  //  Constructor with parameters
        this.userId = userId;  
        this.username = username;  
        this.address = address;  
        this.Email = Email;  
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() { // getter method for userid
        return userId;
    }

    public void setUserId(int userId) { //  setter method for userid
        this.userId = userId;  //  setting the value of user id
    }

    public String getName() { //  getter method for name
        return username;     //  returning the value of name
    }

    public void setName(String name) { //   setter method for name
        this.username = name;         //   assigning the value to name
    }

    public String getAddress() {  //  getter method for address
        return address;          //   returning the value of address
    }

    public void setAddress(String address) { //  setter method for address
        this.address = address;              //   assigning the value to address
    }

    public void setEmail(String email) {  //   setter method for email
        Email = email;      //    assigning the value to email
    }

    public String getEmail() {  //    getter method for email
        return Email;        //      returning the value of email
    }
    public int getPhoneNumber() {  // getter method for phone number
        return phoneNumber;  //  returning the value of phone number
    }

    public void setPhoneNumber(int phoneNumber) { //  setter method for phone number
        this.phoneNumber = phoneNumber;    //   assigning the value to phone number
    }
}
