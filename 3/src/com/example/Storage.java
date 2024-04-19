package com.example;

	import android.util.Log;
	public class Storage {
	private static final String TAG = "storageClass";

	public void SaveStorage() {
		Log.d(TAG, "���������� ���������");
		//���������� ������ � ���� ������
		DataCollection();
		RefreshStorage();
	}
	public void RefreshStorage() {
		Log.d(TAG, "���������� ���������");
		//���������� ���������
	}

	public void DataCollection() {
		Log.d(TAG, "���� ������ �� ���� ��������");
		//���� ������ �� ���� ��������
	}

	public class DataBase {
		private static final String TAG = "DataBaseClass";
		
		//���� ������
		public void ImportDB() {
			Log.d(TAG, "�������������� ���� ������");
			//�������������� ���� ������
		}
		
		public void RefreshDataBase() {
			Log.d(TAG, "���������� ���� ������");
			//���������� ���� ������
		}
		
		public void DeleteDataBase() {
			Log.d(TAG, "�������� ���� ������");
			//�������� ����������
			RefreshDataBase();
		}
		
		public void EditDataBase() {
			Log.d(TAG, "�������������� ���� ������");
			//�������������� ���� ������
			RefreshDataBase();
		}
	}

	public class Cloud {
		private static final String TAG = "CloudClass";
		
		//�������� ���������
		public void RefreshCloud() {
			Log.d(TAG, "���������� ��������� ���������");
			//���������� ���� ������
		}
		public void SaveToCloud() {
			Log.d(TAG, "���������� ������ � ������");
			//���������� ������ � ������
			RefreshCloud();
		}
	}
}