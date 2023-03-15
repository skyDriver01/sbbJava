import objektOriented.aufg1.aufg2.InputIn;

import java.util.*;

public class HuffmanCode {

    private static Map <Character, String> huffmanCodes;

    public static void main(String[] args) {
        String input = InputIn.nextLineOut("Enter input string: ");
        huffmanCodes = new HashMap <>();
        Node root = buildHuffmanTree(input);
        generateHuffmanCodes(root, "");

        System.out.println("Huffman codes for each character:");
        for (Map.Entry <Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String encodedString = encode(input);
        System.out.println("Encoded string: " + encodedString);

        String decodedString = decode(encodedString, root);
        System.out.println("Decoded string: " + decodedString);
    }

    private static Node buildHuffmanTree(String input) {
        Map <Character, Integer> frequencyMap = new HashMap <>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue <Node> priorityQueue = new PriorityQueue <>();
        for (Map.Entry <Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.offer(new Node(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node parent = new Node('\0', left.frequency + right.frequency, left, right);
            priorityQueue.offer(parent);
        }

        return priorityQueue.poll();
    }

    private static void generateHuffmanCodes(Node node, String code) {
        if(node.isLeaf()) {
            huffmanCodes.put(node.character, code);
            return;
        }
        generateHuffmanCodes(node.left, code + "0");
        generateHuffmanCodes(node.right, code + "1");
    }

    private static String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stringBuilder.append(huffmanCodes.get(c));
        }
        return stringBuilder.toString();
    }

    private static String decode(String encodedString, Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = root;
        for (int i = 0; i < encodedString.length(); i++) {
            char c = encodedString.charAt(i);
            if(c == '0') {
                node = node.left;
            } else {
                node = node.right;
            }
            if(node.isLeaf()) {
                stringBuilder.append(node.character);
                node = root;
            }
        }
        return stringBuilder.toString();
    }

    static class Node implements Comparable <Node> {
        char character;
        int frequency;
        Node left;
        Node right;

        public Node(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        public Node(char character, int frequency, Node left, Node right) {
            this.character = character;
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }

        public boolean isLeaf() {
            return this.left == null && this.right == null;
        }

        @Override
        public int compareTo(Node node) {
            return this.frequency - node.frequency;
        }
    }
}