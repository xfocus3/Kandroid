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
@MultiRequestBuilder.Tokenizer(QuizUserEntry.Tokenizer.class)
public class QuizUserEntry extends UserEntry {
	
	public interface Tokenizer extends UserEntry.Tokenizer {
		String score();
		String calculatedScore();
		String feedback();
		String version();
	}

	private Double score;
	private Double calculatedScore;
	private String feedback;
	private Integer version;

	// score:
	public Double getScore(){
		return this.score;
	}
	// calculatedScore:
	public Double getCalculatedScore(){
		return this.calculatedScore;
	}
	// feedback:
	public String getFeedback(){
		return this.feedback;
	}
	public void setFeedback(String feedback){
		this.feedback = feedback;
	}

	public void feedback(String multirequestToken){
		setToken("feedback", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}

	public QuizUserEntry() {
		super();
	}

	public QuizUserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		score = GsonParser.parseDouble(jsonObject.get("score"));
		calculatedScore = GsonParser.parseDouble(jsonObject.get("calculatedScore"));
		feedback = GsonParser.parseString(jsonObject.get("feedback"));
		version = GsonParser.parseInt(jsonObject.get("version"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuizUserEntry");
		kparams.add("feedback", this.feedback);
		return kparams;
	}


    public static final Creator<QuizUserEntry> CREATOR = new Creator<QuizUserEntry>() {
        @Override
        public QuizUserEntry createFromParcel(Parcel source) {
            return new QuizUserEntry(source);
        }

        @Override
        public QuizUserEntry[] newArray(int size) {
            return new QuizUserEntry[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.score);
        dest.writeValue(this.calculatedScore);
        dest.writeString(this.feedback);
        dest.writeValue(this.version);
    }

    public QuizUserEntry(Parcel in) {
        super(in);
        this.score = (Double)in.readValue(Double.class.getClassLoader());
        this.calculatedScore = (Double)in.readValue(Double.class.getClassLoader());
        this.feedback = in.readString();
        this.version = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

