package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mTopButton, mBottomButton;
    int mStoryTNo = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryTNo == 1 || mStoryTNo == 2){
                    mStoryTNo = 3;
                    mStoryText.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                } else {
                    mStoryText.setText(R.string.T6_End);
                    mTopButton.setEnabled(false);
                    mBottomButton.setEnabled(false);
                    mTopButton.setBackgroundColor(0000);
                    mBottomButton.setBackgroundColor(0000);
                    mTopButton.setText("");
                    mBottomButton.setText("");
                }

            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryTNo == 1){
                    mStoryTNo = 2;
                    mStoryText.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                } else if(mStoryTNo == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mTopButton.setEnabled(false);
                    mBottomButton.setEnabled(false);
                    mTopButton.setBackgroundColor(0000);
                    mBottomButton.setBackgroundColor(0000);
                    mTopButton.setText("");
                    mBottomButton.setText("");
                } else {
                    mStoryText.setText(R.string.T5_End);
                    mTopButton.setEnabled(false);
                    mBottomButton.setEnabled(false);
                    mTopButton.setBackgroundColor(0000);
                    mBottomButton.setBackgroundColor(0000);
                    mTopButton.setText("");
                    mBottomButton.setText("");
                }
            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
