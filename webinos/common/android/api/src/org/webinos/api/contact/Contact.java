/*******************************************************************************
*  Code contributed to the webinos project
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*  
*     http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
* Copyright 2011 Istituto Superiore Mario Boella (ISMB)
******************************************************************************/

package org.webinos.api.contact;

import java.util.Date;

import org.meshpoint.anode.bridge.Env;
import org.meshpoint.anode.java.Base;

public class Contact extends Base {
	private static short classId = Env.getInterfaceId(Contact.class);
	protected Contact() { super(classId); }

    public String id;
    public String displayName;
    public ContactName name;
    public String nickname;
    public ContactField[] phoneNumbers;
    public ContactField[] emails;
    public ContactAddress[] addresses;
    public ContactField[] ims;
    public ContactOrganization[] organizations;
    public Date revision;
    public Date birthday;
    public String gender;
    public String note;
    public ContactField[] photos;
    public String[] categories;
    public ContactField[] urls;
    public String timezone;
}
