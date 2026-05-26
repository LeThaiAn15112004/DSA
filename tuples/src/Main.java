// Dùng Arrays.sort để sắp xếp mảng
import java.util.Arrays;

// Tuple = cặp (a, b) — tự định nghĩa, Java không có kiểu tuple sẵn
class Tuple {
    public int a, b; // hai thành phần của cặp

    // Constructor: gán giá trị khi tạo đối tượng new Tuple(10, 11)
    public Tuple(int a, int b) {
        this.a = a; // this.a = field của object; a = tham số truyền vào
        this.b = b;
    }

    // Khi in System.out.println(tuple) sẽ gọi toString() này
    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}

public class Main {

    public static void main(String[] args) {
        // Mảng 4 phần tử kiểu Tuple (ban đầu các ô là null)
        Tuple[] arr = new Tuple[4];
        arr[0] = new Tuple(10, 11);  // (10, 11)
        arr[1] = new Tuple(20, 11);  // (20, 11) — cùng b=11 với arr[0]
        arr[2] = new Tuple(100, 5);  // (100, 5)
        arr[3] = new Tuple(5, 100);  // (5, 100)

        // Sắp xế arr theo Comparator bên dưới (thứ tự tăng dần)
        Arrays.sort(arr, (Tuple o1, Tuple o2) -> {
            // Bước 1: ưu tiên so sánh theo b (cột thứ hai)
            if (o1.b != o2.b) {
                return Integer.compare(o1.b, o2.b); // b nhỏ hơn đứng trước
            } else {
                // Bước 2: nếu b bằng nhau thì so sánh theo a (cột thứ nhất)
                return Integer.compare(o1.a, o2.a);
            }
        });
        // Sau sort: (100,5), (10,11), (20,11), (5,100)
        //   — (10,11) trước (20,11) vì cùng b=11 và 10 < 20

        // Duyệt mảng đã sắp xếp và in từng cặp
        for (Tuple tuple : arr) {
            System.out.println(tuple.toString()); // gọi toString() → "(a, b)"
        }
    }
}
