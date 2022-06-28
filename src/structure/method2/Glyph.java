package src.structure.method2;

public abstract class Glyph {
    abstract void draw();

    public Glyph(){
        System.out.println("before");
        draw();
        System.out.println("after");
    }


}
