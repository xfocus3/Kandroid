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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MsnDistributionJobProviderData.Tokenizer.class)
public class MsnDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String xml();
	}

	private String xml;

	// xml:
	public String getXml(){
		return this.xml;
	}
	public void setXml(String xml){
		this.xml = xml;
	}

	public void xml(String multirequestToken){
		setToken("xml", multirequestToken);
	}


	public MsnDistributionJobProviderData() {
		super();
	}

	public MsnDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xml = GsonParser.parseString(jsonObject.get("xml"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMsnDistributionJobProviderData");
		kparams.add("xml", this.xml);
		return kparams;
	}


    public static final Creator<MsnDistributionJobProviderData> CREATOR = new Creator<MsnDistributionJobProviderData>() {
        @Override
        public MsnDistributionJobProviderData createFromParcel(Parcel source) {
            return new MsnDistributionJobProviderData(source);
        }

        @Override
        public MsnDistributionJobProviderData[] newArray(int size) {
            return new MsnDistributionJobProviderData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.xml);
    }

    public MsnDistributionJobProviderData(Parcel in) {
        super(in);
        this.xml = in.readString();
    }
}

