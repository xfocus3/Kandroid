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
@MultiRequestBuilder.Tokenizer(ReportFilter.Tokenizer.class)
public class ReportFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String dimension();
		String values();
	}

	/**
	 * The dimension whose values should be filtered
	 */
	private String dimension;
	/**
	 * The (comma separated) values to include in the filter
	 */
	private String values;

	// dimension:
	public String getDimension(){
		return this.dimension;
	}
	public void setDimension(String dimension){
		this.dimension = dimension;
	}

	public void dimension(String multirequestToken){
		setToken("dimension", multirequestToken);
	}

	// values:
	public String getValues(){
		return this.values;
	}
	public void setValues(String values){
		this.values = values;
	}

	public void values(String multirequestToken){
		setToken("values", multirequestToken);
	}


	public ReportFilter() {
		super();
	}

	public ReportFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dimension = GsonParser.parseString(jsonObject.get("dimension"));
		values = GsonParser.parseString(jsonObject.get("values"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportFilter");
		kparams.add("dimension", this.dimension);
		kparams.add("values", this.values);
		return kparams;
	}


    public static final Creator<ReportFilter> CREATOR = new Creator<ReportFilter>() {
        @Override
        public ReportFilter createFromParcel(Parcel source) {
            return new ReportFilter(source);
        }

        @Override
        public ReportFilter[] newArray(int size) {
            return new ReportFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.dimension);
        dest.writeString(this.values);
    }

    public ReportFilter(Parcel in) {
        super(in);
        this.dimension = in.readString();
        this.values = in.readString();
    }
}

