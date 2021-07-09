package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main()  {
    val jether = Pessoa(nome = "Jether Rodrigues", cpf = "1234567899")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario(nome = "Jether Rodrigues", cpf = "1234567899", BigDecimal.valueOf(10000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}