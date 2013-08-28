package com.DevonaWard.theInfo;

import com.DevonaWard.project2.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class webView extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.webview_layout);
	    
	    //Loads the URL in to the webview
	    WebView myWebView = (WebView) findViewById(R.id.webview);
  		myWebView.loadUrl("http://espn.go.com/nba/");
	}

}
