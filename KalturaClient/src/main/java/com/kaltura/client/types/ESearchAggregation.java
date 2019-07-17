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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchAggregation.Tokenizer.class)
public class ESearchAggregation extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<ESearchAggregationItem.Tokenizer> aggregations();
	}

	private List<ESearchAggregationItem> aggregations;

	// aggregations:
	public List<ESearchAggregationItem> getAggregations(){
		return this.aggregations;
	}
	public void setAggregations(List<ESearchAggregationItem> aggregations){
		this.aggregations = aggregations;
	}


	public ESearchAggregation() {
		super();
	}

	public ESearchAggregation(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		aggregations = GsonParser.parseArray(jsonObject.getAsJsonArray("aggregations"), ESearchAggregationItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchAggregation");
		kparams.add("aggregations", this.aggregations);
		return kparams;
	}


    public static final Creator<ESearchAggregation> CREATOR = new Creator<ESearchAggregation>() {
        @Override
        public ESearchAggregation createFromParcel(Parcel source) {
            return new ESearchAggregation(source);
        }

        @Override
        public ESearchAggregation[] newArray(int size) {
            return new ESearchAggregation[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.aggregations != null) {
            dest.writeInt(this.aggregations.size());
            dest.writeList(this.aggregations);
        } else {
            dest.writeInt(-1);
        }
    }

    public ESearchAggregation(Parcel in) {
        super(in);
        int aggregationsSize = in.readInt();
        if( aggregationsSize > -1) {
            this.aggregations = new ArrayList<>();
            in.readList(this.aggregations, ESearchAggregationItem.class.getClassLoader());
        }
    }
}

