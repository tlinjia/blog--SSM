package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lin on 2017/2/16 00016.
 */
@Component
public class Function {
    public void fun1(){
        System.out.println("fun1!");
    }

    public void fun2(){
        System.out.println("fun2!");
    }
}
