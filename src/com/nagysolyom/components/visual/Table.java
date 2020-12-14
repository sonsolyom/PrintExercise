package com.nagysolyom.components.visual;

import java.util.Scanner;

//Define the class which extends another - inherits all its attributes and methods
public class Table extends TableData {

    //Instantiate the scanner for the HTML table - we would like to have some user input
    private Scanner inputTable = new Scanner(System.in);

    //Instantiate the extended class - we would like to use its method
    private TableData tableData = new TableData();

    //Define HTML style for better visualization
    private String tableStyle = "\"border:1px solid black;\"";
    private String tableDataStyle = "\"padding:1em; border:1px solid black;\"";

    //Define constructor
    public Table() {

        //Asks the user for input and assign it to the variable
        System.out.print("Please enter the content of the 'will be table': ");
        String inputTableData = inputTable.nextLine();

        //Call the setter of the extended class and pass the user input to it
        tableData.setName(inputTableData);

        //Call the setter of this class
        setName("<table style=" + tableStyle + ">\n"
                +"<tr>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"</tr>\n"
                +"</table>");

    }

}