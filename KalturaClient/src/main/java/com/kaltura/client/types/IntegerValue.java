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

/**
 * An int representation to return an array of ints
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IntegerValue.Tokenizer.class)
public class IntegerValue extends Value {
	
	public interface Tokenizer extends Value.Tokenizer {
		String value();
	}

	private Integer value;

	// value:
	public Integer getValue(){
		return this.value;
	}
	public void setValue(Integer value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public IntegerValue() {
		super();
	}

	public IntegerValue(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		value = GsonParser.parseInt(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIntegerValue");
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<IntegerValue> CREATOR = new Creator<IntegerValue>() {
        @Override
        public IntegerValue createFromParcel(Parcel source) {
            return new IntegerValue(source);
        }

        @Override
        public IntegerValue[] newArray(int size) {
            return new IntegerValue[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.value);
    }

    public IntegerValue(Parcel in) {
        super(in);
        this.value = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

