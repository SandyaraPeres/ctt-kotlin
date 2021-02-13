package model

class OutraSoma() : CalculadoraInterface{
    override fun calcular(x: Int, y: Int): Int {
        return x + y
    }
}

class OutraSubtracao() : CalculadoraInterface{
    override fun calcular(x: Int, y: Int): Int {
        return x - y
    }

}

class OutraDivisao() : CalculadoraInterface{
    override fun calcular(x: Int, y: Int): Int {
        return x / y
    }

}

class OutraMultiplicacao() : CalculadoraInterface{
    override fun calcular(x: Int, y: Int): Int {
        return x * y
    }
}