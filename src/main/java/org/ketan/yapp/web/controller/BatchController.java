package org.ketan.yapp.web.controller;

import java.util.List;

import org.ketan.yapp.business.service.BatchService;
import org.ketan.yapp.persistence.entity.BatchEntity;
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
@RequestMapping(value = "/batches")
public class BatchController
{

    @Autowired
    private BatchService batchservice;

    @GetMapping
    public List<BatchEntity> findAll()
    {
        return batchservice.findAll();
    }

    @GetMapping("/{batchId}")
    public BatchEntity findOne(@PathVariable Integer batchId)
    {
        return batchservice.findOne(batchId);
    }

    @PostMapping
    public BatchEntity save(@RequestBody BatchEntity batchEntity)
    {
        return batchservice.save(batchEntity);
    }

    @PutMapping("/{batchId}")
    public BatchEntity update(@PathVariable Integer batchId, @RequestBody BatchEntity batchEntity)
    {
        return batchservice.update(batchId, batchEntity);
    }

    @DeleteMapping("/{batchId}")
    public void delete(@PathVariable Integer batchId)
    {
        batchservice.delete(batchId);
    }
}
