package com.example.projetofinal.politicando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

     boolean x = false;
      
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        
         if (!x) {
            super.onBackPresse();
        }
          else {
         showPoliticando();
          }
        
    }

    public void constituicao(View view) {
        setContentView(R.layout.topic_layout);
        setTitle("Constituição Federal");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/constituicao.html");
    }

    public void dirpolitico(View view) {
        setContentView(R.layout.topic_layout);
        setTitle("Direitos Políticos");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/dirpolitico.html");
    }

    public void serpoderes(View view) {
        setContentView(R.layout.topic_layout);
        setTitle("Separação dos Poderes");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/serpoderes.html");
    }

    public void improadm(View view) {
        setContentView(R.layout.topic_layout);
        setTitle("Improbidade Administrativa");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/improadm.html");
    }

    public void impeachment(View view) {
        setContentView(R.layout.topic_layout);
        setTitle("Impeachment");
        WebView content = (WebView) findViewById(R.id.content);
        content.loadUrl("file:///android_asset/impeachment.html");
    }

    public void showPoliticando() {
        setTitle("Politicando");
        setContentView(R.layout.activity_main);

    }

}


