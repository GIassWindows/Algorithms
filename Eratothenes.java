public class Eratosthenes{
    public static void main(String[] args){
        boolean[] PrimeList = new boolean[30];
      
        // Set all values from 2 inclusive to true.
        for(int i = 2; i < PrimeList.length; i++){
            PrimeList[i] = true;
        }
        
        // Using nested for loop where j % i == 0 (meaning it's divisible by that number) will turn into a non-prime number
        for(int i = 2; i < PrimeList.length; i++){
            for(int j = i+1; j < PrimeList.length; j++){
                if(PrimeList[j] == true){
                    if(j % i == 0){
                        PrimeList[j] = false;
                    }
                }
            }
        }
        // Printing out if it's prime number or not
        for(int i = 0; i < PrimeList.length; i++){
            System.out.println(PrimeList[i] + " " + i);
        }
    }
}
