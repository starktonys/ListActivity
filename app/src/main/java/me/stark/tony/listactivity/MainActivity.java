package me.stark.tony.listactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

  Functiions[] datas = {
      new Functiions(OtherActivity.class,"其他页面"),
  };

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ArrayAdapter<Functiions> adapter = new ArrayAdapter<Functiions>(this,android.R.layout.simple_list_item_1,datas);
    setListAdapter(adapter);
  }

  @Override protected void onListItemClick(ListView l, View v, int position, long id) {
    Functiions functiions = (Functiions) l.getItemAtPosition(position);
    startActivity(new Intent(MainActivity.this,functiions.clazz));
  }
}
