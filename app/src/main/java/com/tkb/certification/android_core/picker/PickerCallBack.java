package com.tkb.certification.android_core.picker;

public interface PickerCallBack {

     void processDatePickerResult(int year, int month, int dayOfMonth);
     void processTimePickerResult(int hourOfDay, int minute);
}
