package hw.view;

import java.util.List;

import hw.data.User;

public interface UserView  <T extends User>{
    void sendOnConsole(List<T> list);
}
    

