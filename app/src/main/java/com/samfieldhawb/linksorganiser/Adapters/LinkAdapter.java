package com.samfieldhawb.linksorganiser.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.samfieldhawb.linksorganiser.Models.Link;
import com.samfieldhawb.linksorganiser.R;

import java.util.List;

public class LinkAdapter  extends RecyclerView.Adapter<LinkAdapter.LinkHolder> {
    private Context mContext;
    private List<Link> mLinks;

    public LinkAdapter(Context context, List<Link> links) {
        mContext = context;
        mLinks = links;
    }

    @NonNull
    @Override
    public LinkHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.link_card,viewGroup,false);
        return new LinkHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinkHolder linkHolder, int i) {
        Link link = mLinks.get(i);
        linkHolder.mTitle.setText(link.getTitle());
        linkHolder.mLink.setText(link.getUrl());
    }

    @Override
    public int getItemCount() {
        return mLinks != null?mLinks.size():0;
    }

    class LinkHolder extends RecyclerView.ViewHolder {
        TextView mTitle, mLink;
        ImageView mVisit,mEdit,mDelete;
        LinkHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.link_title);
            mLink = itemView.findViewById(R.id.link);
            mVisit = itemView.findViewById(R.id.visit_link);
            mEdit = itemView.findViewById(R.id.edit_link);
            mDelete = itemView.findViewById(R.id.delete_link);
        }
    }
}
