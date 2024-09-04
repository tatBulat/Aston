import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeleteRequestTest {

    @Test
    public void testDeleteRequest() throws Exception {
        String url = "https://postman-echo.com/delete";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("DELETE");

        int responseCode = con.getResponseCode();

        assertEquals(HttpURLConnection.HTTP_OK, responseCode, "Код ответа DELETE-запроса должен быть 200");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("DELETE Response: " + response.toString());
    }
}
