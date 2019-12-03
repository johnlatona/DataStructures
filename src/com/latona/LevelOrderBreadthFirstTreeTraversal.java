package com.latona;

public class LevelOrderBreadthFirstTreeTraversal {
    private class Tree<Key> {
        Key key;
        Tree left;
        Tree right;

        public Tree(Key key, Tree left, Tree right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        public int height(Tree root) {
            if (root == null) {
                return 0;
            } else {
                return 1 + Math.max(height(root.left), height(root.right));
            }
        }
    }

    private interface Action {
        public <Key> void action(Key key);
    }

    public void levelOrder(Tree T, Action whatToDo) {
        for (int i = 0; i < T.height(T); i++) {
            visitLevel(T, i, whatToDo);
        }
    }

    private void visitLevel(Tree T, int level, Action whatToDo) {
        if (T == null) {
            return;
        }
        if (level == 0) {
            whatToDo.action(T.key);
        } else {
            // subtract 1 from level because if I'm on level 1, means I want to visit 1 layer down, and when we call visitLevel on that Tree, the level will be 0 respective to that tree node we're passing in.
            visitLevel(T.left, level - 1, whatToDo);
            visitLevel(T.right, level - 1, whatToDo);
        }
    }

}
