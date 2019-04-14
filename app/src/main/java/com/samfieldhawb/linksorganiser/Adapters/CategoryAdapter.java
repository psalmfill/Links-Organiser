package com.samfieldhawb.linksorganiser.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.samfieldhawb.linksorganiser.Models.Category;
import com.samfieldhawb.linksorganiser.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<Category> mCategories;

    public CategoryAdapter(Context context, List<Category> categories) {
        mContext = context;
        mCategories = categories;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i ==1 ){
            View view = LayoutInflater.from(mContext).inflate(R.layout.category_card,viewGroup,false);
            return  new CategoryHolder(view);
        }else{
            View view = LayoutInflater.from(mContext).inflate(R.layout.add_card,viewGroup,false);
            return new AddCategoryHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int type = getItemViewType(i);
        if(type == 1 ){
            Category category = mCategories.get(i);
            CategoryHolder categoryHolder = (CategoryHolder) viewHolder;
            categoryHolder.mName.setText(category.getName());
        }else {

        }

    }

    @Override
    public int getItemCount() {
        return mCategories !=null?mCategories.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position == mCategories.size()-1 ? 0 : 1;
    }

    class CategoryHolder extends RecyclerView.ViewHolder {
         
        CardView mCard;
        ImageView mIcon;
        TextView mName;
        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            mCard = itemView.findViewById(R.id.cat_card);
            mIcon = itemView.findViewById(R.id.cat_icon);
            mName = itemView.findViewById(R.id.cat_name);
        }
    }

    class AddCategoryHolder extends RecyclerView.ViewHolder {
        public CardView mAdd;
        public AddCategoryHolder(@NonNull View itemView) {
            super(itemView);
            mAdd = itemView.findViewById(R.id.add_card);
        }
    }
}
