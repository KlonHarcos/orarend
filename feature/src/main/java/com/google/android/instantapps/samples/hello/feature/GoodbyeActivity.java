/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.instantapps.samples.hello.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Simple activity that says goodbye.
 * */
public class GoodbyeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_goodbye);

    TextView hetNapjaView = findViewById(R.id.hetNapjaView);
    TextView nulladikOraView = findViewById(R.id.nulladikOraView);
    TextView elsoOraView = findViewById(R.id.elsoOraView);
    TextView masodikOraView = findViewById(R.id.masodikOraView);
    TextView harmadikOraView = findViewById(R.id.harmadikOraView);
    TextView negyedikOraView = findViewById(R.id.negyedikOraView);
    TextView otodikOraView = findViewById(R.id.otodikOraView);
    TextView hatodikOraView = findViewById(R.id.hatodikOraView);
    TextView hetedikOraView = findViewById(R.id.hetedikOraView);


    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK);
    day = Calendar.MONDAY;

    switch (day) {
      case Calendar.SUNDAY:
      case Calendar.MONDAY:
        hetNapjaView.setText(R.string.hetfo);
        nulladikOraView.setText(R.string.tesi);
        elsoOraView.setText(R.string.tesi);
        masodikOraView.setText(R.string.olasz);
        harmadikOraView.setText(R.string.olasz);
        negyedikOraView.setText(R.string.kemia);
        otodikOraView.setText(R.string.enek);
        hatodikOraView.setText(R.string.irodalom);
        hetedikOraView.setText(R.string.ofo);
        break;

      case Calendar.TUESDAY:
        // etc.
        break;
    }


  }
}
