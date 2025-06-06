package com.example.a3055_3;


import android.os.Bundle;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_main);
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           return insets;
       });
   }


   @Override
   protected void onStart() {
       super.onStart();
       Toast.makeText(this,"in start method",Toast.LENGTH_LONG).show();
   }


   @Override
   protected void onResume() {
       super.onResume();
       Toast.makeText(this,"in Resume method",Toast.LENGTH_LONG).show();
   }


   @Override
   protected void onStop() {
       super.onStop();
       Toast.makeText(this,"in stop method",Toast.LENGTH_LONG).show();
   }


   @Override
   protected void onPause() {
       super.onPause();
       Toast.makeText(this,"in pause method",Toast.LENGTH_LONG).show();
   }
