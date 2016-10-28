import java.util.Scanner;

class StopWatch2
  {
    public static void main(String args[])
    {
     long mStart;
     long mEndTime;
     long mEllapsed;
   
      System.out.println("Time ellapsed Count Starts from here");
     
      mStart= System.currentTimeMillis();
      System.out.println("Stop watch Starts from here :"+ mStart);
      
      mEndTime= System.currentTimeMillis();
    
      System.out.println("stop watch finish here  :" +mEndTime);   
      mEllapsed=mEndTime-mStart;
      System.out.println(mEllapsed);

           

     }
  }

   
