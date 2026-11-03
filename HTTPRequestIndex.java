import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTTPRequestIndex {

    private static final String INDEX_URL =
        "https://thunderbird-index-sp22.azurewebsites.net/index-w0a6zk195d";

    public void process() {

        HttpRequest indexRequest =
            new HttpRequest();
        
        if (!indexRequest.readURL(INDEX_URL)) {

            System.out.println(
                "Unable to retrieve index file.");

            return;
        }

        System.out.println("=======================================");
        System.out.println("INDEX FILE.");
        System.out.println("=======================================");
        System.out.println(indexRequest);

        Pattern mypattern = 
            Pattern.compile("https?://[^\"\\s]+");

        Matcher mymatcher =
            mypattern.matcher(indexRequest.toString());

        while (mymatcher.find()) {

            String url = mymatcher.group();

            HttpRequest request = 
                new HttpRequest();

            System.out.println("\n=======================================");
            System.out.println("URL: " + url);
            System.out.println("=======================================");

            if (request.readURL(url)) {
                System.out.println(request);
            } else {
                System.out.println(
                    "Unable to retrieve URL.");
            }
        }
    }
}