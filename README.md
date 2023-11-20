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
