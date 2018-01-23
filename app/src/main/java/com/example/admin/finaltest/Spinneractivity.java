package com.example.admin.finaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.admin.finaltest.Adapter.CountryAdapter;
import com.example.admin.finaltest.Model.CountryClass;

import java.util.ArrayList;

public class Spinneractivity extends AppCompatActivity  implements View.OnClickListener , AdapterView.OnItemSelectedListener{


    //Department Spinner
    private ArrayList<CountryClass> mCountryArrayList;
    private CountryAdapter mCountrySpinnerAdapter;
    private Spinner departmentSpinner;
    private String selecteddepartmentId;
    private TextView tvDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinneractivity);

        intview();
    }

    private void intview() {

        //Department Spinner
        tvDepartment = (TextView) findViewById(R.id.tvDepartment);
        departmentSpinner = (Spinner) findViewById(R.id.departmentSpinner);

        //Department Spinner
        tvDepartment.setOnClickListener(this);
        departmentSpinner.setOnItemSelectedListener(this);
    }

    // to set data adapter


    //Department Spinner
  /*  mCountryArrayList = new ArrayList<>();
    mCountryArrayList = mSelectSubjectResponse.getResult().geDepartmentClass();
    mCountryArrayList.add(0, new DepartmentClass("9999999", getResources().getString(R.string.select_department)));
    mCountrySpinnerAdapter = new CountryAdapter(Spinneractivity.this, mCountryArrayList);
    departmentSpinner.setAdapter(mCountrySpinnerAdapter);*/

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tvDepartment:
                departmentSpinner.performClick();
                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.departmentSpinner)
        {
            selecteddepartmentId = mCountryArrayList.get(i).getDepartmentId();
            tvDepartment.setText(mCountryArrayList.get(i).getDepartmentName());
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
