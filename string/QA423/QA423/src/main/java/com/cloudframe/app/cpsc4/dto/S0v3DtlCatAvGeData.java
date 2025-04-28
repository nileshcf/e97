package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlCatAvGeData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class S0v3DtlCatAvGeData extends S0v3DtlCatAvGeDataSerialized {
   
			private List<CatAvGeData> catAvGeData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlCatAvGeData
	**/
    public S0v3DtlCatAvGeData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CAT_AV_GE_DATA_SIZE;arrayIndex++) {
						catAvGeData.add(new CatAvGeData(this, beginCatAvGeData + 
						arrayIndex * CatAvGeData.getCatAvGeDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < CAT_AV_GE_DATA_SIZE;arrayIndex++) {
					catAvGeData.add(new CatAvGeData(this, beginCatAvGeData + 
						arrayIndex * CatAvGeData.getCatAvGeDataFieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of catAvGeData
	 *  Corresponding COBOL Variable is WS-CAT-AV-GE-DATA
	 *	@return catAvGeData
	 */
   public List<CatAvGeData> getCatAvGeData() {
       return catAvGeData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return catAvGeData
	 */
	public CatAvGeData getCatAvGeData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCatAvGeData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CAT_AV_GE_DATA_SIZE) {
             	index = CAT_AV_GE_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("catAvGeData - Array index exceeded max Size {}, resetting it to max allowed",CAT_AV_GE_DATA_SIZE); 
	    }
		if (index >= catAvGeData.size()) {
       		for (int fillIndex =  catAvGeData.size() -1; fillIndex < index;fillIndex++) {
		       catAvGeData.add(null);
		    }
			catAvGeData.set(index,
			   	   	new CatAvGeData(this,beginCatAvGeData + index * CatAvGeData.getCatAvGeDataFieldLength()) 
				                        ); 	
		} 
   	   CatAvGeData value = catAvGeData.get(index);
   	   if (value == null) {
   	      catAvGeData.set(index,
			   	   	new CatAvGeData(this,beginCatAvGeData + index * CatAvGeData.getCatAvGeDataFieldLength()) 
				                        ); 
		  value = catAvGeData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CatAvGeData at index with the passed value
	 *  Corresponding COBOL Variable is WS-CAT-AV-GE-DATA
	 *  @param index
	 *	@param value
	 */
  public void setCatAvGeData(int index,char[] value) {
   	getCatAvGeData(index).setString(value);
   }
   
	

	
	
	

		public static int getS0v3DtlCatAvGeDataFieldLength() {
			return S_0V_3_DTL_CAT_AV_GE_DATA_LENGTH;
		}

}
  
