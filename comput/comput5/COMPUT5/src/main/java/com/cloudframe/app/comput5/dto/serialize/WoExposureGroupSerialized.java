package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WoExposureGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WoExposureGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WoExposureGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WO_EXPOSURE_GROUP_LENGTH = 3000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWoExposureDetails;
           protected static final int WO_EXPOSURE_DETAILS_SIZE = 300;
	
	/**
	* Constructor for WoExposureGroupSerialized
	**/
    public WoExposureGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WoExposureGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WO_EXPOSURE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWoExposureDetails = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int woExposureDetailsSize() {
			return WO_EXPOSURE_DETAILS_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  10);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  10);
     }
}
  
