fun isValidIPAddress(ip: String): Boolean {
    val parts = ip.split(".")
    if (parts.size != 4) {
        return false
    }
    for (part in parts) {
        val num = part.toIntOrNull()
        if (num == null || num < 0 || num > 255) {
            return false
        }
        if (num.toString() != part) {
            return false
        }
    }
    return true
}
