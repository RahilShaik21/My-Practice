package oops;
// class Test{
//   static String name;
//
//    Test(String name) {
//        Test.name = name;
//    }
class StaticBlock {
    static class Test{
        String name;

        Test(String name) {
            this.name = name;
        }

    }
    void greeting(){
        return ;
    }
    static void main(String[] args) {
        Test a=new Test("rahil");
        Test b=new Test("kunal");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
