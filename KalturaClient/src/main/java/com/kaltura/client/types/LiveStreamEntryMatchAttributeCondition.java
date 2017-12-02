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
import com.kaltura.client.enums.LiveStreamEntryMatchAttribute;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Auto-generated class.  Used to search KalturaLiveStreamEntry attributes. Use
  KalturaLiveStreamEntryMatchAttribute enum to provide attribute name. /
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamEntryMatchAttributeCondition.Tokenizer.class)
public class LiveStreamEntryMatchAttributeCondition extends SearchMatchAttributeCondition {
	
	public interface Tokenizer extends SearchMatchAttributeCondition.Tokenizer {
		String attribute();
	}

	private LiveStreamEntryMatchAttribute attribute;

	// attribute:
	public LiveStreamEntryMatchAttribute getAttribute(){
		return this.attribute;
	}
	public void setAttribute(LiveStreamEntryMatchAttribute attribute){
		this.attribute = attribute;
	}

	public void attribute(String multirequestToken){
		setToken("attribute", multirequestToken);
	}


	public LiveStreamEntryMatchAttributeCondition() {
		super();
	}

	public LiveStreamEntryMatchAttributeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		attribute = LiveStreamEntryMatchAttribute.get(GsonParser.parseString(jsonObject.get("attribute")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamEntryMatchAttributeCondition");
		kparams.add("attribute", this.attribute);
		return kparams;
	}


    public static final Creator<LiveStreamEntryMatchAttributeCondition> CREATOR = new Creator<LiveStreamEntryMatchAttributeCondition>() {
        @Override
        public LiveStreamEntryMatchAttributeCondition createFromParcel(Parcel source) {
            return new LiveStreamEntryMatchAttributeCondition(source);
        }

        @Override
        public LiveStreamEntryMatchAttributeCondition[] newArray(int size) {
            return new LiveStreamEntryMatchAttributeCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.attribute == null ? -1 : this.attribute.ordinal());
    }

    public LiveStreamEntryMatchAttributeCondition(Parcel in) {
        super(in);
        int tmpAttribute = in.readInt();
        this.attribute = tmpAttribute == -1 ? null : LiveStreamEntryMatchAttribute.values()[tmpAttribute];
    }
}
