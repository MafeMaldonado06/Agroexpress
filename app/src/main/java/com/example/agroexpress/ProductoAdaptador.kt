package com.example.agroexpress

import android.telecom.Conference
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agroexpress.Modelos.Producto

class ProductoAdaptador (val ProductoListener:ProductoListener) : RecyclerView.Adapter<ProductoAdaptador.ViewHolder>(){
    val  listProducto = ArrayList<Producto>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType:int)= ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_com_productos, parent,false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val product =listProducto[position] as producticos
        holder.tvNombreP.text= Producto.Pro_Nombre
        holder.tvPrecioP.text= Producto.Pro_Precio
        holder.tvLoteP.text= Producto.Pro_Lote
    }

    fun updateData(data:kotlin.collections.List<Producto>){
        listProducto.clear()
        listProducto.addAll(data)
        notifyDataSetChanged()
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvNombreP=itemView.findViewById<TextView>(R.id.nombreComProducto)
        val tvPrecioP=itemView.findViewById<TextView>(R.id.precioComProducto)
        val tvLoteP=itemView.findViewById<TextView>(R.id.cantidadComProducto)
    }

}