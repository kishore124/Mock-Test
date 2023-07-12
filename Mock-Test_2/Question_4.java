package in.ineuron;

interface Drawable {
	public void draw();
}

class Circle implements Drawable {

	@Override
	public void draw() {

		System.out.println("Drawing circle");
	}
}

class Rectangle implements Drawable {

	@Override
	public void draw() {

		System.out.println("Drawing rectangle");
	}

}

public class Question_4 {

	public static void main(String[] args) {

		Drawable cir = new Circle();
		Drawable rec = new Rectangle();

		cir.draw();
		rec.draw();
	}

}
