fun main() {
    val buy = 1000 //сумма покупки без учета скидки
    val regularCustomer = true //регулярный покупатель или нет
    //вычисляем cумму покупки со скидкой, но без учета постоянства
    val buyWithDicount = if (buy > 0 && 1000 <= buy) buy
                    else if (1000 < buy && 10_000 >= buy) buy - 100
                    else buy - (buy * 0.05)
    //вычисляем скидку с учетом постоянства
    val buyWithRegular = if (regularCustomer == true) buyWithDicount - (buyWithDicount * 0.01)
                    else buyWithDicount
}

