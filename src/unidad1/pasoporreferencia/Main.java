package pasoporreferencia;

public class Main{
    public static void ChangeBox(Box newBox){
        newBox.size =20;
    }
    public static void main(String[] args) {
        Box box=new Box(50);
        System.out.println(box.size);
        System.out.println(box.size);
        System.out.println("Tamaño inicial: " + box.size);
         ChangeBox(box);
        System.out.println("Tamaño después de cambiar: " + box.size);
    }
}