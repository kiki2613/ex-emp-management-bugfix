package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前を入力してください")
	@Size(min = 1, max = 30, message = "名前は1文字以上30文字以内で入力してください")
	private String name;

	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください")
	@Size(min = 1, max = 127, message = "メールアドレスは1文字以上127文字以内で入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードを入力してください")
	@Size(min = 6, max = 40, message = "パスワードは6文字以上40文字以内で設定してください")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]+$", message = "パスワードは英字と数字を両方含む必要があります")
	private String password;

	/** 確認用パスワード */
	@NotBlank(message = "確認用のパスワードを入力してください")
	private String checkPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckPassword() {
		return checkPassword;
	}

	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}
}
