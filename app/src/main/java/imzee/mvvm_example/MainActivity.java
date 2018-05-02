package imzee.mvvm_example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import imzee.mvvm_example.databinding.ActivityMainBinding;
import models.Student;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Handler handler=new Handler();
    Student model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main );


        model= new Student();
        model.setAge("19 years");
        model.setName("Shahroze Khan");

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                model.setAge("23 years");

            }
        },2000);


        binding.setStudent(model);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }


}
