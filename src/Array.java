import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args){
        Integer[] array ={11,1,2,4,55,67,66};
        Integer[] array2 ={101,102,103,104,105};
        int i=0;
        List<Integer> a=new ArrayList<Integer>();
        while(i<array.length && i<array2.length){
            a.add(array[i]);
            a.add(array2[i]);
            i++;
        }
        array=Arrays.copyOfRange(array,i,array.length);
        array2=Arrays.copyOfRange(array2,i,array2.length);
         a.addAll(Arrays.asList(array));
         a.addAll(Arrays.asList());
         a.stream().forEach(System.out::println);
    }
}
