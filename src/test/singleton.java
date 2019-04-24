package test;
public class singleton  {
    private static singleton singleton;
    private singleton(){ }
    public static singleton newInstance(){
        if (singleton == null){
            synchronized (singleton.class){
                if(singleton == null){
                    singleton = new singleton();
                }
            }
        }
        return singleton;
    }
}
