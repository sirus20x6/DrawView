/**
 * 
 */
package edu.niu.cs.shelhamer.aaron.drawview;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author z1757807
 *
 */
public class MyView extends View {
	
	private Paint p = new Paint();
	private Path myPath = new Path();
	Canvas mycan;
	/**
	 * @param context
	 */
	public MyView(Context context) {
		super(context);
		p.setAntiAlias(true);
		p.setStrokeWidth(2.3f);
		p.setStyle(Paint.Style.STROKE);
		p.setColor(Color.BLUE);
		p.setStrokeJoin(Paint.Join.ROUND);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public MyView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		canvas.drawPath(myPath, p);
		mycan = canvas;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event){
		float eventX = event.getX();
		float eventY = event.getY();
		switch (event.getAction()){
		case MotionEvent.ACTION_DOWN:
			myPath.moveTo(eventX, eventY);
			return true;
		case MotionEvent.ACTION_MOVE:
			myPath.lineTo(eventX,eventY);
			invalidate();
			return true;
		case MotionEvent.ACTION_UP:
			myPath.addCircle(eventX, eventY, 2.5f, Path.Direction.CCW);
			//mycan.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
			//invalidate();
			break;
		default:
			return false;
		}
		invalidate();
		return true;
	}
	

}
