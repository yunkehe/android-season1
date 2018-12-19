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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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
//    private Button btn1;
//    private Button btn2;
    private Context Mcontext;
    private TextView textView;

    private Button btnOne;
    private EditText myInput;

    private ImageView imgBg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity --> onCreate");

//        btnOne = (Button) findViewById(R.id.btn1);
//        myInput = (EditText) findViewById(R.id.myInput);
//        第二种方法
//        textView = (TextView) findViewById(R.id.textViewShowData);
//        btnOne.setOnClickListener(this);

//        myInput.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN){
//                    Log.i(TAG, "监听器的onKeyDown方法被调用");
//                }
//                return false;
//            }
//        });
//
//        imgBg = (ImageView) findViewById(R.id.imgBg);
//        imgBg.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Toast.makeText(getApplicationContext(), "通过监听器触摸图片", Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });



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

// 从上面的运行结果,我们就可以知道,传播的顺序是:
// 监听器--->view组件的回调方法--->Activity的回调方法了;
    public boolean onKeyDown(int keyCode, KeyEvent event){
        super.onKeyDown(keyCode, event);
        Log.i(TAG, "Activity的onkeydown方法被调用");
        return false;
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

