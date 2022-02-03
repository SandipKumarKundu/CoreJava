package ProblemSolving;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Anagram {
    static String actualInput="abcde";
    public static void main(String[] args) {
        Anagram x=new Anagram();
        List finalop=(List)x.findAnagram(actualInput);
        System.out.println(finalop.size());
        finalop.forEach(a->{
            System.out.println(a);
        });
    }
    public Object findAnagram(String input){
            if(input.length()==1)
                return input;
            else{
                List finalop=new ArrayList<String>();
                for(int i=0;i<input.length();i++){
                    String letter=input.substring(i,i+1);
                    String word= input.substring(0,i)+input.substring(i+1);
                    Object intermittent=findAnagram(word);
                    if(intermittent instanceof List){
                        ArrayList<String> eachReturn=new ArrayList();
                        ArrayList<String>  intermittentArray=(ArrayList<String> )intermittent;
                        intermittentArray.forEach(a->
                        {eachReturn.addAll(insertElem(letter,a));});
                        if(input.length()==actualInput.length())
                            finalop=eachReturn;
                        return eachReturn;
                    }
                    else
                        return insertElem(letter,(String)intermittent);
                }
                return finalop;
            }
    }

    public ArrayList<String> insertElem(String letter, String word){
        ArrayList<String> returnList=new ArrayList<>();
        returnList.add(letter+word);
        returnList.add(word+letter);
        if(word.length()>1){
            for(int i=1;i<word.length();i++){
                String leftSubString= word.substring(0,i);
                String rightSubString= word.substring(i);
                returnList.add(leftSubString+letter+rightSubString);
            }
        }
        return  returnList;
    }
}
