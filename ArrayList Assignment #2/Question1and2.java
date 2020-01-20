import java.util.Scanner;
import java.util.ArrayList;

class Question1and2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(prime(n));
        int k = sc.nextInt();
        Goldbach(prime(n), k);
    }

    public static ArrayList<Integer> prime(int n){

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            nums.add(i);
        }

        for(int p = 2; p<=n; p++){
            for(int i = nums.size()-1; i>-1; i--){
                if(nums.get(i)>p && nums.get(i) % p == 0){
                    nums.remove(i);
                }

            }
        } 
        return nums;

    }

    public static void Goldbach(ArrayList<Integer> nums, int n ){

        int j = 1;
        int number = 0;
        for(int i = nums.size()-j; i>-1; i--){
            if(number == 0){
                number = nums.get(i);
            }
            if(number + nums.get(i) == n){
                System.out.println(number + "+" + nums.get(i) + "=" + n);
                break;
            }
            if(nums.get(i) == 2 && number + nums.get(i) != n){
                j++;
                number = 0; 
                i = nums.size()-j;
            }
        }

    }
}