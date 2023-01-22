package com.example.todo;

public class Model {

    private String task, description, id, date, email;

    public Model() {
    }

    public Model(String task, String description, String id, String date, String email) {
        this.task = task;
        this.description = description;
        this.id = id;
        this.date = date;
        this.email = email;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
