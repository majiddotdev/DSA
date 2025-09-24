import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Random;

public class YouTubeProxyRequest {

    public static void main(String[] args) {
        String[][] proxies = {
                {"192.168.1.129", "8080"},
                {"192.168.1.121", "8080"},
                {"192.168.1.122", "8080"}
        };

        String targetUrl = "https://www.youtube.com";

        String chromeUserAgent = "Chrome/139.0.7258.139";

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            String[] proxyData = proxies[random.nextInt(proxies.length)];
            String proxyIp = proxyData[0];
            int proxyPort = Integer.parseInt(proxyData[1]);

            try {
                System.out.println("Attempting to connect via proxy: " + proxyIp + ":" + proxyPort);

                // Set up the proxy connection
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyIp, proxyPort));
                URL url = new URL(targetUrl);

                // Create the connection
                HttpURLConnection conn = (HttpURLConnection) url.openConnection(proxy);

                // Set the User-Agent
                conn.setRequestProperty("User-Agent", chromeUserAgent);

                // Attempt to connect and read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Close the connection
                in.close();
                conn.disconnect();

                System.out.println("Success using proxy: " + proxyIp + ":" + proxyPort);
                System.out.println("------");

            } catch (ConnectException e) {
                System.out.println("Failed to connect to proxy: " + proxyIp + ":" + proxyPort);
                System.out.println("Error: " + e.getMessage());
                System.out.println("------");
            } catch (Exception e) {
                System.out.println("Unexpected error while using proxy: " + proxyIp + ":" + proxyPort);
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace(); // Print the full stack trace for better debugging
                System.out.println("------");
            }
        }
    }
}
