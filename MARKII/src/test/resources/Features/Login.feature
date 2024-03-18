Feature: LoginSteps

	Scenario: Realizar uma compra
		Given acessar a aplicacao
		When preencher o campo Username com o valor: "standard_user"
		And preencher o campo Password com o valor: "secret_sauce"
		And clicar no botao Login
		And adiciono o primeiro item ao carrinho
		And clico no icon do carrinho
		And clico no botao checkout

		And preencho o campo Firstname com: "Letícia"
		And preencho o campo LastName com: "Thiesen"
		And preencho o campo Zip Code com: "93310320"
		And clicar no botao continue

		When clicar no botao finish
		Then titulo da mensagem deve estar correto
		Then subtitulo da mensagem deve estar correto
		Then titulo da pagina deve estar correto

	##Scenario: Login com sucesso
		##Given acessar a aplicacao
		##When preencher o campo Username com o valor: "standard_user"
		##And preencher o campo Password com o valor: "secret_sauce"
		##And clicar no botao Login
		##Then devo acessar o site
	