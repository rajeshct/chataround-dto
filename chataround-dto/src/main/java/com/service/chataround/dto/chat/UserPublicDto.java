package com.service.chataround.dto.chat;

import com.next.infotech.persistance.domain.UserDomain;
import com.next.infotech.persistance.domain.UserPublicDomain;

public class UserPublicDto implements UserPublicDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nickName;
	private Double longitude;
	private Double lattitude;
	private String statusMessage;
	public UserPublicDto(){
		
	}
	public UserPublicDto(UserPublicDomain user){
		this.nickName = user.getNickName();
		this.longitude = user.getLongitude();
		this.lattitude = user.getLattitude();
		this.statusMessage = user.getStatusMessage();
		this.id = user.getId();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLattitude() {
		return lattitude;
	}
	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	
}