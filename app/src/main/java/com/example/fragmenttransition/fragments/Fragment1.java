package com.example.fragmenttransition.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.fragmenttransition.R;
import com.example.fragmenttransition.activity.MainActivity;

public class Fragment1 extends Fragment implements View.OnClickListener {
    private Button scaleX, scaleY, scaleXY, fade, flipHorizontal, flipVertical, slideHorizontal,
            slideVertical, slideHorizontalPushTop,
            slideVerticalPushLeft, glide, stack, cube,
            rotate_down, rotate_up, accordian, table_horizontal,
            table_vertical, zoom_from_left_corner, zoom_from_right_corner,
            zoom_slide_horizontal, zoom_slide_vertical;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        scaleX = view.findViewById(R.id.scaleX);
        scaleY = view.findViewById(R.id.scaleY);
        scaleXY = view.findViewById(R.id.scaleXY);
        fade = view.findViewById(R.id.fade);
        flipHorizontal = view.findViewById(R.id.flipHorizontal);
        flipVertical = view.findViewById(R.id.flipVertical);
        slideHorizontal = view.findViewById(R.id.slideHorizontal);
        slideVertical = view.findViewById(R.id.slideVertical);
        slideHorizontalPushTop = view.findViewById(R.id.slideHorizontalPushTop);
        slideVerticalPushLeft = view.findViewById(R.id.slideVerticalPushLeft);
        glide = view.findViewById(R.id.glide);
        stack = view.findViewById(R.id.stack);
        cube = view.findViewById(R.id.cube);
        rotate_down = view.findViewById(R.id.rotate_down);
        rotate_up = view.findViewById(R.id.rotate_up);
        accordian = view.findViewById(R.id.accordian);
        table_horizontal = view.findViewById(R.id.table_horizontal);
        table_vertical = view.findViewById(R.id.table_vertical);
        zoom_from_left_corner = view.findViewById(R.id.zoomFromLeftCorner);
        zoom_from_right_corner = view.findViewById(R.id.zoomFromRightCorner);
        zoom_slide_horizontal = view.findViewById(R.id.zoomSlideHorizontal);
        zoom_slide_vertical = view.findViewById(R.id.zoomSlideVertical);


        scaleX.setOnClickListener(this);
        scaleY.setOnClickListener(this);
        scaleXY.setOnClickListener(this);
        fade.setOnClickListener(this);
        flipHorizontal.setOnClickListener(this);
        flipVertical.setOnClickListener(this);
        slideHorizontal.setOnClickListener(this);
        slideVertical.setOnClickListener(this);
        slideHorizontalPushTop.setOnClickListener(this);
        slideVerticalPushLeft.setOnClickListener(this);
        glide.setOnClickListener(this);
        stack.setOnClickListener(this);
        cube.setOnClickListener(this);
        rotate_down.setOnClickListener(this);
        rotate_up.setOnClickListener(this);
        accordian.setOnClickListener(this);
        table_horizontal.setOnClickListener(this);
        table_vertical.setOnClickListener(this);
        zoom_from_left_corner.setOnClickListener(this);
        zoom_from_right_corner.setOnClickListener(this);
        zoom_slide_horizontal.setOnClickListener(this);
        zoom_slide_vertical.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.scaleX:
                ((MainActivity) getActivity()).addFragmentWithAnimation(0);
                break;

            case R.id.scaleY:
                ((MainActivity) getActivity()).addFragmentWithAnimation(1);
                break;

            case R.id.scaleXY:
                ((MainActivity) getActivity()).addFragmentWithAnimation(2);
                break;

            case R.id.fade:
                ((MainActivity) getActivity()).addFragmentWithAnimation(3);
                break;

            case R.id.flipHorizontal:
                ((MainActivity) getActivity()).addFragmentWithAnimation(4);
                break;
            case R.id.flipVertical:
                ((MainActivity) getActivity()).addFragmentWithAnimation(5);
                break;
            case R.id.slideVertical:
                ((MainActivity) getActivity()).addFragmentWithAnimation(6);
                break;
            case R.id.slideHorizontal:
                ((MainActivity) getActivity()).addFragmentWithAnimation(7);
                break;
            case R.id.slideHorizontalPushTop:
                ((MainActivity) getActivity()).addFragmentWithAnimation(8);
                break;
            case R.id.slideVerticalPushLeft:
                ((MainActivity) getActivity()).addFragmentWithAnimation(9);
                break;
            case R.id.glide:
                ((MainActivity) getActivity()).addFragmentWithAnimation(10);
                break;

            case R.id.stack:
                ((MainActivity) getActivity()).addFragmentWithAnimation(12);
                break;
            case R.id.cube:
                ((MainActivity) getActivity()).addFragmentWithAnimation(13);
                break;
            case R.id.rotate_down:
                ((MainActivity) getActivity()).addFragmentWithAnimation(14);
                break;
            case R.id.rotate_up:
                ((MainActivity) getActivity()).addFragmentWithAnimation(15);
                break;
            case R.id.accordian:
                ((MainActivity) getActivity()).addFragmentWithAnimation(16);
                break;
            case R.id.table_horizontal:
                ((MainActivity) getActivity()).addFragmentWithAnimation(17);
                break;
            case R.id.table_vertical:
                ((MainActivity) getActivity()).addFragmentWithAnimation(18);
                break;
            case R.id.zoomFromLeftCorner:
                ((MainActivity) getActivity()).addFragmentWithAnimation(19);
                break;
            case R.id.zoomFromRightCorner:
                ((MainActivity) getActivity()).addFragmentWithAnimation(20);
                break;
            case R.id.zoomSlideHorizontal:
                ((MainActivity) getActivity()).addFragmentWithAnimation(21);
                break;
            case R.id.zoomSlideVertical:
                ((MainActivity) getActivity()).addFragmentWithAnimation(22);
                break;
        }
    }
}
