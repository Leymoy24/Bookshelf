package com.example.practicalwork1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.practicalwork1.adapter.BookAdapter;

import java.util.ArrayList;
import java.util.List;

public class ReadingFragment extends Fragment {
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Book> bookList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_reading);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        bookList = createBookList();
        bookAdapter = new BookAdapter(bookList);
        recyclerView.setAdapter(bookAdapter);

        // Отображение Toast и сообщения в Log при нажатии на элемент списка
        bookAdapter.setOnItemClickListener(new BookAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getActivity(), "Clicking on a list item", Toast.LENGTH_SHORT).show();
                Log.i("tag","Clicking on a list item");
            }
        });

        return view;
    }

    // Метод для создания списка книг
    private List<Book> createBookList() {
        List<Book> bookList = new ArrayList<>();
        // Добавляем 200 элементов
        for (int i = 1; i <= 200; i++) {
            // Создаем книгу и добавляем в список
            Book book = new Book("Book " + i, R.drawable.book_6);
            bookList.add(book);
        }
        return bookList;
    }

}