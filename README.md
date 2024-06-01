
![CONVERTIDOR DE MONEDAS](https://github.com/RafaVT8/ConversorMonedas/assets/108498746/ed4b9e6f-2720-4987-8549-0e80c1df0863)


<p align="left">
   <img src="https://img.shields.io/badge/STATUS-TERMINADO-green">
</p>
<p>Esta es aplicación, ayuda al usuario a convertir entre los principales tipos de moneda, 
los datos se obtienen de consumir una API, esta realizado con el lenguaje Java</p>

 ## :hammer:Funcionalidades del proyecto

- `Funcionalidad 1`: Se le presenta un menú al usuario, para seleccionar la opción de tipo de conversión que desea realizar, esta selección se guarda en una variable para posteriormente ser mandada al método que realiza la petición para fomar la URI de acuerdo a la selección.
Notese que el menú esta dentro de un ciclo, para que el usuario pueda realizar diferentes tipo de cambio, hasta que decida salir.

![Menu de seleccion](https://github.com/RafaVT8/ConversorMonedas/assets/108498746/8d7c83f0-2aab-405d-ae89-a0e39799fa95)

- `Funcionalidad 2`: Tambien el usuario puede ingresar la cantidad en la moneda seleccionada, para realizar el tipo de cabio, con estos dos datos se envían al método consultarCambio() encargado de realizár la petición HTTP y devolver un objeto de tipo moneda.
  
![image](https://github.com/RafaVT8/ConversorMonedas/assets/108498746/4d1afb10-604c-403f-92f2-4ff7ca9a3d23)

- `Funcionalidad 3`: Con los datos que ingresó el usuario, el método consultarCambio() crea la URI correspondiente.
   Para la petición HTTP se utiliza el HttpClient, HttpRequest y HttpResponse, como se muestra en la siguiente figura.
   Se utilizó la librería Gson para realizar la conversion de la repuesta Json en objeto Java de tipo Moneda.

![image](https://github.com/RafaVT8/ConversorMonedas/assets/108498746/cc238e8f-3073-4cd5-b67e-49acc4abbf1f)

- `Funcionalidad 4`: En la siguiente figura se ve el funcionamiento al correr la aplicación Java, se muestra la selección del menú que realiza el usuario, la cantidad en el tipo de moneda que desea realizar y salida que muestra los datos de la consulta.

![image](https://github.com/RafaVT8/ConversorMonedas/assets/108498746/87c8aee0-64c6-49fb-b31c-864db5261654)

:ballot_box_with_check: Conclusión: La realización de este proyecto fue para fortalacer los concimientos en el consumo de APIs y manejo de datos en Java.



