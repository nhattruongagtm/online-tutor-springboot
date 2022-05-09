package com.example.tutoronline.entities;

import java.util.Arrays;
import java.util.List;

public class ResponsePagination<T> {
    private Long totalItems;
    private List<T> list;
    private int totalPages;
    private int currentPage;


    public ResponsePagination(Long totalItems, List<T> list, int totalPages, int currentPage) {
        this.totalItems = totalItems;
        this.list = list;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
    }

    public ResponsePagination() {
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "ResponsePagination{" +
                "totalItems=" + totalItems +
                ", list=" + list +
                ", totalPages=" + totalPages +
                ", currentPage=" + currentPage +
                '}';
    }
}
