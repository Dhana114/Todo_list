package com.company;

public class MorningRoutine {


    /** MorningRoutine implements our logic workflow
     * This version adds the capability to track whether a task is completed
     */

        public static void main(String[] args) {
            Todo_list myTodoList = new Todo_list("My morning routine");
            myTodoList.addTask("Wake up");
            myTodoList.addTask("Shower");
            myTodoList.addTask("Have breakfast");
            myTodoList.addTask("Go to work");
            myTodoList.display();
            myTodoList.markAsDone("Wake up");
            myTodoList.markAsDone("My working day");
            myTodoList.display();
            myTodoList.removeTask("Have Breakfast");
            myTodoList.display();
            myTodoList.rename("Shower", "Take bath");
            myTodoList.display();
        }

    }

