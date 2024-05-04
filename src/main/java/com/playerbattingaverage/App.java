package com.playerbattingaverage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 *  3
		 *  smith 55.55 09/08/1945
steven 45.55 09/08/1947
kohli 35.55 09/08/1950
    	 */
    	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int noOfPlayers = myObj.nextInt();// Read user input
        
        List<Player> lt = new ArrayList<Player>();
        
        for(int i=0;i<noOfPlayers;i++) {
        	Player pl = new Player(myObj.next(),myObj.nextDouble(),myObj.next());
        	lt.add(pl);
        }
        
        System.out.println(lt);
        
      Collections.sort(lt);
      
      for(Player p: lt) {
    	  System.out.println(p);
      }
    }
}

//i/p
//Smith 40.6 2/06/1988
//Warner 50.2 27/10/1986
//Finch 46.7 17/11/1986
//Lyon 20.7 20/11/1987
//Maxwell 50.2 14/11/1985

//o/p
//Player [name=Maxwell, average=50.2, dob=14/11/1985]
//Player [name=Warner, average=50.2, dob=27/10/1986]
//Player [name=Finch, average=46.7, dob=17/11/1986]
//Player [name=Smith, average=40.6, dob=2/06/1988]
//Player [name=Lyon, average=20.7, dob=20/11/1987]
