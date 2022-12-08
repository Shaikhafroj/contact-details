package com.contact.contactdetails.service;

import com.contact.contactdetails.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContact();
    String saveContact(Contact contact);
    String updateContact(Contact contact );
    String deleteContact(Integer id);
    Contact getContact(Integer id);

}
