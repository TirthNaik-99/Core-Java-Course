package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionApi {
    public static void main(String[] args){
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//
//        for(Object num : nums) {
//            int n = (Integer)num;
//            System.out.println(n*2);
//        }

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next()*2);
        }
    }
}
