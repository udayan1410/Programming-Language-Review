package com.codecenter1430gmail.programminglanguagereview;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Specialise extends AppCompatActivity {
    String name;
    int[] Images;
    String[] Name;
    int id;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_specialise);

        CustomAdapter customAdapter = new CustomAdapter();
        list = (ListView) findViewById(R.id.listview1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name = getIntent().getStringExtra("language");


        switch (name) {
            case "C":
                Images = new int[]{R.mipmap.c_library, R.mipmap.c_data, R.mipmap.c_operator, R.mipmap.c_esc, R.mipmap.c_pointer, R.mipmap.c_condition, R.mipmap.c_loop, R.mipmap.c_array, R.mipmap.c_string, R.mipmap.c_function, R.mipmap.c_structure, R.mipmap.c_enum, R.mipmap.c_linkedlist, R.mipmap.c_memory, R.mipmap.c_file};
                Name = new String[]{"Libraries", "Data Types", "Operators", "Escape Sequences", "Pointers", "Conditional Statements", "Loops", "Arrays", "Strings", "Functions", "Structure and Union", "Enumeration", "LinkedList", "Dynamic Memory Allocation", "File Handling"};
                id=0;
                getSupportActionBar().setTitle("C Programming Language");
                break;

            case "C++":
                Images = new int[]{R.mipmap.c_library, R.mipmap.c_data, R.mipmap.c_operator, R.mipmap.c_esc, R.mipmap.c_pointer, R.mipmap.c_condition, R.mipmap.c_loop, R.mipmap.c_array, R.mipmap.c_string,R.mipmap.cpp_class, R.mipmap.c_function,R.mipmap.j_construct,R.mipmap.cpp_inheritance,R.mipmap.cpp_template,R.mipmap.cpp_overloading,R.mipmap.cpp_exception ,R.mipmap.cpp_stl, R.mipmap.c_linkedlist, R.mipmap.c_memory, R.mipmap.c_file};
                Name = new String[]{"Libraries", "Data Types", "Operators", "Escape Sequences", "Pointers", "Conditional Statements", "Loops", "Arrays", "Strings","Class","Functions","Constructor","Inheritance & Polymorphism","Templates","Overloading","Exception Handling","STL","Linked List","Dynamic Memory Allocation","File Handling"};
                id=1;
                getSupportActionBar().setTitle("C++ Programming Language");
                break;

            case "Java":
                Images = new int[]{ R.mipmap.cpp_class, R.mipmap.j_construct, R.mipmap.c_data, R.mipmap.c_operator, R.mipmap.c_loop, R.mipmap.c_condition ,R.mipmap.j_input, R.mipmap.c_string, R.mipmap.c_array,R.mipmap.c_function, R.mipmap.c_file,R.mipmap.cpp_exception,R.mipmap.cpp_inheritance,R.mipmap.j_poly,R.mipmap.j_interface ,R.mipmap.j_package, R.mipmap.c_data, R.mipmap.j_jdbc};
                Name = new String[]{"Class and Objects", "Constructor", "Datatypes", "Basic Operators", "Loops", "Conditional Statements", "Input Accepting", "Strings","Arrays","Java Methods","File Handling","Exceptions","Inheritance","Polymorphism","Interface","Packages","Data Structures","JDBC"};
                id=2;
                getSupportActionBar().setTitle("Java Programming Language");
                break;
        }

        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Information.class);
                intent.putExtra("type", Name[i]);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });



    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
        return Images.length;
        }

        @Override
        public Object getItem(int i) {
        return null;
        }

        @Override
        public long getItemId(int i) {
        return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.genericlayout,null);
            ImageView img = (ImageView)view.findViewById(R.id.listviewimg);
            TextView txt = (TextView)view.findViewById(R.id.listviewtext);
            Picasso.with(getApplicationContext()).load(Images[i]).into(img);
            txt.setText(Name[i]);
            return view;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}