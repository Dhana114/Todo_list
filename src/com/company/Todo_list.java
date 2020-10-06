package com.company;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** TodoList models a Todo List
 * and the operation we can perform on it
 */
public class Todo_list {
    private String topic;
    private HashMap<String,Boolean> tasks;



        /** TodoList instantiates a TodoList with the provided string as a topic for the list
         * and allocates the memory for the list of tasks
         * @param topic The topic for which the list is created for
         */
        public Todo_list(String topic) {
            this.topic=topic;
            this.tasks=new HashMap<String,Boolean>();
        }


           /** addTask adds a task to the map with the name as the key and false as the completion status
            * @param taskName The description of the task to be added
            */
           public void addTask(String taskName) {
           	this.tasks.put(taskName,false);
           }

     /** display displays the topic of the list
      * and each task description and completion status
      */
     public void display() {
     	if(this.tasks.size()==0){
     		System.out.println("Our Todo List for " + topic + "is currently empty!");
     	}else {
     		System.out.println("Here is our Todo List for " + topic);
     		for(Map.Entry<String, Boolean> task : this.tasks.entrySet()) {
     			if (task.getValue()) {
     				System.out.println("Task " + task.getKey() + " is complete");
     			}else {
     				System.out.println("Task " + task.getKey() + " is not done");
     			}
     		}
     	}
     }


        /** remove removes a task at the provided index
         * @param taskName The name of the task to remove
         */
        public void removeTask(String taskName) {
        	if (this.tasks.containsKey(taskName)){
        	   	System.out.println("Removing " + taskName);
        		this.tasks.remove(taskName);
        	}else {
        		System.out.println("No such task!");
        	}
        }



    /** rename renames the task at the provided index
     *
     * @param oldTask The name of the task to rename
     * @param newTask The new description for the task
     */
    	public void rename(String oldTask, String newTask) {
    	    System.out.println("Renaming " + oldTask + " to " + newTask);
    		if (this.tasks.containsKey(oldTask)){
    			this.tasks.put(newTask, this.tasks.get(oldTask));
    			this.tasks.remove(oldTask);
    		}else {
    			System.out.println("No such task!");
    		}
    	}
    

       /** markAsDone marks the task completion status as true
        * @param taskName
        */
       public void markAsDone(String taskName) {
       	System.out.println("Marking " + taskName + " as completed");
       	if (this.tasks.containsKey(taskName)){
       		this.tasks.put(taskName, true);
       	}else {
       		System.out.println("No such task!");
       	}		
       }







    public static void main(String[] args) {
        // write your code here
    }
}
