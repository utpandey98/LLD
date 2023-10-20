package Observers;

import Model.User;

public interface BasicObserver {
    void update();

    void addUserToObserver(User user);
}
