package com.example.telas.api;

import com.example.telas.model.UserProfileResponse;
import com.example.telas.model.dto.UserDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UserService {

    @GET("api/user/profile")
    Call<UserProfileResponse> getUserProfile(@Header("Authorization") String token);

    @GET("/api/user/me")
    Call<UserDTO> getCurrentUser(@Header("Authorization") String authHeader);

}
