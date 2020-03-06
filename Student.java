package simulator;

public class Student {
    //Instance variables for Student
    private double qualityThreshold;
    private int IDNum;
    private int yearsOnList;

    //Constructor for Student, to be completed by you
    public Student (double qual, int ID) {
    	this.qualityThreshold = qual;
    	this.IDNum = ID;
    	this.yearsOnList = 0;
    }

    //Returns quality threshold for student
    public double getQualityThreshold () {
        return this.qualityThreshold;
    }

    //Returns ID number for student
    public int getIDNum () {
        return this.IDNum;
    }

    public int getYearsOnList () {
        return this.yearsOnList;
    }

    //Lowers quality threshold after cycle of simulation, to be completed by you
    public void addDesperation() {
    	this.qualityThreshold *= .9;
    }

    //Adds a year to elapsed waiting time, to be completed by you
    public void addYear () {
    	this.yearsOnList +=1;
    }
}
