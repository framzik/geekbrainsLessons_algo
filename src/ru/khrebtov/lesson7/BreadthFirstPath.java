package ru.khrebtov.lesson7;

public class BreadthFirstPath extends BasePath {

    public BreadthFirstPath(Graph g, int source) {
        super(g, source);
        super.bfs(g, source);
    }
}
