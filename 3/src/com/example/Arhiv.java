package com.example;

import android.util.Log;

public class Arhiv {
	private static final String TAG = "ArhivClass";
	public void SaveArhiv() {
		Log.d(TAG, "Сохранение архива в облако");
		//сохранение архива в облако
	}
	public class CloudArhivFile {
		private static final String TAG = "CloudArhivClass";
		//Архивирование данных в облако
		
		public void compresionfiles() {
			Log.d(TAG, "Сжатие данных в архив в облако");
			//сжатие данных в архив облако
		}
	public void ArchivatedToCloud() {
		Log.d(TAG, "Архивирование данных в облако");
		//архивирование данных в облако
		}
	public void SynchrovizationCloud() {
		Log.d(TAG, "Синхронизация с облаком");
		//Синхронизация с облаком
		}
	
	}
	
	public class ZipFiles {
		private static final String TAG = "ZipFilesClass";
		//создание сжатого архива
		
		public void CompressionFiles() {
			Log.d(TAG, "Сжатие в определенный архив");
			//сжатие в определенный архив
		}
	}
	
	public class UnZipFiles{
		private static final String TAG = "UnZipFilesClass";
		//Разархевирование архива
		public void DecompressionFiles() {
			Log.d(TAG, "Разжатие файла");
			//разжатие файла
		}
		public void SynchrovizationCloud() {
			Log.d(TAG, "Синхронизация с облаком");
			//синхронизация с облаком
		}
	}
}