import shortestpath.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shortest Path");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());

            JPanel controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(3, 2, 10, 10));
            controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel sourceLabel = new JLabel("Source:");
            JLabel destinationLabel = new JLabel("Destination:");
            JComboBox<String> sourceDropdown = new JComboBox<>(Data.dist.keySet().toArray(new String[0]));
            JComboBox<String> destinationDropdown = new JComboBox<>(Data.dist.keySet().toArray(new String[0]));
            JButton findPathButton = new JButton("Find Path");
            JLabel resultLabel = new JLabel("Result: ");
            resultLabel.setHorizontalAlignment(JLabel.CENTER);

            controlPanel.add(sourceLabel);
            controlPanel.add(sourceDropdown);
            controlPanel.add(destinationLabel);
            controlPanel.add(destinationDropdown);
            controlPanel.add(findPathButton);

            frame.add(controlPanel, BorderLayout.NORTH);
            frame.add(resultLabel, BorderLayout.SOUTH);

            // Add JTextArea for displaying route details
            JTextArea routeDetailsArea = new JTextArea();
            routeDetailsArea.setEditable(false); // Make it non-editable
            routeDetailsArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            JScrollPane scrollPane = new JScrollPane(routeDetailsArea);

            frame.add(scrollPane, BorderLayout.CENTER);

            findPathButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String source = (String) sourceDropdown.getSelectedItem();
                    String destination = (String) destinationDropdown.getSelectedItem();

                    System.out.println("Selected Source: " + source);
                    System.out.println("Selected Destination: " + destination);

                    if (source.equals(destination)) {
                        resultLabel.setText("Source and destination cannot be the same.");
                        routeDetailsArea.setText("");
                        return;
                    }

                    if (!Data.dist.containsKey(source) || !Data.dist.containsKey(destination)) {
                        resultLabel.setText("Invalid source or destination.");
                        routeDetailsArea.setText("");
                        return;
                    }

                    Object[] result = ShortestPath.shortestPath(Data.dist, source, destination);
                    @SuppressWarnings("unchecked")
                    List<String> path = (List<String>) result[0];
                    double distance = (double) result[1];

                    System.out.println("Path: " + path);
                    System.out.println("Distance: " + distance);

                    if (path.isEmpty()) {
                        resultLabel.setText("No path exists between " + source + " and " + destination + ".");
                        routeDetailsArea.setText("");
                    } else {
                        resultLabel.setText("Path found! See details below.");
                        routeDetailsArea.setText("Route: " + String.join(" -> ", path) + "\nDistance: " + distance + " km");
                    }
                }
            });

            frame.setVisible(true);
        });
    }
}
