package base;

import java.util.*;

/**
 * @Author 程序员小张
 * @Date 2023-01-02 20:56
 * @Desc
 */
public class AirPlane {

    private class Node {
        public int time;
        public int flag;

        public Node(int time, int flag) {
            this.time = time;
            this.flag = flag;
        }
    }

    public int countOfAirplanes(List<Interval> airplanes) {
        int count = 0;
        List<Node> list = new ArrayList<Node>();
        for (Interval interval : airplanes) {
            list.add(new Node(interval.start, 1));
            list.add(new Node(interval.end, -1));
        }
        Collections.sort(list, (a, b) -> a.time != b.time ? a.time - b.time : a.flag - b.flag);
        int maxPlane = 0;
        for (Node node : list) {
            if (node.flag == 1) {
                count++;
            } else {
                count--;
            }
            maxPlane = Math.max(maxPlane, count);
        }
        return maxPlane;
    }


    public int countOfAirplanes2(List<Interval> airplanes) {
        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        for (Interval interval : airplanes) {
            treemap.put(interval.start, treemap.getOrDefault(interval.start, 0) + 1);
            treemap.put(interval.end, treemap.getOrDefault(interval.end, 0) - 1);
        }
        int maxPlane = 0;
        int count = 0;
        for (Integer value : treemap.values()) {
            count += value;
            maxPlane = Math.max(maxPlane, count);
        }
        return maxPlane;
    }

}