package com.javaDemo.javaDemo.service;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomersCsv {
    public static void readCsv(){
        try (CSVReader reader = new CSVReader(new FileReader("Employees.csv"), ',');
             Connection connection = DBConnection.getConnection();
        ){

            String insertQuery = "Insert into Customers (customerId,companyName, firstName, lastName,billingAddress,city,stateOrProvince,zipCode,email,companyWebsite,phoneNumber,faxNumber,shipAddress,shipCity,shipStateOrProvince,shipZipCode,shipPhoneNumber) " +
                                    "values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
