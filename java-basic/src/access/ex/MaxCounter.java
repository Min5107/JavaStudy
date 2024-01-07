package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter (int max){
        this.max = max;
    }

    public void increment(){
        if (vaildCount()){
            count++;
        }else {
            System.out.println("최대값을 초과 할 수 없습니다.");
        }
    }

    public int getCount(){
        return count;
    }
    private boolean vaildCount(){
        return max > count;
    }


}
