package one.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc,valor ->    valor + acc
}

fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()

