

//2.	Write generic method to merge tow arrays of any type


import java.util.stream.Stream;
import java.util.Arrays;

    public class B {


        public static <T> Object[] concatenate(T[] a, T[] b)
        {            return Stream.of(a, b)
                    .flatMap(Stream::of)
                    .toArray();
        }

        public static void main (String[] args)
        {
            Integer[] a = new Integer[]{1,2,3,4,5};
            Character[] b = new Character[]{'a','b','c','d','e'};

            Object[] c = concatenate(a,b);

            System.out.println("Merged  array : "+ Arrays.toString(c));
        }
    }


