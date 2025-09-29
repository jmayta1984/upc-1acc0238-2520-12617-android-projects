package pe.edu.upc.easyshop.features.home.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import pe.edu.upc.easyshop.features.home.data.local.models.ProductEntity

@Dao
interface ProductDao {

    @Insert
    suspend fun insert(vararg entities: ProductEntity)

    @Delete
    suspend fun delete(vararg entities: ProductEntity)

    @Query("select * from products")
    suspend fun fetchAll(): List<ProductEntity>

    @Query("select * from products where id=:id")
    suspend fun fetchProductById(id: Int): List<ProductEntity>
}