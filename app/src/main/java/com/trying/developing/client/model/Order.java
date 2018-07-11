package com.trying.developing.client.model;

/**
 * Created by developing on 7/7/2018.
 */

public class Order {

    public Double  lat;
    public Double lng;
    public String details;
    public String address;
    public String status;


    public Order(Double lat, Double lng, String details, String address, String status) {
        this.lat = lat;
        this.lng = lng;
        this.details = details;
        this.address = address;
        this.status = status;
    }

    public Order() {
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public String getDetails() {
        return details;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
}
