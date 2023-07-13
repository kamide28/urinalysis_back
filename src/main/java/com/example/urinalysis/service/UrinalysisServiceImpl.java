package com.example.urinalysis.service;

import com.example.urinalysis.mapper.UrinalysisMapper;
import com.example.urinalysis.model.Result;
import com.example.urinalysis.model.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UrinalysisServiceImpl implements UrinalysisService {
    private final UrinalysisMapper urinalysisMapper;
    
    public UrinalysisServiceImpl(UrinalysisMapper urinalysisMapper) {
        this.urinalysisMapper = urinalysisMapper;
    }
    
    @Override
    public List<Task> findRecentTasks() {
        return urinalysisMapper.findRecentTasks();
    }
    
    @Override
    public List<List<Result>> searchResultById(Integer id) {
        Task task = urinalysisMapper.findTaskById(id);
        if (task == null) {
            throw new RuntimeException();
        }
        List<List<Result>> result = Arrays.asList(urinalysisMapper.searchRevieweeResultById(task.getRevieweeResultId()),
                urinalysisMapper.searchReviewerResultById(task.getReviewerResultId()));
        return result;
    }
}
