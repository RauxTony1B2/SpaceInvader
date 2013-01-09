package fr.dubois.space.invader;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class Sprite {
	
	protected Bitmap bitmap;
	protected float x;
	protected float y;
	protected Paint paint;

	public Sprite(Bitmap bitmap,float x,float y) {
		this.bitmap = bitmap;
		this.x = x;
		this.y = y;
		paint = new Paint();
	}

	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, paint);
	}
	
	public RectF getBbox(){
		return new RectF(x,y,x+bitmap.getWidth()-1,y+bitmap.getHeight()-1); 
	}
	


	  public abstract void act();

	  

}
//Cr�er une classe Alien h�ritant de la classe Sprite, en d�finissant
//la m�thode act (qui est abstraite dans Sprite) et le constructeur. 
//Les versions cr��es par d�faut par eclipse sont suffisantes pour l�instant.

//Cr�ez un champ de type Alien dans la vue. 
//Ce champ sera initialis� dans la m�thode init()

//Dans la m�thode onDraw, demandez � l�alien de s�afficher sur le canevas (canvas).

//V�rifiez l�effet produit en consultant main.xml dans l��diteur graphique 
//(Si rien ne s�affiche, essayez de varier les coordonn�es. 
//En cas d�erreur dans l��diteur graphique, tentez de lancer l�application).

	/*public class Kame extends Sprite{
		kameView=init();
		
	}*/
	
