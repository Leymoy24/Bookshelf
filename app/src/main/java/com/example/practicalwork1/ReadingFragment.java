package com.example.practicalwork1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return view;
    }

    // метод для создания списка книг
    private List<Book> createBookList() {
        List<Book> bookList = new ArrayList<>();
        // добавляем 200 элементов
        for (int i = 1; i <= 200; i++) {
            // создаем книгу и добавляем в список
            Book book = new Book("Book " + i, R.drawable.book_6);
            bookList.add(book);
        }
        return bookList;
    }
}