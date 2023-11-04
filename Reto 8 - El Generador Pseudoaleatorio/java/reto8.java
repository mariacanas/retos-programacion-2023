

public class reto8 {
    
    
    public static int pseudoRandom() {
        long currentTime = System.currentTimeMillis();
        int pseudoRandomNumber = (int) (currentTime % 101); // Genera un número entre 0 y 100
        return pseudoRandomNumber;
    }

    public static void main(String[] args) {
        System.out.println(pseudoRandom());
    }
}
