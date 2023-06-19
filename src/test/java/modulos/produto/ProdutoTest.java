package modulos.produto;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@DisplayName("Testes Mobile do Modulo de produto ")
public class ProdutoTest {
    @DisplayName("Validação do valor de Produto Não Permitido")
    @Test
    public  void testValidacaoDoValorDeProdutoNaoPermitido() throws MalformedURLException {
        //Abrir o App

        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("appium:deviceName","Galaxy J6+");
        capacidades.setCapability("appium:platformName","Android");
        capacidades.setCapability("appium:udid","192.168.234.102:5555");
        capacidades.setCapability("appium:appPackage ", "com.lojinha");
        capacidades.setCapability("appium:appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("appium:app","C:\\lojinha\\Lojinha+Android+Nativa\\lojinha-nativa-bugada.apk");

        WebDriver app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);

        //Fazer Login
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:id/password")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:id/loginButton")).click();

        //Abrir o Formulario de novo produto



        //app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();




        //Cadastrar um produto com o valor inválido

        //validar que a mensagem de valor inválido foi apresentada

    }
}
