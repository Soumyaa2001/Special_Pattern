import java.io.*;
import java.net.*;
public class Server {
 public static void main(String args[]){
 try{
 ServerSocket ss = new ServerSocket(1201);
 Socket s = ss.accept();
 
 DataInputStream Din = new
DataInputStream(s.getInputStream());
 DataOutputStream Dout = new
DataOutputStream(s.getOutputStream());
 
 BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
 
 String MsgIn="",MsgOut="";
 
 while(!MsgIn.equals("end")){
 MsgIn = Din.readUTF();
 System.out.println(MsgIn);
 MsgOut = br.readLine();
 Dout.writeUTF(MsgOut);
 Dout.flush();
 }
 s.close(); 
 }catch(Exception e){
 
 }
 
}
}