package StreamsAssignments;

import java.util.*;
import java.util.stream.Collectors;

class News{
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }
}

public class NewsStream {
    public static int maxComments(List<News> news) {
        news.stream().sorted((a,b) -> a.getComment().compareTo(b.getComment())).forEach(f -> System.out.println(f));;
        return 0;
    }

    public static int budgetCount (List < News > news) {
        return 0;
    }

    public static String maxCommentsByUser (List < News > news) {
        
        System.out.println(news.stream().collect(Collectors.groupingBy(g -> g.getCommentByUser())));
        return null;
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
        System.out.println(news.stream().sorted((a,b) -> a.getCommentByUser().compareTo(b.getCommentByUser())).collect(Collectors.groupingBy(g -> g.getCommentByUser())));
        return null;
    }

    public static void main(String[] args) {
        List<News> list = new ArrayList<>();

        list.add(new News(07,"affan","scout",""));
        list.add(new News(07,"zikr","affan",""));
        list.add(new News(07,"muzkir","affan",""));
        list.add(new News(07,"safa","affan",""));
        list.add(new News(07,"nunin","affan",""));
        list.add(new News(07,"sickle","scout",""));
        list.add(new News(07,"sid","scout",""));
        list.add(new News(07,"scout","fikr",""));

        NewsStream.sortMaxCommentsByUser(list);
        
    }

    
}




