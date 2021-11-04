package com.example.project_myvntour.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_myvntour.Mode.KhachSan;
import com.example.project_myvntour.Mode.LoaiKhachSanj;
import com.example.project_myvntour.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterLoaiKhachSanj extends RecyclerView.Adapter<AdapterLoaiKhachSanj.ViewHolder> {
    private List<LoaiKhachSanj> list;
    private Context mContext;
    private int row_index = -1;
    private boolean selected = true;
    private boolean check = true;
    private UpdateRecyclerView mUpdateRecyclerView;
   private List<KhachSan> listKhachSan;
    public interface UpdateRecyclerView {
        public void callbacksChanged(int position , List<KhachSan> list );
        public void callbacksChanged2(int position , List<KhachSan> list );
    }

    public AdapterLoaiKhachSanj (Context context , List<LoaiKhachSanj> list ,UpdateRecyclerView mUpdateRecyclerView ){
        this.mContext = context;
        this.list = list;
        this.mUpdateRecyclerView = mUpdateRecyclerView;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.itemloaikhachsan, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterLoaiKhachSanj.ViewHolder holder, int position) {
        LoaiKhachSanj loai = list.get(position);
        holder.tvTenLoai.setText(loai.getTenLoaiKhachSanj());

        if(check){
            // trueyefn list nhà ở all
            listKhachSan = new ArrayList<>();
            int[] id1={ 1 , 2, 3, 4, 5};
            int[] image = {R.drawable.anh5, R.drawable.anh4, R.drawable.anh3, R.drawable.anh2, R.drawable.anh1};
            String[] tenkhachsan = {"Marriott International", "Hilton Worldwide", "InterContinental Hotels Group (IHG)", "Accor Hotels", "Wyndham Hotel Group"};
            String[] diadiem = {"Tiểu bang Maryland, Mỹ", "Bang Virginia, Mỹ", "Denham, Vương quốc Anh", "Paris, Pháp", "Wyndham Hotel Group"};
            int[]soluongPHongNGu ={ 5 , 7 ,8 ,3 ,5 };
            int[]soLUongPHongTam ={ 9 , 2 ,2 ,4 ,3 };
            int[]soSao ={ 5 , 4 ,5 ,2 ,1 };
            int[]trangthai ={ 0 , 0 ,0 ,0 ,0 };
            int[]giathue ={ 9000000,20000000 ,4000000 ,300000 , 60000000};
            double[] kinhdo = {20.7554032 , 20.7305544 , 20.7310787, 20.7316318, 20.7318967};
            double[] vido = {106.3717384, 106.3940725, 106.3965079, 106.3958132, 106.393657};
            String[] LoaiKhachSan = {"Hotel", "Apartments", "Villa", "Wooden house", "Condos"};
            for(int i=0; i<id1.length; i++) {
                listKhachSan.add(new KhachSan(id1[i] , soluongPHongNGu[i] , soLUongPHongTam [i] ,image[i] ,
                        tenkhachsan[i],
                        diadiem[i],
                        kinhdo[i],
                        vido[i]
                        ,
                        giathue[i]
                        ,
                        LoaiKhachSan[i],trangthai[i] ,soSao[i]
                ));
            }
            mUpdateRecyclerView.callbacksChanged(position , listKhachSan);
            mUpdateRecyclerView.callbacksChanged2(position , listKhachSan);
            check = false;


        }

        holder.itemView.setOnClickListener(v->{
            row_index =position;
            notifyDataSetChanged();

            if(position == 0){
                // trueyefn list nhà ở all
                listKhachSan = new ArrayList<>();
                int[] id1={ 1 , 2, 3, 4, 5};
                int[] image = {R.drawable.anh5, R.drawable.anh4, R.drawable.anh3, R.drawable.anh2, R.drawable.anh1};
                String[] tenkhachsan = {"Marriott International", "Hilton Worldwide", "InterContinental Hotels Group (IHG)", "Accor Hotels", "Wyndham Hotel Group"};
                String[] diadiem = {"Tiểu bang Maryland, Mỹ", "Bang Virginia, Mỹ", "Denham, Vương quốc Anh", "Paris, Pháp", "Wyndham Hotel Group"};
                int[]soluongPHongNGu ={ 5 , 7 ,8 ,3 ,5 };
                int[]soLUongPHongTam ={ 9 , 2 ,2 ,4 ,3 };
                int[]soSao ={ 5 , 4 ,5 ,2 ,1 };
                int[]trangthai ={ 0 , 0 ,0 ,0 ,0 };
                int[]giathue ={ 9000000,20000000 ,4000000 ,300000 , 60000000};
                double[] kinhdo = {20.7554032 , 20.7305544 , 20.7310787, 20.7316318, 20.7318967};
                double[] vido = {106.3717384, 106.3940725, 106.3965079, 106.3958132, 106.393657};
                String[] LoaiKhachSan = {"Hotel", "Apartments", "Villa", "Wooden house", "Condos"};
                for(int i=0; i<id1.length; i++) {
                    listKhachSan.add(new KhachSan(id1[i] , soluongPHongNGu[i] , soLUongPHongTam [i] ,image[i] ,
                            tenkhachsan[i],
                            diadiem[i],
                            kinhdo[i],
                            vido[i]
                            ,
                            giathue[i] ,
                            LoaiKhachSan[i],trangthai[i] ,soSao[i]
                    ));
                }
                mUpdateRecyclerView.callbacksChanged(position , listKhachSan);
                mUpdateRecyclerView.callbacksChanged2(position , listKhachSan);

            }else if(position == 1) {
                listKhachSan = new ArrayList<>();
                int[] id1={ 1 , 2, 3, 4, 5};
                int[] image = { R.drawable.anh3, R.drawable.anh2,R.drawable.anh5, R.drawable.anh4, R.drawable.anh1};
                String[] tenkhachsan = {"Marriott International" ,"Accor Hotels", "Hilton Worldwide", "InterContinental Hotels Group (IHG)", "Wyndham Hotel Group"};
                String[] diadiem = {"Tiểu bang Maryland, Mỹ", "Bang Virginia, Mỹ", "Denham, Vương quốc Anh", "Paris, Pháp", "Wyndham Hotel Group"};
                int[]soluongPHongNGu ={ 5 , 7 ,8 ,3 ,5 };
                int[]soLUongPHongTam ={ 9 , 2 ,2 ,4 ,3 };
                int[]soSao ={ 5 , 4 ,5 ,2 ,1 };
                int[]trangthai ={ 0 , 0 ,0 ,0 ,0 };
                int[]giathue ={ 9000000,20000000 ,4000000 ,300000 , 60000000};
                double[] kinhdo = {20.7554032 , 20.7305544 , 20.7310787, 20.7316318, 20.7318967};
                double[] vido = {106.3717384, 106.3940725, 106.3965079, 106.3958132, 106.393657};
                String[] LoaiKhachSan = {"Hotel", "Apartments", "Villa", "Wooden house", "Condos"};
                for(int i=0; i<id1.length; i++) {
                    listKhachSan.add(new KhachSan(id1[i] , soluongPHongNGu[i] , soLUongPHongTam [i] ,image[i] ,
                            tenkhachsan[i],
                            diadiem[i],
                            kinhdo[i],
                            vido[i]
                            ,
                            giathue[i] ,
                            LoaiKhachSan[i],trangthai[i] ,soSao[i]
                    ));
                }
                mUpdateRecyclerView.callbacksChanged(position , listKhachSan);
                mUpdateRecyclerView.callbacksChanged2(position , listKhachSan);
            }
            else if(position == 2) {

            }
            else if(position == 3) {

            }
            else if(position == 4) {

            }
            else if(position == 5) {

            }
            else if(position == 6) {

            }
            else if(position == 7) {

            }
            else if(position == 8) {

            }



        });
        if(selected){
            if(position == 0){
                holder.itemView.setBackgroundResource(R.drawable.gradient2);
                holder.tvTenLoai.setTextColor(Color.parseColor("#FFFFFF"));
            }
            selected = false;
        }else{
            if(row_index==position){
                holder.itemView.setBackgroundResource(R.drawable.gradient2);
                holder.tvTenLoai.setTextColor(Color.parseColor("#FFFFFF"));
            }
            else
            {
                holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
                holder.tvTenLoai.setTextColor(Color.parseColor("#858585"));
            }
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTenLoai;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);


            tvTenLoai = (TextView)itemView. findViewById(R.id.tvTenLoai);

        }
    }
}