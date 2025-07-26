package shortestpath;

import java.util.*;

public class ShortestPath {

    public static Object[] shortestPath(Map<String, Map<String, Double>> graph, String source, String destination) {
        Map<String, Double> distances = new HashMap<>();
        Map<String, String> previousNodes = new HashMap<>();
        Set<String> visitedNodes = new HashSet<>();

        for (String node : graph.keySet()) {
            distances.put(node, Double.MAX_VALUE);
        }
        distances.put(source, 0.0);

        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        queue.add(source);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            visitedNodes.add(currentNode);

            if (currentNode.equals(destination)) break;

            for (Map.Entry<String, Double> neighbor : graph.get(currentNode).entrySet()) {
                
                if (visitedNodes.contains(neighbor.getKey())) continue;
                System.out.println(neighbor.getKey());
                double newDist = distances.get(currentNode) + neighbor.getValue();
                if (newDist < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), newDist);
                    previousNodes.put(neighbor.getKey(), currentNode);
                    queue.add(neighbor.getKey());
                }
            }
        }

        List<String> path = new ArrayList<>();
        String current = destination;
        while (current != null) {
            path.add(current);
            current = previousNodes.get(current);
        }

        Collections.reverse(path);
        System.out.println(path);
        return new Object[]{path, distances.get(destination)};
    }
}
