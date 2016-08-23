package techlearn.com.androidconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class InnerClassActivity extends AppCompatActivity {

    private Button btn_ok;
    private Button btn_second_use;
    private Button btn_reset;
    private TextView txt;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);

        //creating object of inner class
        ButtonClicked innerClass=new ButtonClicked();


        btn_ok = (Button) findViewById(R.id.btn_ok);
        btn_second_use= (Button) findViewById(R.id.btn_second_use);
        btn_reset = (Button) findViewById(R.id.btn_reset);
        txt = (TextView) findViewById(R.id.txt);


        //using instance of inner class for button OK
        btn_ok.setOnClickListener(innerClass);

        //same inner class can be used at many places e.g.
        //using instance of inner class for button "Second use"
        btn_second_use.setOnClickListener(innerClass);

        //using Annonymous inner class for button reset, annonymos class can be used
        //at single place only because no reference for this, directky passing into method
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                txt.setText(""+count);
            }
        });
    }

    //case 1: we can create inner class for click listener and pass to setLitsener()
    //ButtonClicked is an inner class that implements an interface .
    private class ButtonClicked implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            if (v.getId()==R.id.btn_ok) {
                txt.setText("" + count++);

            }else if(v.getId()==R.id.btn_second_use){

                Toast.makeText(v.getContext(), "same inner class at other place !!", Toast.LENGTH_LONG).show();
            }
        }
    }


}
