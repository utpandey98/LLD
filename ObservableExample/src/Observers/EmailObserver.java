package Observers;

import Model.User;
import Observables.BasicObservable;

import java.util.ArrayList;
import java.util.List;

public class EmailObserver implements BasicObserver {

    BasicObservable basicObservable;
    List<User> userList = new ArrayList<>();

    public EmailObserver(BasicObservable basicObservable){
        this.basicObservable = basicObservable;
    }

    @Override
    public void update() {
        sendEmailNotification();
    }

    private void sendEmailNotification() {
        for (User user : userList) {
            System.out.println("Send email to " + user.getEmailId());
        }
    }

    public void addUserToObserver(User user){
        userList.add(user);
    }
}
