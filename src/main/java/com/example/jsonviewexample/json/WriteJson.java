package com.example.jsonviewexample.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {

   //JSONArray: To write data in JSON arrays. Use its add() method to add objects of type JSONObject.
   //JSONObject : To write JSON objects. Use it’s put() method to populate fields.

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // First User
        JSONObject userDetails = new JSONObject();
        userDetails.put("Id", 101);
        userDetails.put("firstName", "Ganesh");
        userDetails.put("lastName", "Kumar");
        userDetails.put("userName","Ganesh Kumar");
        userDetails.put("email", "ganesh@gmail.com");

        //Second User
        JSONObject userDetails1 = new JSONObject();
        userDetails1.put("id", 102);
        userDetails1.put("firstName", "Arnav");
        userDetails1.put("lastName", "Jyoti");
        userDetails1.put("userName","Arnav Jyoti");
        userDetails1.put("email", "arnav@gmail.com");

        //Third User
        JSONObject userDetails2 = new JSONObject();
        userDetails2.put("id", 103);
        userDetails2.put("firstName", "Shashi");
        userDetails2.put("lastName", "Bhushan");
        userDetails2.put("userName","Shashi Bhushan");
        userDetails2.put("email", "sm@gmail.com");


        // Add employee to List
        JSONArray userArray = new JSONArray();
        userArray.add(userDetails);
        userArray.add(userDetails1);
        userArray.add(userDetails2);


        // Write JSON file
        try(FileWriter file = new FileWriter("user.json")){
            file.write(userArray.toJSONString());
        }catch (IOException e){
            e.printStackTrace();
        }



   }
}
