package techlearn.com.androidconcepts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnInnerClass;
    private Button btnAppbar;
    private Button btn_crd_lyt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setListener();
    }


    private void initUI(){

        btnInnerClass = (Button) findViewById(R.id.btn_inner);
        btnAppbar = (Button) findViewById(R.id.btn_appbar);
        btn_crd_lyt = (Button) findViewById(R.id.btn_crd_lyt);
    }

    private void setListener(){
        btnInnerClass.setOnClickListener(this);
        btnAppbar.setOnClickListener(this);
        btn_crd_lyt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch(v.getId()){

            case R.id.btn_inner:

                 intent = new Intent(MainActivity.this, InnerClassActivity.class);
                 startActivity(intent);

                break;

            case R.id.btn_appbar:

                intent = new Intent(MainActivity.this, AppbarActivity.class);
                startActivity(intent);

                break;


            case R.id.btn_crd_lyt:

                intent = new Intent(MainActivity.this, CoordinatorActivity.class);
                startActivity(intent);

                break;
        }


    }
}
