package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    // CRUD -> CREATE, READ, UPDATE, DELETE

    // CREATE
    public Task addTask(Task task) {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(task);
    }

    // GET ALL TASK
    public List<Task> findAllTasks() {
        return repository.findAll();
    }

    // GET SINGLE TASK
    public Task getTaskByTaskId(String taskId) {
        return repository.findById(taskId).get();
    }

    // GET TASK BY SEVERITY
    public List<Task> getTaskBySeverity(int severity) {
        return repository.findBySeverity(severity);
    }

    // GET TASK BY ASSIGNEE
    public List<Task> getTaskByAssignee(String assignee) {
        return repository.getTasksByAssignee(assignee);
    }

    // UPDATE TASK
    public Task updateTask(Task taskRequest) {
        // get the existing document from DB
        // populate the new value from request to existing object/entity/document
        Task existingTask = repository.findById(taskRequest.getTaskId()).get();
        existingTask.setDescription(taskRequest.getDescription());
        existingTask.setSeverity(taskRequest.getSeverity());
        existingTask.setStoryPoint(taskRequest.getStoryPoint());
        existingTask.setAssignee(taskRequest.getAssignee());

        return repository.save(existingTask);

    }


    // DELETE A TASK
    public String deleteTask(String taskId) {
        repository.deleteById(taskId);
        return taskId + "Task deleted successfully.";
    }

}
