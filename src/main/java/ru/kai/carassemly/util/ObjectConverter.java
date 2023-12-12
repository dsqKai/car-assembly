package ru.kai.carassemly.util;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObjectConverter {
    private final ModelMapper modelMapper;

}
