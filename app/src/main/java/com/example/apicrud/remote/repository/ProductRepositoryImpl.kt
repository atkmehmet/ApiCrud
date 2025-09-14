package com.example.apicrud.remote.repository

import com.example.apicrud.model.Repository.ProductRepository
import com.example.apicrud.remote.apis.apiProduct
import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse

class ProductRepositoryImpl(
    private val apiProduct: apiProduct
):ProductRepository {
    override suspend fun getProducts(): productsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getProductSearch(searchString: String): productsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getProductsLimit(limit: Int, skip: Int, select: String): productsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getProductOrders(sortBy: String, order: String): productsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun addProducts(products: products): products {
        TODO("Not yet implemented")
    }

    override suspend fun updateProducts(tile: String): products {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProducts(): products {
        TODO("Not yet implemented")
    }
}