# Eratothenes

An algorithm developed by Sieve of Erathothenes to determine if a number is prime.

Works by creating an array and setting every value from 2 to false.

For loop (int i) is created with a nested for loop (int j), where the nested for loop checks if the value in the array is true or false, if true then the for loop will divide j by i and check if there's a remainder. If there is no remainder, then that value will be set to false, meaning it is not a prime number.
