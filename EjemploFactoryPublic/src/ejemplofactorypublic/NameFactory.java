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
public class NameFactory {
//returns an instance of LastFirst or FirstFirst
//depending on whether a comma is found
   public Namer getNamer(String entry) {
   int i = entry.indexOf(","); //comma determines name order
   if (i>0)
      return new LastFirst(entry); //return one class
   else
      return new FirstFirst(entry); //or the other
   }
}

