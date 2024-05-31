import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarTipoCambio {

    Moneda consultarCambio(double cantidad, String tipoMoneda){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/77ec3606fc1650c26d993d24/pair/"+tipoMoneda+"/"+cantidad);

        URI dir = URI.create("https://v6.exchangerate-api.com/v6/77ec3606fc1650c26d993d24/pair/USD/MXN/50.0");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("No se pudo realizar el tipo de cambio");
        }
    }

}
