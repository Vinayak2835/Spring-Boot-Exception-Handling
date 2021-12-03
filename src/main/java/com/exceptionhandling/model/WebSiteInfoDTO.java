package com.exceptionhandling.model;

public class WebSiteInfoDTO {

	private String webSiteName;

	private String webSiteCategory;

	public WebSiteInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWebSiteName() {
		return webSiteName;
	}

	public String getWebSiteCategory() {
		return webSiteCategory;
	}

	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}

	public void setWebSiteCategory(String webSiteCategory) {
		this.webSiteCategory = webSiteCategory;
	}

	@Override
	public String toString() {
		return "WebSiteInfoDTO [webSiteName=" + webSiteName + ", webSiteCategory=" + webSiteCategory + "]";
	}

}
