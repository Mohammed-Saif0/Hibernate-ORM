package com.hibernates;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Address {
    @Id
    private int addressId;
    @Column(length = 200)
    private String street;
    @Column(length = 120)
    private String city;
    @Transient
    private double random;
    @Lob
    byte[] image;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public byte[] getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", random=" + random +
                '}';
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
