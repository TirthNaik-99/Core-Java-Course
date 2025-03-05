package org.example;

class P{
    public void see() throws ClassNotFoundException{
        Class.forName("college");
    }
}
public class DuckingException {
    public static void main(String[] args) {
        P obj = new P();
        try {
            obj.see();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
