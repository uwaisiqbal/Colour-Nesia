package com.colournesia;

import android.content.Context;
import android.graphics.Rect;

public class TwoRectangleShapeView extends ShapeView {

	private static final int VIEW_ID = 3;
	int NO_OF_RECT = 2;
	private Rect[] rect = new Rect[NO_OF_RECT];

	public TwoRectangleShapeView(Context context, PaintManager paintManager) {
		super(context, VIEW_ID, paintManager);

	}

	private int w, h;

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
		this.w = w;
		this.h = h;
		rect[0] = new Rect(w / 8, h / 8, w * 3 / 8, h * 7 / 8);
		rect[1] = new Rect(w * 5 / 8, h / 8, w * 7 / 8, h * 7 / 8);
		setRect(rect);

	}

}
