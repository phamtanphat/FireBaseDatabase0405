package com.ptp.phamtanphat.firebasedatabase0405;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textview);
        //Chuoi : Nguyen Van A
//        myRef.child("Hoc sinh").child("Lop 10").setValue("20 em");
        //Integer : 20
//         myRef.child("Si so").setValue(30);
//        Nhanvien nhanvien1 = new Nhanvien("Nguyen Van A",25);
//        myRef.child("Nhan vien").push().setValue(nhanvien1);

//        myRef.child("Hocsinh").addValueEventListener(new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//            String value = (String) dataSnapshot.getValue();
//            Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onCancelled(DatabaseError databaseError) {
//            Log.d("BBB",databaseError.getMessage());
//        }
//    });
//        Nhanvien nhanvien = new Nhanvien("Nguyen Van A",20);
//        Nhanvien nhanvien1 = new Nhanvien("Nguyen Van B",25);
//        Nhanvien nhanvien2 = new Nhanvien("Nguyen Van C",30);
//
//        myRef.child("Nhanvien").push().setValue(nhanvien2).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                Log.d("BBB",task.toString());
//            }
//        });

//        myRef.child("Hocsinh").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                txt.setText(dataSnapshot.getValue().toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        Nhanvien
//        { Nhan vat 1 : 20 }
//        myRef.child("Nhanvien1").setValue(new Nhanvien("Nhan vat 1",20));
//        myRef.child("Nhanvien1").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Nhanvien nhanvien = dataSnapshot.getValue(Nhanvien.class);
//                Log.d("BBB",nhanvien.getTen());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        myRef.child("Nhanvien").addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                Nhanvien nhanvien = dataSnapshot.getValue(Nhanvien.class);
//                Log.d("BBB",nhanvien.getTen());
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        myRef.child("Nhanvien").orderByChild("ten").equalTo("Nguyen Van A").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d("BBB",dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
