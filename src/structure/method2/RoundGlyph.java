package src.structure.method2;

class RoundGlyph extends Glyph{
    int radius=1;
    public RoundGlyph(int r){
        radius=r;
        System.out.println(radius);
    }

    @Override
    void draw() {
        System.out.println(radius);
    }

}
