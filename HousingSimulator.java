package simulator;

import java.util.ArrayList;
import java.util.Scanner;

import simulator.MyQueue.Node;

public class HousingSimulator {
    //Functions for generating random double
    public static double randomDouble(int from, int to) {
        return Math.random() * to + from;
    }

    //Functions for generating random int
    public static int randomInt(int from, int to) {
        return (int) Math.random() * to + from;
    }

	//To be completed by you
    public static <E> void runSimulation(int k, int N) { 
    	System.out.println(k);
    	System.out.println(N);
    	Apartment apartList[] = new Apartment [N];
    	for(int i = 0; i< N; i++) {
    		Apartment temp = new Apartment(randomDouble(0,1),i,0);
    		
    		apartList[i] = temp;    		
    	}
    	MyQueue studentLst = new MyQueue();
    	for(int i = 0; i < k; i++) {
    		Student temp = new Student(randomDouble(0,1),i);
    		Node x = new Node(temp);
    		studentLst.offer(temp);
    		
    	}
    	System.out.println("start sim");
    	int year =1;
    	
    	while(year<11) {
    		int apartTaken = 0;
	    	for (int i = 0; i< N; i++) {
	    		Apartment temp = apartList[i];
	    		if(temp.getYearsLeft()==0) {
		    		for (int j = 0; j<k; j++) {
		    			Student samp = (Student) studentLst.poll();
		    			if(samp.getQualityThreshold()>temp.getQuality()) {
		    				System.out.println("Student quality threshold followed by appartment quality:");
		    				System.out.println(samp.getQualityThreshold());
		    				System.out.println(temp.getQuality());
		    				samp.addDesperation();
		    				studentLst.offer(samp);
		    				
		    			}
		    			else {
		    				
		    				System.out.println("Student quality threshold followed by appartment quality:");
		    				System.out.println(samp.getQualityThreshold());
		    				System.out.println(temp.getQuality());
		    				System.out.println("Apartment taken");
		    				apartTaken++;
		    				temp.setYearsLeft(randomInt(1,5));
		    				k--;
		    				break;
		    			}
		    		}
	    		}
	    		
	    	}
	    	System.out.println("year " + year + " statistics:");
	    	System.out.println("apartments taken:");
	    	System.out.println(apartTaken);
	    	int apartVacated = 0;
	    	for (int i = 0; i<N; i++) {
	    		Apartment temp = apartList[i];
	    		if(temp.getYearsLeft()==1) {
	    			apartVacated++;
	    		}
	    		if(temp.getYearsLeft()>0) {
	    			temp.setYearsLeft(temp.getYearsLeft()-1);
	    		}
	    		
	    	}
	    	System.out.println("apartments vacated:");
	    	System.out.println(apartVacated);
	    	year++;
    	}
    }

    //Main method for simulation
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to run simulation with: ");
        int k = sc.nextInt();

        System.out.print("Enter number of apartments to run simulation with: ");
        int N = sc.nextInt();

        runSimulation(k, N);
    }
}
