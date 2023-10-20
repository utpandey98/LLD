import Model.User;
import Observables.BasicObservable;
import Observables.IPhoneObservableImpl;
import Observers.BasicObserver;
import Observers.EmailObserver;

public class Main {
    public static void main(String ... args) {
        BasicObservable iPhoneObservable  = new IPhoneObservableImpl();

        BasicObserver emailObserver = new EmailObserver(iPhoneObservable);

        iPhoneObservable.add(emailObserver);

        emailObserver.addUserToObserver(new User("fName", "lName", "abc1@gm.com", "1232456"));
        emailObserver.addUserToObserver(new User("fName2", "lName2", "abc1@gm.com2", "1232452131236"));

        iPhoneObservable.addData(2134);
    }
}
