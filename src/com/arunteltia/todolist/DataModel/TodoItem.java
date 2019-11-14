package com.arunteltia.todolist.DataModel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDiscription;
    private String details;
    private LocalDate deadline;


    public String getShortDiscription() {
        return shortDiscription;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public TodoItem(String shortDiscription, String details, LocalDate deadline) {
        this.shortDiscription = shortDiscription;
        this.details = details;
        this.deadline = deadline;
    }

    public void setShortDiscription(String shortDiscription) {
        this.shortDiscription = shortDiscription;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

//    @Override
//    public String toString() {
//        return shortDiscription;
//    }
// we have created a custom factory which is converting the reference to the string and we dont need this now

}
