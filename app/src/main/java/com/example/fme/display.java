package com.example.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.fme.R.id;

public class display extends Activity {
    WebView wb;

    String department,semester,subject,type,url;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Bundle i=getIntent().getExtras();
        department=i.getString("department");
        subject=i.getString("subject");
        semester=i.getString("semester");
        type=i.getString("type");
        wb=(WebView) findViewById(R.id.wv);
        switch (i.getString("department")) {
            case "computer science and engineering":
                switch (i.getString("semester")) {
                    case "semester 1":
                        switch (i.getString("subject")) {
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://www.google.com";
                                        break;
                                    case "Course Content":
                                        url = "https://www.youtube.com/watch?v=b1_5YO11rmM&list=RDGMEM916WJxafRUGgOvd6dVJkeQ&index=27";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;
                                }
                                break;
                            case "applied physics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;
                                }
                                break;
                            case "basic electrical engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "engineering graphics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "physics lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="";
                                break;
                        }
                        break;
                    case "semester 2":
                        break;
                }
                break;
            case "cse(ai)":
                switch (i.getString("semester")){
                    case "semester 1":
                        switch (i.getString("subject")) {
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "applied chemistry":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "english for engineers":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "discrete mathematical structure":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "english lab":
                                url="";
                                break;
                            case "chemistry lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;



                        }
                    case "semester 2":
                        break;
                }
                break;
            case "cse(ds)":
                switch (i.getString("semester")){
                 case "semester 1":
                    switch(i.getString("subject")){
                        case "calculus and numerical techniques":
                            switch (i.getString("type")){
                                case "Syllabus":
                                    url = "";
                                    break;
                                case "Course Content":
                                    url="";
                                    break;
                                case "Power Point":
                                    url="";
                                    break;
                                case "Videos":
                                    url="";
                                    break;
                                case "Question Bank":
                                    url="";
                                    break;
                                case "Previous Question":
                                    url="";
                                    break;
                                case "E-Books":
                                    url="";
                                    break;


                            }
                            break;
                        case "applied physics":
                            switch (i.getString("type")){
                                case "Syllabus":
                                    url = "";
                                    break;
                                case "Course Content":
                                    url="";
                                    break;
                                case "Power Point":
                                    url="";
                                    break;
                                case "Videos":
                                    url="";
                                    break;
                                case "Question Bank":
                                    url="";
                                    break;
                                case "Previous Question":
                                    url="";
                                    break;
                                case "E-Books":
                                    url="";
                                    break;


                            }
                            break;
                        case "introduction to data science":
                            switch (i.getString("type")){
                                case "Syllabus":
                                    url = "";
                                    break;
                                case "Course Content":
                                    url="";
                                    break;
                                case "Power Point":
                                    url="";
                                    break;
                                case "Videos":
                                    url="";
                                    break;
                                case "Question Bank":
                                    url="";
                                    break;
                                case "Previous Question":
                                    url="";
                                    break;
                                case "E-Books":
                                    url="";
                                    break;


                            }
                            break;
                        case "engineering graphics":
                            switch (i.getString("type")){
                                case "Syllabus":
                                    url = "";
                                    break;
                                case "Course Content":
                                    url="";
                                    break;
                                case "Power Point":
                                    url="";
                                    break;
                                case "Videos":
                                    url="";
                                    break;
                                case "Question Bank":
                                    url="";
                                    break;
                                case "Previous Question":
                                    url="";
                                    break;
                                case "E-Books":
                                    url="";
                                    break;


                            }
                            break;
                        case "problem solving and c programming":
                            switch (i.getString("type")){
                                case "Syllabus":
                                    url = "";
                                    break;
                                case "Course Content":
                                    url="";
                                    break;
                                case "Power Point":
                                    url="";
                                    break;
                                case "Videos":
                                    url="";
                                    break;
                                case "Question Bank":
                                    url="";
                                    break;
                                case "Previous Question":
                                    url="";
                                    break;
                                case "E-Books":
                                    url="";
                                    break;


                            }
                            break;
                        case "c programming lab":
                            url="";
                            break;
                        case "physics lab":
                            url="";
                            break;
                        case "engineering workshop":
                            url="";
                            break;

                    }
                    break;
                    case "semester 2":
                        break;
            }
                break;
            case "eletronics and communication engineering":
                switch (i.getString("semester")){
                    case "semester 1":
                        switch(i.getString("subject")){
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "applied chemistry":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "english for engineers":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "basic mechanical engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "basic civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "physics lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="";
                                break;










                        }
                        break;
                    case "semester 2":
                        break;
                }
                break;
            case "electrical and eletronic engineering":
                switch(i.getString("semester")){
                    case "semester 1":
                        switch(i.getString("subject")){
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "applied chemistry":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "english for engineers":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "basic mechanical engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "basic civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "chemistry lab":
                                url="";
                                break;
                            case "english lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;






                        }
                        break;
                    case "semester 2":
                        break;
                }
                break;
            case "civil engineering":
                switch(i.getString("semester")){
                    case "semester 1":
                        switch(i.getString("subject")){
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "engineering physics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "introduction to civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "engineering graphics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "physics lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="";
                                break;



                        }
                        break;
                    case "semester 2":
                        break;
                }
                break;
            case "mechanical engineering":
                switch(i.getString("semester")){
                    case "semester 1":
                        switch(i.getString("subject")){
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "engineering physics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "Basic electrical and electronic engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "problem solving and c programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "engineering graphics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "introduction to civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "";
                                        break;
                                    case "Course Content":
                                        url="";
                                        break;
                                    case "Power Point":
                                        url="";
                                        break;
                                    case "Videos":
                                        url="";
                                        break;
                                    case "Question Bank":
                                        url="";
                                        break;
                                    case "Previous Question":
                                        url="";
                                        break;
                                    case "E-Books":
                                        url="";
                                        break;


                                }
                                break;
                            case "physics lab":
                                url="";
                                break;
                            case "c programming lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="";
                                break;






                        }
                        break;
                    case "semester 2":
                        break;
                }
                break;

        }
        Toast.makeText(this,i.getString("semester"), Toast.LENGTH_SHORT).show();
        wb.loadUrl(url);
        wb.getSettings().setJavaScriptEnabled(true);
    }
}
