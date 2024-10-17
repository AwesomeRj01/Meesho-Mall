package hackon.lifetime.shopon

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

val products = mutableListOf(
//    Product(
//        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
//        "Free Delivery",
//        "Acacia Wood and Natural Cane Weaving",
//        4.5f, "1,210",
//        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/chair.glb?alt=media&token=e32cf525-ee71-4490-a38e-0c42f49be3b2"
//    ),
//    Product(
//        2, "Canteen Table", "4,500", R.drawable.table,
//        "Free Delivery",
//        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
//        4f, "895",
//        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
//    ),
//    Product(
//        3, "Pedestal Fan", "3,200", R.drawable.pedestal_fan,
//        "Free Delivery",
//        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
//        3.5f, "4,752",
//        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/coolerfan(without-defense).glb?alt=media&token=9ec989b7-82da-4892-b2b6-926fa7dd3f92"
//    ),
//    Product(
//        4, "Mobile Tripod", "500", R.drawable.tripod_image,
//        "Free Delivery",
//        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
//        4f, "14,396",
//        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Tripod%20Grip.glb?alt=media&token=c8c8650f-8980-4848-ba46-130b7d90cc83"
//    ),
//    Product(
//        5, "Office Chair", "11,880", R.drawable.office_chair,
//        "Free Delivery",
//        "Chair with lumbar support and pneumatic gas lift for height adjustment and 360 degree swivel.",
//        4.5f, "257",
//        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/chair.glb?alt=media&token=ca3b84fa-e8b2-4c85-bff1-1b0b63272c1e"
//    ),
//    Product(
//        6, "Bar Chair", "5,500", R.drawable.bar_chair,
//        "Free Delivery",
//        "Stable And Sturdy Bar chair - With a built-in 360 degree swivel. High density foam upholstered in leatherette.",
//        4f, "1,664",
//        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/bar_chair.glb?alt=media&token=f17deee7-1bff-4ff0-86ea-9542f68146cb"
//    ),
//    Product(
//        7, "Park Bench", "12,500", R.drawable.park_bench_photo,
//        "Free Delivery",
//        "The large garden bench seat pad offers the perfect mix of appearance and functionality",
//        3.5f, "578",
//        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/park_bench.glb?alt=media&token=8afb7436-7dc2-411e-9b9a-3583c076fc8f"
//    ),
//    Product(
//        8, "Microwave Oven", "15,000", R.drawable.oven_photo,
//        "Free Delivery",
//        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
//        4.5f, "734",
//        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/oven.glb?alt=media&token=116d796f-9619-45c2-b170-9704520c7582"
//    ),
    Product(
        9, "Cotton T-Shirt", "499", R.drawable.pink_tshirt,
        "Free Delivery",
        "This classic cotton t-shirt offers a perfect blend of comfort and style. Its soft, breathable fabric is ideal for everyday wear. Featuring a modern fit, it pairs effortlessly with jeans or shorts.",
        4.5f, "1024",
        "https://drive.google.com/uc?export=download&id=1Bo9jr2BBhqk6NOKnYFwvg5bPAaE-N-dp"
    ),
        Product(
        2, "Canteen Table", "9999", R.drawable.table,
        "Free Delivery",
        "The Canteen Table is a durable, high-quality piece perfect for cafeterias, canteens, or dining areas. Designed with a sleek finish, it comfortably seats multiple people and is easy to clean. Built for daily use, this table is both sturdy and stylish, ideal for any food service setting. Upgrade your space with this reliable and functional canteen table.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    // model not working for this black t-shirt.
//    Product(
//        10, "T-Shirt", "899", R.drawable.black_tshirt,
//        "Free Delivery",
//        "This sleek black t-shirt is crafted from premium, soft cotton for all-day comfort. Featuring a classic crew neck design, it's perfect for casual outings or layering. Its minimalist style pairs effortlessly with any outfit. Available in multiple sizes for the perfect fit.",
//        4.5f, "734",
//        "https://drive.google.com/uc?export=download&id=1FfYYrWvu8ajHoMsnKpI4bbFvKXhFGy0d"
//    ),
    Product(
        11, "Sun Glass", "1299", R.drawable.fancy_glasses,
        "Free Delivery",
        "These stylish sunglasses offer 100% UV protection with a sleek, modern design. Featuring durable, lightweight frames and scratch-resistant lenses, they provide comfort and long-lasting wear. Perfect for any outdoor occasion, they add a touch of elegance to any outfit.",
        4.5f, "634",
        "https://drive.google.com/uc?export=download&id=1gqT0vnS-FCS9-CiwtBws0PoftmHWBpOg"
    )
            ,
    // models for half pant aren't working. tried different websites.
//    Product(
//            12, "Half Pant", "599", R.drawable.half_pant,
//    "Free Delivery",
//    "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
//    4.5f, "734",
//    "https://drive.google.com/uc?export=download&id=1OzPSopm957q_53XybabHpt3KGIxRoQ4N"
//)
    Product(
        13, "Barbie Dress", "1599", R.drawable.barbie_dress,
        "Free Delivery",
        "This stylish Barbie dress is perfect for imaginative play and dress-up fun. It features vibrant colors and intricate details, designed to make your Barbie look stunning. Made with high-quality fabric, it fits most standard Barbie dolls. Add this to your collection for endless fashion possibilities!",
        4.5f, "734",
        "https://drive.google.com/uc?export=download&id=1Llrx5cHF8PfANh-6gjePgbXIdSQTuOne"
    ),

//    Product(
//        14, "Closet", "1599", R.drawable.barbie_dress,
//        "Free Delivery",
//        "This stylish Barbie dress is perfect for imaginative play and dress-up fun. It features vibrant colors and intricate details, designed to make your Barbie look stunning. Made with high-quality fabric, it fits most standard Barbie dolls. Add this to your collection for endless fashion possibilities!",
//        4.5f, "734",
//        "https://drive.google.com/uc?export=download&id=15zpTRV9xoO-TXN_izGc5_30-VXM1WEH2"
//    )

        Product(
        5, "Office Chair", "7999", R.drawable.office_chair,
        "Free Delivery",
        "Elevate your workspace with our ergonomic office chair, designed for all-day comfort and support. Featuring adjustable height, breathable mesh, and a sleek modern design, it blends style with functionality. Perfect for long hours of productivity, this chair promotes healthy posture. Upgrade your office today!",
        4.5f, "101",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/chair.glb?alt=media&token=ca3b84fa-e8b2-4c85-bff1-1b0b63272c1e"
    ),
        Product(
        4, "Mobile Tripod", "2399", R.drawable.tripod_image,
        "Free Delivery",
        "Capture stunning photos and videos with our versatile mobile tripod, featuring adjustable legs for stability on any surface. Lightweight and portable, it’s perfect for on-the-go shooting and vlogging. The 360-degree rotation allows for dynamic angles and creative shots. Enhance your mobile photography experience today!",
        4f, "1,400",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Tripod%20Grip.glb?alt=media&token=c8c8650f-8980-4848-ba46-130b7d90cc83"
    )


// half pant -> glasses
// t-shirt -> aadmi
// oven ->t-shirt
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}