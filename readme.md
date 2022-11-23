#### Project Setup 
Go to start.spring.io, choose the below settings and download the zip file

> Lombok - is a Java annotation library which helps to reduce boilerplate code.
> Spring mongodb - is the mongodb dependency

![sp](https://user-images.githubusercontent.com/70065792/203532402-e6f8eed6-9b9e-4116-a5eb-052605dedb0d.png)



---

#### Conencting java app to mongodb
In the `src/main/resources` folder create an `application.yml` file and configure
```yml
spring:
  data:
    mongodb:
      uri : mongodb+srv://<dbname>:<db password>@it8.fccieaj.mongodb.net/?retryWrites=true&w=majority
      database: Task
```

---

#### Change the port number of app
In the `src/main/resources/application.properties` add the port
```
server.port=7000

```

##### Folders (packages to create) and flow
> model -> repository -> service -> controller

#### Create a new task
> localhost:7000/tasks POST
```json
{
"description":"Task 1",
"storyPoint":5,
"severity":1,
"assignee":"james brown"
}
```
#### Response
```json
{
        "taskId": "5a3bd0e0",
        "description": "Task 4",
        "severity": "5",
        "assignee": "Timo brown",
        "storyPoint": "7"
    }
```


#### Get all tasks
> localhost:7000/tasks

##### Get task by id
> localhost:7000/tasks/a3bd0e0


#### Get tasks by severity
> localhost:7000/tasks/severity/:severity

#### Search by assignee
> localhost:7000/task/assignee/:assignee
> localhost:7000/tasks/assignee/Shade brown

#### Update a task
> localhost:7000/tasks
```json
{
    "taskId":"e2d006e9",
    "description":"updated 2",
    "storyPoint":6,
    "severity":6,
    "assignee":"updated Shade brown"
}
```

#### Delete a task
> localhost:7000/tasks/:id DELETE
> localhost:7000/tasks/e2d006e9
