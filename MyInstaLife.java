import java.io.*;
import java.util.*;

public class MyInstaLife {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name=scan.next();
        int followers=scan.nextInt();
        int posts=scan.nextInt();
        float hours=scan.nextFloat();
        System.out.println("My name is "+name+", my Instagram has "+followers+" followers, I have posted "+posts+" posts, and I use Instagram for "+hours+" hours daily.");
       }
                           
    }
