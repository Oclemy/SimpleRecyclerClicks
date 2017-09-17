package com.tutorials.hp.simplerecyclerclicks;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our galaxycell class
 */
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.jaychang.srv.SimpleCell;
import com.jaychang.srv.SimpleViewHolder;
/*
- Our GalaxyCell class.
- Derives from SimpleCell.
- Is the equivalence of our RecyclerView.Adapter class.
 */
public class GalaxyCell extends SimpleCell<Galaxy,GalaxyCell.ViewHolder>  {


    public GalaxyCell(@NonNull Galaxy item) {
        super(item);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.model;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(ViewGroup parent, View cellView) {
        return new ViewHolder(cellView);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder viewHolder, int i, @NonNull Context context, Object o) {
        viewHolder.titleTxt.setText(getItem().getName());
        viewHolder.descTxt.setText(getItem().getDescription());
        viewHolder.img.setImageResource(getItem().getImage());
    }
    /**
     * Define your view holder, which must extend SimpleViewHolder.
     * */
    static class ViewHolder extends SimpleViewHolder {
        TextView titleTxt,descTxt;
        ImageView img;

        ViewHolder(View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.nameTxt);
            descTxt=itemView.findViewById(R.id.descTxt);
            img=itemView.findViewById(R.id.galaxyImageview);

        }
    }
}

