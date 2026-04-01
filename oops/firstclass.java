class firstclass {
    
    public void print(){
        System.out.println("hello world");
    }
    public int add(int a,int b){
        int sum = a+b;
        return sum;

    }
    public int sub(int a,int b){
        int sub = a-b;
        return sub;
    }
    public float add(float a,float b){
        float sum = a+b;
        return sum;
    }
    public double add(double a,double b){
        double dadd=a+b;
        return dadd;
    }
    public static void main(String args[]){
        firstclass obj = new firstclass();
        int iadd=obj.add(2,5);
        System.out.println(iadd);
        int isub=obj.sub(5,4);
        System.out.println(isub);
        float fadd=obj.add(2.3f,2.7f);
        double hadd=obj.add(2.3,3.6);
        System.out.println(fadd);
        System.out.println(hadd);
        obj.print();

    }
     
            

    
}
