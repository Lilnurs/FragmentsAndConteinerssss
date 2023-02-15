package com.example.fragmentsandconteinerssss.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentsandconteinerssss.R;


public class FirstFragment extends Fragment {
    private EditText editText;
    private EditText editTextTwo;
    private Button button;
    private Button buttonTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews();
        clicks();
    }

    private void findViews() {
        editText = requireActivity().findViewById(R.id.et_text);
        editTextTwo = requireActivity().findViewById(R.id.et_text_second);
        button = requireActivity().findViewById(R.id.btn_one);
        buttonTwo = requireActivity().findViewById(R.id.btn_two);
    }

    private void clicks() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key", editText.getText().toString());
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, secondFragment).addToBackStack(null).commit();
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key", editTextTwo.getText().toString());
                ThirdFragment thirdFragment = new ThirdFragment();
                thirdFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, thirdFragment).addToBackStack(null).commit();
            }
        });
    }
}