package com.example.android.popularmovies;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivity2Fragment extends Fragment {

    public DetailActivity2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail2, container, false);

        Intent intent = getActivity().getIntent();

        if (intent != null){
            MovieData message = (MovieData) intent.getSerializableExtra("MovieData");
            TextView title = (TextView) rootView.findViewById(R.id.header);
            title.setText(message.getOrginal_title());
            ImageView image = (ImageView) rootView.findViewById(R.id.image_fragment);
            Picasso.with(getActivity()).load("http://image.tmdb.org/t/p/w185/" + message.getUrl()).into(image);
            TextView relese_date = (TextView) rootView.findViewById(R.id.release_date);
            relese_date.setText(message.getRelease_date());
            TextView rating = (TextView) rootView.findViewById(R.id.user_rating);
            rating.setText(message.getVote_average() + "/10");
            TextView overview = (TextView) rootView.findViewById(R.id.overview);
            overview.setText(message.getOverview());
        }

        return rootView;
    }
}
