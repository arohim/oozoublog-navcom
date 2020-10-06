package com.him.oozoublog.navcom

object InternalDeepLink {
    const val DOMAIN = "myapp://"

    const val LISTING = "${DOMAIN}listing"
    const val PAYMENT = "${DOMAIN}payment"
    const val SHOPPING_CART = "${DOMAIN}shopping-cart"
    const val HISTORY = "${DOMAIN}history"

    fun makeCustomDeepLink(id: String): String {
        return "${DOMAIN}customDeepLink?id=${id}"
    }
}