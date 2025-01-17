package article.service;

import java.util.Map;

import article.model.Writer;

public class WriteRequest {

		private Writer writer;
		private String title;
		private String content;
		
		
		
		
		
		
		public WriteRequest(Writer writer, String title, String content) {
			super();
			this.writer = writer;
			this.title = title;
			this.content = content;
		}






		public Writer getWriter() {
			return writer;
		}






		public void setWriter(Writer writer) {
			this.writer = writer;
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






		public void validate(Map<String, Boolean> errors) {
			if(title == null || title.trim().isEmpty()) {
				errors.put("title", Boolean.TRUE);
			}
		}
}
