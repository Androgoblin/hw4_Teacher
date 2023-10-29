package hw.controller;

import hw.data.User;

public interface UserController <T extends User> {
    void create (String firstName, String secondName, String lastName);
}
    

