package com.example;

import android.util.Log;

public class Login {
	private static final String TAG = "LoginClass";
	String PassRand;

	public String Autgenerate(String authorization_code) {
		Log.d(TAG, "��������� ���� ��� �����������");
		return authorization_code;
	}
	
	public class Registration {
		private static final String TAG = "RagistrationClass";
		
		public void NewPassword () {
			Log.d(TAG, "���� ������ ������");
			//����� ������ ������
		}
		public void NewLogin () {
			Log.d(TAG, "���� ������ ������");
			//����� ������ ������
		}
		public void SaveLogin () {
			Log.d(TAG, "���������� ������ � ������");
			//���������� ������ � ������
		}
	}
	
	public class Authorization{
		private static final String TAG = "AuthorizationClass";
		//����������� ������������
	
	public void EnterPass () {
		Log.d(TAG, "���� ������");
		//���� ������
	}
	public void EnterLogin () {
		Log.d(TAG, "���� ������");
		//����� ������
	}
}
	public class LoginDirector {
		private static final String TAG = "LoginDirectorClass";
		
		public void EnterDirectorLogin() {
			Log.d(TAG, "������ �����");
			//������ �����
		}
		public void EnterDirectorPassword() {
			Log.d(TAG, "������ ������");
			//������ ������
		}
	}

	public class Forgoten {
		private static final String TAG = "ForgotenClass";

		Integer RecoverCode;
		String PhoneNumber;
		String Mail;
		public void ForgPass () {
			Log.d(TAG, "������ �����");
			//������ �����
		}
		public void ForgLogin () {
			Log.d(TAG, "������ ������");
			//������ ������
		}
		
		public void passrand () {
			Log.d(TAG, "��������� ����");
			//��������� ����
		}
		public void PhoneNumber () {
			Log.d(TAG, "���� ������ ��������");
			//���� ������ ��������
		}
		public void RecovingPassord () {
			Log.d(TAG, "������������� ������");
			//������������� ������
		}
		public void RecovingLogin () {
			Log.d(TAG, "������������� ������");
			//������������� ������
		}
		public String enterMail(String Mail) {
			Log.d(TAG, "���� �����");
			//���� �����
			return Mail;
		}
		public void SendMail() {
			Log.d(TAG, "��������� �� �����");
			//��������� �� �����
		}
		
	}

}
