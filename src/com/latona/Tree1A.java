package com.latona;

public class Tree1A<Key> {
    Key k; // e.g. 0
    Tree1A left;
    Tree1A middle;
    Tree1A right;
}

//public class Tree1B<Key> { // this approach allows for variable sizes, whereas Tree1A does not
//    Key k; // e.g. 0
//    Tree1B[] children;
//}
//
//public class Tree1C<Key> { // sibling tree
//    Key k;
//    Tree1C firstChild;
//    Tree1C sibling;
//}
//
//public class Tree2<Key> { // all keys go into an array
//    Key[] keys;
//}
