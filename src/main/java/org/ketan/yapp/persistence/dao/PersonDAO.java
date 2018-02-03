package org.ketan.yapp.persistence.dao;

import org.ketan.yapp.persistence.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonDAO extends CrudRepository<PersonEntity, Integer>
{

}
