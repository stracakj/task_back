package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "device")
public class Device {

    public Device() {

    }

    public Device( String name, String type, String data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String type;

    private String data;


}
