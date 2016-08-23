package techlearn.com.androidconcepts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnInnerClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setListener();
    }


    private void initUI(){

        btnInnerClass = (Button) findViewById(R.id.btn_inner);
    }

    private void setListener(){
        btnInnerClass.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch(v.getId()){

            case R.id.btn_inner:

                 intent = new Intent(MainActivity.this, InnerClassActivity.class);
                 startActivity(intent);

                break;
        }


    }
}
