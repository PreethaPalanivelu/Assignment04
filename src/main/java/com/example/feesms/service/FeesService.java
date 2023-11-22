package com.example.feesms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.feesms.model.Fees;
import com.example.feesms.repository.FeesRepository;

@Service
public class FeesService
{
    @Autowired
    FeesRepository feesRepository;

    public List<Fees> getAllFees()
    {
        List<Fees> feess = new ArrayList<Fees>();
        feesRepository.findAll().forEach(fees -> feess.add(fees));
        return feess;
    }

    public Fees getFeesById(int id)
    {
        return feesRepository.findById(id).get();
    }

    public void saveOrUpdate(Fees fees)
    {
        feesRepository.save(fees);
    }

    public void delete(int id)
    {
        feesRepository.deleteById(id);
    }


}
