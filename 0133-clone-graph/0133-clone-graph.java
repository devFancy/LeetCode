class Solution {
    Map<Integer, Node> map = new HashMap<>();
    Queue<Node> q = new LinkedList<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node copied = new Node(node.val);
        map.put(copied.val, copied);

        q.offer(node);

        while (!q.isEmpty()) {
            Node poll = q.poll();

            for (Node n : poll.neighbors) {
                if (!map.containsKey(n.val)) {
                    Node newNode = new Node(n.val);
                    map.put(n.val, newNode);
                    q.offer(n);
                }

                map.get(poll.val).neighbors.add(map.get(n.val));
            }
        }

        return copied;

    }
}