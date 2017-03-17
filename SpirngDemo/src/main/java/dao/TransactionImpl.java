package dao;

import org.springframework.stereotype.Component;

/**
 * Created by lin on 2017/2/16 00016.
 */
@Component
public class TransactionImpl implements Transaction {
    @Override
    public void openTransaction(){
        System.out.println("openTransaction");
    }

    @Override
    public void closeTransaction() {
        System.out.println("closeTransaction");
    }
}
