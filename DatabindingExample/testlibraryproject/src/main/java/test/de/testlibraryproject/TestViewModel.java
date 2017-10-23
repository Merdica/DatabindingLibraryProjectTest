package test.de.testlibraryproject;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class TestViewModel extends ViewModel {

    private final ObservableField<String> currentMessage = new ObservableField<>("No button clicked yet");

    public final String getValue_one() {
        return "Test value 1";
    }

    public String getValue_two() {
        return "Test value 2";
    }

    public String getTitleMainFragment() {
        return "Main Fragment";
    }

    public String getTitleLibraryFragment() {
        return "Library Fragment";
    }

    public final String getButton1Title() {
        return "Button 1";
    }

    public final String getButton2Title() {
        return "Button 2";
    }

    public final String getButton3Title() {
        return "Button 3";
    }

    public final String getButton4Title() {
        return "Button 4";
    }

    public ObservableField<String> getCurrentMessage() {
        return currentMessage;
    }

    public void buttonClicked1() {
        currentMessage.set("Button 1 clicked");
    }

    public void buttonClicked2() {
        currentMessage.set("Button 2 clicked");
    }

    public void buttonClicked3() {
        currentMessage.set("Button 2 clicked");
    }

    public void buttonClicked4() {
        currentMessage.set("Button 2 clicked");
    }
}
