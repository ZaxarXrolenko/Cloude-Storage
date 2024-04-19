package com.example;

import android.util.Log;

public class Login {
	private static final String TAG = "LoginClass";
	String PassRand;

	public String Autgenerate(String authorization_code) {
		Log.d(TAG, "генерация кода для авторизации");
		return authorization_code;
	}
	
	public class Registration {
		private static final String TAG = "RagistrationClass";
		
		public void NewPassword () {
			Log.d(TAG, "Ввод нового пароля");
			//РВвод нового пароля
		}
		public void NewLogin () {
			Log.d(TAG, "Ввод нового логина");
			//Войти нового логина
		}
		public void SaveLogin () {
			Log.d(TAG, "Сохранение логина и пароля");
			//Сохранение логина и пароля
		}
	}
	
	public class Authorization{
		private static final String TAG = "AuthorizationClass";
		//регистрация пользователя
	
	public void EnterPass () {
		Log.d(TAG, "Ввод пароля");
		//Ввод пароля
	}
	public void EnterLogin () {
		Log.d(TAG, "Ввод логина");
		//Войти логина
	}
}
	public class LoginDirector {
		private static final String TAG = "LoginDirectorClass";
		
		public void EnterDirectorLogin() {
			Log.d(TAG, "ввести логин");
			//ввести логин
		}
		public void EnterDirectorPassword() {
			Log.d(TAG, "ввести пароль");
			//ввести пароль
		}
	}

	public class Forgoten {
		private static final String TAG = "ForgotenClass";

		Integer RecoverCode;
		String PhoneNumber;
		String Mail;
		public void ForgPass () {
			Log.d(TAG, "Забыли логин");
			//Забыли логин
		}
		public void ForgLogin () {
			Log.d(TAG, "Забыли пароль");
			//Забыли пароль
		}
		
		public void passrand () {
			Log.d(TAG, "Генерация кода");
			//Генерация кода
		}
		public void PhoneNumber () {
			Log.d(TAG, "Ввод номера телефона");
			//Ввод номера телефона
		}
		public void RecovingPassord () {
			Log.d(TAG, "Востановление пароля");
			//Востановление пароля
		}
		public void RecovingLogin () {
			Log.d(TAG, "Востановление логина");
			//Востановление логина
		}
		public String enterMail(String Mail) {
			Log.d(TAG, "Ввод почты");
			//Ввод почты
			return Mail;
		}
		public void SendMail() {
			Log.d(TAG, "Отправить на почту");
			//Отправить на почту
		}
		
	}

}
