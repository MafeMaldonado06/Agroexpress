package com.example.agroexpress.Adaptador

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.agroexpress.Modelos.Campesinos
import com.example.agroexpress.R
import kotlin.jvm.internal.Intrinsics.Kotlin

class CampesinosAdaptador  (private val CampesinosListner: CampesinosListener) : RecyclerView.Adapter<CampesinosAdaptador.ViewHolder>(){
    val listCampesino = ArrayList<Campesinos>()

    override  fun  onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.fragment_admi_campesinos,parent,false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val campesino = listCampesino[position]

        try{
            Glide.with(holder.itemView.context)
                  .load(campesino.get("imagen"))
                  .into(holder.imagen)
            holder.itemView.setOnClickListener{
                //hola
            }
            holder.tvnombres_campesino.text = campesino.Cam_Nombre
            holder.TV_apellidos_campesino.text = campesino.Cam_Apellido
            holder.TV_apellidos_campesino.text = campesino.Cam_Apellido
            holder.TV_ciudad_campesino.text = campesino.Cam_Ciudad
            holder.TV_telefono_campesino.text = campesino.Cam_Telefono
        }catch (e : Exception){
            Log.w("Campesinosdatos", "No cargan datos")
        }
    }

    fun updateData(data:kotlin.collections.List<Campesinos>){
        listCampesino.clear()
        listCampesino.addAll(data)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvnombres_campesino = itemView.findViewById<TextView>(R.id.tvnombres_campesino)
        val TV_apellidos_campesino = itemView.findViewById<TextView>(R.id.TV_apellidos_campesino)
        val TV_ciudad_campesino =itemView.findViewById<TextView>(R.id.TV_ciudad_campesino)
        val TV_telefono_campesino = itemView.findViewById<TextView>(R.id.TV_telefono_campesino)
        var imagen: ImageView = itemView.findViewById(R.id.IV_imagen_campesino)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}


