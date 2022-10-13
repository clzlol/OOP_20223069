
public class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String name(){
        return name;
    }

    public void getname(String newname){
        name = newname;
    }

    public int score(){
        return score;
    }
    
    public void getscore(int newscore){
        score = newscore;
    }
}

