package com.example.nidal.cupaadoption;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SuccessfulAdoptions extends Fragment {

    View view;
    private static final String TAG = "SuccessfulAdoptions";
    private static final int NUM_COLUMNS = 2;
    private ArrayList<String> mImageUrls;


    public SuccessfulAdoptions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_successful_adoptions, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        StaggeredRecyclerviewAdapter staggeredRecyclerviewAdapter = new StaggeredRecyclerviewAdapter(getContext(), mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerviewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mImageUrls = new ArrayList<>();

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Brandon-697x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Disco-1024x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160224-WA0006.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160304-WA0012.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160313-WA0015-972x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Pixie-with-her-new-brother.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Mumzu-and-Ramu-1024x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160223-WA0027-760x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160520-WA0011-1024x576.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20150611-WA0019-1024x575.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Google.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2017/05/WhatsApp-Image-2017-07-22-at-17.23.25.jpeg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2017/05/WhatsApp-Image-2017-07-14-at-16.02.44.jpeg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2017/05/WhatsApp-Image-2017-05-17-at-18.10.25-1.jpeg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2017/05/WhatsApp-Image-2017-07-24-at-16.27.17.jpeg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160507-WA0003-768x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160527-WA0005-1024x576.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160530-WA0007-1024x576.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Lexi-575x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Silly-aka-Mulan-1024x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160326-WA0005-699x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160226-WA0052-1024x896.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160228-WA0006.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160401-WA0017.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Terry-and-Lily-1024x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/Pixie-and-Nidhi-1024x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160313-WA0014-858x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160530-WA0004-1024x576.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2016/01/IMG-20160326-WA0006-576x1024.jpg");

        mImageUrls.add("http://cupabangalore.org/wp-content/uploads/2017/05/WhatsApp-Image-2017-07-01-at-17.28.07.jpeg");

    }

    /*private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");


        onCreateView();

    }*/


}
