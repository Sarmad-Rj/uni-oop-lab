package Lab_3;

public class Task_3_Student {
    private String name;
    private int[] resultArray;

    public Task_3_Student(String name, int[] resultArray) {
        this.name = name;
        this.resultArray = resultArray;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            sum += resultArray[i];
        }

        return (double) sum / resultArray.length;
    }

    public String getName() {
        return name;
    }

    public int[] getResultArray() {
        return resultArray;
    }


}
