package projects.android.my.simplefragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SimleAddition extends Fragment {

    TextView displayText;
    View fragmentView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        //Get the view for the fragment using inflator
       fragmentView = inflater.inflate(R.layout.fragment_simle_addition,null);
        return fragmentView;
    }

    public void setText(String text)
    {
        //populate the text to the textview
       displayText = (TextView) fragmentView.findViewById(R.id.displayNum);
       displayText.setText(text);
    }
}
