import java.net.*; // imports java net library

/*
 * Program that obtains the DNS names corresponding to a list of IP addresses.
 * 
 * @author Keanu De Cleene 
 */
public class reverse{
    public static void main(String[] args) {
        //checking format of line
        if (args.length == 0){
            System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
            return;
        }
        //FOR every DNS name given by user
        for(String DNSName : args){
            try {
                //gets the internet address object for the given DNS name
                InetAddress ipAddress = InetAddress.getByName(DNSName);
                System.out.println(DNSName + " : " + ipAddress.getHostAddress()); //prints name and its address
        }catch (Exception e) {
            System.out.println(DNSName + " : unknown host");
        }
    }
    }
}