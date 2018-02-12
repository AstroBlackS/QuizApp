package frank.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Global variable to keep track of score
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        //Check Correct answer for Q1 and add score
        RadioButton q1c = (RadioButton) findViewById(R.id.q1c);
        boolean q1cChecked = q1c.isChecked();
        if (q1cChecked) {
            score += 1;
        }

        //Check Correct answer for Q2 and add score
        RadioButton q2a = (RadioButton) findViewById(R.id.q2a);
        boolean q2aChecked = q2a.isChecked();
        if (q2aChecked) {
            score += 1;
        }

        //Check Correct answer for Q3 and add score
        RadioButton q3b = (RadioButton) findViewById(R.id.q3b);
        boolean q3bChecked = q3b.isChecked();
        if (q3bChecked) {
            score += 1;
        }

        //Check Correct answer for Q4 and add score
        RadioButton q4d = (RadioButton) findViewById(R.id.q4d);
        boolean q4dChecked = q4d.isChecked();
        if (q4dChecked) {
            score += 1;
        }

        //Check Correct answer for Q5 and add score
        RadioButton q5a = (RadioButton) findViewById(R.id.q5a);
        boolean q5aChecked = q5a.isChecked();
        if (q5aChecked) {
            score += 1;
        }

        //Check Correct answer for Q6 and add score
        RadioButton q6a = (RadioButton) findViewById(R.id.q6a);
        boolean q6aChecked = q6a.isChecked();
        if (q6aChecked) {
            score += 1;
        }

        //Check Correct answer for Q7 and add score
        RadioButton q7c = (RadioButton) findViewById(R.id.q7c);
        boolean q7cChecked = q7c.isChecked();
        if (q7cChecked) {
            score += 1;
        }

        //Check Correct answer for Q8 and add score
        RadioButton q8d = (RadioButton) findViewById(R.id.q8d);
        boolean q8dChecked = q8d.isChecked();
        if (q8dChecked) {
            score += 1;
        }

        //note score, and display appropriate msg
        if (score <= 4){
            Context fail = getApplicationContext();
            CharSequence failtext = "You scored " + score + " out of 8. Better luck next time.";
            int duration = Toast.LENGTH_LONG;

            Toast failmsg = Toast.makeText(fail, failtext, duration);
            failmsg.show();
        }
        if (score >= 5 && score < 8){
            Context pass = getApplicationContext();
            CharSequence passtext = "You scored " + score + " out of 8. Good job.";
            int duration = Toast.LENGTH_LONG;

            Toast passMsg = Toast.makeText(pass, passtext, duration);
            passMsg.show();
        }
        if (score == 8){
            Context perfect = getApplicationContext();
            CharSequence perfectTxt = "You scored " + score + " out of 8. Flawless Victory!";
            int duration = Toast.LENGTH_LONG;

            Toast perfectMsg = Toast.makeText(perfect, perfectTxt, duration);
            perfectMsg.show();
        }
        //Reset score to 0
        score = 0;
    }

}
