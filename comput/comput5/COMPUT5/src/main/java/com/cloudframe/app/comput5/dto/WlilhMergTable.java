package com.cloudframe.app.comput5.dto;

/**
*  The class WlilhMergTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class WlilhMergTable extends WlilhMergTableSerialized {
   
			private List<WlilhMrTbl> wlilhMrTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for WlilhMergTable
	**/
    public WlilhMergTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WLILH_MR_TBL_SIZE;arrayIndex++) {
						wlilhMrTbl.add(new WlilhMrTbl(this, beginWlilhMrTbl + 
						arrayIndex * WlilhMrTbl.getWlilhMrTblFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of wlilhMrTbl
	 *  Corresponding COBOL Variable is WLILH-MR-TBL
	 *	@return wlilhMrTbl
	 */
   public List<WlilhMrTbl> getWlilhMrTbl() {
       return wlilhMrTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wlilhMrTbl
	 */
	public WlilhMrTbl getWlilhMrTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWlilhMrTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WLILH_MR_TBL_SIZE) {
             	index = WLILH_MR_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("wlilhMrTbl - Array index exceeded max Size {}, resetting it to max allowed",WLILH_MR_TBL_SIZE); 
	    }
		if (index >= wlilhMrTbl.size()) {
       		for (int fillIndex =  wlilhMrTbl.size() -1; fillIndex < index;fillIndex++) {
		       wlilhMrTbl.add(null);
		    }
			wlilhMrTbl.set(index,
			   	   	new WlilhMrTbl(this,beginWlilhMrTbl + index * WlilhMrTbl.getWlilhMrTblFieldLength()) 
				                        ); 	
		} 
   	   WlilhMrTbl value = wlilhMrTbl.get(index);
   	   if (value == null) {
   	      wlilhMrTbl.set(index,
			   	   	new WlilhMrTbl(this,beginWlilhMrTbl + index * WlilhMrTbl.getWlilhMrTblFieldLength()) 
				                        ); 
		  value = wlilhMrTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WlilhMrTbl at index with the passed value
	 *  Corresponding COBOL Variable is WLILH-MR-TBL
	 *  @param index
	 *	@param value
	 */
  public void setWlilhMrTbl(int index,char[] value) {
   	getWlilhMrTbl(index).setString(value);
   }
   
	

	
	
	

		public static int getWlilhMergTableFieldLength() {
			return WLILH_MERG_TABLE_LENGTH;
		}

}
  
