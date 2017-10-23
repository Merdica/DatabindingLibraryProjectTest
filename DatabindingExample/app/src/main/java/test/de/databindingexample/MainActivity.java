package test.de.databindingexample;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.de.testlibraryproject.LibraryFragment;
import test.de.testlibraryproject.TestViewModel;

public class MainActivity extends AppCompatActivity {

    private TestViewModel testViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testViewModel = ViewModelProviders.of(this).get(TestViewModel.class);

        showLibraryFragment();
    }

    protected void showLibraryFragment() {
        LibraryFragment libraryFragment = LibraryFragment.newInstance(testViewModel);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, libraryFragment, LibraryFragment.class.getName());
        fragmentTransaction.commit();
    }
}
