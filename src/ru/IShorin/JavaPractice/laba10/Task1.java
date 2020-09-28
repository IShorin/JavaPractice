package ru.IShorin.JavaPractice.laba10;

class Tasks {
    private int n;

    public Tasks(int n) {
        this.n = n;
    }

    public void task_1() {
        for (int i = 0; i <(n-1) ; i++) {
            int k=0;
            while (k!=(i+1)){
                array[k]=i+1;
                k++;

            }
        }
    }
    public static void main(String[] args) {
        int c = 5;
        Tasks obx = new Tasks(c);
        obx.task_1();
    }
}


