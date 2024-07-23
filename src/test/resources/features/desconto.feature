#language: pt

  Funcionalidade: Receber o cupom desconto da QAzando
    Eu como usuario da QAzando
    Quero receber cupom de desconto
    Para comprar um curso com valor reduzido

    @test01
    Cenário: Visualizar código de desconto
      Dado que estou no site da QAzando
      Quando preencho meu email
      E clico no botão ganhar cupom
      Então eu vejo o código de desconto