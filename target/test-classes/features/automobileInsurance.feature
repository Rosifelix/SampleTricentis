#language: pt

@seguroAutomovel
Funcionalidade: Realizar Cotação de seguro para automóvel
  Como usuário do site
  Quero realizar cotação
  Para obter os valores de seguro


Contexto: Acessar o site
   Dado que acesso o site "https://sampleapp.tricentis.com/101/index.php"

Cenário: Informar dados para cotação
  
  Quando clicar em automobile
  E informar dados do veículo
  E informar dados do segurador
  E informar dados do produto
  E selecionar opção de preço
  Então o sistema realiza a cotação desejada









