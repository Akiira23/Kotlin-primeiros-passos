package br.com.alura.bytebank.collection

fun testaAssociacao() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0),
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido ->
        pedido.valor > 50
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maia", "Mario", "Mario", "Gisele")
    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['M'])

    val nomesAgrupados = nomes.groupingBy { nome ->
        nome.first()
    }
    println(nomesAgrupados.eachCount())
}

data class Pedido( val numero: Int, val valor: Double)