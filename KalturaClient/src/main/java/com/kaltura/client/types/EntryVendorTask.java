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
import com.kaltura.client.enums.EntryVendorTaskCreationMode;
import com.kaltura.client.enums.EntryVendorTaskStatus;
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.VendorTaskData;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryVendorTask.Tokenizer.class)
public class EntryVendorTask extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String vendorPartnerId();
		String createdAt();
		String updatedAt();
		String queueTime();
		String finishTime();
		String entryId();
		String status();
		String reachProfileId();
		String catalogItemId();
		String price();
		String userId();
		String moderatingUser();
		String errDescription();
		String accessKey();
		String version();
		String notes();
		String dictionary();
		String context();
		String accuracy();
		String outputObjectId();
		String partnerData();
		String creationMode();
		VendorTaskData.Tokenizer taskJobData();
		String expectedFinishTime();
		String serviceType();
		String serviceFeature();
	}

	private Long id;
	private Integer partnerId;
	private Integer vendorPartnerId;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer queueTime;
	private Integer finishTime;
	private String entryId;
	private EntryVendorTaskStatus status;
	/**
	 * The profile id from which this task base config is taken from
	 */
	private Integer reachProfileId;
	/**
	 * The catalog item Id containing the task description
	 */
	private Integer catalogItemId;
	/**
	 * The charged price to execute this task
	 */
	private Double price;
	/**
	 * The ID of the user who created this task
	 */
	private String userId;
	/**
	 * The user ID that approved this task for execution (in case moderation is
	  requested)
	 */
	private String moderatingUser;
	/**
	 * Err description provided by provider in case job execution has failed
	 */
	private String errDescription;
	/**
	 * Access key generated by Kaltura to allow vendors to ingest the end result to the
	  destination
	 */
	private String accessKey;
	/**
	 * Vendor generated by Kaltura representing the entry vendor task version
	  correlated to the entry version
	 */
	private String version;
	/**
	 * User generated notes that should be taken into account by the vendor while
	  executing the task
	 */
	private String notes;
	private String dictionary;
	/**
	 * Task context
	 */
	private String context;
	/**
	 * Task result accuracy percentage
	 */
	private Integer accuracy;
	/**
	 * Task main object generated by executing the task
	 */
	private String outputObjectId;
	/**
	 * Json object containing extra task data required by the requester
	 */
	private String partnerData;
	/**
	 * Task creation mode
	 */
	private EntryVendorTaskCreationMode creationMode;
	private VendorTaskData taskJobData;
	private Integer expectedFinishTime;
	private VendorServiceType serviceType;
	private VendorServiceFeature serviceFeature;

	// id:
	public Long getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// vendorPartnerId:
	public Integer getVendorPartnerId(){
		return this.vendorPartnerId;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// queueTime:
	public Integer getQueueTime(){
		return this.queueTime;
	}
	// finishTime:
	public Integer getFinishTime(){
		return this.finishTime;
	}
	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// status:
	public EntryVendorTaskStatus getStatus(){
		return this.status;
	}
	public void setStatus(EntryVendorTaskStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// reachProfileId:
	public Integer getReachProfileId(){
		return this.reachProfileId;
	}
	public void setReachProfileId(Integer reachProfileId){
		this.reachProfileId = reachProfileId;
	}

	public void reachProfileId(String multirequestToken){
		setToken("reachProfileId", multirequestToken);
	}

	// catalogItemId:
	public Integer getCatalogItemId(){
		return this.catalogItemId;
	}
	public void setCatalogItemId(Integer catalogItemId){
		this.catalogItemId = catalogItemId;
	}

	public void catalogItemId(String multirequestToken){
		setToken("catalogItemId", multirequestToken);
	}

	// price:
	public Double getPrice(){
		return this.price;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	// moderatingUser:
	public String getModeratingUser(){
		return this.moderatingUser;
	}
	// errDescription:
	public String getErrDescription(){
		return this.errDescription;
	}
	public void setErrDescription(String errDescription){
		this.errDescription = errDescription;
	}

	public void errDescription(String multirequestToken){
		setToken("errDescription", multirequestToken);
	}

	// accessKey:
	public String getAccessKey(){
		return this.accessKey;
	}
	// version:
	public String getVersion(){
		return this.version;
	}
	// notes:
	public String getNotes(){
		return this.notes;
	}
	public void setNotes(String notes){
		this.notes = notes;
	}

	public void notes(String multirequestToken){
		setToken("notes", multirequestToken);
	}

	// dictionary:
	public String getDictionary(){
		return this.dictionary;
	}
	// context:
	public String getContext(){
		return this.context;
	}
	public void setContext(String context){
		this.context = context;
	}

	public void context(String multirequestToken){
		setToken("context", multirequestToken);
	}

	// accuracy:
	public Integer getAccuracy(){
		return this.accuracy;
	}
	public void setAccuracy(Integer accuracy){
		this.accuracy = accuracy;
	}

	public void accuracy(String multirequestToken){
		setToken("accuracy", multirequestToken);
	}

	// outputObjectId:
	public String getOutputObjectId(){
		return this.outputObjectId;
	}
	public void setOutputObjectId(String outputObjectId){
		this.outputObjectId = outputObjectId;
	}

	public void outputObjectId(String multirequestToken){
		setToken("outputObjectId", multirequestToken);
	}

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// creationMode:
	public EntryVendorTaskCreationMode getCreationMode(){
		return this.creationMode;
	}
	// taskJobData:
	public VendorTaskData getTaskJobData(){
		return this.taskJobData;
	}
	public void setTaskJobData(VendorTaskData taskJobData){
		this.taskJobData = taskJobData;
	}

	// expectedFinishTime:
	public Integer getExpectedFinishTime(){
		return this.expectedFinishTime;
	}
	// serviceType:
	public VendorServiceType getServiceType(){
		return this.serviceType;
	}
	// serviceFeature:
	public VendorServiceFeature getServiceFeature(){
		return this.serviceFeature;
	}

	public EntryVendorTask() {
		super();
	}

	public EntryVendorTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		vendorPartnerId = GsonParser.parseInt(jsonObject.get("vendorPartnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		queueTime = GsonParser.parseInt(jsonObject.get("queueTime"));
		finishTime = GsonParser.parseInt(jsonObject.get("finishTime"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		status = EntryVendorTaskStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		reachProfileId = GsonParser.parseInt(jsonObject.get("reachProfileId"));
		catalogItemId = GsonParser.parseInt(jsonObject.get("catalogItemId"));
		price = GsonParser.parseDouble(jsonObject.get("price"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		moderatingUser = GsonParser.parseString(jsonObject.get("moderatingUser"));
		errDescription = GsonParser.parseString(jsonObject.get("errDescription"));
		accessKey = GsonParser.parseString(jsonObject.get("accessKey"));
		version = GsonParser.parseString(jsonObject.get("version"));
		notes = GsonParser.parseString(jsonObject.get("notes"));
		dictionary = GsonParser.parseString(jsonObject.get("dictionary"));
		context = GsonParser.parseString(jsonObject.get("context"));
		accuracy = GsonParser.parseInt(jsonObject.get("accuracy"));
		outputObjectId = GsonParser.parseString(jsonObject.get("outputObjectId"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		creationMode = EntryVendorTaskCreationMode.get(GsonParser.parseInt(jsonObject.get("creationMode")));
		taskJobData = GsonParser.parseObject(jsonObject.getAsJsonObject("taskJobData"), VendorTaskData.class);
		expectedFinishTime = GsonParser.parseInt(jsonObject.get("expectedFinishTime"));
		serviceType = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceType")));
		serviceFeature = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeature")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryVendorTask");
		kparams.add("entryId", this.entryId);
		kparams.add("status", this.status);
		kparams.add("reachProfileId", this.reachProfileId);
		kparams.add("catalogItemId", this.catalogItemId);
		kparams.add("errDescription", this.errDescription);
		kparams.add("notes", this.notes);
		kparams.add("context", this.context);
		kparams.add("accuracy", this.accuracy);
		kparams.add("outputObjectId", this.outputObjectId);
		kparams.add("partnerData", this.partnerData);
		kparams.add("taskJobData", this.taskJobData);
		return kparams;
	}


    public static final Creator<EntryVendorTask> CREATOR = new Creator<EntryVendorTask>() {
        @Override
        public EntryVendorTask createFromParcel(Parcel source) {
            return new EntryVendorTask(source);
        }

        @Override
        public EntryVendorTask[] newArray(int size) {
            return new EntryVendorTask[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.vendorPartnerId);
        dest.writeValue(this.createdAt);
        dest.writeValue(this.updatedAt);
        dest.writeValue(this.queueTime);
        dest.writeValue(this.finishTime);
        dest.writeString(this.entryId);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.reachProfileId);
        dest.writeValue(this.catalogItemId);
        dest.writeValue(this.price);
        dest.writeString(this.userId);
        dest.writeString(this.moderatingUser);
        dest.writeString(this.errDescription);
        dest.writeString(this.accessKey);
        dest.writeString(this.version);
        dest.writeString(this.notes);
        dest.writeString(this.dictionary);
        dest.writeString(this.context);
        dest.writeValue(this.accuracy);
        dest.writeString(this.outputObjectId);
        dest.writeString(this.partnerData);
        dest.writeInt(this.creationMode == null ? -1 : this.creationMode.ordinal());
        dest.writeParcelable(this.taskJobData, flags);
        dest.writeValue(this.expectedFinishTime);
        dest.writeInt(this.serviceType == null ? -1 : this.serviceType.ordinal());
        dest.writeInt(this.serviceFeature == null ? -1 : this.serviceFeature.ordinal());
    }

    public EntryVendorTask(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.vendorPartnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.createdAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.updatedAt = (Integer)in.readValue(Integer.class.getClassLoader());
        this.queueTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.finishTime = (Integer)in.readValue(Integer.class.getClassLoader());
        this.entryId = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : EntryVendorTaskStatus.values()[tmpStatus];
        this.reachProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.catalogItemId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.price = (Double)in.readValue(Double.class.getClassLoader());
        this.userId = in.readString();
        this.moderatingUser = in.readString();
        this.errDescription = in.readString();
        this.accessKey = in.readString();
        this.version = in.readString();
        this.notes = in.readString();
        this.dictionary = in.readString();
        this.context = in.readString();
        this.accuracy = (Integer)in.readValue(Integer.class.getClassLoader());
        this.outputObjectId = in.readString();
        this.partnerData = in.readString();
        int tmpCreationMode = in.readInt();
        this.creationMode = tmpCreationMode == -1 ? null : EntryVendorTaskCreationMode.values()[tmpCreationMode];
        this.taskJobData = in.readParcelable(VendorTaskData.class.getClassLoader());
        this.expectedFinishTime = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpServiceType = in.readInt();
        this.serviceType = tmpServiceType == -1 ? null : VendorServiceType.values()[tmpServiceType];
        int tmpServiceFeature = in.readInt();
        this.serviceFeature = tmpServiceFeature == -1 ? null : VendorServiceFeature.values()[tmpServiceFeature];
    }
}

