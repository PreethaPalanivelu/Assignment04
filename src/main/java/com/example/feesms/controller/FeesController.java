package com.example.feesms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.feesms.model.Fees;
import com.example.feesms.service.FeesService;

@RestController
public class FeesController
{
    @Autowired
    FeesService feesService;

    @GetMapping("/fees")
    private List<Fees> getAllFees()
    {
        return feesService.getAllFees();
    }



    @PostMapping("/fees")
    private int saveFees(@RequestBody Fees fees)
    {
        feesService.saveOrUpdate(fees);
        return fees.getId();
    }
}
