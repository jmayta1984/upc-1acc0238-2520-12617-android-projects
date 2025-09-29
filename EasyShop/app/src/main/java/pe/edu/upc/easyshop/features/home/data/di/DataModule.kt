package pe.edu.upc.easyshop.features.home.data.di

import androidx.room.Room
import pe.edu.upc.easyshop.MyApplication
import pe.edu.upc.easyshop.features.home.data.local.dao.ProductDao
import pe.edu.upc.easyshop.features.home.data.local.database.AppDatabase
import pe.edu.upc.easyshop.features.home.data.remote.services.ProductService
import pe.edu.upc.easyshop.features.home.data.repositories.ProductRepositoryImpl
import pe.edu.upc.easyshop.features.home.domain.repositories.ProductRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataModule {

}