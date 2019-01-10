package com.gvtech.serviceathome.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.gvtech.serviceathome.R;
import com.gvtech.serviceathome.activities.LoginActivity;
import com.gvtech.serviceathome.activities.professional.ProfessionalHomeActivity;
import com.gvtech.serviceathome.activities.user.HomeActivity;

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

        Button btnLogin = view.findViewById(R.id.btn_login);
        EditText edtUsername = view.findViewById(R.id.edt_username);
        Button btnReg = view.findViewById(R.id.btn_reg);
        Button btnLinkBusiness = view.findViewById(R.id.btnLinkBusiness);
        btnReg.setOnClickListener(v -> {
            ((LoginActivity)this.getActivity()).replaceFragment(new RegistrationFragment(), true);
        });
        btnLinkBusiness.setOnClickListener(v -> {
            ((LoginActivity)this.getActivity()).replaceFragment(new LinkBusinessFragment(),true);
        });
        btnLogin.setOnClickListener(v -> {
            Intent intent;
            if(edtUsername.getText().toString().equals("p")){
                intent = new Intent(getActivity().getApplicationContext(),ProfessionalHomeActivity.class);
            }else {
                intent = new Intent(getActivity().getApplicationContext(),HomeActivity.class);
            }

            getActivity().startActivity(intent);
            getActivity().finish();
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
