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
@MultiRequestBuilder.Tokenizer(DrmEntryContextPluginData.Tokenizer.class)
public class DrmEntryContextPluginData extends PluginData {
	
	public interface Tokenizer extends PluginData.Tokenizer {
		String flavorData();
	}

	/**
	 * For the uDRM we give the drm context data which is a json encoding of an array
	  containing the uDRM data      for each flavor that is required from this
	  getContextData request.
	 */
	private String flavorData;

	// flavorData:
	public String getFlavorData(){
		return this.flavorData;
	}
	public void setFlavorData(String flavorData){
		this.flavorData = flavorData;
	}

	public void flavorData(String multirequestToken){
		setToken("flavorData", multirequestToken);
	}


	public DrmEntryContextPluginData() {
		super();
	}

	public DrmEntryContextPluginData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorData = GsonParser.parseString(jsonObject.get("flavorData"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmEntryContextPluginData");
		kparams.add("flavorData", this.flavorData);
		return kparams;
	}


    public static final Creator<DrmEntryContextPluginData> CREATOR = new Creator<DrmEntryContextPluginData>() {
        @Override
        public DrmEntryContextPluginData createFromParcel(Parcel source) {
            return new DrmEntryContextPluginData(source);
        }

        @Override
        public DrmEntryContextPluginData[] newArray(int size) {
            return new DrmEntryContextPluginData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.flavorData);
    }

    public DrmEntryContextPluginData(Parcel in) {
        super(in);
        this.flavorData = in.readString();
    }
}

