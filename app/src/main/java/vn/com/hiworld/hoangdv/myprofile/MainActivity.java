package vn.com.hiworld.hoangdv.myprofile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import vn.com.hiworld.hoangdv.myprofile.adapters.ExpandListAdapter;
import vn.com.hiworld.hoangdv.myprofile.models.Child;
import vn.com.hiworld.hoangdv.myprofile.models.Group;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandList = (ExpandableListView) findViewById(R.id.expandableListView_info);
        ArrayList<Group> expListItems = SetStandardGroups();
        ExpandListAdapter expAdapter = new ExpandListAdapter(MainActivity.this, expListItems);
        expandList.setAdapter(expAdapter);

    }

    public ArrayList<Group> SetStandardGroups() {
        ArrayList<Group> list = new ArrayList<>();
        Group group = new Group();
        group.setName("Thông tin cá nhân");
        ArrayList<Child> childrens = new ArrayList<>();
        childrens.add(new Child("hoang.dv", R.drawable.ic_skype));
        childrens.add(new Child("01676 322 963", R.drawable.ic_phone));
        childrens.add(new Child("hoang.dv@outlook.com", R.drawable.ic_mail));
        group.setItems(childrens);
        list.add(group);

        group = new Group();
        group.setName("Thông tin cơ quan công tác");
        ArrayList<Child> childrens2 = new ArrayList<>();
        childrens2.add(new Child("http://hiworld.com.vn", R.drawable.ic_internet));
        childrens2.add(new Child("01676 322 963", R.drawable.ic_phone));
        childrens2.add(new Child("hoang.dv@outlook.com", R.drawable.ic_mail));
        group.setItems(childrens2);
        list.add(group);

        group = new Group();
        group.setName("Liên hệ khẩn cấp");
        ArrayList<Child> childrens3 = new ArrayList<>();
        childrens3.add(new Child("Hoàng Rapper", R.drawable.ic_wifi));
        group.setItems(childrens3);
        list.add(group);

        return list;
    }
}