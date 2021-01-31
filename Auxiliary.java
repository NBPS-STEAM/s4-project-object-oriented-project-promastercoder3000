public class Auxiliary{
// the purpose of this class is to hold any additional methods the program may need
// without making a mess of the code in the other classes.
// the method below is a static method that belongs to the class in which we can use it across
// our other files.
public static void delayTime(int timeInMs){ 
      //this method will be accessed in other classes as well.
        try{
          Thread.sleep(timeInMs); // Thread.sleep() pauses the execution of the program for a prescribed amount of time. Thread. followed by the "sleep" function, is the first step in delaying a program's execution. Parenthesis are then added at the end, where you put a certain amount of time ( in milliseconds ) to pause the running of the program. 1000 milliseconds is equal to 1 second, and there is a one-second pause between each line of dialogue; meanwhile, 500 milliseconds is 0.5 seconds ( half a second ). 3000 milliseconds will turn out to be 3 seconds, while 2000 milliseconds will turn out to be 2 seconds.
        }
        catch(InterruptedException ie){ //  "InterruptedException" is thrown from thread.sleep() in this program when it's called; therefore, we must catch the exception by any means, even if no errors have occured.
          ;
        }
      }
      
}