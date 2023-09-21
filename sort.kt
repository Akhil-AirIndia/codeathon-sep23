fun sortArrayAscending(numbers: IntArray): IntArray {
    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            if (numbers[j] < numbers[i]) {
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
    return numbers
}
