/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spanngradebook;

import java.util.ArrayList;

/**
 *
 * @author Shanell A. Spann
 */
public class Controller 
{
    ArrayList <StudentGrade> students = new ArrayList<>(); //instead of square brackets, we use the triangles for ArrayLists
    
    
    public Controller()
    {
        //create some gradebook objects so we can have something to play with
        StudentGrade kristen = new StudentGrade("Kristen", "Ross", "01234567",
        new int[]{48,49,50,50,45,50,50,50,49,50}, new int[]{10,9,10,10,10,9,9,10,10,10},
        new int[]{100, 100}, 200);
        
        StudentGrade janet = new StudentGrade("Janet", "Pierce", "01236587",
        new int[]{48,39,50,50,46,50,50,50,49,50}, new int[]{10,9,8,10,10,9,7,10,10,10},
        new int[]{100, 95}, 200);
        
        System.out.println(kristen.toString()); // to display scores
        System.out.println(janet.toString());
        
        students.add(janet);
        students.add(kristen);     
    }
    
}
