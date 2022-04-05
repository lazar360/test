package com.mycompany.formationspring.test.repository;

import com.mycompany.formationspring.test.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
