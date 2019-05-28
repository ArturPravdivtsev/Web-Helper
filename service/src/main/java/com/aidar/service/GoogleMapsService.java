package com.aidar.service;

import com.aidar.util.google_api.LocationBody;

public interface GoogleMapsService {

    LocationBody getLocation(String address);

}
