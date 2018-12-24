package com.gvtech.serviceathome.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gvtech.serviceathome.R;
import com.gvtech.serviceathome.activities.LoginActivity;

public class LoginFragment extends Fragment {



    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnReg = view.findViewById(R.id.btn_reg);
        Button btnLinkBusiness = view.findViewById(R.id.btnLinkBusiness);
        btnReg.setOnClickListener(v -> {
            ((LoginActivity)this.getActivity()).replaceFragment(new RegistrationFragment());
        });
        btnLinkBusiness.setOnClickListener(v -> {
            ((LoginActivity)this.getActivity()).replaceFragment(new LinkBusinessFragment());
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
