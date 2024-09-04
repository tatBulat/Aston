import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PatchRequestTest {

    @Test
    public void testPatchRequest() throws Exception {
        String url = "https://postman-echo.com/patch";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("PATCH");
        con.setRequestProperty("Content-Type", "application/json");

        String patchData = "{\"data\":\"This is a PATCH test\"}";

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(patchData.getBytes());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();

        assertEquals(HttpURLConnection.HTTP_OK, responseCode, "Код ответа PATCH-запроса должен быть 200");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("PATCH Response: " + response.toString());
    }
}