package com.mithilesh.userentity.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mithilesh.userentity.model.user;

@RestController  //  It is a controller that returns the response in JSON format by default

@RequestMapping("/user") //  This annotation indicates that this class will handle requests with mapping /user

 public class userAPIservice {
    private user user;

    @GetMapping("{userId}")  // http://localhost:8091/user/userId

    //This is a simple API to get the details of User with given ID
    public  user getUserDetail(String userId) {
       
        return user ;
        //new user
        //(1,"Mithilesh Patel","Bangalore","mithleshpatel887766@gmail.com",919008001);
    }
    @PostMapping  // Create new User
     public String  creatUserDetail(@RequestBody user user){
     this.user =  user;
     return "User has been created Successfully";
 }
 @PutMapping  //  Update existing User Detail
 public String  updateUserDetail(@RequestBody user user){
    this.user =  user;
    return "User has been update Successfully";
}
@DeleteMapping("{userId}") //  Delete User from Database
public String  deleteUserDetail(int userId){
    this.user =  null;
    return "User has been delete Successfully";
}
 }



