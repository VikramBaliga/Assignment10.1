package projects.android.my.simplefragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SimleAddition sFragment;
    EditText txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the FragmentManager
        FragmentManager fManager = getSupportFragmentManager();
        //Create an object of the Fragment
        sFragment = new SimleAddition();

        //Load the fragment in the main agcity
        fManager.beginTransaction().add(R.id.fragmentHolder,sFragment).commit();
    }

    public void loadtofrag(View view)
    {
        //onclick handler of the button
        //onclick pass the text to the fragment

        txtNumber = (EditText) findViewById(R.id.number);
        sFragment.setText(txtNumber.getText().toString());
    }
}
