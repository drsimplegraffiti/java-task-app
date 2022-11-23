package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // @RestController annotation is used to create RESTful web services using Spring MVC.
@RequestMapping("/tasks")
public class TaskController {

    @Autowired // Autowired annotation is used to inject the object dependency implicitly.
    private TaskService service; // import task service

    @PostMapping // @PostMapping annotation handles the HTTP POST requests matched with given URI expression.
    @ResponseStatus(HttpStatus.CREATED) // @ResponseStatus annotation is used to set the response status code.
    public Task createTask(@RequestBody Task task) {
        return service.addTask(task);
    } //@RequestBody annotation binds the HTTP request body with a domain object in method parameter or return type.

    @GetMapping // @GetMapping annotation handles the HTTP GET requests matched with given URI expression.
    public List<Task> getTasks() { // get all tasks
        return service.findAllTasks();
    }

    @GetMapping("/{taskId}") // @PathVariable annotation is used to bind a method parameter or method return value to a URI template variable.
    public Task getTask(@PathVariable String taskId){
        return service.getTaskByTaskId(taskId);
    }


    @GetMapping("/severity/{severity}")
    public List<Task> findTaskUsingSeverity(@PathVariable int severity){
        return service.getTaskBySeverity(severity);
    }

    @GetMapping("/assignee/{assignee}") // @PathVariable annotation is used to bind a method parameter or method return value to a URI template variable.
    public List<Task> getTaskByAssignee(@PathVariable String assignee){
        return service.getTaskByAssignee(assignee);
    }

    @PutMapping // @PutMapping annotation handles the HTTP PUT requests matched with given URI expression.
    public Task modifyTask(@RequestBody Task task){

        return service.updateTask(task);
    }

    @DeleteMapping("/{taskId}") // @DeleteMapping annotation handles the HTTP DELETE requests matched with given URI expression.
    public String deleteTask(@PathVariable String taskId){

        return service.deleteTask(taskId); // return the deleted task id
    }

}

