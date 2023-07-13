package com.example.urinalysis.controller;

import com.example.urinalysis.model.Result;
import com.example.urinalysis.model.Task;
import com.example.urinalysis.service.UrinalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrinalysisController {
    
    @Autowired
    private final UrinalysisService urinalysisService;
    
    public UrinalysisController(UrinalysisService urinalysisService) {
        this.urinalysisService = urinalysisService;
    }
    
    @GetMapping("/urinalysis")
    public List<Task> findRecentTasks() {
        return urinalysisService.findRecentTasks();
    }
    
    @GetMapping("/urinalysis/{id}")
    public List<List<Result>> searchResultById(@PathVariable("id") Integer id) {
        return urinalysisService.searchResultById(id);
    }
}
