import objektOriented.aufg1.aufg2.InputIn;

import java.util.*;

public class HuffmanCode {

    private static Map <Character, String> huffmanCodes;


    public static void main(String[] args) {
        String input = InputIn.nextLineOut("Enter input string: ");         // Huffman-Baum aus den Häufigkeiten der Zeichen in der Eingabe erstellen
        huffmanCodes = new HashMap <>();                // Huffman-Codes für jedes Zeichen generieren
        Node root = buildHuffmanTree(input);
        generateHuffmanCodes(root, "");
        // Ausgabe der Huffman-Codes für jedes Zeichen
        System.out.println("Huffman codes for each character:");
        for (Map.Entry <Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String encodedString = encode(input);
        System.out.println("Encoded string: " + encodedString);

        String decodedString = decode(encodedString, root);
        System.out.println("Decoded string: " + decodedString);
    }

    // Baum aus den Häufigkeiten der Zeichen in der Eingabe erstellen
    private static Node buildHuffmanTree(String input) {
        Map <Character, Integer> frequencyMap = new HashMap <>();
        for (int i = 0; i <
                        input.length(); i++) {               // Die Häufigkeiten jedes Zeichens in der Eingabe zählen
            char c = input.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        // Eine Prioritätswarteschlange zur Erstellung des Huffman-Baums verwenden
        PriorityQueue <Node> priorityQueue = new PriorityQueue <>();
        for (Map.Entry <Character, Integer> entry : frequencyMap.entrySet()) {          // Durchlaufe die Frequenzkarte und füge jedes Zeichen als neuen Knoten zur Prioritätswarteschlange hinzu
            priorityQueue.offer(new Node(entry.getKey(), entry.getValue()));
        }
        // Solange die Prioritätswarteschlange mehr als einen Knoten hat:
        while (priorityQueue.size() > 1) {
            // Entferne die beiden Knoten mit den niedrigsten Frequenzen aus der Prioritätswarteschlange
            // Erstelle einen neuen Elternknoten für diese beiden Knoten mit der Summe ihrer Frequenzen
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node parent = new Node('\0', left.frequency + right.frequency, left, right);
            // Füge den Elternknoten wieder in die Prioritätswarteschlange ein
            priorityQueue.offer(parent);
        }
        // Gib den Wurzelknoten des Huffman-Baums zurück
        return priorityQueue.poll();
    }


    // Methode zum Generieren der Huffman-Codes anhand des Huffman-Baums
    private static void generateHuffmanCodes(Node node, String code) {
        // node: aktueller Knoten
        // code: aktueller Code (rekursiv aufgebaut)
        // Basisfall: Blattknoten erreicht, füge den Code zum Map huffmanCodes hinzu
        if(node.isLeaf()) {
            huffmanCodes.put(node.character, code);
            return;
        }
        // Rekursiver Aufruf für linken Teilbaum, füge '0' zum Code hinzu
        // Rekursiver Aufruf für rechten Teilbaum, füge '1' zum Code hinzu
        generateHuffmanCodes(node.left, code + "0");
        generateHuffmanCodes(node.right, code + "1");
    }

// Methode zum Kodieren eines Strings mit Hilfe der Huffman-Codes


    private static String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);           // input: der Eingabe-String, der kodiert werden soll
            stringBuilder.append(huffmanCodes.get(c));          // Füge den Huffman-Code für jedes Zeichen des Eingabe-Strings hinzu
        }
        return stringBuilder.toString();            // Rückgabe: der kodierter String als Binärzahl
    }

    /**
     * Decodes an encoded string using the given Huffman tree root node.
     *
     * @param encodedString the encoded string to decode
     * @param root          the root node of the Huffman tree
     * @return the decoded string
     */
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
            // If the current node is a leaf node, append its character to the output
            if(node.isLeaf()) {
                stringBuilder.append(node.character);
                node = root;
            }
        }
        // string and reset the current node to the root of the Huffman tree
        return stringBuilder.toString();
    }


    static class Node implements Comparable <Node> {
        char character;
        int frequency;
        Node left;
        Node right;

        // Konstruktor für einen Knoten ohne Kinder
        public Node(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        // Konstruktor für einen Knoten mit Kindern
        public Node(char character, int frequency, Node left, Node right) {
            this.character = character;
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }
        // Methode zur Überprüfung, ob ein Knoten ein Blattknoten ist

        public boolean isLeaf() {
            return this.left == null && this.right == null;
        }

        // Methode zur Implementierung der Comparable-Schnittstelle für die Sortierung nach der Häufigkeit
        @Override
        public int compareTo(Node node) {
            return this.frequency - node.frequency;
        }
    }
}
