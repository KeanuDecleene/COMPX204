import java.io.*;
import java.net.*;
/* Simple network server which will greet each client that connects and disconnect them. 
* This is done through 
* 
* @author Keanu De Cleene ID: 162997
*/
public class SimpleClient {
    public static void main(String[] args) {
    //if args parsed is less than 2 then print out error message
    if (args.length == 2){
        System.out.println("Usage: java SimpleServer <hostname> <port>");
        return;
    }
    String hostName = args[0];
    try{
        int portNum = Integer.parseInt(args[1]);
        try{
            
            // creates a new socket with hostnum and port number
            Socket socket = new Socket(hostName, portNum); 
            //read message from the server 
            BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine;
            //prints read lines
            while ((readLine = read.readLine()) != null){
                System.out.println(readLine);
            }
            //closes connections
            socket.close();
        } catch(Exception e){
            System.out.println("unknown host");
    
        }
    }catch(Exception e){
        System.err.println(e);
    }
    
}
}
