/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author hanht
 */

public class GuinhanUDP {
    DatagramSocket dg;
 public void MoCong(int cong) throws Exception {
        dg=new DatagramSocket(cong);
        System.out.println("Da da mo cong" + cong);
    }
    
 public String Nhan() throws Exception {
      byte bodem[]=new byte[256];
      DatagramPacket dr=new DatagramPacket (bodem, bodem.length);
      dg.receive(dr);
      String st= new String(dr.getData()).trim() ;
        return st;
 }
 public void Gui(String data, String IpMaychu, int cong) throws Exception{
     DatagramSocket c=new DatagramSocket();
      byte bodem[]=new byte[256];   
       bodem=data.getBytes();
      InetAddress ip=InetAddress.getByName(IpMaychu);
      DatagramPacket dr= new DatagramPacket(bodem,bodem.length,ip,cong);
      c.send(dr);
     System.out.print("Da gửi");

 }
 public byte[] Nhanfile() throws Exception {
      byte bodem[]=new byte[1024];
      DatagramPacket dr=new DatagramPacket (bodem, bodem.length);
      dg.receive(dr);
      return  dr.getData();
   }
  public void Guifile(byte[] data, String IpMaychu, int cong) throws Exception{
      byte bodem[]=new byte[1024];  
      InetAddress ip=InetAddress.getByName(IpMaychu);
      DatagramPacket dr= new DatagramPacket(data,data.length,ip,cong);
      
      dg.send(dr);
     System.out.print("Da gửi");

 }
}