package _16.customconverter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {
	
		private String bookmarkURL;

		public String getBookmarkURL() {
			return bookmarkURL;
		}

		public void setBookmarkURL(String bookmarkURL) {
			this.bookmarkURL = bookmarkURL;
		}
		
		
}
