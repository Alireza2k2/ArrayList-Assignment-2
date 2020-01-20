import java.util.ArrayList;

class Question3 {

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int carry = 0;
        int sizeA = a.size()-1;
        int sizeB = b.size()-1;
        System.out.println(sizeA +"," + sizeB);

        while (sizeA >= 0 || sizeB >= 0) {
            int sum = 0;
            if (sizeA >= 0 && sizeB >= 0) {
                sum = a.get(sizeA) + b.get(sizeB) + carry;
                System.out.print("1: "+a.get(sizeA) + " + " + b.get(sizeB) + " + " + carry);
            } else if (sizeA >= 0) {
                sum = a.get(sizeA) + carry;  
                System.out.print("2: "+a.get(sizeA) + " + " + carry);
            } else if (sizeB >= 0) {
                sum = b.get(sizeB) + carry;
                System.out.print("3: "+b.get(sizeB) + " + " + carry);
            } else {  
                sum = carry;
                System.out.print("4: "+carry);
            }

            if (sum > 9) {
                carry = 1;
                sum -= 10;
                System.out.println(" carrying...");
            } else {
                carry = 0;
                System.out.println(" not carrying...");
            }

            answer.add(0, sum);
            sizeA--;
            sizeB--;
        }

        if (carry > 0) {
            answer.add(0, 1);
        }

        return answer;
    }

    public static void main (String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(9);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(9);
        n2.add(9);
        ArrayList<Integer> n3 = add(n1, n2);
        System.out.println(n3);

    }
}