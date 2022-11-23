package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


// Interface is a blueprint of a class and it is used to implement multiple inheritance. It is a collection of abstract methods.
public interface TaskRepository extends MongoRepository<Task, String> { // Task is the model class and String is the type of primary key

    List<Task> findBySeverity(int severity); // custom method to find by severity level (severity is the field name in Task model class)

    @Query("{assignee: ?0 }")                        // @ is called annotation. For multiple field use @Query("{assignee: ?0 , severity: ?1 }")
    List<Task> getTasksByAssignee(String assignee); // custom method to find by assignee (assignee is the field name in Task model class)
}
