package Observables;

import Observers.BasicObserver;

public interface BasicObservable {
    void add(BasicObserver basicObserver);

    void remove(BasicObserver basicObserver);

    void sendNotification();

    void addData(int data);

    int getData();
}
