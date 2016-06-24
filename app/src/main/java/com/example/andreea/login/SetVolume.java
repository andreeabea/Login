package com.example.andreea.login;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.Toast;

/**
 * Created by Victor on 12.06.2016.
 */
public class SetVolume extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener
{
        SeekBar sb;
        AudioManager am;
        int Volume=0;

protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_settings);

        sb  =(SeekBar) findViewById(R.id.sbVolume);
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        int maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);

        sb.setMax(maxVolume);
        sb.setProgress(curVolume);

        sb.setOnSeekBarChangeListener(this);
        }

protected void onPause(){
        super.onPause();

}

    protected void onResume(){
        super.onResume();


    }
    public void onProgressChanged(SeekBar seekb, int progress, boolean arg2) {
        am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
        Volume = progress;
    }

    public void onStartTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub

    }

    public void onStopTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(), "Volume: " + Integer.toString(Volume), Toast.LENGTH_SHORT).show();
    }
}