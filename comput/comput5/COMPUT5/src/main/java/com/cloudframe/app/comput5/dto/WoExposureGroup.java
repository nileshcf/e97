package com.cloudframe.app.comput5.dto;

/**
*  The class WoExposureGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WoExposureGroup extends WoExposureGroupSerialized {
   
			@Getter @Setter private List<WoExposureDetails> woExposureDetails = new ArrayList<>();
    	
	
	/**
	* Constructor for WoExposureGroup
	**/
    public WoExposureGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WO_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
						getWoExposureDetails().add(new WoExposureDetails(this, beginWoExposureDetails + 
						arrayIndex * WoExposureDetails.getWoExposureDetailsFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < WO_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
					getWoExposureDetails().add(new WoExposureDetails(this, beginWoExposureDetails + 
						arrayIndex * WoExposureDetails.getWoExposureDetailsFieldLength()));
			}
    }





}
  
