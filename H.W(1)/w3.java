
//3.	Write a Java method that remove elements from an array.

import java.util.Arrays;
public class w2 {
        int[] array = {1, 2, 3, 4, 5};
        public void printArrayBeforRemove() {
            System.out.println(Arrays.toString(array));
        }
        public void printArrayAfterRemove() {
            int i;
            int remove = 3 ;
            for (i = remove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[i] = 0;

        System.out.println(Arrays.toString(array));
        }
        public static void main(String[] args) {
            w2 a=new w2();
            a.printArrayBeforRemove();
            a.printArrayAfterRemove();
    }
}
