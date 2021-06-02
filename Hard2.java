package progcompe;

public class Hard2 {

    public static void main(String[] args) {
        String[] list = {"Hello", "World", "in", "a", "frame"};
        frame(list);
    }

    public static void frame(String[] list) {
        int size = list.length;
        for (int j = 0; j < maxLength(list)+4; j++) {
                    System.out.print("*");
                }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            while(list[i].length()!= maxLength(list)) list[i]= list[i]+" ";
            System.out.println("* " + list[i] + " *");
        }
        for (int j = 0; j < maxLength(list) + 4; j++) {
            System.out.print("*");
        }
    }

    static int maxLength(String[] arr) {
        int len = Integer.MIN_VALUE;
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            int l = arr[i].length();
            if (len < l) {
                len = l;
            }
        }
        return len;
    }
}
