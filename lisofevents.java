package com.Hemant.fashionsahayak;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class lisofevents extends AppCompatActivity {
    ListView listV;
    ImageView imageview;
    String text;
    String name[]={"Lohri","Pongal","Basant Panchmi","Holi","Eid","Raksha Bandhan","Ganesh Chaturthi","Harela","Durga Puja","Diwali"};
    int name_image[]={R.drawable.lohri,R.drawable.pongal,R.drawable.basantpanchmi,R.drawable.holi,R.drawable.eid,R.drawable.rakshabandhan,R.drawable.ganesshchaturthi,R.drawable.harela,R.drawable.durgapuja,R.drawable.diwali};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisofevents);
        listV=(ListView) findViewById(R.id.list);
        CustomAdapter customAdapter= new CustomAdapter(getApplicationContext(),name,name_image);
        listV.setAdapter(customAdapter);
        listV.setOnItemClickListener(new  AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text=name[position].toString();
                Toast.makeText(lisofevents.this,text+ " is selected" , Toast.LENGTH_SHORT).show();
                switch (text) {
                    case "Lohri":
                        Intent intent=new Intent(getApplicationContext(),lohriFest.class);
                        startActivity(intent);
                        break;
                    case "Pongal":
                        Intent intent1=new Intent(getApplicationContext(),pongalFest.class);
                        startActivity(intent1);
                        break;
                    case "Holi":
                        Intent intent2=new Intent(getApplicationContext(),HoliFest.class);
                        startActivity(intent2);
                        break;

                    case "Diwali":
                        Intent intent3=new Intent(getApplicationContext(),diwaliFest.class);
                        startActivity(intent3);
                        break;
                    case "Eid":
                        Intent intent4=new Intent(getApplicationContext(),EidF.class);
                        startActivity(intent4);
                        break;
                    case "Basant Panchmi":
                        Intent intent5=new Intent(getApplicationContext(),BPFest.class);
                        startActivity(intent5);
                        break;
                    case "Raksha Bandhan":
                        Intent intent6=new Intent(getApplicationContext(),RBFest.class);
                        startActivity(intent6);
                        break;
                    case "Ganesh Chaturthi":
                        Intent intent7=new Intent(getApplicationContext(),GCFest.class);
                        startActivity(intent7);
                        break;
                    case "Harela":
                        Intent intent8=new Intent(getApplicationContext(),HarelaFest.class);
                        startActivity(intent8);
                        break;
                    case "Durga Puja" :
                        Intent intent9=new Intent(getApplicationContext(),DPFest.class);
                        startActivity(intent9);
                        break;


                }

            }
        });
    }

    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(lisofevents.this);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent a = new Intent(Intent.ACTION_MAIN);
                        a.addCategory(Intent.CATEGORY_HOME);
                        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(a);
                    }
                })
                .setNegativeButton("No",null);
        AlertDialog alert=builder.create();
        alert.show();
    }
}