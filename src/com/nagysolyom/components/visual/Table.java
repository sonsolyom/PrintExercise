package com.nagysolyom.components.visual;

import java.util.ArrayList;
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

    private ArrayList<String> columns = new ArrayList<String>();
    private ArrayList<String> tableCells = new ArrayList<String>();

    //Define constructor
    public Table() {

        //Asks the user for input and assign it to the variable
        /*System.out.print("Please enter the content of the 'will be table': ");
        String inputTableData = inputTable.nextLine();*/

        //Call the setter of this class
        /*setName("<table style=" + tableStyle + ">\n"
                +"<tr>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>\n"
                +"</tr>\n"
                +"</table>");*/

    }

    public void setTable(Integer colNums, Integer rowNums){
        this.setColumns(colNums);
        this.setRows(rowNums);
        return ;
    }

    public void setColumns(Integer colNums){
        int counter;
        int cellSerial = 1;

        for (counter = 0; counter < colNums; counter++){
            tableCells.add("cell - " + cellSerial);
            tableData.setName(tableCells.get(counter));

            columns.add("<td style=" + tableDataStyle + ">" + tableData.getName() + "</td>");

            cellSerial++;
        }

    }

    public void setRows(Integer rowNums){
        int counter;
        System.out.println("<table style:" + tableStyle + ">");
        for (counter = 0; counter < rowNums; counter++){
            System.out.println("<tr>");
            for(String cells : columns){
                System.out.println(cells);
            }
            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }


}