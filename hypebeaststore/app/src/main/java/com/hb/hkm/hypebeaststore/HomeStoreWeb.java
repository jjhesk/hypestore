package com.hb.hkm.hypebeaststore;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;

import com.hb.hkm.hypebeaststore.life.Config;

/**
 * Created by hesk on 2/25/15.
 */
public class HomeStoreWeb extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.fragment_store_demo_webview);
        final WebView webview = (WebView) findViewById(R.id.store_webview);
        // webview.reload();
        webview.setWebViewClient(new com.hb.hkm.hypebeaststore.widgets.webviewclients.HomePageClient(webview));
        webview.loadUrl(Config.wv.domain_start);
        /*final HomepageBridge bridge = new HomepageBridge(webview);
        webview.postDelayed(new Runnable() {
            @Override
            public void run() {
                bridge.getNavigator(new Callback<Navigator>() {
                    @Override
                    public void onResult(Navigator result) {
                        Toast.makeText(MainActivity.this, result.platform, Toast.LENGTH_SHORT).show();
                    }
                });
                bridge.getWindowWidth(new Callback<Float>() {
                    @Override
                    public void onResult(Float result) {
                        Toast.makeText(MainActivity.this, "window width = " + result, Toast.LENGTH_SHORT).show();
                    }
                });
                bridge.alert("tjena");
            }
        }, 1000);*/

    }

}
