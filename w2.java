
    // C-3.18 Let B be an array of size n26 containing integers from 1 to n-5 inclusive, five of which are repeated.
// Describe an algorithm for finding the five integers in 8 that are repeated.
    public class w2 {

        int arra[]={ 7, 3, 4, 5, 5, 6, 2 , 2 , 4 , 3 };
        static void printTwoElements(int arra[])
        {
            int i;
            System.out.println("The repeating element is ");
            for ( i = 0; i <arra.length ; i++) {
                int abs_val =Math.abs(arra[i]);
                if (arra[abs_val -1]>0)
                    arra[abs_val  - 1] = -arra[abs_val  - 1];
                else
                    System.out.println(abs_val );
            }

        }

        public static void main(String[] args) {
            w2 a1=new w2();
            printTwoElements(a1.arra);




        }
    }


