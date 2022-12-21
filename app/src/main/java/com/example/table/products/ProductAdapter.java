package com.example.table.products;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.table.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolderData> {

    ArrayList<Producto> listaProductos;

    public ProductAdapter(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_productos, null, false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolderData holder, int position) {
        holder.textView_nombre.setText(listaProductos.get(position).getNombre());
        holder.textView_descripcion.setText(listaProductos.get(position).getDescripcion());
        holder.imageView_foto.setImageResource(listaProductos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }
    public class ViewHolderData extends RecyclerView.ViewHolder{
        private TextView textView_nombre, textView_descripcion;
        private ImageView imageView_foto;

        public ViewHolderData(@NonNull View itemView) {
            super(itemView);
            textView_nombre= itemView.findViewById(R.id.id_lp_textview_nombre);
            textView_descripcion= itemView.findViewById(R.id.id_lp_textview_info);
            imageView_foto= itemView.findViewById(R.id.id_lp_imageview_foto);

        }

        public TextView getTextView_nombre() {
            return textView_nombre;
        }

        public void setTextView_nombre(TextView textView_nombre) {
            this.textView_nombre = textView_nombre;
        }

        public TextView getTextView_descripcion() {
            return textView_descripcion;
        }

        public void setTextView_descripcion(TextView textView_descripcion) {
            this.textView_descripcion = textView_descripcion;
        }

        public ImageView getImageView_foto() {
            return imageView_foto;
        }

        public void setImageView_foto(ImageView imageView_foto) {
            this.imageView_foto = imageView_foto;
        }
    }
}
