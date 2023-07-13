package com.example.urinalysis.mapper;

import com.example.urinalysis.model.Result;
import com.example.urinalysis.model.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UrinalysisMapper {
    @Select("SELECT * FROM tasks ORDER BY taskId DESC LIMIT 30")
    List<Task> findRecentTasks();
    
    @Select("SELECT * FROM tasks WHERE taskId= #{id}")
    Task findTaskById(Integer id);
    
    @Select("SELECT * FROM reviewee_results WHERE revieweeResultId= #{id}")
    List<Result> searchRevieweeResultById(Integer id);
    
    @Select("SELECT * FROM reviewer_results WHERE reviewerResultId = #{id}")
    List<Result> searchReviewerResultById(Integer id);
    
    @Insert("INSERT INTO tasks(taskName) VALUES(#{taskName},revieweeResultId=taskId,reviewerResultId=taskId)")
    void createTask(Task task);
}
