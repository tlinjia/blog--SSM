package dao;

/**
 * Created by lin on 2017/2/16 00016.
 */
public interface Transaction {
    void openTransaction();

    void closeTransaction();
}
