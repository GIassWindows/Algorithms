public class BigONotation {
    // O(1) representing constant time complexity of the code. The code's runtime remains constant as there are no loops involved.
    static void ConstantTime(){
        System.out.println("O(1) time complexity.");
    }

    // O(n) representing linear time complexity of the code. The code's runtime is linear and grows with n as there is a loops involved. The loop in this case is N.
    static void LinearTime(){
        for(int i = 0; i < 1; i++){
            System.out.println("O(n) time complexity.");
        }
    }

    // O(n^2) representing quadratic time complexity of the code. The code's runtime is quadratic and grows with n as there is a nested loop involved. 
    static void QuadraticTime(){
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 1; j++){
                System.out.println("O(n^2) time complexity.");
            }
        }
    }
}
