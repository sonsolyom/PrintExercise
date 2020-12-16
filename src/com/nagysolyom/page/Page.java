package com.nagysolyom.page;

public class Page {
    //Instantiate stringBuilders to be able to print out any String
    private StringBuilder startPageString = new StringBuilder();
    private StringBuilder endPageString = new StringBuilder();

    //Define constructor
    public Page() {
    }

    //Define method to create the beginning of an HTML page
    public void createStart(){
        startPageString
                .append("<html>")
                .append("\n")
                .append("<body>");

        System.out.println(startPageString.toString());
    }

    //Define method to create the ending of an HTML page
    public void createEnd(){
        endPageString
                .append("</body>")
                .append("\n")
                .append("</html>");

        System.out.println(endPageString.toString());

    }

}
