package com.codesroots.mac.smart.presentaion.portifliofragment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.codesroots.mac.smart.R
import com.codesroots.mac.smart.databinding.ReportItemBinding
import com.codesroots.mac.smart.databinding.SavedLayoutBinding
import com.codesroots.mac.smart.models.Buypackge
import com.codesroots.mac.smart.models.ReportDaily
import com.codesroots.mac.smart.presentaion.ClickHandler
import com.codesroots.mac.smart.presentaion.MainActivity
import com.codesroots.mac.smart.presentaion.mainfragment.viewmodel.MainViewModel

class portifolioAdapter(var viewModel: MainViewModel, var context : Context?, var data:List<Buypackge>) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return  data.size
    }
    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        p0.bind(viewModel,context,data.get(p1))
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val  binding: SavedLayoutBinding = DataBindingUtil.inflate (
            LayoutInflater.from(p0.context),
            R.layout.saved_layout,p0,false)
        return  CustomViewHolder(binding)
    }
}
class CustomViewHolder (
    private val binding: SavedLayoutBinding
) : RecyclerView.ViewHolder(binding.root){
    fun bind(viewModel: MainViewModel, context: Context?, data: Buypackge) {
        binding.listener = ClickHandler()
        binding.data = data
        binding.context = context as MainActivity?
    }

}