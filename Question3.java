/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author Kevin
 */
public class Question3 {

    public static void main(String[] args)
	{
		automobile truck = new automobile( "Truck: ", 3);
		automobile van = new automobile( "Van: ", 4);
		automobile sport = new automobile( "Sport: Car ", 6);
	
		
		System.out.println(truck.About());

		
		System.out.println(van.About());

		
		System.out.println(sport.About());
	}
    
}
