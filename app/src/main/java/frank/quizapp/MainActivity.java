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

    //Resets ALL radio buttons (probably a better way to do this, but I don't know how yet)
    private void resetChecked(){
        //Q1 buttons --------------------------------------------------
        RadioButton q1a = (RadioButton) findViewById(R.id.q1a);
        q1a.setChecked(false);
        RadioButton q1b = (RadioButton) findViewById(R.id.q1b);
        q1b.setChecked(false);
        RadioButton q1c = (RadioButton) findViewById(R.id.q1c);
        q1c.setChecked(false);
        RadioButton q1d = (RadioButton) findViewById(R.id.q1d);
        q1d.setChecked(false);

        //Q2 buttons --------------------------------------------------
        RadioButton q2a = (RadioButton) findViewById(R.id.q2a);
        q2a.setChecked(false);
        RadioButton q2b = (RadioButton) findViewById(R.id.q2b);
        q2b.setChecked(false);
        RadioButton q2c = (RadioButton) findViewById(R.id.q2c);
        q2c.setChecked(false);
        RadioButton q2d = (RadioButton) findViewById(R.id.q2d);
        q2d.setChecked(false);

        //Q3 buttons --------------------------------------------------
        RadioButton q3a = (RadioButton) findViewById(R.id.q3a);
        q3a.setChecked(false);
        RadioButton q3b = (RadioButton) findViewById(R.id.q3b);
        q3b.setChecked(false);
        RadioButton q3c = (RadioButton) findViewById(R.id.q3c);
        q3c.setChecked(false);
        RadioButton q3d = (RadioButton) findViewById(R.id.q3d);
        q3d.setChecked(false);

        //Q4 buttons --------------------------------------------------
        RadioButton q4a = (RadioButton) findViewById(R.id.q4a);
        q4a.setChecked(false);
        RadioButton q4b = (RadioButton) findViewById(R.id.q4b);
        q4b.setChecked(false);
        RadioButton q4c = (RadioButton) findViewById(R.id.q4c);
        q4c.setChecked(false);
        RadioButton q4d = (RadioButton) findViewById(R.id.q4d);
        q4d.setChecked(false);

        //Q5 buttons --------------------------------------------------
        RadioButton q5a = (RadioButton) findViewById(R.id.q5a);
        q5a.setChecked(false);
        RadioButton q5b = (RadioButton) findViewById(R.id.q5b);
        q5b.setChecked(false);
        RadioButton q5c = (RadioButton) findViewById(R.id.q5c);
        q5c.setChecked(false);
        RadioButton q5d = (RadioButton) findViewById(R.id.q5d);
        q5d.setChecked(false);

        //Q6 buttons --------------------------------------------------
        RadioButton q6a = (RadioButton) findViewById(R.id.q6a);
        q6a.setChecked(false);
        RadioButton q6b = (RadioButton) findViewById(R.id.q6b);
        q6b.setChecked(false);
        RadioButton q6c = (RadioButton) findViewById(R.id.q6c);
        q6c.setChecked(false);
        RadioButton q6d = (RadioButton) findViewById(R.id.q6d);
        q6d.setChecked(false);

        //Q7 buttons --------------------------------------------------
        RadioButton q7a = (RadioButton) findViewById(R.id.q7a);
        q7a.setChecked(false);
        RadioButton q7b = (RadioButton) findViewById(R.id.q7b);
        q7b.setChecked(false);
        RadioButton q7c = (RadioButton) findViewById(R.id.q7c);
        q7c.setChecked(false);
        RadioButton q7d = (RadioButton) findViewById(R.id.q7d);
        q7d.setChecked(false);

        //Q8 buttons --------------------------------------------------
        RadioButton q8a = (RadioButton) findViewById(R.id.q8a);
        q8a.setChecked(false);
        RadioButton q8b = (RadioButton) findViewById(R.id.q8b);
        q8b.setChecked(false);
        RadioButton q8c = (RadioButton) findViewById(R.id.q8c);
        q8c.setChecked(false);
        RadioButton q8d = (RadioButton) findViewById(R.id.q8d);
        q8d.setChecked(false);

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

        //Reset ALL radio buttons
        resetChecked();

    }

}
