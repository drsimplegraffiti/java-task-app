

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