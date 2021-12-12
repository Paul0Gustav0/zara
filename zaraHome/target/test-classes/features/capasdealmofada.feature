@capas
Feature: Executar Casos de Teste no site da ZaraHome
  Eu como usuario quero acessar os site para verificar suas funcionalidades

  Background:
	  Given que o usuário esteja na "https://www.zarahome.com/br/quarto/capas-de-almofada-c1020247098.html"
 
  @tag01
  Scenario: CT01 - Verificar a funcionalidade de exibicao
    When o usuario selecionar para exibir em duas colunas
    Then valida se os produtos estão sendo exibidos em duas colunas "capas" "CT01-Coluna 2"
    
  @tag02  
  Scenario: CT02 - Verificar a funcionalidade de exibicao  
    When o usuario selecionar para exibir em quatro colunas
    Then valida se os produtos estão sendo exibidos em quatro colunas "capas" "CT02-Coluna 4"
    
  @tag03  
  Scenario: CT03 - Verificar a funcionalidade de disponibilidade
    When selecionar um produto
    And selecionar a opcao Disponibilidade na loja
    And preencher os dados
    Then valido se o produto tem disponibilidade "capas" "CT03-disponibilidade"
    
 	@tag04 
 	Scenario: CT04 - Verificar a funcionalidade de compra
 		When selecionar um produto
 		And seleciono a opcao comprar
 		Then o sistema da prosseguimento a compra "capas" "CT04-comprafail"
 		
 	@tag05
 	Scenario: CT05 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Amarelo
 		Then valido se os produtos apresentados estão em amarelo "capas" "CT05-Cor Amarelo"
 		
 	@tag06
 	Scenario: CT06 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Azul
 		Then valido se os produtos apresentados estão em azul "capas" "CT06-Cor Azul"
 		
 	@tag07
 	Scenario: CT07 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Branco
 		Then valido se os produtos apresentados estão em branco "capas" "CT07-Cor Branco"

 	@tag08
 	Scenario: CT08 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Cinza
 		Then valido se os produtos apresentados estão em cinza "capas" "CT08-Cor Cinza"
 		
 	@tag09
 	Scenario: CT09 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Marrom
 		Then valido se os produtos apresentados estão em marrom "capas" "CT09-Cor Marrom"
 		
 	@tag10
 	Scenario: CT10 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Roxo
 		Then valido se os produtos apresentados estão em roxo "capas" "CT10-Cor Roxo"
 		
 	@tag11
 	Scenario: CT11 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Natural
 		Then valido se os produtos apresentados estão em natural "capas" "CT11-Cor Natural"
 		
 	@tag12
 	Scenario: CT12 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Rosa
 		Then valido se os produtos apresentados estão em rosa "capas" "CT12-Cor Rosa"
 		
 	@tag13
 	Scenario: CT13 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Verde
 		Then valido se os produtos apresentados estão em verde "capas" "CT13-Cor Verde"

 	@tag14
 	Scenario: CT14 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Outros
 		Then valido se os produtos apresentados estão em outros "capas" "CT14-Cor Outros"
 		
 	@tag15
 	Scenario: CT15 - Verificar se a função de filtro pelo menor preço
 		When selecionar o filtro de preço
 		And coloco a opção por menor
 		Then valido se a ordem de produtos esta crescente "capas" "CT15-Ordem Menor"
 	
 	@tag16
 	Scenario: CT16 - Verificar se a função de filtro pelo maior preço
 		When selecionar o filtro de preço
 		And coloco a opção por maior
 		Then valido se a ordem de produtos esta decrescente "capas" "CT16-Ordem Maior"