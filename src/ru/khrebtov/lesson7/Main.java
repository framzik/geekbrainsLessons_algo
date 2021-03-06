package ru.khrebtov.lesson7;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 0);

        graph.addEdge(5, 6);
        graph.addEdge(7, 8);
        graph.addEdge(9, 4);
        graph.addEdge(8, 2);
        graph.addEdge(9, 0);

//        System.out.println(graph.getVertexCount());
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(4));

        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
        System.out.println(dfp.hasPathTo(0));
        System.out.println(dfp.pathTo(0));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 8);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(0));
    }
}
