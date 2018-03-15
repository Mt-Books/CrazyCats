
public class QuickSortTester {

	// Main Method
    public static void main ( String[] args ) {

     
	// Most Likely Case
		
		System.out.println();

		long totalTime = 0;
		
		for ( int i = 1; i < 101; i++ ) {
		    int[] array = QuickSort.buildArray( i, 99 );
		    long startTime = System.nanoTime();
		    QuickSort.qsort( array );
		    long elapsedTime = System.nanoTime() - startTime;
		 
		    System.out.println( i  + "," + elapsedTime + ",");
		    totalTime += elapsedTime;
		}

		System.out.println( totalTime / 100 );
		System.out.println();

		/*
		// Best Case
		int[] array2 = { 5, 4, 2, 3, 1, 8, 6, 7, 9 };
		int[] array2a = { 5, 4, 2, 3, 1, 8, 6, 7, 9 };
       
		long bestTotal = 0;
		
		for ( int i = 0; i < 100; i++ ) {
		    long bestStart = System.nanoTime();
		    QuickSort.qsort( array2 );
		    long bestEnd = System.nanoTime() - bestStart;
		    bestTotal += bestEnd;
		    array2 = array2a;
		}

		System.out.println( bestTotal / 100 );
		System.out.println();
		
		
		// Worst Case
		int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		long worstTotal = 0;
		
		for ( int i = 0; i < 100; i++ ) {
		    long worstStart = System.nanoTime();
		    QuickSort.qsort( array3 );
		    long worstEnd = System.nanoTime() - worstStart;
		    worstTotal += worstEnd;
		}

		System.out.println( worstTotal / 100 );
		*/
	}

}
