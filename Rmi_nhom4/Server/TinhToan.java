/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hanht
 */
public class TinhToan implements ITinhtoan{

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
    
}
