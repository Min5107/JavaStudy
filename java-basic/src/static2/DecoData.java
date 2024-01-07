package static2;

public class DecoData {
    
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall(){
//        instanceValue++; // 인스턴스 변수 접근 , comile error
//        instanceMethod(); // 인스턴스 변수 접근 , comile error

        // static 메서드라 이라 정적 변수, 메서드만 접근 가능
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }
    
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근 
        instanceMethod(); // 인스턴스 변수 접근 
        
        // 인스턴스 메서드지만 정적 변수, 메서드도 접근 가능
        staticValue++; // 정적 변수 접근 
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instaceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
