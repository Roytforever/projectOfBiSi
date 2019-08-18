package lintCode.easyCode;

public class ReferenceManager {
    public Node node;

    /**
     *
     * @param obj
     */
    public void copyValue(Node obj) {
        if (obj == null) {
            return;
        }
        if (node == null) {
            node = new Node(obj.val);
        }
        node.val = obj.val;
    }

    /**
     *
     * @param obj
     */
    public void copyReference(Node obj) {
        node = obj;
    }
}
