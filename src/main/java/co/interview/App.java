package co.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App extends Date
{
    public final static native int w();
    public App() {
        super();
    }

    private void test(){
        System.out.println(super.getClass().getSuperclass().getName());
    }
    public static void main(String[] args )
    {
        boolean a;
        if (a=true){

        }
        App app = new App();
        app.test();
        List list = new ArrayList();
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            Object t = iter.next();
            iter.remove();
        }
        StringBuffer sbf = new StringBuffer(10);
        sbf.append("aa");
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
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
