package com.contact.contactdetails.controller;

import com.contact.contactdetails.entity.Contact;
import com.contact.contactdetails.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactServiceImpl contactServiceImpl;

    @PostMapping("/saveContact")
    public String saveContact(@RequestBody Contact contact){
       return contactServiceImpl.saveContact(contact);
    }

    @GetMapping("/viewAllContact")
    public List<Contact> viewAllContact(){
       return contactServiceImpl.getAllContact();
    }

    @PutMapping("/updateContact")
    public String updateContact(@RequestBody Contact contact){
      return contactServiceImpl.updateContact(contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable (value = "id") Integer id){
       return contactServiceImpl.deleteContact(id);
    }

    @GetMapping("/viewContact/{id}")
    public Contact viewContact(@PathVariable (value = "id") Integer id){
       return contactServiceImpl.getContact(id);
    }
}
