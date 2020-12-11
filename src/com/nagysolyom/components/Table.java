package com.nagysolyom.components;

public class Table extends TableData {

    TableData tableData = new TableData();
    private String tableStyle = "\"border:1px solid black;\"";
    private String tableDataStyle = "\"padding:1em; border:1px solid black;\"";

    public Table() {
        setName("<table style="+tableStyle+">\n"
                +"<tr>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"<td style="+tableDataStyle+">"+tableData.getName()+"</td>\n"
                +"</tr>\n"
                +"</table>");

    }

}