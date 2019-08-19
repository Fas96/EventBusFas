package com.fas.eventbus;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.fas.eventbus.events.EventSendData;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventReceiverActivity extends AppCompatActivity {

    TextView dataReceived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_receiver);


        dataReceived=findViewById(R.id.data);

        startActivity(new Intent(EventReceiverActivity.this, MainActivity.class));

    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(EventSendData event) {
        dataReceived.setText(event.getName()+" "+event.getID()+" "+event.getAge());

        System.out.println("Josiah "+event.getName()+" "+event.getID()+" "+event.getAge());
    }
}
