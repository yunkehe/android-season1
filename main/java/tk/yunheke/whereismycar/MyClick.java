package tk.yunheke.whereismycar;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MyClick implements OnClickListener {
    private TextView textView;

    public MyClick(TextView txt) {
        textView = txt;
    }

    public void onClick(View v) {
        textView.setText("点击了按钮");
    }

}