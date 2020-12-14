package com.nagysolyom.page;

public class Page {

    //Define constructor
    public Page() {
    }

    //Define method to create the beginning of an HTML page
    public void createStart(){

        System.out.println("<html>");
        System.out.println("<body>");

    }

    //Define method to create the ending of an HTML page
    public void createEnd(){

        System.out.println("</body>");
        System.out.println("</html>");

    }

}
