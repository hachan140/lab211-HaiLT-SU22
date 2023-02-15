/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author havu
 */
public class MyTree {

    Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void insert(String id, String xName, double xRating) {
        if (isEmpty()) {
            root = new Node(id, xName, xRating);
            return;
        }

        if (xName.contains("Pa") || xRating <= 3) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (id.compareToIgnoreCase(root.info.id) > 0) {
                root.right = new Node(id, xName, xRating);
            } else {
                root.left = new Node(id, xName, xRating);
            }
            return;
        }

        Node trace = root;
        Node par = null;

        while (trace != null) {
            if (id.compareToIgnoreCase(trace.info.id) == 0) {
                return;
            }
            par = trace;
            if (id.compareToIgnoreCase(trace.info.id) > 0) {
                trace = trace.right;
            } else {
                trace = trace.left;
            }
        }

        if (id.compareToIgnoreCase(par.info.id) > 0) {
            par.right = new Node(id, xName, xRating);
        } else {
            par.left = new Node(id, xName, xRating);
        }
    }

    int level(Node p) {
        Node trace = root;
        int lev = 1;
        while (trace != p) {
            lev++;
            if (p.info.id.compareToIgnoreCase(trace.info.id) > 0) {
                trace = trace.right;
            } else {
                trace = trace.left;
            }
        }
        return lev;
    }

    void traverse() {
        MyQueue q = new MyQueue();
        q.enqueue(root);
        while (!q.isEmpty()) {
            Node p = (Node) q.dequeue();

            if (p.info.rating >= 4) {
                System.out.println(p.info.toString() + " | " + level(p));
            }
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
        }
    }

    private double sumRating(Node p) {
        if (p == null) {
            return 0;
        }
        return sumRating(p.left) + sumRating(p.right) + p.info.rating;
    }

    private int countNode(Node p) {
        if (p == null) {
            return 0;
        }
        return countNode(p.left) + countNode(p.right) + 1;
    }

    private double avg() {
        return sumRating(root) / countNode(root);
    }

    void delete() {
        preOrderdelete(root, 0);
    }

    void rotateRight() {
        preOrderRotate(root, null, 0);
    }

    private void preOrderRotate(Node p, Node f, int pos) {
        if (p == null) {
            return;
        }
        
        if(p.info.rating >= 4 && f != null) pos=1;
        
        if (p.info.rating >= 4 && f != null && pos == 0 && p == f.left) {
            p = rotateToRight(p);
            f.left = p;
            pos++;
        }
        System.out.println(p.info.toString());
        preOrderRotate(p.left, p, pos);
        preOrderRotate(p.right, p, pos);
    }

    private Node rotateToRight(Node p) {
        Node ch = p.left;
        p.left = ch.right;
        ch.right = p;
        return ch;
    }

    private void preOrderdelete(Node p, int count) {
        if (p == null) {
            return;
        }
        if (p.info.rating >= avg()) {
            count++;
            if (count == 2) {
                deleteByCopying(p);
            }
        }
        System.out.println(p.info.toString());
        preOrderdelete(p.left, count);
        preOrderdelete(p.right, count);
    }

    private void deleteByCopying(Node x) {
        if (isEmpty()) {
            return;
        }
        Node p = root;
        Node parent = null;
        while (p != null) {
            if (p == x) {
                break;
            }
            parent = p;
            if ((p.info.id.compareToIgnoreCase(x.info.id)) < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }

        if (p == null) {
            return;
        }

        if (p.left == null && p.right == null) {
            if (parent == null) {
                root = null;
                return;
            }
            if (parent.left == p) {
                parent.left = null;
            } else {
                parent.right = null;
            }

            return;
        }

        if ((p.left == null && p.right != null) || (p.left != null && p.right == null)) {
            if (parent == null) {
                if (p.right != null) {
                    root = p.right;
                    p.right = null;
                } else {
                    root = p.left;
                    p.left = null;
                }

                return;
            }
            if (parent.left == p) {
                if (p.right != null) {
                    parent.left = p.right;
                    p.right = null;
                } else {
                    parent.left = p.left;
                    p.left = null;
                }
                return;
            } else {
                if (p.right != null) {
                    parent.right = p.right;
                    p.right = null;
                } else {
                    parent.right = p.left;
                    p.left = null;
                }
                return;
            }
        }

        if (p.left != null && p.right != null) {
            Node rm = p.left;
            Node parentRM = null;
            while (rm.right != null) {
                parentRM = rm;
                rm = rm.right;
            }
            p.info = rm.info;
            if (parentRM == null) {
                p.left = rm.left;
            } else {
                parentRM.right = rm.left;
            }
        }
    }
}
