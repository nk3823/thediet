package co.nikhil.thediet;

//import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    public Button patient,home,old,demand;
//    public void init() {
//        patient= findViewById(R.id.patients);
//        home= findViewById(R.id.home);
//        old= findViewById(R.id.old);
//        demand= findViewById(R.id.demand);
//
//        patient.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent i = new Intent(MainActivity.this, patients.class);
//                startActivity(i);
//            }
//            });
//
//         demand.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v){
//                    Intent j = new Intent(MainActivity.this, demand.class);
//                    startActivity(j);
//                }
//            });
//                 old.setOnClickListener(new View.OnClickListener() {
//                     @Override
//                     public void onClick(View v) {
//                         Intent k = new Intent(MainActivity.this, old.class);
//                         startActivity(k);
//                     }
//                 });
//                 home.setOnClickListener(new View.OnClickListener() {
//                     @Override
//                     public void onClick(View v) {
//                         Intent l = new Intent(MainActivity.this, family.class);
//                         startActivity(l);
//                     }
//                 });
//
//
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // init();
    }
}
