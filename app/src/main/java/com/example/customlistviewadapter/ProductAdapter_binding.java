package com.example.customlistviewadapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.customlistviewadapter.databinding.RowLayoutBinding;

import java.util.ArrayList;


public class ProductAdapter_binding extends ArrayAdapter<Product> {

    private final Context context;
    private final ArrayList<Product> values;
    //

    public ProductAdapter_binding(Context context, ArrayList<Product> list) {
        super(context, R.layout.row_layout, list);
        this.context = context;
        this.values = list;
    }
    //

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
//        return super.getView(position, convertView, parent);
        //
        RowLayoutBinding binding;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            binding = RowLayoutBinding.inflate(inflater, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (RowLayoutBinding) convertView.getTag();
        }

        binding.rowLayoutTvProductTitle.setText(values.get(position).getTitle());
        binding.rowLayoutTvModelType.setText(values.get(position).getType());
        binding.rowLayoutTvDescription.setText(values.get(position).getDescription());
        binding.rowLayoutTvPrice.setText("Price: $"+values.get(position).getPrice());
        //

        if(values.get(position).isSale()){
            binding.rowLayoutIvSale.setImageResource(R.drawable.sale);
        }else{
            binding.rowLayoutIvSale.setImageResource(R.drawable.best_price);
        }
        //
        if(values.get(position).getTitle().equals("Toyota")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.toyota);
        } else if (values.get(position).getTitle().equals("Honda")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.honda);
        } else if (values.get(position).getTitle().equals("Ford")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.ford);
        }else if (values.get(position).getTitle().equals("BMW")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.bmw);
        }else if (values.get(position).getTitle().equals("Chevrolet")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.chevrolet);
        }else if (values.get(position).getTitle().equals("Dodge")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.dodge);
        }else if (values.get(position).getTitle().equals("Jeep")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.jeep);
        }else if (values.get(position).getTitle().equals("Audi")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.audi);
        }else if (values.get(position).getTitle().equals("Lexus")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.lexus);
        }else if (values.get(position).getTitle().equals("Suzuki")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.suzuki);
        }else if (values.get(position).getTitle().equals("Volvo")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.volvo);
        }else if (values.get(position).getTitle().equals("Nissan")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.nissan);
        }else if (values.get(position).getTitle().equals("Peugeot")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.peugeot);
        }else if (values.get(position).getTitle().equals("Mercedes-Benz")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.mercedes);
        }else if (values.get(position).getTitle().equals("Volkswagen")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.volkswagen);
        }
        else if (values.get(position).getTitle().equals("Mitsubishi")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.mitsubishi_50);

            //            binding.rowLayoutIvProduct.setImageResource(R.drawable.mitsubishi_50);
            binding.rowLayoutIvProduct.setImageResource(R.mipmap.mitsubishi_foreground);
        }
        else if (values.get(position).getTitle().equals("Ford")){
            binding.rowLayoutIvProduct.setImageResource(R.drawable.ford_480);
        }

        return convertView;
    }


}































