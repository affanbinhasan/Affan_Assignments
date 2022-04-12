package com.springrest.spring_rest_assignment.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.spring_rest_assignment.models.User;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    
    private static List<User> users= new ArrayList<>();

   
    static{
        users.add(new User("affan","javadev"));
        users.add(new User("amit","mentor"));  
        users.add(new User("adarsh","trainingcr"));
        users.add(new User("akash","groupmem"));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserService.users = users;
    }
    

    public String validateUsers(String uid,String passkey){
        //User user1 = new User("affan","javadev");
        for (User user: users){
            if (    uid.equals((String) user.getUsername())     ){

                if (    passkey.equals((String) user.getPassword()     )){
    
                    return "Valid User  :  " + uid +"   "+ passkey;
    
                }
                
            }
            
        }

        return "Invalid User";
    }

    @Override
    public String toString() {
        return "UserService []" + users.toArray();
    }
  
}
