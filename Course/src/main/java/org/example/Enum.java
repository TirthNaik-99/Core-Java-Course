package org.example;

enum Languages{
    Hindi("Up"), Marathi("Maharashtra"), Kannada("Karnataka"), Gujarati("Gujarat"), Tamil("Chennai");

    Languages(String states) {
        this.states = states;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    private String states;

}
//enum RestApi{
//    GET, POST, PUT, DELETE;
//}
//enum Days{
//    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//}

public class Enum {
    public static void main(String[] args) {
        //Ordinal and values() function
//        RestApi[] restApi = RestApi.values();
//
//        for (RestApi api : restApi) {
//            System.out.println(api.name() + " : " + api.ordinal());
//        }
//
//        //Switch Conditions
//        Days day = Days.Friday;
//        switch (day){
//            case Monday -> System.out.println("Monday");
//            case Tuesday -> System.out.println("Tuesday");
//            case Wednesday -> System.out.println("Wednesday");
//            case Thursday -> System.out.println("Thursday");
//            case Friday -> System.out.println("Friday");
//            case Saturday -> System.out.println("Saturday");
//            case Sunday -> System.out.println("Sunday");
//            default -> System.out.println("No such day");
//        }
//
//
//        //IF else condition
//        RestApi rap = RestApi.GET;
//
//        if (rap == RestApi.GET ) {
//            System.out.println("Get the results");
//        }
//        else if (rap == RestApi.POST) {
//            System.out.println("Post the results");
//        }
//        else if (rap == RestApi.PUT) {
//            System.out.println("Put the results");
//        }
//        else{
//            System.out.println("Delete the results");
//        }


        for (Languages l : Languages.values()) {
            System.out.println(l + " " + l.getStates());
        }
    }
}
