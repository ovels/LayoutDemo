package wang.layoutdemo.FrameLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class FrameLayoutActivity extends AppCompatActivity {

    String[] layout = new String[]{"FrameLayoutBaseActivity", "FrameLayoutLeastCodeActivity", "FrameLayoutForegroundActivity", "FrameLayoutMarginAndPaddingActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        ListView listView = new ListView(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layout));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(FrameLayoutActivity.this, FrameLayoutBaseActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(FrameLayoutActivity.this, FrameLayoutLeastCodeActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(FrameLayoutActivity.this, FrameLayoutForegroundActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(FrameLayoutActivity.this, FrameLayoutMarginAndPaddingActivity.class);
                        startActivity(intent4);
                        break;
//                    case 4:
//                        Intent intent5 = new Intent(FrameLayoutActivity.this, GridLayoutActivity.class);
//                        startActivity(intent5);
//                        break;
                }
            }
        });
        linearLayout.addView(listView);
        setContentView(linearLayout);
    }
}
