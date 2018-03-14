public class QuickSortDriver {

	// Main Method
    public static void main ( String[] args ) {
		
		// Create a 9-element array of random integers
		int[] array = QuickSort.buildArray( 9, 99 );
		
		System.out.println();

		// Run 10 trials
		for ( int i = 0; i < 10; i++ ) {
			long startTime = System.nanoTime();
			QuickSort.qsort( array );
			long elapsedTime = System.nanoTime() - startTime;
			System.out.println( elapsedTime );
			QuickSort.shuffle( array );
		}
		
		System.out.println();
		
		// Showcase sorted array
		QuickSort.qsort( array );
		QuickSort.printArr( array );
	
	}

}
