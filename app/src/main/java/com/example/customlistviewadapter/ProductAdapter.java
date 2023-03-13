package com.example.customlistviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    //
    private final Context context;
    private final ArrayList<Product> values;


    public ProductAdapter(@NonNull Context context, ArrayList<Product> list) {
        super(context, R.layout.row_layout, list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        //
        TextView tvCarBrand = (TextView) rowView.findViewById(R.id.rowLayout_tv_ProductTitle);
        TextView tvCarModel = (TextView) rowView.findViewById(R.id.rowLayout_tv_ModelType);
        TextView tvCarPrice = (TextView) rowView.findViewById(R.id.rowLayout_tv_Price);
        TextView tvCarDescription = (TextView) rowView.findViewById(R.id.rowLayout_tv_Description);
        //
        tvCarBrand.setText(values.get(position).getTitle());
        tvCarModel.setText(values.get(position).getType());
        tvCarDescription.setText(values.get(position).getDescription());
        tvCarPrice.setText("Price: $"+values.get(position).getPrice());
        //
        ImageView ivCarBrand = (ImageView) rowView.findViewById(R.id.rowLayout_iv_Product);
        ImageView ivCarSale = (ImageView) rowView.findViewById(R.id.rowLayout_iv_Sale);
        //
        if(values.get(position).isSale()){
            ivCarSale.setImageResource(R.drawable.sale);
        }else{
            ivCarSale.setImageResource(R.drawable.best_price);
        }
        //
        if(values.get(position).getTitle().equals("Toyota")){
            ivCarBrand.setImageResource(R.drawable.toyota);
        } else if (values.get(position).getTitle().equals("Honda")){
            ivCarBrand.setImageResource(R.drawable.honda);
        } else if (values.get(position).getTitle().equals("Ford")){
            ivCarBrand.setImageResource(R.drawable.ford);
        }else if (values.get(position).getTitle().equals("BMW")){
            ivCarBrand.setImageResource(R.drawable.bmw);
        }else if (values.get(position).getTitle().equals("Chevrolet")){
            ivCarBrand.setImageResource(R.drawable.chevrolet);
        }else if (values.get(position).getTitle().equals("Dodge")){
            ivCarBrand.setImageResource(R.drawable.dodge);
        }else if (values.get(position).getTitle().equals("Jeep")){
            ivCarBrand.setImageResource(R.drawable.jeep);
        }else if (values.get(position).getTitle().equals("Audi")){
            ivCarBrand.setImageResource(R.drawable.audi);
        }else if (values.get(position).getTitle().equals("Lexus")){
            ivCarBrand.setImageResource(R.drawable.lexus);
        }else if (values.get(position).getTitle().equals("Suzuki")){
            ivCarBrand.setImageResource(R.drawable.suzuki);
        }else if (values.get(position).getTitle().equals("Volvo")){
            ivCarBrand.setImageResource(R.drawable.volvo);
        }else if (values.get(position).getTitle().equals("Nissan")){
            ivCarBrand.setImageResource(R.drawable.nissan);
        }else if (values.get(position).getTitle().equals("Peugeot")){
            ivCarBrand.setImageResource(R.drawable.peugeot);
        }else if (values.get(position).getTitle().equals("Mercedes-Benz")){
            ivCarBrand.setImageResource(R.drawable.mercedes);
        }else if (values.get(position).getTitle().equals("Volkswagen")){
            ivCarBrand.setImageResource(R.drawable.volkswagen);
        }
        else if (values.get(position).getTitle().equals("Mitsubishi")){
//            ivCarBrand.setImageResource(R.drawable.mitsubishi_50);
            ivCarBrand.setImageResource(R.mipmap.mitsubishi_foreground);
        }
        else if (values.get(position).getTitle().equals("Ford")){
            ivCarBrand.setImageResource(R.drawable.ford_480);
        }
        //
        return rowView;
    }
}




























