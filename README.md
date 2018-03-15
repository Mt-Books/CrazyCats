## Quick Sort
Created by: CrazyCats (Tania Cao, Frank Chen, Xinyi Huang)

### Hypothesis
The execution-time of the best case and the average or most likely case will be O(nlogn). The execution-time of the worst case will be O(n^2).

### Background
The array consists of at least one integer. Each array generated will have integers placed in random order.

### Experiment
The algorithm we've developed would execute the following...
1. Create a best case array
2. Populate the array and shuffle them so they are in random order
3. Sort the array using QuickSort
4. Record the execution time 
5. Repeat steps 1-4 ninety-nine times (total number of trials: 100)
6. Repeat steps 1-5 with the worst case array

### Results
![Data]()

### Conclusion
Our hypothesis is correct. The best case occurs when the pivot goes back to the middle and when the implementation takes the least number of swaps. The worst case occurs when the pivot goes to one of the ends of the array, meaning that the worst case is a sorted or reversely sorted array.
