package org.ketan.yapp.web.controller;

import java.util.List;

import org.ketan.yapp.business.service.PersonService;
import org.ketan.yapp.persistence.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonController
{
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonEntity> findAll()
    {
        return personService.findAll();
    }

    @GetMapping("/{personId}")
    public PersonEntity findOne(@PathVariable Integer personId)
    {
        return personService.findOne(personId);
    }

    @PostMapping
    public PersonEntity save(@RequestBody PersonEntity personEntity)
    {
        return personService.save(personEntity);
    }

    @PutMapping("/{personId}")
    public PersonEntity update(@PathVariable Integer personId, @RequestBody PersonEntity personEntity)
    {
        return personService.update(personId, personEntity);
    }

    @DeleteMapping("/{personId}")
    public void delete(@PathVariable Integer personId)
    {
        personService.delete(personId);
    }

}
