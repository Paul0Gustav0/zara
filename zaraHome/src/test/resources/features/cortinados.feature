@cortinados
Feature: Executar Casos de Teste no site da ZaraHome
  Eu como usuario quero acessar os site para verificar suas funcionalidades

  Background:
	  Given que o usuário esteja na "https://www.zarahome.com/br/quarto/cortinados-c1020377310.html"
 
  @c01
  Scenario: CT01 - Verificar se a função de filtro pelo maior preço
 		When selecionar o filtro de preço
 		And coloco a opção por maior
 		Then valido se a ordem de produtos esta decrescente "cortinados" "CT01-Ordem Maior"
 		
 	@c02
  Scenario: CT02 - Verificar se a função de filtro pelo menor preço
 		When selecionar o filtro de preço
 		And coloco a opção por menor
 		Then valido se a ordem de produtos esta crescente "cortinados" "CT02-Ordem Menor"
 	
 	@c03
 	Scenario: CT03 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Branco
 		Then valido se os produtos apresentados estão em Branco "cortinados" "CT03-Cor Branco"
 
	@c04	
 	Scenario: CT04 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Natural
 		Then valido se os produtos apresentados estão em natural "cortinados" "CT04-Cor Natural"
 		
 	@c05
 	Scenario: CT05 - Verificar a opção de filtro pela cor
 		When selecionar o filtro de cor
 		And seleciono a opção Outros
		Then valido se os produtos apresentados estão em outros "cortinados" "CT05-Cor Outros"
	
	@c06
	Scenario: CT06 - Verificar a opção de remoção de filtro
	 	When selecionar o filtro de cor
 		And seleciono a opção Natural
 		And seleciono a opção eliminar
 		Then valido se o filtro selecionado foi removido "cortinados" "CT06-Remover Filtro"
 	
 	@c07
 	Scenario: CT07 - Verificar a funcionalidade de compra
 		When selecionar um produto
 		And seleciono a opcao comprar
 		Then o sistema da prosseguimento a compra "cortinados" "CT07-Funcionalidade Compra"
 	
 	@c08
  Scenario: CT08 - Verificar a funcionalidade de disponibilidade
    When selecionar um produto
    And selecionar a opcao Disponibilidade na loja
    And preencher os dados
    Then valido se o produto tem disponibilidade "cortinados" "CT08-Disponibilidade"
 	
 	@c09
  Scenario: CT09 - Verificar a funcionalidade de exibicao
    When o usuario selecionar para exibir em duas colunas
    Then valida se os produtos estão sendo exibidos em duas colunas "cortinados" "CT09-Coluna 2"
    
  @c10
  Scenario: CT10 - Verificar a funcionalidade de exibicao  
    When o usuario selecionar para exibir em quatro colunas
    Then valida se os produtos estão sendo exibidos em quatro colunas "cortinados" "CT10-Coluna 4"