package com.example;

import android.util.Log;

public class Operation {
	private  static final String TAG = "OperationClass";

public class UpLoadFiles {
	private static final String TAG = "UpLoadClass";
	//загрузка файлов
	
	public void ChangeFiles() {
	Log.d(TAG, "Выбор данных");
	//Выбор данных
	}
	public void CloudSynch() {
		Log.d(TAG, "Синхронизация с облаком");
		//Синхронизация с облаком
	}
	public void FileFormat() {
		Log.d(TAG, "Установка фораматов файлов");
		//Установка фораматов файлов
	}
	public void SaveToCloud() {
		Log.d(TAG, "Сохранение файлов в облако");
		//Сохранение файлов в облако
	}
	
}

public class DeleteFile {
	private static final String TAG = "DeleteClass";
	//Удаление файлов
	
	
	public void ChangeFiles() {
	Log.d(TAG, "Выбор данных");
	//Выбор данных
	}
	public void CloudSynch() {
		Log.d(TAG, "Синхронизация с облаком");
		//Синхронизация с облаком
	}
	public void DeleteFiles() {
		Log.d(TAG, "Удаление файлов");
		//Удаление файлов
	}
}
}
