package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By colu2 = By.id("btn-grid2");
	private By colu4 = By.id("btn-grid4");
	private By cookies = By.id("onetrust-accept-btn-handler");
	private By newsletter = By.cssSelector("body > itx-common > section > main > itx-newsletter-advice > div > div.nl-icon > md-icon");
	private By produto = By.cssSelector("#product-grid > article:nth-child(1) > itx-product-item > div > div.product-image > itx-product-item-images > div > ul > li > a > img");
	private By disponibilidade = By.xpath("//*[@class='stock-finder-icon mas-info-link']");
	private By tamanho = By.cssSelector("#dialogContent_0 > div > div.col-xs-12.col-md-6.store-stock-content > ul > li:nth-child(1) > md-checkbox");
	private By continuar = By.cssSelector("#dialogContent_0 > div > div.col-xs-12.col-md-6.store-stock-content > itx-button > button > div");
	private By cep = By.xpath("//*[@id=\"input_2\"]");
	private By lupa = By.cssSelector("#blk-tiendas-cercanas > header > form > div > md-input-container > a");
	private By compra = By.xpath("//*[@id=\"btnAddToCart\"]/button/div");
	
	// == FILTROS ==
	private By filtro = By.cssSelector("#actions-bar > div > a");
	private By fechar = By.cssSelector("#actions-bar > div > div.filters-options > itx-category-filters > md-sidenav > footer > div:nth-child(2) > button");
	private By eliminar = By.cssSelector("#actions-bar > div > div.filters-options > itx-category-filters > md-sidenav > footer > div:nth-child(1) > button");
	private By preco = By.cssSelector("#actions-bar > div > div.filters-options > itx-category-filters > md-sidenav > div > ul > li:nth-child(1) > a");
	private By menor = By.id("radio_1");
	private By maior = By.id("radio_0"); 
	private By cor = By.cssSelector("#actions-bar > div > div.filters-options > itx-category-filters > md-sidenav > div > ul > li.colors");
	private By amarelo = By.cssSelector("#actions-bar > div > div.filters-options > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.amarillo > md-checkbox > div.md-label");
	private By azul = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.azul > md-checkbox > div.md-label");
	private By branco = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.blanco > md-checkbox > div.md-label");
	private By cinza = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.gris > md-checkbox > div.md-label");
	private By marrom = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.marron > md-checkbox > div.md-label");
	private By roxo = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.morado > md-checkbox > div.md-label");
	private By natura = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.natural > md-checkbox > div.md-label");
	private By rosa = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.rosa > md-checkbox > div.md-label");
	private By verde = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.verde > md-checkbox > div.md-label");
	private By outros = By.cssSelector("#actions-bar > div > div > itx-category-filters > md-sidenav > div > ul > li.colors.open > div > md-input-container.otros > md-checkbox > div.md-label");
	// =============
	
	public By getAzul() {
		return azul;
	}
	public By getBranco() {
		return branco;
	}
	public By getCinza() {
		return cinza;
	}
	public By getMarrom() {
		return marrom;
	}
	public By getRoxo() {
		return roxo;
	}
	public By getNatura() {
		return natura;
	}
	public By getRosa() {
		return rosa;
	}
	public By getVerde() {
		return verde;
	}
	public By getOutros() {
		return outros;
	}
	public By getTamanho() {
		return tamanho;
	}
	public By getFechar() {
		return fechar;
	}
	public By getEliminar() {
		return eliminar;
	}
	public By getContinuar() {
		return continuar;
	}
	public By getCor() {
		return cor;
	}
	public By getAmarelo() {
		return amarelo;
	}
	public By getCookies() {
		return cookies;
	}
	public By getNewsletter() {
		return newsletter;
	}
	public By getColu2() {
		return colu2;
	}
	public By getColu4() {
		return colu4;
	}
	public By getProduto() {
		return produto;
	}
	public By getDisponibilidade() {
		return disponibilidade;
	}
	public By getCep() {
		return cep;
	}
	public By getLupa() {
		return lupa;
	}
	public By getCompra() {
		return compra;
	}
	public By getFiltro() {
		return filtro;
	}
	public By getPreco() {
		return preco;
	}
	public By getMenor() {
		return menor;
	}
	public By getMaior() {
		return maior;
	}
}
