package com.issueanalysis.documentation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class NotificationEmail {
	 private String subject;
	    private String recipient;
	    private String body;
}
