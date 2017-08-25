package com.dw.notification;

import java.util.List;

import com.dw.user.IUser;

public class Notification {
	IUser user;

	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<IFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<IFilter> filters) {
		this.filters = filters;
	}

	public Notification(String title, String content, IUser user) {
		this.title = title;
		this.content = content;
		this.user = user;
	}

	Metadata metadata;
	String title;
	String content;
	List<IFilter> filters;
}
