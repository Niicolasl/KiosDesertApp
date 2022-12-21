package com.example.table.services;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.table.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ViewHolderService> {
    ArrayList<Service> listaServicios;
    @NonNull
    @Override
    public ServiceAdapter.ViewHolderService onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_services,null, false);
        return new ViewHolderService(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceAdapter.ViewHolderService holder, int position) {
        holder.textView_nombre.setText(listaServicios.get(position).getNombre());
        holder.imageView_foto.setImageResource(listaServicios.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaServicios.size();
    }

    public ServiceAdapter(ArrayList<Service> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public class ViewHolderService extends RecyclerView.ViewHolder{
        private TextView textView_nombre;
        private ImageView imageView_foto;
        public ViewHolderService(@NonNull View itemView) {
            super(itemView);
            textView_nombre= itemView.findViewById(R.id.id_ls_textview_nombre);
            imageView_foto=itemView.findViewById(R.id.id_ls_imageview_foto);
        }

        public TextView getTextView_nombre() {
            return textView_nombre;
        }

        public void setTextView_nombre(TextView textView_nombre) {
            this.textView_nombre = textView_nombre;
        }

        public ImageView getImageView_foto() {
            return imageView_foto;
        }

        public void setImageView_foto(ImageView imageView_foto) {
            this.imageView_foto = imageView_foto;
        }
    }
}
