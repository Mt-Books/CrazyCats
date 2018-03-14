
public class QuickSortTester {

	// Main Method
    public static void main ( String[] args ) {
		
		// Most Likely Case
	        int[] array = QuickSort.buildArray( 9, 99 );
		
		System.out.println();

		long totalTime = 0;
		
		for ( int i = 0; i < 100; i++ ) {
		    long startTime = System.nanoTime();
		    QuickSort.qsort( array );
		    long elapsedTime = System.nanoTime() - startTime;
		    totalTime += elapsedTime;
		    QuickSort.shuffle( array );
		}

		System.out.println( totalTime / 100 );
		System.out.println();

		
		// Best Case
		int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		long bestTotal = 0;
		
		for ( int i = 0; i < 100; i++ ) {
		    long bestStart = System.nanoTime();
		    QuickSort.qsort( array2 );
		    long bestEnd = System.nanoTime() - bestStart;
		    bestTotal += bestEnd;
		}

		System.out.println( bestTotal / 100 );
		System.out.println();
		

		// Worst Case
		int[] array3 = { 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int[] array3a = { 1, 1, 1, 1, 1, 1, 1, 1, 1};

		long worstTotal = 0;
		
		for ( int i = 0; i < 100; i++ ) {
		    long worstStart = System.nanoTime();
		    QuickSort.qsort( array3 );
		    long worstEnd = System.nanoTime() - worstStart;
		    worstTotal += worstEnd;
		    array3 = array3a;
		}

		System.out.println( worstTotal / 100 );
	
	}

}
