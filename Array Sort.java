//This code sorts array based on comparator
import java.util.*;
class MyComp implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        if(i1<i2) return 1;
        if(i1>i2) return -1;
        return 0;
    }
}
public class Sample{
    public static void main(String[] args){
        Integer[] a = {2,4,6,8,1,3,5,7}; //array declared as Integer because custom comparator works only with objects.
        Arrays.sort(a,new MyComp());
        System.out.println(Arrays.toString(a));
    }
}
