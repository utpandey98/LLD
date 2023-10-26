package model;

import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {

    User user;
    Vehicle vehicle;
    Date fromDate;
    Date toDate;
    int reservationId;
    public int createReservation(Vehicle vehicle, User user) {
        this.reservationId = 1231452;
        this.vehicle = vehicle;
        this.user = user;

        return reservationId;
    }

}
