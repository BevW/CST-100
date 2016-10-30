package topic02.chapter09;

public class E06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// had to get A LOT of information from other chapters to do this
		
		//create object stopwatch
		StopWatch stopwatch = new StopWatch();
		
		//invoke stopwatch
		stopwatch.Start();
		
		//create array with random 100000
		int[] array = new int [100000];
			for (int i = 0; i < array.length; i++){
				array[i] = (int)(Math.random() * 100000);
			}
		
		//sort 100000
		int [] arrayb = new int[100000];
			for (int i = 1; i < arrayb.length - 1; i++) {
				int currentMin = arrayb[i];
				int currentMinIndex = i;
			
					for (int j = i + 1; j < arrayb.length; j++){
						if (currentMin > arrayb[j]){
							currentMin = arrayb[j];
							currentMinIndex = j;
						}
						
					}
					// swap array[i] with array[currentMinIndex] if necessary
					if (currentMinIndex != i){
						arrayb[currentMinIndex] = arrayb[i];
						arrayb[i] = currentMin;
					}
			}
		//invoke stopwatch
		stopwatch.Stop();
		
		//display
		System.out.println("The execution time of sorting 100,000 numbers is " + StopWatch.getElapsedTime() +
				" milliseconds.");
	}
}


class StopWatch {
//Created a non public class with no main method because it does not need to run	
	private static long startTime;
	private static long endTime;
	
	//no arg constructor setting startTime = to current time
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	//A method named start() that resets the startTime to the current time.
	public void Start() {
		startTime = System.currentTimeMillis();
	}
	
	//A method named stop() that sets the endTime to the current time.
	public void Stop() {
		endTime = System.currentTimeMillis();
	}
	
	//getter method for startTime data field
	
	public static long getStartTime() {
		return startTime;
	}
	//getter method for endTime data field
	public static long getEndTime() {
		return endTime;
	}
	
	/* A method named getElapsedTime() that returns the elapsed time for the
	* stopwatch in milliseconds.
	*/
	public static long getElapsedTime(){
		return getEndTime() - getStartTime();
	}	
	
	
}

