import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class GeneradorArchivo {

    public void guardarArchivo(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("RegistroConversion.json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }

}
