package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "tasks") // collection name in MongoDB database is "tasks"
@Data // lombok annotation to generate getters and setters
@AllArgsConstructor // generates constructor with all fields
@NoArgsConstructor // default constructor
public class Task {
    @Id                   // @Id is set as primary key
    private String taskId; // taskId is the primary key in MongoDB database and private means it can only be accessed by this class
    private String description;
    private int severity;
    private String assignee;
    private int storyPoint;
    private Date createdDate = new Date();
    private Date updatedDate = new Date(); // default value is current date

}


