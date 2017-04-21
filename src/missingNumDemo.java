/**
 * Created by SunDa on 4/16/2017.
 */
public class missingNumDemo {
    public static void main(String [] args){

        int[] array1 = {};
        int[] array2 = {1};
        int[] array3 = {2};
        int[] array4 = {1, 3};
        int[] array5 = {1, 2};
        int[] array6 = {1, 4, 3, 7, 6, 2};

        findMissingNum(array1);
        findMissingNum(array2);
        findMissingNum(array3);
        findMissingNum(array4);
        findMissingNum(array5);
        findMissingNum(array6);

    }

    public static void findMissingNum(int [] array)
    {
        stack missingNum = new stack();
        missingNum.push(array);
        System.out.println(missingNum.missing(missingNum));
    }
}
