package com.example.apicrud.remote.repository

import com.example.apicrud.model.Repository.ProductRepository
import com.example.apicrud.remote.apis.apiProduct
import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse

class ProductRepositoryImpl(
    private val apiProduct: apiProduct
):ProductRepository {
    override suspend fun getProducts(): productsResponse {
        return apiProduct.getProducts()
    }

    override suspend fun getProductSearch(searchString: String): productsResponse {
        return apiProduct.getProductSearch(searchString)
    }

    override suspend fun getProductsLimit(limit: Int, skip: Int, select: String): productsResponse {
       return apiProduct.getProductsLimit(limit,skip,select)
    }

    override suspend fun getProductOrders(sortBy: String, order: String): productsResponse {
        return apiProduct.getProductOrders(sortBy,order)
    }

    override suspend fun addProducts(products: products): products {
        return apiProduct.addProducts(products)
    }

    override suspend fun updateProducts(tile: String): products {
        return apiProduct.updateProducts(tile)
    }

    override suspend fun deleteProducts(): products {
        return apiProduct.deleteProducts()
    }
}