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
import com.kaltura.client.enums.SiteRestrictionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SiteRestriction.Tokenizer.class)
public class SiteRestriction extends BaseRestriction {
	
	public interface Tokenizer extends BaseRestriction.Tokenizer {
		String siteRestrictionType();
		String siteList();
	}

	/**
	 * The site restriction type (allow or deny)
	 */
	private SiteRestrictionType siteRestrictionType;
	/**
	 * Comma separated list of sites (domains) to allow or deny
	 */
	private String siteList;

	// siteRestrictionType:
	public SiteRestrictionType getSiteRestrictionType(){
		return this.siteRestrictionType;
	}
	public void setSiteRestrictionType(SiteRestrictionType siteRestrictionType){
		this.siteRestrictionType = siteRestrictionType;
	}

	public void siteRestrictionType(String multirequestToken){
		setToken("siteRestrictionType", multirequestToken);
	}

	// siteList:
	public String getSiteList(){
		return this.siteList;
	}
	public void setSiteList(String siteList){
		this.siteList = siteList;
	}

	public void siteList(String multirequestToken){
		setToken("siteList", multirequestToken);
	}


	public SiteRestriction() {
		super();
	}

	public SiteRestriction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		siteRestrictionType = SiteRestrictionType.get(GsonParser.parseInt(jsonObject.get("siteRestrictionType")));
		siteList = GsonParser.parseString(jsonObject.get("siteList"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSiteRestriction");
		kparams.add("siteRestrictionType", this.siteRestrictionType);
		kparams.add("siteList", this.siteList);
		return kparams;
	}


    public static final Creator<SiteRestriction> CREATOR = new Creator<SiteRestriction>() {
        @Override
        public SiteRestriction createFromParcel(Parcel source) {
            return new SiteRestriction(source);
        }

        @Override
        public SiteRestriction[] newArray(int size) {
            return new SiteRestriction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.siteRestrictionType == null ? -1 : this.siteRestrictionType.ordinal());
        dest.writeString(this.siteList);
    }

    public SiteRestriction(Parcel in) {
        super(in);
        int tmpSiteRestrictionType = in.readInt();
        this.siteRestrictionType = tmpSiteRestrictionType == -1 ? null : SiteRestrictionType.values()[tmpSiteRestrictionType];
        this.siteList = in.readString();
    }
}

