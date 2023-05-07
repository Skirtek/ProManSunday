package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int boardId;

    private List<Task> taskList = new ArrayList<>();

    public Board(int boardId) {
        this.boardId = boardId;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public void addNewTask(Task task) {
        taskList.add(task);
    }

    public void showAllTasks() {
/*        for (Task task: taskList) {
            System.out.println(task);
        }*/

        taskList.forEach(System.out::println);
    }
}
