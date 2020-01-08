// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2020  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlRecognizer.Tokenizer.class)
public class UrlRecognizer extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String hosts();
		String uriPrefix();
	}

	/**
	 * The hosts that are recognized
	 */
	private String hosts;
	/**
	 * The URI prefix we use for security
	 */
	private String uriPrefix;

	// hosts:
	public String getHosts(){
		return this.hosts;
	}
	public void setHosts(String hosts){
		this.hosts = hosts;
	}

	public void hosts(String multirequestToken){
		setToken("hosts", multirequestToken);
	}

	// uriPrefix:
	public String getUriPrefix(){
		return this.uriPrefix;
	}
	public void setUriPrefix(String uriPrefix){
		this.uriPrefix = uriPrefix;
	}

	public void uriPrefix(String multirequestToken){
		setToken("uriPrefix", multirequestToken);
	}


	public UrlRecognizer() {
		super();
	}

	public UrlRecognizer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hosts = GsonParser.parseString(jsonObject.get("hosts"));
		uriPrefix = GsonParser.parseString(jsonObject.get("uriPrefix"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlRecognizer");
		kparams.add("hosts", this.hosts);
		kparams.add("uriPrefix", this.uriPrefix);
		return kparams;
	}


    public static final Creator<UrlRecognizer> CREATOR = new Creator<UrlRecognizer>() {
        @Override
        public UrlRecognizer createFromParcel(Parcel source) {
            return new UrlRecognizer(source);
        }

        @Override
        public UrlRecognizer[] newArray(int size) {
            return new UrlRecognizer[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.hosts);
        dest.writeString(this.uriPrefix);
    }

    public UrlRecognizer(Parcel in) {
        super(in);
        this.hosts = in.readString();
        this.uriPrefix = in.readString();
    }
}

