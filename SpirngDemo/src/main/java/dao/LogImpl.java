package dao;

import org.springframework.stereotype.Component;

/**
 * Created by lin on 2017/2/16 00016.
 */
@Component
public class LogImpl implements Log{
    @Override
    public void log() {
        System.out.println("Log");
    }
}
