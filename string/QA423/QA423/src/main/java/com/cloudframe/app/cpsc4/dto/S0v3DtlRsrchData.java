package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlRsrchData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class S0v3DtlRsrchData extends S0v3DtlRsrchDataSerialized {
   
			private List<RsrchData> rsrchData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlRsrchData
	**/
    public S0v3DtlRsrchData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < RSRCH_DATA_SIZE;arrayIndex++) {
						rsrchData.add(new RsrchData(this, beginRsrchData + 
						arrayIndex * RsrchData.getRsrchDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < RSRCH_DATA_SIZE;arrayIndex++) {
					rsrchData.add(new RsrchData(this, beginRsrchData + 
						arrayIndex * RsrchData.getRsrchDataFieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of rsrchData
	 *  Corresponding COBOL Variable is WS-RSRCH-DATA
	 *	@return rsrchData
	 */
   public List<RsrchData> getRsrchData() {
       return rsrchData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return rsrchData
	 */
	public RsrchData getRsrchData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRsrchData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RSRCH_DATA_SIZE) {
             	index = RSRCH_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("rsrchData - Array index exceeded max Size {}, resetting it to max allowed",RSRCH_DATA_SIZE); 
	    }
		if (index >= rsrchData.size()) {
       		for (int fillIndex =  rsrchData.size() -1; fillIndex < index;fillIndex++) {
		       rsrchData.add(null);
		    }
			rsrchData.set(index,
			   	   	new RsrchData(this,beginRsrchData + index * RsrchData.getRsrchDataFieldLength()) 
				                        ); 	
		} 
   	   RsrchData value = rsrchData.get(index);
   	   if (value == null) {
   	      rsrchData.set(index,
			   	   	new RsrchData(this,beginRsrchData + index * RsrchData.getRsrchDataFieldLength()) 
				                        ); 
		  value = rsrchData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update RsrchData at index with the passed value
	 *  Corresponding COBOL Variable is WS-RSRCH-DATA
	 *  @param index
	 *	@param value
	 */
  public void setRsrchData(int index,char[] value) {
   	getRsrchData(index).setString(value);
   }
   
	

	
	
	

		public static int getS0v3DtlRsrchDataFieldLength() {
			return S_0V_3_DTL_RSRCH_DATA_LENGTH;
		}

}
  
