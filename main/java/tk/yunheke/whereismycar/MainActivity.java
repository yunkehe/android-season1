package tk.yunheke.whereismycar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationProvider;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener {
    private RadioGroup rg;
    final String TAG = "TAG";
    private Button btn1;
    private Button btn2;
    private Context Mcontext;
    private TextView textView;

    private Button btnOne;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity --> onCreate");

        btnOne = (Button) findViewById(R.id.btn1);
//        第二种方法
        textView = (TextView) findViewById(R.id.textViewShowData);
//        btnOne.setOnClickListener(this);

    }

//    重新接口中的抽象方法
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
    }

//    自定义一个方法
    public void myClick(View source){
        Toast.makeText(getApplicationContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
    }

}
//public class MainActivity extends AppCompatActivity {
//    private RadioGroup rg;
//    final String TAG = "TAG";
//    private Button btn1;
//    private Button btn2;
//    private Context Mcontext;
//    private TextView textView;
//
//    private Button btnOne;
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.i(TAG, "MainActivity --> onCreate");
//
//        btnOne = (Button) findViewById(R.id.btn1);
////        第二种方法
//        textView = (TextView) findViewById(R.id.textViewShowData);
//        btnOne.setOnClickListener(new MyClick(textView));
//
////        第一种方法
////        btnOne.setOnClickListener(new OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Toast.makeText(getApplicationContext(), "你点击了按钮", Toast.LENGTH_SHORT).show();
////            }
////        });
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(TAG, "MainActivity --> onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i(TAG, "MainActivity --> onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(TAG, "MainActivity --> onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(TAG, "MainActivity --> onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i(TAG, "MainActivity --> onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(TAG, "MainActivity --> onRestart");
//    }
//}

