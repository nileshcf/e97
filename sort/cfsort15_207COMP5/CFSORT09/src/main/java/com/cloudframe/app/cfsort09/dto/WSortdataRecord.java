package com.cloudframe.app.cfsort09.dto;

/**
*  The class WSortdataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WSortdataRecord extends WSortdataRecordSerialized {
   

								@Getter @Setter private long wSortdataKeyZoneDec;
	
	/**
	* Constructor for WSortdataRecord
	**/
    public WSortdataRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
