public class QuickSortDriver {

    public static void main ( String[] args ) {

		int[] array = { 15, 60, 23, 44, 58, 91, 2, 3 };
		
		System.out.println();

		for ( int i = 0; i <= 10; i++ ) {
			long startTime = System.nanoTime();
			QuickSort.qsort( array );
			long elapsedTime = System.nanoTime() - startTime;
			System.out.println( elapsedTime );
			QuickSort.shuffle( array );
		}
		
		System.out.println();
		
		QuickSort.qsort( array );
		QuickSort.printArr( array );
	
	}

}
