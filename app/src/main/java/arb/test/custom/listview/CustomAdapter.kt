package arb.test.custom.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.listview.view.*

//    parent.context.resources.getIdentifier(dataList.img , "drawable" , parent.context.packageName)

class CustomAdapter(var data: List<DataModel>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view: View
        val holder: CustomViewHolder

        if (convertView == null) {

            view = LayoutInflater.from(parent!!.context).inflate(R.layout.listview, null)
            holder = CustomViewHolder()
            holder.img = view.list_img
            holder.txt = view.list_name
            view.tag = holder
        } else {
            holder = convertView.tag as CustomViewHolder
            view = convertView
        }

        var listData = getItem(position)

        var imgID = parent.context.resources.getIdentifier(
            listData.img,
            "drawable",
            parent.context.packageName
        )

        view.list_img.setImageResource(imgID)
        view.list_name.text = listData.name

        view.list_lin.setOnClickListener {
            Toast.makeText(parent.context, "${listData.name}", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    override fun getItem(position: Int): DataModel = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = data.size

    class CustomViewHolder {
        lateinit var img: CircleImageView
        lateinit var txt: TextView
    }

}