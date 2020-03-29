package com.app;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(StringUtils.isNotBlank("Qwe"));
        System.out.println(CollectionUtils.isNotEmpty(CollectionUtils.EMPTY_COLLECTION));
    }
}
