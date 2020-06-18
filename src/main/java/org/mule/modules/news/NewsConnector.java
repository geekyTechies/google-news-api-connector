package org.mule.modules.news;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.news.config.ConnectorConfig;

@Connector(name="news", friendlyName="News")
public class NewsConnector {
	
	
	private static final String USER_AGENT = "Mozilla/5.0";

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     * @throws Exception 
     */
    @Processor
    public String getNews(String news) throws Exception {
    	
    	String url= "https://newsapi.org/v2/everything"+"?apiKey="+config.getApiKey()+"&q="+config.getSearchCriteria();
    	
    	URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		String responseOut="";
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			responseOut=response.toString();
			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("GET request not worked");
		}
    	
    	return responseOut;
        
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}