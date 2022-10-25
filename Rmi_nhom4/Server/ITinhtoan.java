
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITinhtoan extends Remote {
    public int Cong(int a,int b)throws Exception;
   public int Tru(int a,int b)throws Exception;
    public int Nhan(int a,int b)throws Exception;
     public int Chia(int a,int b)throws Exception;
}

