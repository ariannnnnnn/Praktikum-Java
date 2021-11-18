public class Aritmatik {
    
        private Aritmatik(){
        }
        public void kali(int a,int b){
                System.out.println(a*b);
        }
        public void kali(int a,int b,int c) {
                System.out.println(a*b*c);
        }
        public static void main(String args[]) {
                Aritmatik A = new Aritmatik();
                A.kali(2,1,1);
                A.kali(2,3);
        }
}
