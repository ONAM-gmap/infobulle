package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.example.helper.*;
import com.example.model.*;

public class PointDao {

	private SQLiteDatabase database;
	private MySQLiteHelper dbHelper;
	private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
			MySQLiteHelper.COLUMN_X, MySQLiteHelper.COLUMN_Y };

	public PointDao(Context context) {
		dbHelper = new MySQLiteHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}

	public Point createPoint(Double x, Double y) {
		ContentValues values = new ContentValues();
		values.put(MySQLiteHelper.COLUMN_X, x);
		values.put(MySQLiteHelper.COLUMN_Y, y);
		long insertId = database.insert(MySQLiteHelper.TABLE_POINTS, null,
				values);
		Cursor cursor = database.query(MySQLiteHelper.TABLE_POINTS, allColumns,
				MySQLiteHelper.COLUMN_ID + " = " + insertId, null, null, null,
				null);
		cursor.moveToFirst();
		Point newPoint = cursorToPoint(cursor);
		cursor.close();
		System.out.println("("+newPoint.getX()+","+newPoint.getY()+")");
		return newPoint;
	}

	public void deletePoint(Point point) {
		long id = point.getId();
		System.out.println("Comment deleted with id: " + id);
		database.delete(MySQLiteHelper.TABLE_POINTS, MySQLiteHelper.COLUMN_ID
				+ " = " + id, null);
	}

	public List<Point> getAllPoints() {
		List<Point> points = new ArrayList<Point>();
		Cursor cursor = database.query(MySQLiteHelper.TABLE_POINTS, allColumns,
				null, null, null, null, null);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Point point = cursorToPoint(cursor);
			points.add(point);
			cursor.moveToNext();
		}
		cursor.close();
		return points;
	}

	private Point cursorToPoint(Cursor cursor) {
		Point point = new Point();
		point.setId(cursor.getLong(0));
		point.setX(cursor.getDouble(1));
		point.setY(cursor.getDouble(2));
		return point;
	}
}
