package com.example.agroexpress

import com.example.agroexpress.Modelos.Producto
import java.text.FieldPosition

interface ProductoListener {
    fun onProductoCliked(producto: Producto,position: int)

}