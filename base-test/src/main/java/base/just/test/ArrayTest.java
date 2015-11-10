package base.just.test;

/**
 * Created by base on 2015-11-10.
 */
public class ArrayTest {
    public static void main(String[] args) {

        int[][] multiArray1 = new int[3][6];
        int[][] multiArray2 = {{1,2,3,4,5},{10,20,30,40}};
        System.out.println(multiArray1[0].length);//6
        System.out.println(multiArray1[1].length);//6
        System.out.println(multiArray2[0].length);//5
        System.out.println(multiArray2[1].length);//4
    }
}
