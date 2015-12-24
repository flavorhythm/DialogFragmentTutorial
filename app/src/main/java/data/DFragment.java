package data;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zenoyuki.flavorhythm.dialogfragmenttutorial.R;

/**
 * Created by ZYuki on 12/23/2015.
 */
public class DFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.d_fragment, container, false);
        getDialog().setTitle("DialogFragment Tutorial");

        return rootView;
    }
}
