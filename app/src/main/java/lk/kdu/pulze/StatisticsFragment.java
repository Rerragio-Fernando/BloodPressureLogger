package lk.kdu.pulze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class StatisticsFragment extends Fragment {
    ExtendedFloatingActionButton extendedFloatingActionButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_statistics, container, false);
        extendedFloatingActionButton = requireActivity().findViewById(R.id.extended_fab);
        extendedFloatingActionButton.hide();
        return v;
    }
}
