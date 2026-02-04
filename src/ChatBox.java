import javax.print.DocFlavor;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class ChatBox {

    private static final String API_KEY = " ";
    private static final String API_URL = "https://api.openai.com/v1/completions";

    public static String  categorizeText(String inputText) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String prompt = "Categorize this massage: \"" + inputText + "\". Categories: [Support,Sale, Feedback, Other].";
            String body = "{"
                        + "\"model\":\"gpt-3.5-turbo-instruction\","
                        + "\"prompt\":\"" + prompt + "\","
                        + "\"max_tokens\":10"
                        + "}";

            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = body.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8")
            );
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error calling AI API";
        }
    }
    public static void main(String[] args) {
        String userMessage = "I have an issue with my last order. Can you help";
        String result = categorizeText(userMessage);
        System.out.println("AI Categorization; " + result);
    }
}
