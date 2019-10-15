package com.ana.droplist.apphelper;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ana.droplist.droplist.DropListRvAdapter;
import com.ana.falldetector.model.Drop;

import java.util.List;

public class DropListBinding {

    @BindingAdapter("android:items")
    public static void setItems(RecyclerView recyclerView, List<Drop> drops) {
        DropListRvAdapter adapter = (DropListRvAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.setItems(drops);
        }
    }
}