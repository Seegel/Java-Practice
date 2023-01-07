package test.demo.data.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>();
        linkedList.add("Test");
        linkedList.add("Test1");
        var i =9;

        ArrayList arrayList = new ArrayList<>();

        arrayList.add("ListOne");

        System.out.println(linkedList);
    }
}
