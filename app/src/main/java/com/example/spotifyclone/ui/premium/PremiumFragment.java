package com.example.spotifyclone.ui.premium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.spotifyclone.databinding.FragmentPremiumBinding;

public class PremiumFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        PremiumViewModel premiumViewModel = new ViewModelProvider(this).get(PremiumViewModel.class);
        com.example.spotifyclone.databinding.FragmentPremiumBinding fragmentPremiumBinding = FragmentPremiumBinding.inflate(inflater, container, false);
        View root = fragmentPremiumBinding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
