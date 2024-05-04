package com.playerbattingaverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayerHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        
        int noOfPlayers = myObj.nextInt();// Read user input
        String names =  myObj.next();
        String heights =  myObj.next();
        
        String[] myArray = names.split(",");
        List <String> myList = Arrays.asList(myArray);
        
        String[] heightArray = heights.split(",");
        List <String> heightList = Arrays.asList(heightArray);
        
        //new players list with their heights
        List<Players> plsList = new ArrayList<Players>();
        
        for(int i=0;i<noOfPlayers;i++) {
        	Players pls = new Players(myArray[i],Integer.parseInt(heightArray[i]));
        	plsList.add(pls);
        }
        
        //print the list
        System.out.println(plsList);

	}

}
