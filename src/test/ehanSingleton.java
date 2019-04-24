package test;

public class ehanSingleton {
    private ehanSingleton(){}
    private static ehanSingleton singleton = new ehanSingleton();
    public  static ehanSingleton newInstance(){
        return singleton;
    }
}
