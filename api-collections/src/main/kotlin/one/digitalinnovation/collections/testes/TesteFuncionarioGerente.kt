package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Gerente

fun main()  {

    val maria = Gerente(
        nome = "Maria do Carmo",
        cpf = "1234567899",
        salario = 1000.0

    )

    ImprimeRelatorioFuncionario.imprime(maria)

}

