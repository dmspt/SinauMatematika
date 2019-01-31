package id.or.redroid.sinaumatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class IstilahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istilah);

        WebView view = (WebView) findViewById(R.id.webviewistilah);
        view.setVerticalScrollBarEnabled(false);
        view.loadData(getString(R.string.istilah), "text/html; charset=utf-8", "utf-8");
    }
}
