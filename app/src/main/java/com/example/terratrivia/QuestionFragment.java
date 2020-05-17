package com.example.terratrivia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuestionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuestionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = "QuestionFragment";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button buttonOption1;
    Button buttonOption2;
    Button buttonOption3;
    Button buttonOption4;
    TextView questionView;
    TextView scoreView;
    ArrayList<Question> listOfQuestions = new ArrayList<Question>(3);
    Question question1;
    Question question2;
    Question question3;
    int playerScore = 0;
    int round = 1;

    public QuestionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuestionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuestionFragment newInstance(String param1, String param2) {
        QuestionFragment fragment = new QuestionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate method");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        //Choose question at random here
        // i.e. getRandomQuestion();
        // or constructor with no parameters, and with class method to choose question from external file
        listOfQuestions.add(new Question("What is the capital of Afghanistan?",
                "Kabul", "Tehran", "Bagdad","Cairo"));

        listOfQuestions.add(new Question("How many US states are there?",
                "50", "51", "52", "53"));

        listOfQuestions.add(new Question("Which is the longest river in the world?",
                "Nile", "Amazon", "Danube", "Yangtze"));

        listOfQuestions.add(new Question("Who is best gf in world?", "Chazza D",
                "Leslie Knope", "Laurelei", "Blake Vanderwall"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView method");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated method");

        questionView = view.findViewById(R.id.tv_question);
        questionView.setText(listOfQuestions.get(round-1).getQuestion());
        scoreView = view.findViewById(R.id.tv_score);
        scoreView.setText(String.valueOf(playerScore));

        buttonOption1 = view.findViewById(R.id.btn_option1);
        buttonOption2 = view.findViewById(R.id.btn_option2);
        buttonOption3 = view.findViewById(R.id.btn_option3);
        buttonOption4 = view.findViewById(R.id.btn_option4);


        buttonOption1.setText(listOfQuestions.get(round-1).getOption1());
        buttonOption2.setText(listOfQuestions.get(round-1).getOption2());
        buttonOption3.setText(listOfQuestions.get(round-1).getOption3());
        buttonOption4.setText(listOfQuestions.get(round-1).getAnswer());
        Log.d(TAG, "answer should be: " + listOfQuestions.get(round-1).getAnswer());
        Log.d(TAG, "round is: " + String.valueOf(round));

        buttonOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOption1.setBackgroundColor(buttonOption1.getContext().getResources().getColor(R.color.colorTertiaryAccent));
                //compare text from button to Question answer string
                String selectedOption = buttonOption1.getText().toString();
                //compare to this...
                String answer = listOfQuestions.get(round-1).getAnswer();
                Log.d(TAG, "selected option is: " + selectedOption);
                Log.d(TAG, "actual answer is: " + answer);
                if (selectedOption.equals(answer)) {
                    playerScore+=10;
                    round++;
                    scoreView.setText(String.valueOf(playerScore));
                    nextQuestion();
                }
                else {
                    Log.d(TAG, "wrong answer");
                    nextQuestion();
                }
            }
        });
        buttonOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOption2.setBackgroundColor(buttonOption2.getContext().getResources().getColor(R.color.colorTertiaryAccent));
                //compare text from button to Question answer string
                String selectedOption = buttonOption2.getText().toString();
                //compare to this...
                String answer = listOfQuestions.get(round-1).getAnswer();
                Log.d(TAG, "selected option is: " + selectedOption);
                Log.d(TAG, "actual answer is: " + answer);
                if (selectedOption.equals(answer)) {
                    playerScore+=10;
                    round++;
                    scoreView.setText(String.valueOf(playerScore));
                    nextQuestion();
                }
                else {
                    Log.d(TAG, "wrong answer");
                    nextQuestion();
                }
            }
        });
        buttonOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOption3.setBackgroundColor(buttonOption3.getContext().getResources().getColor(R.color.colorTertiaryAccent));
                //compare text from button to Question answer string
                String selectedOption = buttonOption3.getText().toString();
                //compare to this...
                String answer = listOfQuestions.get(round-1).getAnswer();
                Log.d(TAG, "selected option is: " + selectedOption);
                Log.d(TAG, "actual answer is: " + answer);
                if (selectedOption.equals(answer)) {
                    playerScore+=10;
                    round++;
                    scoreView.setText(String.valueOf(playerScore));
                    nextQuestion();
                }
                else {
                    Log.d(TAG, "wrong answer");
                    nextQuestion();
                }
            }
        });
        buttonOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOption4.setBackgroundColor(buttonOption4.getContext().getResources().getColor(R.color.colorTertiaryAccent));
                //compare text from button to Question answer string
                String selectedOption = buttonOption4.getText().toString();
                //compare to this...
                String answer = listOfQuestions.get(round-1).getAnswer();
                Log.d(TAG, "selected option is: " + selectedOption);
                Log.d(TAG, "actual answer is: " + answer);
                if (selectedOption.equals(answer)) {
                    Log.d(TAG, "answer accepted");
                    playerScore+=10;
                    round++;
                    scoreView.setText(String.valueOf(playerScore));
                    Log.d(TAG, "about to launch next question");
                    nextQuestion();
                }
                else {
                    Log.d(TAG, "answer was not accepted");
                    nextQuestion();
                }
            }
        });
    }

    public void nextQuestion() {
        Log.d(TAG, "next question");
        //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment, new QuestionFragment());
        getActivity().getSupportFragmentManager().beginTransaction().detach(this).attach(this).commit();
    }

    public void finish() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
