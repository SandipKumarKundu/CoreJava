public class stack {
    int[]  arr;
    stack(int size){
        arr=new int[size];
    }

    static int index =0;
     void push( int x){
         if(index<arr.length){
             arr[index] = x;
             index++;
         }
    }
    int pop(){
         if(index>=0) {
             int max=0;
             for(int i=index-1;i>=0;i--){
                 max=arr[max]>=arr[i]?max:i;
             }

             index--;
             int returnValue = arr[max];
             arr[max] = arr[index];
             return returnValue;
         }
         else
             return 0;
    }
    void print(){
        for(int i=index-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
    stack sc=new stack(5);
    sc.push(11);
    sc.push(22);
    sc.push(3);
    sc.push(4);
    System.out.println(sc.pop());
sc.print();
    }
}
