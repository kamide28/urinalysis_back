package com.example.urinalysis.service;

import com.example.urinalysis.model.Result;
import com.example.urinalysis.model.Task;

import java.util.List;

public interface UrinalysisService {
    List<Task> findRecentTasks();
    
    List<List<Result>> searchResultById(Integer id);
}
