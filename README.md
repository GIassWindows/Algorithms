# Big O Notation

Big O Notation is a way to measure time complexity of a code. Often displayed as O(1), O(n), O(n^2) where n is the factor that affects the runtime of the code. 

N is often a loop, when there are no loops, the time complexity is constant. 

O(1) is a constant time complexity represented in this case. There are no loops involved.

O(n) is a linear time complexity. This represents the runtime of the code affected by a loop.

O(n^2) is a quadratic time complexity. This represents the runtime of the code affected by a loop and a nested loop.



# Eratothenes

An algorithm developed by Sieve of Erathothenes to determine if a number is prime.

Works by creating an array and setting every value from 2 to false.

For loop (int i) is created with a nested for loop (int j), where the nested for loop checks if the value in the array is true or false, if true then the for loop will divide j by i and check if there's a remainder. If there is no remainder, then that value will be set to false, meaning it is not a prime number.

# Basic Sorting Algorithms

Assuming we have an unsorted array with a size of 15. 

We are given 3 basic sorting methods:
- Bubble Sort, O(n^2) time complexity. This is the slowest but the most accurate sort.
- Selection Sort, O(n^2) time complexity. This is a very simple sort, but inaccurate when dealing with bigger arrays. 
- Insertion Sort, O(n^2) time complexity. Despite also having a O(n^2) time complexity, this is the fastest sort **provided** the array is partially sorted.

### Bubble Sort

Bubble sorting works by comparing adjacent array elements. This algorithm repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The algorithm runs until it is completely sorted.

### Selection Sort

Selection sorting works by repeatedly selecting the minimum element from an unsorted portion of the array and puts it back to the beginning. 

## Insertion Sort

Insertion sorting works the fastest by sorting a partially sorted array and rebuilds the array one value at a time.
