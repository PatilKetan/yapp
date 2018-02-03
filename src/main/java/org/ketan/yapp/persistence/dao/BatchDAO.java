package org.ketan.yapp.persistence.dao;

import org.ketan.yapp.persistence.entity.BatchEntity;
import org.springframework.data.repository.CrudRepository;

public interface BatchDAO extends CrudRepository<BatchEntity, Integer>
{

}
