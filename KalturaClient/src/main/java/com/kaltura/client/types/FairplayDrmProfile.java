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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(FairplayDrmProfile.Tokenizer.class)
public class FairplayDrmProfile extends DrmProfile {
	
	public interface Tokenizer extends DrmProfile.Tokenizer {
		String publicCertificate();
	}

	private String publicCertificate;

	// publicCertificate:
	public String getPublicCertificate(){
		return this.publicCertificate;
	}
	public void setPublicCertificate(String publicCertificate){
		this.publicCertificate = publicCertificate;
	}

	public void publicCertificate(String multirequestToken){
		setToken("publicCertificate", multirequestToken);
	}


	public FairplayDrmProfile() {
		super();
	}

	public FairplayDrmProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		publicCertificate = GsonParser.parseString(jsonObject.get("publicCertificate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFairplayDrmProfile");
		kparams.add("publicCertificate", this.publicCertificate);
		return kparams;
	}


    public static final Creator<FairplayDrmProfile> CREATOR = new Creator<FairplayDrmProfile>() {
        @Override
        public FairplayDrmProfile createFromParcel(Parcel source) {
            return new FairplayDrmProfile(source);
        }

        @Override
        public FairplayDrmProfile[] newArray(int size) {
            return new FairplayDrmProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.publicCertificate);
    }

    public FairplayDrmProfile(Parcel in) {
        super(in);
        this.publicCertificate = in.readString();
    }
}
