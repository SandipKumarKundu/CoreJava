package annotation;

public interface DefaultImplementation {
    boolean getState();
    String getName();
    static double getCount(){
        return Math.random()*100;
    }
    default double getRoleNumber(){
        return DefaultImplementation.getCount();
    }
}
