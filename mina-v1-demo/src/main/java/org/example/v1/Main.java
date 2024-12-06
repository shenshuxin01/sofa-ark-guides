package org.example.v1;

import org.apache.mina.common.IoFilter;
import org.apache.mina.filter.LoggingFilter;

public class Main {
    public static void main(String[] args) {
        IoFilter loggingFilter = new LoggingFilter();
        System.out.println("minaV1:classInfo ===> "+loggingFilter.getClass().getClassLoader());
        System.out.println(loggingFilter.getClass().toString());
    }
}