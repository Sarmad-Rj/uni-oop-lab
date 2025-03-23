package Assignment_2;

public class P2_Book {
    private String author;
    private String[] chapterNames;

    public P2_Book() {
        this.author = "NA";
        this.chapterNames = new String[100];
    }

    public P2_Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    public boolean compareBooks(P2_Book b) {
        if (this.author.equals(b.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    public P2_Book compareChapterNames(P2_Book b) {
        int thisChapterCount = countChapters(this.chapterNames);
        int otherChapterCount = countChapters(b.getChapterNames());

        if (thisChapterCount > otherChapterCount) {
            return this;
        } else {
            return b;
        }
    }

    // Helper method to count non-null chapters
    private int countChapters(String[] chapters) {
        int count = 0;
        for (String chapter : chapters) {
            if (chapter != null) {
                count++;
            }
        }
        return count;
    }
}
