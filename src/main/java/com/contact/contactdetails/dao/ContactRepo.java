package com.contact.contactdetails.dao;

import com.contact.contactdetails.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Integer> {
}
