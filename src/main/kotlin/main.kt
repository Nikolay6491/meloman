fun main() {
    val summ = 1300
    val isMeloman = true
    val userDiscount = when (summ) {
        in 0..1_000 -> summ.toDouble()
        in 1001..10_000 -> (summ - 100).toDouble()
        else -> summ - summ * 0.05
    }
    val totalSumm = if (isMeloman) userDiscount - userDiscount * 0.01  else userDiscount
    println("Сумма без скидки = $summ руб.\nИтоговая сумма с учетом скидок = $totalSumm руб.")
}