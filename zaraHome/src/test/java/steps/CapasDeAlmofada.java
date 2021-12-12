package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class CapasDeAlmofada {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que o usuário esteja na {string}")
	public void que_o_usuário_esteja_na(String string) throws InterruptedException {
		metodos.abrirNavegador(string);
		metodos.aguardarElemento(15, el.getNewsletter());
		metodos.apertarButton(el.getCookies());
		metodos.apertarButton(el.getNewsletter());
	}

	@When("o usuario selecionar para exibir em duas colunas")
	public void o_usuario_selecionar_para_exibir_em_duas_colunas() {
		metodos.apertarButton(el.getColu2());
	}

	@Then("valida se os produtos estão sendo exibidos em duas colunas {string} {string}")
	public void valida_se_os_produtos_estão_sendo_exibidos_em_duas_colunas(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("o usuario selecionar para exibir em quatro colunas")
	public void o_usuario_selecionar_para_exibir_em_quatro_colunas() {
		metodos.apertarButton(el.getColu4());
	}

	@Then("valida se os produtos estão sendo exibidos em quatro colunas {string} {string}")
	public void valida_se_os_produtos_estão_sendo_exibidos_em_quatro_colunas(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("selecionar um produto")
	public void selecionar_um_produto() {
		metodos.apertarButton(el.getProduto());
	}

	@When("selecionar a opcao Disponibilidade na loja")
	public void selecionar_a_opcao_disponibilidade_na_loja() throws InterruptedException {
		Thread.sleep(4000);
		metodos.scroll(el.getDisponibilidade());
		metodos.apertarButton(el.getDisponibilidade());
		Thread.sleep(2000);
	}

	@When("preencher os dados")
	public void preencher_os_dados() throws InterruptedException {
		metodos.apertarButton(el.getTamanho());
		metodos.apertarButton(el.getContinuar());
		metodos.mandarMsg(el.getCep(), "08090-284");
		metodos.apertarButton(el.getLupa());
		Thread.sleep(8000);
	}

	@Then("valido se o produto tem disponibilidade {string} {string}")
	public void valido_se_o_produto_tem_disponibilidade(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opcao comprar")
	public void seleciono_a_opcao_comprar() throws InterruptedException {
		Thread.sleep(2000);
		metodos.apertarButton(el.getCompra());
	}

	@Then("o sistema da prosseguimento a compra {string} {string}")
	public void o_sistema_da_prosseguimento_a_compra(String string, String string2) throws IOException, InterruptedException {
		Thread.sleep(2000);
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("selecionar o filtro de cor")
	public void selecionar_o_filtro_de_cor() {
		metodos.apertarButton(el.getFiltro());
		metodos.apertarButton(el.getCor());
	}

	@When("seleciono a opção Amarelo")
	public void seleciono_a_opção_amarelo() {
		metodos.apertarButton(el.getAmarelo());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em amarelo {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_amarelo(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Azul")
	public void seleciono_a_opção_azul() {
		metodos.apertarButton(el.getAzul());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em azul {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_azul(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Branco")
	public void seleciono_a_opção_branco() {
		metodos.apertarButton(el.getBranco());
		metodos.apertarButton(el.getFechar());

	}

	@Then("valido se os produtos apresentados estão em branco {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_branco(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Cinza")
	public void seleciono_a_opção_cinza() {
		metodos.apertarButton(el.getCinza());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em cinza {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_cinza(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Marrom")
	public void seleciono_a_opção_marrom() {
		metodos.apertarButton(el.getMarrom());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em marrom {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_marrom(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Roxo")
	public void seleciono_a_opção_roxo() {
		metodos.apertarButton(el.getRoxo());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em roxo {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_roxo(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Natural")
	public void seleciono_a_opção_natural() {
		metodos.apertarButton(el.getNatura());
		
	}

	@Then("valido se os produtos apresentados estão em natural {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_natural(String string, String string2) throws IOException {
		metodos.apertarButton(el.getFechar());
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Rosa")
	public void seleciono_a_opção_rosa() {
		metodos.apertarButton(el.getRosa());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em rosa")
	public void valido_se_os_produtos_apresentados_estão_em_rosa() throws IOException {
		metodos.screenShot("CT12-Cor Rosa", "capas");
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Verde")
	public void seleciono_a_opção_verde() {
		metodos.apertarButton(el.getVerde());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em verde")
	public void valido_se_os_produtos_apresentados_estão_em_verde() throws IOException {
		metodos.screenShot("CT13-Cor Verde", "capas");
		metodos.fecharNavegador();
	}

	@When("seleciono a opção Outros")
	public void seleciono_a_opção_outros() {
		metodos.apertarButton(el.getOutros());
		metodos.apertarButton(el.getFechar());
	}

	@Then("valido se os produtos apresentados estão em outros {string} {string}")
	public void valido_se_os_produtos_apresentados_estão_em_outros(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}

	@When("selecionar o filtro de preço")
	public void selecionar_o_filtro_de_preço() {
		metodos.apertarButton(el.getFiltro());
		metodos.apertarButton(el.getPreco());
	}

	@When("coloco a opção por menor")
	public void coloco_a_opção_por_menor() throws InterruptedException {
		metodos.apertarButton(el.getMenor());
		metodos.apertarButton(el.getFechar());
		Thread.sleep(3000);
	}

	@Then("valido se a ordem de produtos esta crescente {string} {string}")
	public void valido_se_a_ordem_de_produtos_esta_crescente(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}
	
	@When("coloco a opção por maior")
	public void coloco_a_opção_por_maior() throws InterruptedException {
	    metodos.apertarButton(el.getMaior());
	    metodos.apertarButton(el.getFechar());
	    Thread.sleep(3000);
	}
	
	@Then("valido se a ordem de produtos esta decrescente {string} {string}")
	public void valido_se_a_ordem_de_produtos_esta_decrescente(String string, String string2) throws IOException {
		metodos.screenShot(string, string2);
		metodos.fecharNavegador();
	}
	
	@When("seleciono a opção eliminar")
	public void seleciono_a_opção_eliminar() {
	    metodos.apertarButton(el.getEliminar());
	    metodos.apertarButton(el.getFechar());
	}
	@Then("valido se o filtro selecionado foi removido {string} {string}")
	public void valido_se_o_filtro_selecionado_foi_removido(String string, String string2) throws IOException {
	    metodos.screenShot(string, string2);
	    metodos.fecharNavegador();
	}
}


