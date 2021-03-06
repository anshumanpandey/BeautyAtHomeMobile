package com.gvtech.serviceathome.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gvtech.serviceathome.R;
import com.gvtech.serviceathome.adapters.AvailabilityAdapter;
import com.gvtech.serviceathome.adapters.BusinessServiceAdapter;
import com.gvtech.serviceathome.data.LoadData;

/**
 * A simple {@link Fragment} subclass.
 */
public class AvailabilityFragment extends Fragment {


    public AvailabilityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_availability, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerService = view.findViewById(R.id.recycler_availability);
        AvailabilityAdapter availabilityAdapter = new AvailabilityAdapter(getActivity().getApplicationContext(),LoadData.loadAvailibilityItemData());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerService.setLayoutManager(mLayoutManager);
        recyclerService.setItemAnimator(new DefaultItemAnimator());
        recyclerService.setAdapter(availabilityAdapter);
    }

}
