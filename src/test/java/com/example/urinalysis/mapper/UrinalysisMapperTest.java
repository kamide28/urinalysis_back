package com.example.urinalysis.mapper;

import com.example.urinalysis.model.Result;
import com.example.urinalysis.model.Task;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DBRider
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UrinalysisMapperTest {
    @Autowired
    UrinalysisMapper urinalysisMapper;
    
    @Test
    @DataSet(value = "datasets/tasks.yml")
    @Transactional
    void タスクが取得できること() {
        List<Task> tasks = urinalysisMapper.findRecentTasks();
        assertThat(tasks)
                .hasSize(3)
                .contains(
                        new Task(1, "7/7鈴木一本目", 1, 1),
                        new Task(2, "7/7山田一本目", 2, 2),
                        new Task(3, "7/7鈴木二本目", 3, 3)
                );
    }
    
    @Test
    @DataSet(value = "datasets/tasks.yml")
    @Transactional
    void ID指定のタスクを取得できること() {
        Task task = urinalysisMapper.findTaskById(1);
        assertThat(task).isEqualTo(
                new Task(1, "7/7鈴木一本目", 1, 1)
        );
    }
    
    @Test
    @DataSet(value = "datasets/empty.yml")
    @Transactional
    void IDが存在しないときは空で返すこと() {
        Task task = urinalysisMapper.findTaskById(99);
        assertThat(task).isNull();
    }
    
    @Test
    @DataSet(value = "datasets/revieweeResult.yml")
    @Transactional
    void ID指定のレビュイー結果を取得できること() {
        List<Result> revieweeResult = urinalysisMapper.searchRevieweeResultById(1);
        assertThat(revieweeResult).hasSize(10).contains(
                new Result(1, "鈴木", "1~3/20", "1~3/20", "1~3/1",
                        "1~3/10", "1~3/10", "桿菌(1+)", "正常範囲内と考えます")
        );
    }
    
    @Test
    @DataSet(value = "datasets/reviewerResult.yml")
    @Transactional
    void ID指定のレビュワー結果を取得できること() {
        List<Result> reviewerResult = urinalysisMapper.searchReviewerResultById(1);
        assertThat(reviewerResult).contains(
                new Result(1, "鈴木", "1~3/20", "1~3/20", "1~3/1",
                        "1~3/10", "1~3/10", "桿菌(1+)", "正常範囲内と考えます")
        );
    }
}

