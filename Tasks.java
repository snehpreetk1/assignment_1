package org.example;

import java.util.ArrayList;

public class Tasks {

    private ArrayList<String> tasks;
    private ArrayList<String> completedTasks;

    public Tasks() {
        tasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
    }

    // Add a new task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Remove a task
    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Mark a task as completed
    public void markTaskAsCompleted(String task) {
        if (tasks.remove(task)) {
            completedTasks.add(task);
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Show all completed tasks
    public void showCompletedTasks() {
        System.out.println("Completed tasks:");
        for (String task : completedTasks) {
            System.out.println("- " + task);
        }
    }
}
