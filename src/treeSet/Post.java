package treeSet;

import java.util.Comparator;

public class Post implements Comparable<Post> {
    public int likesNum;
    public String text;
    public int repostNumber;
    public int id;
    public static int postsTotal = 0;

    public Post(int likesNum, String text, int repostNumber, int id) {
        this.likesNum = likesNum;
        this.text = text;
        this.repostNumber = repostNumber;
        this.id = id;
        postsTotal += 1;
    }

    @Override
    public String toString() {
        return "Post " + text +
                "likesNum " + likesNum +
                ", text " +
                ", repostNumber " + repostNumber +
                ", id " + id;
    }


    @Override
    public int compareTo(Post o) {
        return Integer.compare(this.id, o.id);
    }
}
