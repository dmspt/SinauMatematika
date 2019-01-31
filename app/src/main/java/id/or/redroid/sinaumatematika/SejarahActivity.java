package id.or.redroid.sinaumatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SejarahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        WebView view = (WebView) findViewById(R.id.webviewsejarah);
        view.setVerticalScrollBarEnabled(false);
        view.loadData(getString(R.string.sejarah), "text/html; charset=utf-8", "utf-8");
    }
}
