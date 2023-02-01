package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Post> posts = new TreeSet<>();
        posts.add(new Post(789, "Hello my lovely mountains", 65, 777));
        posts.add(new Post(79, "the 1st of septemper was great", 5, 7987));
        System.out.println(posts);
        System.out.println(Post.postsTotal);
        TreeSet<Post> posts2 = new TreeSet<>(new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return -(o1.text.length() - o2.text.length());
            }
        });
        posts2.add(new Post(45, "It is a great plesure to meet you in my town ", 82, 9000));
        posts2.add(new Post(5, "It is so fan ", 82, 9770));
        posts2.add(new Post(14, "My town ", 2, 987));
        System.out.println(posts2);
        System.out.println(Post.postsTotal);
    }
}
