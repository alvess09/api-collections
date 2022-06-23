package alves.ariel.apicollections

import java.math.BigDecimal

// conseguimos espandir as possibilidades das funções com as extensionsFunctions
// as vezes precisamos para nossa regra de negócio de uma função específica que precisa ser implementada
//e não tem nas coleções de funções


fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
