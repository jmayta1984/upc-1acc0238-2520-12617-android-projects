package pe.edu.upc.easyshop.features.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import pe.edu.upc.easyshop.core.ui.theme.AppTheme
import pe.edu.upc.easyshop.shared.models.Product
import pe.edu.upc.easyshop.shared.models.products

@Composable
fun ProductDetail(product: Product) {
    Scaffold(
        floatingActionButton = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = {}, modifier = Modifier.weight(1f)) {
                    Text("Add to cart")
                }

                Button(onClick = {}, modifier = Modifier.weight(1f)) {
                    Text("Buy now")
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center

    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Box(contentAlignment = Alignment.TopEnd) {
                AsyncImage(
                    model = product.image,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(256.dp)
                        .background(MaterialTheme.colorScheme.secondaryContainer)
                )

                IconButton(
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.background)
                            .padding(8.dp)
                    )
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProductDetailPreview() {
    AppTheme {
        ProductDetail(products[0])
    }
}