package base.just.test;

/**
 * Created by pan on 2015-11-10.
 */
public class CountFormater {

    public static void main(String[] args) {
        int n =5;
        String str = String.format("%02d",n);
        System.out.println(str);
        for(int i=0;i<20;i++){
            System.out.printf("%02d"+",",i);
        }
    }
}
