package com.example.jerrol.samplefirebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Jerrol on 11/29/2017.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
