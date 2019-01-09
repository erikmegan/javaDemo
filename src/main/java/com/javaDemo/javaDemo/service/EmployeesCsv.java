package com.javaDemo.javaDemo.service;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import au.com.bytecode.opencsv.CSVReader;

public class EmployeesCsv {
    public static void readCsv(){
        try (CSVReader reader = new CSVReader(new FileReader("Employees.csv"), ',');
             Connection connection = DBConnection.getConnection();
             ){

            String insertQuery = "Insert into Employees (employeeId,firstName, lastName, title,workPhone) values (null,?,?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(insertQuery);

            String[] rowData = null;

            int i = 0;

            while((rowData = reader.readNext()) != null)

            {
                for (String data : rowData)
                {
                    pstmt.setString((i % 3) + 1, data);
                    if (++i % 3 == 0)

                    pstmt.addBatch();
                    if (i % 30 == 0

                    pstmt.executeBatch();

                }

            }

            System.out.println("Data Successfully Uploaded");

        }

        catch (Exception e)

        {

            e.printStackTrace();

        }



    }
}
