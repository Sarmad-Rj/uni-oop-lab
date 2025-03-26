package online_class;

public class T2_Book {
    private String author;
    private String[] chapterNames;

    public T2_Book(){
        this.author = "";
        this.chapterNames = new String[100];
    }

    public T2_Book(String a, String[] chN){
        this.author = a;
        this.chapterNames = chN;
    }

    public boolean compareBooks(T2_Book b) {
        if(this.author.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

    public int chapterCount(String[] chapters){
        int count = 0;
        for(String chapter: chapters){
            if(chapter != null){
                count++;
            }
        }
        return count;
    }

//    public T2_Book compareChapterNames(T2_Book b){
//        int chapterCount = chapterCount(this.chapterNames);
//        int chapterCount2 = chapterCount(b.chapterNames);
//
//        if(chapterCount > chapterCount2){
//            return this;
//        } else if(chapterCount2 > chapterCount) {
//            return b;
//        } else {
//
//        }
//    }
}
