package com.nagysolyom.page;

import com.nagysolyom.container.Container;

public class Page {

    public void create(){

        Container container = new Container();

        System.out.println("<html>");
        System.out.println("<body>");
        container.display();
        System.out.println("</body>");
        System.out.println("</html>");
    }

}
