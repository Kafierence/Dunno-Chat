package ChatApp.android.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ChatApp.android.databinding.ActivityPostTimeLineBinding;

public class PostTimeLine extends AppCompatActivity {
    private ActivityPostTimeLineBinding binding;

    /**
     * create post and upload screen
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPostTimeLineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}