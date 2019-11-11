package com.arunteltia.todolist;

import com.arunteltia.todolist.DataModel.ToDoData;
import com.arunteltia.todolist.DataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionFeild;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResult(){
        String shortDescription = shortDescriptionFeild.getText();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadlinePicker.getValue();

        TodoItem newItem= new TodoItem(shortDescription,details,deadLineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;

    }
}
