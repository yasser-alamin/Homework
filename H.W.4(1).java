

//1.	Write generic method to reverse arrays of any type


public class A {


        public static <T> void print(T[] array){
            for (int i = array.length-1; i >= 0 ; i--) {
                System.out.print("["+array[i]+"] ");

            }
            System.out.println();

        }


        public static void main(String[] args) {
            Integer[] inArray={1,2,3,4,5};
            Double[] doubleArray={1.0,2.0,3.0,4.0,5.0};
            Character[] characterAraay={'a','b','c','d','e'};

            print(inArray);
            print(doubleArray);
            print(characterAraay);
        }
    }

