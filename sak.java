public class sak {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Type: java sak -Help");
            return;
        }

        String command = args[0].toLowerCase();

        System.out.println("Command entered: [" + args[0] + "]");
        System.out.println("Converted: [" + command + "]");

        switch (command) {
            case "-help":
                Help.display();
                break;
            
            case "-httpsrequest":
                if (args.length < 2) {
                    System.out.println("Usage: java sak -httpsrequest <URL>");
                    break;
                }
                
                System.out.println("Processing HTTPS request...");

                HttpRequest request = new HttpRequest();

                if (request.readURL(args[1])) {
                    System.out.println(request);
                } else {
                    System.out.println("Error: Invalid URL or request failed.");
                }

                break;
            
            case "-httprequestindex":

                HTTPRequestIndex index =
                    new HTTPRequestIndex();
                
                index.process();

                break;

            default:
                System.out.println("Type: java sak -Help");
        }
    }
}