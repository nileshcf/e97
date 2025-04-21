package com.cloudframe.app.comput5.dto;

/**
*  The class WtExposureTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WtExposureTable extends WtExposureTableSerialized {
   
			private List<WtExposureDetails> wtExposureDetails = new ArrayList<>();
    	
	
	/**
	* Constructor for WtExposureTable
	**/
    public WtExposureTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WT_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
						wtExposureDetails.add(new WtExposureDetails(this, beginWtExposureDetails + 
						arrayIndex * WtExposureDetails.getWtExposureDetailsFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of wtExposureDetails
	 *  Corresponding COBOL Variable is WT-EXPOSURE-DETAILS
	 *	@return wtExposureDetails
	 */
   public List<WtExposureDetails> getWtExposureDetails() {
       return wtExposureDetails;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wtExposureDetails
	 */
	public WtExposureDetails getWtExposureDetails(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWtExposureDetails(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WT_EXPOSURE_DETAILS_SIZE) {
             	index = WT_EXPOSURE_DETAILS_SIZE -1; // can't exceed max array size
             	logger.trace("wtExposureDetails - Array index exceeded max Size {}, resetting it to max allowed",WT_EXPOSURE_DETAILS_SIZE); 
	    }
		if (index >= wtExposureDetails.size()) {
       		for (int fillIndex =  wtExposureDetails.size() -1; fillIndex < index;fillIndex++) {
		       wtExposureDetails.add(null);
		    }
			wtExposureDetails.set(index,
			   	   	new WtExposureDetails(this,beginWtExposureDetails + index * WtExposureDetails.getWtExposureDetailsFieldLength()) 
				                        ); 	
		} 
   	   WtExposureDetails value = wtExposureDetails.get(index);
   	   if (value == null) {
   	      wtExposureDetails.set(index,
			   	   	new WtExposureDetails(this,beginWtExposureDetails + index * WtExposureDetails.getWtExposureDetailsFieldLength()) 
				                        ); 
		  value = wtExposureDetails.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WtExposureDetails at index with the passed value
	 *  Corresponding COBOL Variable is WT-EXPOSURE-DETAILS
	 *  @param index
	 *	@param value
	 */
  public void setWtExposureDetails(int index,char[] value) {
   	getWtExposureDetails(index).setString(value);
   }
   
	

	
	
	

		public static int getWtExposureTableFieldLength() {
			return WT_EXPOSURE_TABLE_LENGTH;
		}

}
  
