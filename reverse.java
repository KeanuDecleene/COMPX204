import java.net.*; // imports java net library

/*
 * Program that obtains the DNS names corresponding to a list of IP addresses.
 * 
 * @author Keanu De Cleene ID: 162997
 */
public class reverse{
    public static void main(String[] args) {
        //checking format of line
        if (args.length == 0){
            System.out.println("Usage: reverse <IP1> <IP2> ... <IPN>");
            return;
        }
        //FOR every ip address given by user
        for(String ip : args){
            try {
                //gets the internet address object for the given ip address
                InetAddress ipAddress = InetAddress.getByName(ip);
                //gets the host name for the IP address
                String hostName = ipAddress.getHostName();
                //checks if the hostname exists compared to original input
                if (hostName.compareTo(ip) == 0){
                    //prints result if no valid ip and hostname
                    System.out.println(ip + " : " + "no name"); 
                }else {
                    System.out.println(ip + " : " + hostName);
                } 
        }catch (Exception e) {
            System.out.println(ip + " : unknown host");
        }
    }
    }
}