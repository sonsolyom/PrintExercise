package com.nagysolyom.components.visual;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Table extends TableData {

    private Scanner inputTable = new Scanner(System.in);


    private TableData tableData = new TableData();

    private String tableStyle = "\"border:1px solid black;\"";
    private String tableDataStyle = "\"padding:1em; border:1px solid black;\"";



    public Table() {

        System.out.print("Please enter the content of the 'will be table': ");
        String inputTableData = inputTable.nextLine();

        tableData.setName(inputTableData);

        setName("<table style="+tableStyle+">\n"
                +"<tr>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"</tr>\n"
                +"</table>");

    }

}