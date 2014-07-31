/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplofactorypublic;

/**
 *
 * @author Oscar
 */
public class FirstFirst extends Namer {
    
    
    public FirstFirst(String s) {
       int i = s.lastIndexOf(" "); //find sep space
       if (i > 0) {
           //left is first name
           first = s.substring(0, i).trim();
           //right is last name
           last =s.substring(i+1).trim();
       }
       else {
           first = ""; // put all in last name
           last = s; // if no space
       }
    }
    
}
