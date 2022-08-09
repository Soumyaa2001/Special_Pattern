import java.io.*;
import java.net.*;
public class Client {
 public static void main(String args[]){
 try{
 Socket s = new Socket("192.168.43.7",1201);

 DataInputStream Din = new
DataInputStream(s.getInputStream());
 DataOutputStream Dout = new
DataOutputStream(s.getOutputStream());

 BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
 String MsgIn="",MsgOut="";

 while(!MsgIn.equals("end")){
 MsgOut = br.readLine();
 Dout.writeUTF(MsgOut);
 MsgIn = Din.readUTF();
 System.out.println(MsgIn);
 }
 }catch(Exception e){

 }
 }

}