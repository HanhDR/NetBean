
import java.rmi.Naming;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanht
 */
public class MyClient {
    public static void main(String[] args) {
    try{
    ITinhtoan tt= (ITinhtoan)Naming.lookup("rmi://localhost/TinhToan");
        Scanner n= new Scanner(System.in);
     
    int a,b;
     System.out.println("\nNhap a: ");
     a=n.nextInt();
     System.out.println("\nNhap b: ");
     b=n.nextInt();
      tt.Cong(a, b);  
      tt.Tru(a, b); 
      tt.Nhan(a, b);
      tt.Chia(a, b);
     

    }catch(Exception tt) {System.out.print(tt);}
  }
    
}
