package arb.test.custom.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.listview.view.*
//    parent.context.resources.getIdentifier(dataList.img , "drawable" , parent.context.packageName)

class CustomAdapter(var data : List<DataModel>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.listview , null)

        var listData = getItem(position)

        var imgID = parent.context.resources.getIdentifier(listData.img , "drawable" , parent.context.packageName)

        view.list_img.setImageResource(imgID)
        view.list_name.text = listData.name

        return view
    }

    override fun getItem(position: Int): DataModel = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = data.size

}