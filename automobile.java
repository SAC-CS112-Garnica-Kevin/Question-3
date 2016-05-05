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
public class automobile 
{

	private String name;
	private int transmission;
	private String dis; 



	public automobile (String name, int trans )
	{
		this.name = name;
		transmission = trans; 
	}


	public String About() 
	{
		this.dis = name + transmission + " gear(s)";
		return dis;
	}
}
