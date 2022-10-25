
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hanht
 */
public class TinhToan extends UnicastRemoteObject implements ITinhtoan{
public  TinhToan () throws RemoteException{};
    @Override
    public int Cong(int a, int b) throws Exception {
       int s=a+b;  
      System.out.print("\nTong: "+ s);
     return s;

    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s=a-b; 
        System.out.print("\nTru: " + s); 
        return s;  
    }
     public int Nhan(int a, int b) throws Exception {
        int s=a*b; 
        System.out.print("\nNhan: " + s); 
        return s;  
    }
     


    @Override
    public int Chia(int a, int b) throws Exception {
    int s=a/b; 
        System.out.print("\nChia: " + s); 
        return s;     }

    @Override
    public int ToHop(int k, int n) throws Exception {
      if (k == 0 || k == n) return 1;
    if (k == 1) return n;
    return ToHop(k - 1, n - 1) + ToHop(k, n - 1);
    }

}
