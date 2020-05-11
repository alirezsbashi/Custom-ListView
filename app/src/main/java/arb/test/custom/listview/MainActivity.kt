package arb.test.custom.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = listOf(
        DataModel("Kotlin","kotlin") ,
        DataModel("Java","java") ,
        DataModel("PHP","php") ,
        DataModel("Node js","node") ,
        DataModel("Kotlin","kotlin") ,
        DataModel("Java","java") ,
        DataModel("PHP","php") ,
        DataModel("Node js","node") ,
        DataModel("Kotlin","kotlin") ,
        DataModel("Java","java") ,
        DataModel("PHP","php") ,
        DataModel("Node js","node") ,
        DataModel("Kotlin","kotlin") ,
        DataModel("Java","java") ,
        DataModel("PHP","php") ,
        DataModel("Node js","node") ,
        DataModel("Kotlin","kotlin") ,
        DataModel("Java","java") ,
        DataModel("PHP","php") ,
        DataModel("Node js","node")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CustomAdapter(list)
        listview.adapter = adapter

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"${list[position].name}",Toast.LENGTH_SHORT).show()
        }
    }
}
