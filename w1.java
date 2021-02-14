//C-3.17 Let A be an array of size n22 containing integers from I to n-l inclusive,
// one of which is repeated. Describe an algorithm for finding the integer in A that is repeated.

    public class w1{

    int arr[] = { 7, 3, 4, 5, 5, 6, 2 };

        static void printTwoElements(int arr[])
        {
            int i;
            System.out.print("The repeating element is ");

            for (i = 0; i < arr.length; i++) {
                int abs_val = Math.abs(arr[i]);
                if (arr[abs_val - 1] > 0)
                    arr[abs_val - 1] = -arr[abs_val - 1];
                else
                    System.out.println(abs_val);
            }

        }

        public static void main(String[] args)
        {
            w1 a1=new w1();
            printTwoElements(a1.arr);
        }
    }


