package com.koterwong.androidhero.chapter_10;

import android.webkit.WebView;

import com.koterwong.androidhero.BaseFragment;
import com.koterwong.androidhero.R;

import butterknife.Bind;

/**
 * ================================================
 * Created By：Koterwong; Time: 2016/06/02 17:12
 * <p>
 * Description:
 * =================================================
 */
public class Chapter_10Fragment extends BaseFragment{

    private static final String URL = "file:///android_asset/chapter10.html";

    @Bind(R.id.webview)
    WebView webView ;

    @Override protected int getLayoutID() {
        return R.layout.fragment_chapter_11;
    }

    @Override protected void initData() {
        webView.loadUrl(URL);
    }
}
