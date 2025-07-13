package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.BookingTreksAndTours;
import com.example.matoshritoursandtravels.model.UpcomingTour;
import com.example.matoshritoursandtravels.repository.BookingTreksAndToursRepository;
import com.example.matoshritoursandtravels.repository.UpcomingTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingTreksAndToursService {

    @Autowired
    private BookingTreksAndToursRepository bookingRepo;

    @Autowired
    private UpcomingTourRepository tourRepo;

    public List<BookingTreksAndTours> getAllBookings() {
        return bookingRepo.findAll();
    }



    public BookingTreksAndTours bookTour(BookingTreksAndTours booking) {
        UpcomingTour tour = tourRepo.findByTrekNameAndDateAndTime(
                booking.getTrekName(), booking.getDate(), booking.getTime());

        if (tour != null && tour.getSeats() >= booking.getSeatsToBook()) {
            tour.setSeats(tour.getSeats() - booking.getSeatsToBook());
            tourRepo.save(tour);
            return bookingRepo.save(booking);
        } else {
            throw new RuntimeException("Not enough seats available");
        }
    }
}
