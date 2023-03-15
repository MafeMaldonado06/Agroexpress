package com.example.agroexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class Activity_Inicio_Roles : AppCompatActivity() {

     private val list = mutableListOf<CarouselItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_roles)


        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://www.procapslaboratorios.com/getattachment/Blog/Salud-y-Bienestar/Es-importante-consumir-frutas-y-verduras-1/procaps-frutas-y-verduras-beneficios-1.jpg.aspx?width=715&height=528"))
        list.add(CarouselItem("https://www.edualimentaria.com/images/frutas-verduras/frutas_hortaliza_verduras.jpg"))
        list.add(CarouselItem("https://www.cdc.gov/foodsafety/images/comms/features/GettyImages-1247930626-500px.jpg?_=00453"))
        carousel.addData(list)
    }
}