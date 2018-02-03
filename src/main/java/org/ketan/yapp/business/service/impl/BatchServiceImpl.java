package org.ketan.yapp.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ketan.yapp.business.service.BatchService;
import org.ketan.yapp.persistence.dao.BatchDAO;
import org.ketan.yapp.persistence.entity.BatchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchService")
public class BatchServiceImpl implements BatchService
{

    @Autowired
    private BatchDAO batchDAO;

    @Override
    public BatchEntity save(BatchEntity batchEntity)
    {
        return batchDAO.save(batchEntity);
    }

    @Override
    public List<BatchEntity> findAll()
    {
        List<BatchEntity> batchEntities = new ArrayList<>();

        batchDAO.findAll().forEach(batchEntities::add);

        return batchEntities;
    }

    @Override
    public BatchEntity findOne(Integer batchId)
    {
      return  batchDAO.findOne(batchId);
    }

    @Override
    public BatchEntity update(Integer batchId, BatchEntity batchEntity)
    {
        return batchDAO.save(batchEntity);
    }

    @Override
    public void delete(Integer batchId)
    {
        batchDAO.delete(batchId);
    }

}
