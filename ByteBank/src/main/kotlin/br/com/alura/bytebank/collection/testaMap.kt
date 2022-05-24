package br.com.alura.bytebank.collection

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0, 4 to 47.5)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key} valor: ${p.value}")
    }

    pedidos[5] = 42.75
    pedidos.put(6, 77.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(7, 200.0)
    pedidos.putIfAbsent(7, 300.0)
    println(pedidos)

    pedidos.remove(6)
    pedidos.remove(7, 300.0)   //soh remove se o valor bater
    println(pedidos)
}