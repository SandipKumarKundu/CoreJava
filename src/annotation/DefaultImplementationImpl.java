package annotation;

public class DefaultImplementationImpl extends AbstarctParent implements DefaultImplementation{
    @Override
    public boolean getState() {
        return false;
    }

    @Override
    public String getName() {
        return "null";
    }
//     overiding getCount with private access modifier creates a error
//    private double getCount(){
//        return Math.random()*100;
//    }
    public static void main(String[] args) {
        DefaultImplementation c=new DefaultImplementationImpl();
        System.out.println(c.getRoleNumber());
    }
}
