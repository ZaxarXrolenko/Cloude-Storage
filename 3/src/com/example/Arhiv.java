package com.example;

import android.util.Log;

public class Arhiv {
	private static final String TAG = "ArhivClass";
	public void SaveArhiv() {
		Log.d(TAG, "���������� ������ � ������");
		//���������� ������ � ������
	}
	public class CloudArhivFile {
		private static final String TAG = "CloudArhivClass";
		//������������� ������ � ������
		
		public void compresionfiles() {
			Log.d(TAG, "������ ������ � ����� � ������");
			//������ ������ � ����� ������
		}
	public void ArchivatedToCloud() {
		Log.d(TAG, "������������� ������ � ������");
		//������������� ������ � ������
		}
	public void SynchrovizationCloud() {
		Log.d(TAG, "������������� � �������");
		//������������� � �������
		}
	
	}
	
	public class ZipFiles {
		private static final String TAG = "ZipFilesClass";
		//�������� ������� ������
		
		public void CompressionFiles() {
			Log.d(TAG, "������ � ������������ �����");
			//������ � ������������ �����
		}
	}
	
	public class UnZipFiles{
		private static final String TAG = "UnZipFilesClass";
		//���������������� ������
		public void DecompressionFiles() {
			Log.d(TAG, "�������� �����");
			//�������� �����
		}
		public void SynchrovizationCloud() {
			Log.d(TAG, "������������� � �������");
			//������������� � �������
		}
	}
}