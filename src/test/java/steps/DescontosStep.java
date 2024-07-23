package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DescontosStep {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da QAzando")
    public void acessar_site_qadando(){
        driver.manage().window().maximize();
        driver.get("https://www.qazando.com.br/curso.html");
    }
    @Quando("preencho meu email")
    public void preencho_meu_email() throws InterruptedException {
        //------------Scrool na tela-----------
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("windows.scrollTo(0, 10000)");
        //Thread.sleep(2000);
        //-------------------------------------

        driver.findElement(By.id("email")).sendKeys("cintia.brito80@gmail.com.br");
    }
    @Quando("clico no botão ganhar cupom")
    public void clico_no_botão_ganhar_cupom() throws InterruptedException {
        
        WebElement element = driver.findElement(By.id("button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        driver.findElement(By.id("button")).click();

    }
    @Então("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.print(texto_cupom);

        driver.quit();
    }
}
