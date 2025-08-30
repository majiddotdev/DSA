import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class YouTubeProxyRequest {

    void main(String[] args) {
        String[][] proxies = {
                {"123.45.67.1", "8080"},
                {"123.45.67.2", "8080"},
                {"123.45.67.3", "8080"}
        };

        String targetUrl = "https://www.youtube.com";

        for (String[] proxyData : proxies) {
            String proxyIp = proxyData[0];
            int proxyPort = Integer.parseInt(proxyData[1]);

            try {
                System.out.println("Connecting via proxy: " + proxyIp + ":" + proxyPort);

                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyIp, proxyPort));
                URL url = new URL(targetUrl);

                HttpURLConnection conn = (HttpURLConnection) url.openConnection(proxy);
                conn.setRequestProperty("User-Agent", "Mozilla/5.0");
                conn.setConnectTimeout(5000);
                conn.setReadTimeout(5000);

                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                conn.disconnect();

                System.out.println("Success using proxy: " + proxyIp);
                System.out.println("------");

            } catch (Exception e) {
                System.out.println("Failed using proxy: " + proxyIp + ":" + proxyPort);
                System.out.println(e.getMessage());
                System.out.println("------");
            }
        }
    }
}
