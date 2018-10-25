/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


public class RectangleTest {
    //main method
    public static void main(String []args){
        //Creates two rectangle objects
        Rectangle rt1 = new Rectangle(4.0,40.0);
        Rectangle rt2 = new Rectangle(3.5, 35.9);
        //Output for results
        System.out.print("Rectangle One \n" + rt1);
        System.out.print("\n---------------\n");
        System.out.print("Rectangle Two \n" + rt2 + "\n");
    }
}
