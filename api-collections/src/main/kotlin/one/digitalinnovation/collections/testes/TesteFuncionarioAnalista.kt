package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Analista

fun main()  {

    val joao = Analista(
        nome = "Joao Pedro",
        cpf = "1234567899",
        salario = 10000.0

    )

    ImprimeRelatorioFuncionario.imprime(joao)
}

