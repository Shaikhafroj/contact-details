package com.contact.contactdetails.service;

import com.contact.contactdetails.dao.ContactRepo;
import com.contact.contactdetails.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepo contactRepo;


    @Override
    public List<Contact> getAllContact() {
        return contactRepo.findAll();

    }

    @Override
    public String saveContact(Contact contact) {
        contactRepo.save(contact);
        return "Contact Added Successfully....";
    }

    @Override
    public String updateContact(Contact contact) {
        contactRepo.save(contact);
        return "Update Contact Successfully.....";
    }

    @Override
    public String deleteContact(Integer id) {
        contactRepo.deleteById(id);
        return "Delete Contact  Successfully....";
    }

    @Override
    public Contact getContact(Integer id) {
       return contactRepo.findById(id).get();

    }
}
