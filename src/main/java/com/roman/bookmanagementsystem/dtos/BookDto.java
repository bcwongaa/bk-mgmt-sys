package com.roman.bookmanagementsystem.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;

@Setter
@Getter
public class BookDto {

    public Long id;

    @NonNull
    public String title;
    @NonNull
    public String author;
    @NonNull
    public Boolean published;
}

