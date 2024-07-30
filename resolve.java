import java.net.*; // imports java net library

/*
 * Program that obtains the IPv4 address of a corresponding DNS name.
 * 
 * @author Keanu De Cleene 
 */
public class resolve {
    public static void main(String[] args) {
        //checking format of line
        if (args.length == 0){
            System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
            return;
        }

        for( String DNSName : args){
            try {
                //gets the internet address object for the given DNS name
                InetAddress ipAddress = InetAddress.getByName(DNSName);
                System.out.println(DNSName + " : " + ipAddress.getHostAddress()); //prints name and its address

        }catch ( Exception ex){
            System.out.println(DNSName + " : unknown host");
        }
    }
    }
}
