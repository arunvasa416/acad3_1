package com.example.hello.acad3_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main", "initial load");
         btn=(Button)findViewById(R.id.Serchbtn);
         et=(EditText)findViewById(R.id.searchtxt);

    }



    public void openSeach(View v)
    {
        Uri uri = Uri.parse("http://www.google.com/#q="+et.getText().toString());
        Log.d("Main", et.getText().toString());
        Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(webIntent);

    }
}
