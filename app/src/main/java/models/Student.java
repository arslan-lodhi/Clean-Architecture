package models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Observable;

import imzee.mvvm_example.BR;

/**
 * Created by arslanlodhi on 5/2/18.
 */

public class Student extends BaseObservable {

public Student(){

}
    String Name;
    String age;

    @Bindable
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        this.notifyPropertyChanged(BR.age);

    }


}
