import java.io.*;
import java.net.*;
/* Simple network server which will greet each client that connects and disconnect them. 
*  
* 
* @author Keanu De Cleene ID: 162997
*/
public class SimpleServer {
    public static void main(String[] args) {
            
    try{
        //creates a new server socket with an open port number, prints out what port using
        ServerSocket serverSock = new ServerSocket(0);
        System.out.println("listening on port " + serverSock.getLocalPort());
        //loop and accept new connections as they arrive 
        while(true){
            Socket client = serverSock.accept();
            //gets internet address of client
            InetAddress ia = client.getInetAddress();
            //get IP and host name 
            String ip = ia.getHostAddress();
            String hostName = ia.getHostName();

            //gets info from the client server and then prints it out 
            PrintWriter print = new PrintWriter(client.getOutputStream(), true);

            print.println("Hello, " + hostName);
            print.println("your IP address is " + ip);

            //close socket
            client.close();
        }
    } catch(Exception e){
        System.out.println(e.toString());
    }
 }
}


