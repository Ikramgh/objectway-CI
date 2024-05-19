package com.example.customkeywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.example.customkeywords.GenerateRandomNumberAndAppendToURLKeyword as CustomKeyword
//CustomKeyword customKeyword = new CustomKeyword()
public class GenerateRandomNumberAndAppendToURLKeyword {

	@Keyword
	public void appendRandomNumberToURL(String baseUrl) {
		// Generate a random number
		def randomNumber = Math.floor(Math.random() * 1000000)

		// Append the random number to the base URL
		def  url = baseUrl + "#" + randomNumber

		// Redirect to the new URL using JavaScript
		WebUI.executeJavaScript("window.location.href = '" + url + "'", null)
	}
}
