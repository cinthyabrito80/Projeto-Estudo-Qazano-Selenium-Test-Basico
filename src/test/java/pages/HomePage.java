package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://www.qazando.com.br/curso.html");
        esperarElementoVisivel(By.id("btn-ver-cursos"),10);
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        //------------Scrool na tela-----------
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("cintia.brito80@gmail.com.br");
    }

    public void botaoGanharCupom() throws InterruptedException {
        WebElement element = driver.findElement(By.id("button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        Assert.assertEquals("Não exibiu o botão",true, driver.findElement(By.id("button")).isDisplayed());
        driver.findElement(By.id("button")).click();
    }

    public void verificarCodigoDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom está errado","QAZANDO15OFF", texto_cupom);
    }
}
