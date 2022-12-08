package com.contact.contactdetails.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="contact_details")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="email")
    private String email;

    @Column(name ="mobileNo")
    private long mobileNo;

}
