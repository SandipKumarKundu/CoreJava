import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args){
        System.out.println(args);
        List<Integer> A= Arrays.asList(1,2,3,4,5);
        Integer x=A.stream().reduce(0,(j,i)->j+i);
        System.out.println(x);
        A.stream().forEach(e->{
            if(e%2==0)
            {
                System.out.println("hello"+e);
            }
        });


        Map<String,Map<String,String>> map= new HashMap<>();
        Map<String,String> value= new HashMap<>();
        value.put("name","Sandip");
        value.put("age","22");
        value.put("gender","Male");
        map.put("id1",value);
        Map<String,String> value1= new HashMap<>();
        value1.put("name","Kruna");
        value1.put("age","25");
        value1.put("gender","Male");
        map.put("id2",value1);
        Map<String,String> value2= new HashMap<>();
        value2.put("name","Roshni");
        value2.put("age","18");
        value2.put("gender","Female");
        map.put("id3",value2);
        List names= new ArrayList();
        map.values().stream().forEach(e->{
            e.entrySet().stream().filter(m->m.getKey()=="name").forEach(y->names.add(y.getValue()));
        });
        System.out.println(names);
    }
}
