package com.audisankara.fme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.fme.R;


public class display extends Activity {
    WebView wb;

    String department,semester,subject,type,url;
    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Bundle i=getIntent().getExtras();
        department=i.getString("department");
        subject=i.getString("subject");
        semester=i.getString("semester");
        type=i.getString("type");
        //Toast.makeText(this, department+semester+subject+type, Toast.LENGTH_LONG).show();
        wb=(WebView) findViewById(R.id.wv);
        switch (i.getString("department")) {
            case "computer science and engineering":
                switch (i.getString("semester")) {
                    case "semester 1":
                        switch (i.getString("subject")) {
                            case "calculus and numerical techniques":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1c0IzfMHhqmk41AO0jYgFfQ5Ol8BZej0C/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1m8ou84n0UqgC53-Uuo1wIEF8WFKyQs54/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1Rw2Xoczvh2zSr6h2_ranR5kctIvzKQue/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1BI6xSEqbTun0cZHTbwFSeWQJNbGGBrDI/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1e3Qg_6GpUMu8LeF6a36VmJlJUuJ7gTW7/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                                //url="https://drive.google.com/file/d/1u-o4MbsTHNQ5-QJUuqNABeNI5f5hL_gK/view?usp=share_link";
                                break;
                            case "c programming lab":
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                            case "engineering workshop":
                                url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                                break;
                        }
                        break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Integral transforms and Matrix theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "";
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
                                        url = "https://drive.google.com/file/d/1VdH4ccaI0k3gX89mrYa5hT3QdUZog88e/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Basic mechanical and civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1LacqU4-iQeikZ_RGZUlkIcklR9SivONs/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1Ox-AUtcz8rcPJMMh3RGiDEx4_DAMblcL/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;
                            case "Data structures Lab":
                                url="";
                                break;
                        }

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
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1VdH4ccaI0k3gX89mrYa5hT3QdUZog88e/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1bwEuao_3iTwb4JePeMn6kth7MnD7WG9b/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;
                            case "chemistry lab":
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "c programming lab":
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                        }
                    case "semester 2":
                        switch (i.getString("subject")) {
                            case "Linear algebra and regression analysis":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1c0IzfMHhqmk41AO0jYgFfQ5Ol8BZej0C/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1m8ou84n0UqgC53-Uuo1wIEF8WFKyQs54/view?usp=share_link";
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
                            case "Python programming":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1t8uKYL3Cvrrpuh708nsFsHqaeYuuszwy/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                            case "Data structures Lab":
                                url="";
                                break;
                            case "Python programming Lab":
                                url="";
                                break;
                        }
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
                                    url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                    break;
                                case "Course Content":
                                    url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                    url = "https://drive.google.com/file/d/1c0IzfMHhqmk41AO0jYgFfQ5Ol8BZej0C/view?usp=share_link";
                                    break;
                                case "Course Content":
                                    url="https://drive.google.com/file/d/1m8ou84n0UqgC53-Uuo1wIEF8WFKyQs54/view?usp=share_link";
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
                                    url = "https://drive.google.com/file/d/1R8fs7BPhhYQM0tkleTiN6UKb9cGMHJQQ/view?usp=share_link";
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
                                    url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                    break;
                                case "Course Content":
                                    url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                                    url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                    break;
                                case "Course Content":
                                    url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                            url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                            break;
                        case "physics lab":
                            url="";
                            break;
                        case "engineering workshop":
                            url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                            break;

                    }
                    break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Linear algebra and regression analysis":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1cjzbQQmUa3TfhYlwQGKbnnxyv5Wc7TKD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1VdH4ccaI0k3gX89mrYa5hT3QdUZog88e/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Mathematical foundations for data science":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/14pncEs2nBAmjcLZUsU4YJhkv4sLb4ClC/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1YDUm51UBf_p-oG6BfKBOKVMTHnbmW7N9/view?usp=share_link";
                                break;
                            case "Data structures Lab":
                                url="";
                                break;

                        }
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
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1VdH4ccaI0k3gX89mrYa5hT3QdUZog88e/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Basic mechanical and civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1LacqU4-iQeikZ_RGZUlkIcklR9SivONs/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1Ox-AUtcz8rcPJMMh3RGiDEx4_DAMblcL/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
                                break;
                            case "c programming lab":
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;

                        }
                        break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Integral transforms and Matrix theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
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
                            case "Modern physics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1GoPtA9HfUsWtSWjT-1oqzbbwFqXIOhYG/view?usp=share_link";
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
                            case "circuit theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/14q-pWSs94-GUyNYBXvLylpj3LvbAf1ED/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                            case "Data structures Lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                                break;

                        }
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
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1VdH4ccaI0k3gX89mrYa5hT3QdUZog88e/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1P-uEI1OpSZwIq78Igwd9YNra_0XxuJ9g/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Basic mechanical and civil engineering":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1LacqU4-iQeikZ_RGZUlkIcklR9SivONs/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1Ox-AUtcz8rcPJMMh3RGiDEx4_DAMblcL/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;
                            case "c programming lab":
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                        }
                        break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Integral transforms and Matrix theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
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
                            case "Modern physics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1GoPtA9HfUsWtSWjT-1oqzbbwFqXIOhYG/view?usp=share_link";
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
                            case "circuit theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/14q-pWSs94-GUyNYBXvLylpj3LvbAf1ED/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                            case "Data structures Lab":
                                url="";
                                break;
                            case "engineering workshop":
                                url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                                break;
                        }
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
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/14ugs59JRdAGciQMOP_5hg1ih1j618Sp1/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1i-lQqQLlCdPBW0t4q-zfTBjmFAtQHMW3/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1K6g06xQK_eEmUpBvA2N2GdEFjRQsPYgp/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1rcqGan9HSc32h1eIadrC84klE6jB9zpG/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                            case "engineering workshop":
                                url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                                break;
                        }
                        break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Integral transforms and Matrix theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
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
                            case "Engineering chemistry":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1LGAWdTcqN0-hHsgd481bZ6WD16VIgz1-/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Engineering mechanics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1z5QeoVjpmUcjHxub4y8e7qatPj9DwDz4/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;
                            case "Data structures Lab":
                                url="";
                                break;
                        }
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
                                        url = "https://drive.google.com/file/d/1Ij_ShJVifjvZ_keIP4b4MYwx1Jx_Rdsh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url = "https://drive.google.com/file/d/1ODvsyOiK3MCbYHMVj0sEqrov0OpkssMD/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/14ugs59JRdAGciQMOP_5hg1ih1j618Sp1/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1i-lQqQLlCdPBW0t4q-zfTBjmFAtQHMW3/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1l6EM-9YrhtkJyyJKkCkNUQn4PXViWAg8/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1goQhMF_iLOWLYPjhFhKUzZTSOVNEcDXh/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1WGbm3CyTt3uZfPdzAG8vpFyOWuTnoZFV/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/10t07POLSUgd3W0GggsXrMxpGOVOnqIER/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1hV2_H94DNsUU6w5Ia_sg_biODE-sOw3D/view?usp=share_link";
                                break;
                            case "engineering workshop":
                                url="https://drive.google.com/file/d/1vXeNw4pAArGL853drIAt3WYA8b4FhyhY/view?usp=share_link";
                                break;
                        }
                        break;
                    case "semester 2":
                        switch(i.getString("subject")){
                            case "Integral transforms and Matrix theory":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1Zdyxa33CY_yn2cQ5gLDOZsbI8nvnELY2/view?usp=share_link";
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
                            case "Engineering chemistry":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1LGAWdTcqN0-hHsgd481bZ6WD16VIgz1-/view?usp=share_link";
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
                                        url = "https://drive.google.com/file/d/1m3E7e85w_eykg2zCIX8q-O1uiAMuz8ch/view?usp=share_link";
                                        break;
                                    case "Course Content":
                                        url="https://drive.google.com/file/d/1WfiTb25gdO-_VmzR_jc2l9V4EySSzvtx/view?usp=share_link";
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
                            case "Engineering mechanics":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1z5QeoVjpmUcjHxub4y8e7qatPj9DwDz4/view?usp=share_link";
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
                            case "Data structures":
                                switch (i.getString("type")){
                                    case "Syllabus":
                                        url = "https://drive.google.com/file/d/1g0IxfFUqZ0RuZk3buAqyFWxcNMerh4Ux/view?usp=share_link";
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
                                url="https://drive.google.com/file/d/1T0LHtC025tJs2PRsIbpaVppQW7s-HzSM/view?usp=share_link";
                                break;
                            case "english lab":
                                url="https://drive.google.com/file/d/1KQsc9pq4ISDZWrtxap6JRoqE1mEaWUs6/view?usp=share_link";
                                break;
                            case "Data structures Lab":
                                url="";
                                break;
                        }
                        break;
                }
                break;

        }
        wb.clearCache(true);
        wb.clearHistory();
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl(url);

    }
}
