package org.example.demos.threadDemo;
import java.util.concurrent.Callable;

//继承Callable<T> T为什么类型则返回什么类型
public class ThreadWay3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //执行逻辑
        return 0;
    }
}
