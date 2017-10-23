package test.de.testlibraryproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.de.testlibraryproject.databinding.LibraryFragmentLayoutBinding;

public class LibraryFragment extends Fragment {

    private TestViewModel viewModel;

    @NonNull
    public static LibraryFragment newInstance(@NonNull final TestViewModel viewModel) {
        final LibraryFragment viewModelFragment = new LibraryFragment();
        viewModelFragment.setViewModel(viewModel);
        return viewModelFragment;
    }

    private void setViewModel(@NonNull final TestViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final LibraryFragmentLayoutBinding libraryFragmentLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.library_fragment_layout, container, false);
        libraryFragmentLayoutBinding.setTestViewModel(viewModel);

        return libraryFragmentLayoutBinding.getRoot();
    }
}
