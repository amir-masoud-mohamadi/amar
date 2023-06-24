package com.geofahm.shahrdari.config;

import com.github.eloyzone.jalalicalendar.DateConverter;
import com.github.eloyzone.jalalicalendar.JalaliDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Backup {
    public static boolean executeCommand(String... command) throws IOException {

        LocalDate date = LocalDate.now();
        DateConverter dateConverter = new DateConverter();
        JalaliDate jalaliDate = dateConverter.gregorianToJalali(date.getYear(), date.getMonth(), date.getDayOfMonth());
        System.out.println(jalaliDate);
        String commands = "set PGPASSWORD=postgres | pg_dump -Fc -v -h 127.0.0.1 -p 5432 -U postgres  fars > c:\\fars\\fars"+jalaliDate+".backup";

        Process process = new ProcessBuilder("CMD", "/C", commands).start();
        System.out.println(process);
        return true;
    }

}
