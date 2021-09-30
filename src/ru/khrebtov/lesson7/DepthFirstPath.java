package ru.khrebtov.lesson7;

import java.util.LinkedList;

public class DepthFirstPath extends BasePath {

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
        super.dfs(g, source);
    }

    public boolean hasPathTo(int dist) {
        return super.hasPathTo(dist);
    }

    public LinkedList<Integer> pathTo(int dist) {
        return super.pathTo(dist);
    }
}
