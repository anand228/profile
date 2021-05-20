package com.example.profile;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.view.GravityCompat;


import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {

    private Button skill_b;
    private Button education_b;
    private Button training_b;
    private Button hobbies_b;
    private Button projects_b;
    private FrameLayout frame_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skill_b =findViewById(R.id.skill_button);
        education_b =findViewById(R.id.edu_button);
        training_b =findViewById(R.id.training);
        hobbies_b =findViewById(R.id.hobby_button);
        projects_b =findViewById(R.id.projects_button);
        frame_home =findViewById(R.id.frame_layout);

        skill_b.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new SkillsFragment()).commit();
        });

        education_b.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new EducationFragment()).commit();
        });

        training_b.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new TrainingFragment()).commit();
        });
        hobbies_b.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HobbyFragment()).commit();
        });
        projects_b.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new ProjectsFragment()).commit();
        });
    }



}