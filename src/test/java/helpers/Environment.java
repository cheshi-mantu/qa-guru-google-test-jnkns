package helpers;

public class Environment {
    // config is common for all the tests
    public final static String
        //gradle search_tests -Durl="" -Dsearchstring=""
        urlstring = System.getProperty("urlstring", "http://google.com"),
        searchstring =  System.getProperty("searchstring", "Лепра");

}

