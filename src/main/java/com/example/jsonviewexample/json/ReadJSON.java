package com.example.jsonviewexample.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("users.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray userList = (JSONArray) obj;

            // Iterate over employee array
            userList.forEach(user -> parseUserObject((JSONObject) user));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseUserObject(JSONObject user) {

        // Get user first name
        Long id = (Long) user.get("id");
        System.out.println(id);

        // Get user first name
        String firstName = (String) user.get("firstName");
        System.out.println(firstName);

        // Get user last name
        String lastName = (String) user.get("lastName");
        System.out.println(lastName);

        // Get user website name
        String userName = (String) user.get("userName");
        System.out.println(userName);

        // Get user email name
        String email = (String) user.get("email");
        System.out.println(email);
    }
}
