package tk.yunheke.whereismycar.myview;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyInput extends AppCompatEditText{
    private static String TAG = "自定义输入框";
    public MyInput(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    //    重写键盘按下的触发事件
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        super.onKeyDown(keyCode, event);
        Log.i(TAG, "自定义onKeyDown方法被调用");
        return false;
    }
    //    重写弹起键盘的触发事件
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event){
        super.onKeyUp(keyCode, event);
        Log.i(TAG, "onKeyUp方法被调用");
        return true;
    }

    // 组件被触摸了
    @Override
    public boolean onTouchEvent(MotionEvent event){
        super.onTouchEvent(event);
        Log.i(TAG, "onTouchEvent方法被调用");
        return false;
    }
}