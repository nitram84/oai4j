/*
 * Copyright 2008 National Library of Sweden 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0 
 *  
 * Unless required by applicable law or agreed to in writing, software 
 * distributed  under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package se.kb.oai.ore;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.dom4j.Element;

import se.kb.oai.OAIException;

public interface ResourceMapFactory {

	public ResourceMap newResourceMap(String uri) throws URISyntaxException;
	
	public ResourceMap newResourceMap(URI uri);
	
	public ResourceMap getResourceMap(URL url) throws OAIException;
	
	public ResourceMap getResourceMap(String url) throws OAIException;
	
	public ResourceMap getResourceMap(Element root) throws OAIException;
}