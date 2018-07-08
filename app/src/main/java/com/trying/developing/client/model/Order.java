package com.trying.developing.client.model;

/**
 * Created by developing on 7/7/2018.
 */

public class Order {

    public Double  lat;
    public Double lng;
    public String details;
    public String address;

    public Order(Double lat, Double lng, String details, String address) {
        this.lat = lat;
        this.lng = lng;
        this.details = details;
        this.address = address;
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
}
