/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spanngradebook;

import java.util.Arrays;

/**
 *
 * @author Shanell A. Spann
 * Final Exam Practice --- ITDEV110
 */
public class StudentGrade 
{
    String firstName;
    String lastName;
    String studentID;
    
    int[] assignmentsArray = {0,0,0,0,0,0,0,0,0,0};
    int[] discussionTopics = {0,0,0,0,0,0,0,0,0,0};
    int[] exams = {0,0};
    int project = 0;
    
    public StudentGrade()
    {
        
    }
    
    public StudentGrade(String fn, String ln, String id, int[] assignments, 
                        int[] dt, int[] exams, int proj) // we will create our own 2 string method to display object so we have to override existing one. 
    {
        this.firstName = fn;
        this.lastName = ln;
        this.studentID = id;
        this.assignmentsArray = assignments;
        this.discussionTopics = dt;
        this.exams = exams;
        this.project = proj; 
    }
    
    @Override
    public String toString()
    {
        return "\nStudent Gradebook: \n\tFirst Name = " + this.firstName + 
                "\n\tLast Name = " + this.lastName +
                "\n\tStudent ID = " + this.studentID +
                "\n\tAssignments = " + convertArray(this.assignmentsArray) +
                "\n\tDiscussion Topics = " + convertArray(this.discussionTopics) +
                "\n\tExams = " + convertArray(this.exams) + 
                "\n\tProjects = " + this.project ; //this is a concatonated string    
    }
    
    public String convertArray(int[] array) // means we want to recieve an array
    {
       String ZERO = "0";
       String myDisplay;
       
       String strArray[] = new String[array.length]; //means we want it to accept whatever length of whatever array we are passing 
       for(int i = 0; i < array.length; i++)
       {
           if(array[i] > 0) //if array element is greater than zero, we will convert
           {
               strArray[i] = String.valueOf(array[i]);
           }
           else
           {
              strArray[i] = ZERO; //when the element is ZERO, display a "0" for zero
           }         
       }
   
        myDisplay = Arrays.toString(strArray).replace(", ", "][");
       
       return myDisplay;
       
       
    }
    
    
   
    
    
    
    
}
