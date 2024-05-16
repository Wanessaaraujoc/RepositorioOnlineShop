#language: pt
@tag

Funcionalidade: login no site onlineshopdemo
 

  @tag1
  Cenario: logar sem sucesso
    Dado dado que eu esteja no site "https://www.onlineshopdemo.co.uk/"
    Quando clicar para logar
    E preencher login e senha incorretos 
    Então deverá aparecer a observação de login e senha incorretos
    

 