fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 64.0), 3 to 50.0, 4 to 100.0, 5 to 150.0, 6 to 80.0)
    //val valorPedido = pedidos.getValue(5)
    val valorPedido = pedidos.getValue(3)
    println(valorPedido)
    println(pedidos.getOrElse(5) {
        "Nao tem pedido"
    })

    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    for (numerosDePedidos in pedidos.keys) {
        println("Pedido: $numerosDePedidos")
    }
    for (valor in pedidos.values) {
        println("Valor: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 78.0))       //adicionar mais de 1
    pedidos += Pair(7, 85.0)
    println(pedidos)

    println(pedidos - 6)
    println(pedidos - listOf(6, 5))            //remover mais de 1
    println(pedidos)

//    pedidos.putAll(setOf(7 to 90.0, 8 to 78.0, 9 to 100.0))    //substitui o valor se a chave ja existe
    pedidos += (setOf(7 to 90.0, 8 to 78.0, 9 to 100.0))         //substitui o valor se a chave ja existe
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(100.0)  //se tiver valor repetido, remove o primeiro encontrado
    println(pedidos)

    pedidos -= 6
    println(pedidos)

}






