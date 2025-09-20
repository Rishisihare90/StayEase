package com.book.StayEase.services;

import com.book.StayEase.dtos.BookingDTO;
import com.book.StayEase.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
