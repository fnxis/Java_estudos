package estudos.diagramaClasse.entities2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import  java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf=  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments=new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post(){
    }

    public List<Comment> getComment() {
        return comments;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComent(Comment comment){
        comments.add(comment);
    }

    public void removeComent(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append(" Likes - ").append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (Comment comment : comments) {
            sb.append(comment.getText()).append("\n");
        }
        return sb.toString();
    }
}
