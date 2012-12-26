/*
 * #%L
 * TESB :: Examples :: Locator Rest Client
 * %%
 * Copyright (C) 2011 - 2012 Talend Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package demo.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stringwrapper")
public class StringWrapper {
	
	String source;
	String consonants;
	String vowels;

	public String getSource() {
		return source;
	}

	@XmlElement
	public void setSource(String source) {
		this.source = source;
	}

	
	public String getConsonants() {
		return consonants;
	}

	@XmlElement
	public void setConsonants(String source) {
		this.consonants = StringWrapper.getConsonants(source);
	}

	public String getVowels() {
		return vowels;
	}

	@XmlElement
	public void setVowels(String source) {
		this.vowels = StringWrapper.getVowels(source);
	}
	
	public StringWrapper() {
		super();
	}
	
	public StringWrapper(String source) {
		super();
		this.source = source;
		this.consonants = StringWrapper.getConsonants(source);
		this.vowels = StringWrapper.getVowels(source);
	}

	public static boolean isVowel(char arg) {
		Pattern p = Pattern.compile("[aeiouy]");
		Matcher m = p.matcher(Character.toString(arg).toLowerCase());
		return m.matches();
	}

	public static String getVowels(String arg) {
		String tempStr = "";
		char[] tempChar = arg.toCharArray();
		for (char c : tempChar) {
			if (isVowel(c)) {
				tempStr += c;
			}
		}
		return tempStr;
	}

	public static String getConsonants(String arg) {
		String tempStr = "";
		char[] tempChar = arg.toCharArray();
		for (char c : tempChar) {
			if (!isVowel(c)) {
				tempStr += c;
			}
		}
		return tempStr;
	}
	
	
}
