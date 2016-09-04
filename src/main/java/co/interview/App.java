package co.interview;

/**
 * Hello world!
 *
 */
public class App 
{
    public App() {
        super();
    }

    public static void main(String[] args )
    {
        System.out.println(getValue());
    }

    public static int getValue(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }

    }
}
