package com.sproutlemon.banana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "weixin_access_token")
public class WeixinAccessToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "access_token", length = 512, nullable = false)
	private String accessToken; // 接口调用凭证

	@Column(name = "expires_in")
	private int expiresIn; // access_token接口调用凭证超时时间，单位（秒）

	@Column(name = "refresh_token", length = 512)
	private String refreshToken;// 用户刷新access_token

	@Column(name = "open_id", length = 512)
	private String openId;// 授权用户唯一标识

	@Column(name = "scope", length = 512)
	private String scope;// 用户授权的作用域，使用逗号（,）分隔

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
