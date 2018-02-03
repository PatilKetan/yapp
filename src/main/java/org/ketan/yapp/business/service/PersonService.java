package org.ketan.yapp.business.service;

import java.util.List;

import org.ketan.yapp.persistence.entity.PersonEntity;

public interface PersonService
{
    PersonEntity save(PersonEntity personEntity);

    List<PersonEntity> findAll();

    PersonEntity findOne(Integer personId);

    PersonEntity update(Integer personId, PersonEntity personEntity);

    void delete(Integer personId);

}
