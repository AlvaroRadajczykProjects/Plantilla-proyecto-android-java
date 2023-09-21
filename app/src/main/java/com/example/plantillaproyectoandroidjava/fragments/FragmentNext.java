package com.example.plantillaproyectoandroidjava.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.plantillaproyectoandroidjava.R;
import com.example.plantillaproyectoandroidjava.databinding.FragmentNextBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNext} factory method to
 * create an instance of this fragment.
 */
public class FragmentNext extends Fragment {

    private FragmentNextBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNextBinding.inflate(inflater);
        View fragmentView = binding.getRoot();

        navHostFragment = (NavHostFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        binding.button.setOnClickListener(view -> {
            NavDirections action = FragmentNextDirections.actionFragmentNextToFragmentMenu();
            Navigation.findNavController(view).navigate(action);
        });

        // Inflate the layout for this fragment
        return fragmentView;
    }
}