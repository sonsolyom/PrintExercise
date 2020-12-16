package com.nagysolyom.components.visual;

import com.nagysolyom.components.Component;

import java.util.ArrayList;

//Define the class which extends another - inherits all its attributes and methods
public class Table extends Component {
    /*
    * //Instantiate the scanner for the HTML table - we would like to have some user input
    * private Scanner inputTable = new Scanner(System.in);
    */

    /*
     * Instantiate the extended class - we would like to use its method
     * tableData is the 'container' of the content in each cell.
     */
    private String tableData;

    //Define HTML style for better visualization
    private String tableStyle = "\"border=1px solid black;\"";
    private String tableDataStyle = "\"padding:1em; border:1px solid black;\"";


    /**
     * {@link ArrayList<String>} columns - in HTML we can not set exact columns only rows,
     *      we have to set as many cells as many columns we would like to receive.
     * {@link ArrayList<String>} tableCells is the content of each cells we would like to store
     * */
    private ArrayList<String> columns = new ArrayList<String>();
    private ArrayList<String> tableCells = new ArrayList<String>();

    //Instantiate a stringBuilder to be able to print out any String
    StringBuilder stringBuilder = new StringBuilder();


    //Define constructor
    public Table() {
        /*
        * //Asks the user for input and assign it to the variable
        * System.out.print("Please enter the content of the 'will be table': ");
        * String inputTableData = inputTable.nextLine();
        */

    }

    //Private variable setter
    public void setTableData(String tableData){
        this.tableData = tableData;
    }
    //Private variable getter
    public String getTableData() {
        return tableData;
    }

    /*
    * setTable method combine two method - we pass 2 integers to it,
    * first one - set the number of columns we would like to have
    * second one - set the rows
    * At the end it passes the entire content of the stringBuilder to the setter method -
    *   we will be able to print Table to the console easier.
    */
    public void setTable(Integer colNums, Integer rowNums){
        this.setColumns(colNums);
        this.setRows(rowNums);

        String stringBuilderToString = stringBuilder.toString();

        setName(stringBuilderToString);

    }

    /*
    * This method need an integer as parameter - it sets how many cells we would like to make.
    * With the cellSerial variable here we serialized the cells.
    */
    public void setColumns(Integer colNums){
        int counter;
        int cellSerial = 1;

        /*
        * In the for loop we adding elements to the arrayLists
        * and use a setter to pass data to the pointed instance
        */
        for (counter = 0; counter < colNums; counter++){
            tableCells.add(tableData);
            setTableData(tableCells.get(counter));

            columns.add("<td style=" + tableDataStyle + ">" + getTableData() + cellSerial + "</td>");

            cellSerial++;
        }

    }

    /*
     * This method need an integer as parameter - it sets how many rows we would like to have.
     * Utilize the stringBuilder to easily concatenate the String elements
     */
    public void setRows(Integer rowNums){
        stringBuilder
                .append("<table style:")
                .append(tableStyle)
                .append(">")
                .append("\n");

        /* The for loop access the passed integer of the parameter
        *       and runs as many times.
        *       Then the for each loop access an arrayList and concatenate its content.
        */
        for (int i = 0; i < rowNums; i++){
            stringBuilder.append("<tr>")
                .append("\n");
            for(String cellsToAppend : columns) {
                stringBuilder
                        .append(cellsToAppend)
                        .append("\n");
            }
            stringBuilder
                    .append("</tr>")
                    .append("\n");
        }
        stringBuilder.append("</table>");
    }
}