/*
file name:StopWatch
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:interval time between the start and end clicks
*/

public class StopWatch {

private long mStartTime = 0;
private long mStopTime = 0;
private boolean mRunning = false;


public void start() {
    this.mStartTime = System.currentTimeMillis();
    this.mRunning = true;
}


public void stop() {
    this.mStopTime = System.currentTimeMillis();
    this.mRunning = false;
}


//elaspsed time in milliseconds
public long getElapsedTime() {
    long elapsed;
    if (mRunning) {
         elapsed = (System.currentTimeMillis() - mStartTime);
    }
    else {
        elapsed = (mStopTime - mStartTime);
    }
    return elapsed;
}


//elaspsed time in seconds
public long getElapsedTimeSecs() {
    long elapsed;
    if (mRunning) {
        elapsed = ((System.currentTimeMillis() - mStartTime) / 1000);
    }
    else {
        elapsed = ((mStopTime - mStartTime) / 1000);
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
