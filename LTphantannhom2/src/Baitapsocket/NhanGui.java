/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitapsocket;

import com.sun.corba.se.spi.activation.Server;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hanht
 */
public class NhanGui {
    ServerSocket Sserver;
    public void MoCong(int cong) throws Exception {
        Sserver = new ServerSocket(cong);
        System.out.println("Server da mo cong" + cong);
    }
    
    public String Nhan() throws Exception {
        
//        Lap vo han de doi client noi len
        Socket c = Sserver.accept();
        System.out.println("Da co 1 clien connected .....");
        
        InputStreamReader is= new InputStreamReader(c.getInputStream());
         //Tạo bộ đệm để lưu dữ liệu nhận về
        BufferedReader r= new BufferedReader(is);
        return r.readLine();
    }
    
    public void Gui(String data, String IpServer, int cong) throws Exception {
        Socket c = new Socket(IpServer, cong);
        System.out.println("Da noi len server...");
        DataOutputStream out =new DataOutputStream(c.getOutputStream());
        out.writeBytes(data); //Gửi thông báo
        out.write(13);
        out.write(10);
        out.close();
        c.close();
    }

}
