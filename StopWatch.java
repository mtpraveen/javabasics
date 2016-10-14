/*
file name:StopWatch.java
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:interval time between the start and end clicks
*/
//package com.bridgelabz.java;
public class StopWatch {

	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;


	public void start() {
    	this.startTime = System.currentTimeMillis();
    	this.running = true;
	}


	public void stop() {
    	this.stopTime = System.currentTimeMillis();
    	this.running = false;
	}


	//elaspsed time in milliseconds
	public long getElapsedTime() {
    	long elapsed;
    	if (running) {
        elapsed = (System.currentTimeMillis() - startTime);
   	 }
    	else {
        elapsed = (stopTime - startTime);
   	}
   	return elapsed;
	}


	//elaspsed time in seconds
	public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
       	}
        else {
        elapsed = ((stopTime - startTime) / 1000);
  	}
   	return elapsed;
	}




//sample usage
public static void main(String[] args) {
    StopWatch s = new StopWatch();
    s.start();
    //code you want to time goes here
	for(int i=1;i<40;i++)
	{
	System.out.println(i);
	}

    s.stop();
    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime()); 
	System.out.println("elapsed time in seconds: " + s.getElapsedTimeSecs());
}
}
