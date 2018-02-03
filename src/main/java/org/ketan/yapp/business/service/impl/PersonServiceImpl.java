package org.ketan.yapp.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ketan.yapp.business.service.PersonService;
import org.ketan.yapp.persistence.dao.PersonDAO;
import org.ketan.yapp.persistence.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService
{

    @Autowired
    private PersonDAO personDAO;

    @Override
    public List<PersonEntity> findAll()
    {
        List<PersonEntity> personEntities = new ArrayList<>();

        personDAO.findAll().forEach(personEntities::add);

        return personEntities;
    }

    @Override
    public PersonEntity findOne(Integer personId)
    {
        return personDAO.findOne(personId);
    }

    @Override
    public PersonEntity save(PersonEntity personEntity)
    {
        return personDAO.save(personEntity);
    }

    @Override
    public PersonEntity update(Integer personId,PersonEntity personEntity)
    {
        return personDAO.save(personEntity);
    }

    @Override
    public void delete(Integer personId)
    {
        personDAO.delete(personId);
    }

}
