package com.hussam;

import com.hussam.dao.StudentDAO;
import com.hussam.model.Student;
import com.hussam.ui.StudentMenu;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentMenu().start();
    }
}