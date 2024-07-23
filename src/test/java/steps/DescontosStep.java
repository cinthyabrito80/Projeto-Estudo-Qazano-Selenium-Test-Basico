package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da QAzando")
    public void acessar_site_qadando(){
        homePage.acessarAplicacao();
    }
    @Quando("preencho meu email")
    public void preencho_meu_email() throws InterruptedException {
        homePage.preencheEmail();
    }
    @Quando("clico no botão ganhar cupom")
    public void clico_no_botão_ganhar_cupom() throws InterruptedException {
        homePage.botaoGanharCupom();
    }
    @Então("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() {
        homePage.verificarCodigoDesconto();
    }
}
