package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dener on 04/04/2018.
 */

public class MyPlaces extends BaseAdapter {

    private ArrayList<Place> places;
    private Context context;

    MyPlaces(Context context, ArrayList<Place> list) {
        this.context = context;
        this.places = new ArrayList<>();
        for (Place place: list) {
            this.places.add(place);
        }
    }

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int i) {
        return this.places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place place = this.places.get(i);

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        TextView placeName = newView.findViewById(R.id.txt_place_name);
        placeName.setText(place.getName());

        TextView placeDescription = newView.findViewById(R.id.txt_place_description);
        placeDescription.setText(place.getDescription());

        TextView placeDistance = newView.findViewById(R.id.txt_place_distance);
        placeDistance.setText(place.getDistance().toString() + " km");

        RatingBar placeRating = newView.findViewById(R.id.place_rating);
        placeRating.setRating(place.getRate().floatValue());

        ImageView placeImage = newView.findViewById(R.id.img_place_photo);
        placeImage.setImageDrawable(this.context.getDrawable(place.getPhotoId()));

        return newView;
    }
}
