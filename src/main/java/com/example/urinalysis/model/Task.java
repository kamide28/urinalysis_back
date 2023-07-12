package com.example.urinalysis.model;

import lombok.Getter;

import java.util.Objects;

@Getter
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId) && Objects.equals(taskName, task.taskName) && Objects.equals(revieweeResultId, task.revieweeResultId) && Objects.equals(reviewerResultId, task.reviewerResultId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, revieweeResultId, reviewerResultId);
    }
}
