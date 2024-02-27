package metody;

public class SomeClass {

    private String fieldOne;
    private String fieldTwo;

    public SomeClass(String fieldOne, String fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }


    public int show(){
        return doSomthing();
    }

    private int doSomthing(){
        int sum = 0;
        for(int i = 1; i<=50;i++){
            if(i % 5 == 0){
                sum+=i;
            }
        }
        return sum;
    }



}
