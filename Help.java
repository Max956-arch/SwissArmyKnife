// All of this stuff is just for the help command. It displays the available commands and features of the Swiss Army Knife (SAK) program.
public class Help {

    public static void display() {

        System.out.println("======================================");
        System.out.println("      Swiss Army Knife (SAK)");
        System.out.println("======================================");
        System.out.println();
        System.out.println("AVAILABLE COMMANDS");
        System.out.println();
        System.out.println("1. Show Help");
        System.out.println("   java sak -Help");
        System.out.println();
        System.out.println("2. Retrieve a URL");
        System.out.println("   java sak -HttpsRequest https://www.google.com");
        System.out.println();
        System.out.println("3. Retrieve an Index and All URLs");
        System.out.println("   java sak -HttpRequestIndex");
        System.out.println();
        System.out.println("FEATURES");
        System.out.println("--------------------------------------");
        System.out.println("* Case insensitive commands");
        System.out.println("* HTTP URL retrieval");
        System.out.println("* JSON index processing");
        System.out.println("* Encapsulated object-oriented design");
        System.out.println();
    }
}