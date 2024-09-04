import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PutRequestTest {

    @Test
    public void testPutRequest() throws Exception {
        String url = "https://postman-echo.com/put";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");

        String putData = "{\"data\":\"This is a PUT test\"}";

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(putData.getBytes());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();

        assertEquals(HttpURLConnection.HTTP_OK, responseCode, "Код ответа PUT-запроса должен быть 200");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("PUT Response: " + response.toString());
    }
}
