package com.cloudframe.app.comput5.dto;

/**
*  The class WoExposureGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WoExposureGroup extends WoExposureGroupSerialized {
   
			private List<WoExposureDetails> woExposureDetails = new ArrayList<>();
    	
	
	/**
	* Constructor for WoExposureGroup
	**/
    public WoExposureGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WO_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
						woExposureDetails.add(new WoExposureDetails(this, beginWoExposureDetails + 
						arrayIndex * WoExposureDetails.getWoExposureDetailsFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < WO_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
					woExposureDetails.add(new WoExposureDetails(this, beginWoExposureDetails + 
						arrayIndex * WoExposureDetails.getWoExposureDetailsFieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of woExposureDetails
	 *  Corresponding COBOL Variable is WO-EXPOSURE-DETAILS
	 *	@return woExposureDetails
	 */
   public List<WoExposureDetails> getWoExposureDetails() {
       return woExposureDetails;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return woExposureDetails
	 */
	public WoExposureDetails getWoExposureDetails(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWoExposureDetails(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WO_EXPOSURE_DETAILS_SIZE) {
             	index = WO_EXPOSURE_DETAILS_SIZE -1; // can't exceed max array size
             	logger.trace("woExposureDetails - Array index exceeded max Size {}, resetting it to max allowed",WO_EXPOSURE_DETAILS_SIZE); 
	    }
		if (index >= woExposureDetails.size()) {
       		for (int fillIndex =  woExposureDetails.size() -1; fillIndex < index;fillIndex++) {
		       woExposureDetails.add(null);
		    }
			woExposureDetails.set(index,
			   	   	new WoExposureDetails(this,beginWoExposureDetails + index * WoExposureDetails.getWoExposureDetailsFieldLength()) 
				                        ); 	
		} 
   	   WoExposureDetails value = woExposureDetails.get(index);
   	   if (value == null) {
   	      woExposureDetails.set(index,
			   	   	new WoExposureDetails(this,beginWoExposureDetails + index * WoExposureDetails.getWoExposureDetailsFieldLength()) 
				                        ); 
		  value = woExposureDetails.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WoExposureDetails at index with the passed value
	 *  Corresponding COBOL Variable is WO-EXPOSURE-DETAILS
	 *  @param index
	 *	@param value
	 */
  public void setWoExposureDetails(int index,char[] value) {
   	getWoExposureDetails(index).setString(value);
   }
   
	

	
	
	

		public static int getWoExposureGroupFieldLength() {
			return WO_EXPOSURE_GROUP_LENGTH;
		}

}
  
