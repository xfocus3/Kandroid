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
import com.kaltura.client.types.PlayReadyPolicy;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlayReadyLicenseDetails.Tokenizer.class)
public class PlayReadyLicenseDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		PlayReadyPolicy.Tokenizer policy();
		String beginDate();
		String expirationDate();
		String removalDate();
	}

	/**
	 * PlayReady policy object
	 */
	private PlayReadyPolicy policy;
	/**
	 * License begin date
	 */
	private Integer beginDate;
	/**
	 * License expiration date
	 */
	private Integer expirationDate;
	/**
	 * License removal date
	 */
	private Integer removalDate;

	// policy:
	public PlayReadyPolicy getPolicy(){
		return this.policy;
	}
	public void setPolicy(PlayReadyPolicy policy){
		this.policy = policy;
	}

	// beginDate:
	public Integer getBeginDate(){
		return this.beginDate;
	}
	public void setBeginDate(Integer beginDate){
		this.beginDate = beginDate;
	}

	public void beginDate(String multirequestToken){
		setToken("beginDate", multirequestToken);
	}

	// expirationDate:
	public Integer getExpirationDate(){
		return this.expirationDate;
	}
	public void setExpirationDate(Integer expirationDate){
		this.expirationDate = expirationDate;
	}

	public void expirationDate(String multirequestToken){
		setToken("expirationDate", multirequestToken);
	}

	// removalDate:
	public Integer getRemovalDate(){
		return this.removalDate;
	}
	public void setRemovalDate(Integer removalDate){
		this.removalDate = removalDate;
	}

	public void removalDate(String multirequestToken){
		setToken("removalDate", multirequestToken);
	}


	public PlayReadyLicenseDetails() {
		super();
	}

	public PlayReadyLicenseDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		policy = GsonParser.parseObject(jsonObject.getAsJsonObject("policy"), PlayReadyPolicy.class);
		beginDate = GsonParser.parseInt(jsonObject.get("beginDate"));
		expirationDate = GsonParser.parseInt(jsonObject.get("expirationDate"));
		removalDate = GsonParser.parseInt(jsonObject.get("removalDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayReadyLicenseDetails");
		kparams.add("policy", this.policy);
		kparams.add("beginDate", this.beginDate);
		kparams.add("expirationDate", this.expirationDate);
		kparams.add("removalDate", this.removalDate);
		return kparams;
	}


    public static final Creator<PlayReadyLicenseDetails> CREATOR = new Creator<PlayReadyLicenseDetails>() {
        @Override
        public PlayReadyLicenseDetails createFromParcel(Parcel source) {
            return new PlayReadyLicenseDetails(source);
        }

        @Override
        public PlayReadyLicenseDetails[] newArray(int size) {
            return new PlayReadyLicenseDetails[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.policy, flags);
        dest.writeValue(this.beginDate);
        dest.writeValue(this.expirationDate);
        dest.writeValue(this.removalDate);
    }

    public PlayReadyLicenseDetails(Parcel in) {
        super(in);
        this.policy = in.readParcelable(PlayReadyPolicy.class.getClassLoader());
        this.beginDate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.expirationDate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.removalDate = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

