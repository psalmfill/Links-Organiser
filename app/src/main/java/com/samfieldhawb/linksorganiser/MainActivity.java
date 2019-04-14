package com.samfieldhawb.linksorganiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.samfieldhawb.linksorganiser.Adapters.CategoryAdapter;
import com.samfieldhawb.linksorganiser.Models.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mCategoryRecycler;
    CategoryAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Category> categories = new ArrayList<>();
        Category[] categories1 = {
                new Category("music"),
                new Category("Videos"),
                new Category("Java"),
                new Category("Python"),
                new Category()
        };
        for(Category category : categories1){
            categories.add(category);
        }
        mCategoryRecycler = findViewById(R.id.cat_rv);
        mCategoryRecycler.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        mCategoryRecycler.setAdapter(new CategoryAdapter(this,categories));

    }
}
