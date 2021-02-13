package model

//Exemplo da aula
abstract class Calculadora {
    abstract fun calcular(x: Int, y: Int) : Int
}

class Soma : Calculadora(){
    //@Override
    override fun calcular(x: Int, y: Int): Int {
        return x + y
    }
}

class Subtracao : Calculadora(){
    override fun calcular(x: Int, y: Int): Int {
        return x - y
    }
}

class Divisao : Calculadora(){
    override fun calcular(x: Int, y: Int): Int {
        return x / y
    }
}

class Multiplicaco : Calculadora(){
    override fun calcular(x: Int, y: Int): Int {
        return x * y
    }
}