package eureka.http;

import com.netflix.config.ConfigurationManager;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Copyright By WeSure
 *
 * @author nikofeng
 * @date 2018/2/24 11:22
 * @description
 */
public class TestHttpClient {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        for (int i = 0; i < 6; i++) {
            HttpGet httpGet = new HttpGet("http://localhost:9000/router");
            HttpResponse response = httpClient.execute(httpGet);
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
