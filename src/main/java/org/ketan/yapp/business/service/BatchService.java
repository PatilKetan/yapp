package org.ketan.yapp.business.service;

import java.util.List;

import org.ketan.yapp.persistence.entity.BatchEntity;

public interface BatchService
{
    BatchEntity save(BatchEntity batchEntity);

    List<BatchEntity> findAll();

    BatchEntity findOne(Integer batchId);

    BatchEntity update(Integer batchId, BatchEntity batchEntity);

    void delete(Integer batchId);
}
