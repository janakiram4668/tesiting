class test{
    int a;
    int b;
    test(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int add(){
        return a+b;
    }
    public static void main(String[] args) {
        test t=new test(3, 4);
        System.out.println(t.add());
        
    }
}