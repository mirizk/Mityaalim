package com.mityaalim.ui.main.investment

import com.maatayim.koren.ui.base.list.BaseListItem

data class ServiceItem(
    val id: String,
    val title: String,
    val description: String,
    val price: Float? = null,
    val imageUrl: String? = null
) : BaseListItem<ServiceItem> {
    override fun areItemsTheSame(newItem: ServiceItem): Boolean {
        return id == newItem.id
    }

    override fun isContentTheSame(newItem: ServiceItem): Boolean {
        return title == newItem.title &&
                description == newItem.description &&
                price == newItem.price
    }
}