package Observables;

import Observers.BasicObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements BasicObservable{

    List<BasicObserver> basicObserverList = new ArrayList<>();
    int data = 0;
    @Override
    public void add(BasicObserver basicObserver) {
        this.basicObserverList.add(basicObserver);
    }

    @Override
    public void remove(BasicObserver basicObserver) {
        this.basicObserverList.remove(basicObserver);
    }

    @Override
    public void sendNotification() {
        for(BasicObserver basicObserver : basicObserverList) {
            basicObserver.update();
        }
    }

    @Override
    public void addData(int data) {
        this.data = this.data + data;
        sendNotification();
    }

    public int getData() {
        return this.data;
    }
}
