package com.example.urinalysis.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Task {
    
    private Integer taskId;
    private String taskName;
    private Integer revieweeResultId;
    private Integer reviewerResultId;
    
    public Task(Integer taskId, String taskName, Integer revieweeResultId, Integer reviewerResultId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.revieweeResultId = revieweeResultId;
        this.reviewerResultId = reviewerResultId;
    }
}
