package com.example.s07150727.mycontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ContactsMessageActivity extends AppCompatActivity {

    private TextView nameEditText;
    private TextView mobileEditText;
    private TextView qqEditText;
    private TextView danweiEditText;
    private TextView addressEditText;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_message);
        nameEditText = (TextView)findViewById(R.id.name);
        mobileEditText = (TextView)findViewById(R.id.mobile);
        danweiEditText = (TextView)findViewById(R.id.danwei);
        qqEditText = (TextView)findViewById(R.id.qq);
        addressEditText = (TextView)findViewById(R.id.address);

        Bundle localBundle = getIntent().getExtras();
        int id = localBundle.getInt("user_ID");
        ContactsTable ct = new ContactsTable(this);
        user = ct.getUserByID(id);
        nameEditText.setText("姓名:"+user.getName());
    }
}
