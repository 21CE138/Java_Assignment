package JavaAssignment_11;
import java.util.*;
import java.io.*;
import java.util.concurrent.ExecutionException;

public class Main {
        public static void main(String[] args) throws ExecutionException {
            Triplet<String, Integer, Character> p1 = Triplet.of("Yashrajsinh", 10, 'M');
            Triplet<String, Integer, Character> p2 = Triplet.of("Yuvrajsinh", 12, 'M');
            Triplet<String, Integer, Character> p3 = Triplet.of("Vishvdipsinh", 9, 'M');
            List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
            pairs.add(p1);
            pairs.add(p2);
            pairs.add(p3);
            System.out.println(pairs);
            Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
            System.out.println(distinctTriplets);
        }
    }
