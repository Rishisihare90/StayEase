package com.book.StayEase.services;

import com.book.StayEase.dtos.LoginRequest;
import com.book.StayEase.dtos.RegistrationRequest;
import com.book.StayEase.dtos.Response;
import com.book.StayEase.dtos.UserDTO;
import com.book.StayEase.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
