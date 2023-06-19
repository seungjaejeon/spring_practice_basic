package hello.core.singletone;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    //static 영역에 객체를 딱 1개만 생성해둔다.
    public static SingletonService getInstance(){
        return instance; //항상 같은 인스턴스 반환
    }
    private SingletonService(){
    //생성자를 private로 설정하여 외부에서 생성하지 못하도록 함
    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
