package com.cloudframe.app.comput3.dto;

/**
*  The class WcVolumeTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class WcVolumeTable extends WcVolumeTableSerialized { 
   
			private List<WcVolumeGroup> wcVolumeGroup = new ArrayList<>();
    	
	
	/**
	* Constructor for WcVolumeTable
	**/
    public WcVolumeTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcVolumeTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of wcVolumeGroup
	 *  Corresponding COBOL Variable is WC-VOLUME-GROUP
	 *	@return wcVolumeGroup
	 */
   public List<WcVolumeGroup> getWcVolumeGroup() {
       return wcVolumeGroup;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wcVolumeGroup
	 */
	public WcVolumeGroup getWcVolumeGroup(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWcVolumeGroup(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WC_VOLUME_GROUP_SIZE) {
             	index = WC_VOLUME_GROUP_SIZE -1; // can't exceed max array size
             	logger.trace("wcVolumeGroup - Array index exceeded max Size {}, resetting it to max allowed",WC_VOLUME_GROUP_SIZE); 
	    }
		if (index >= wcVolumeGroup.size()) {
       		for (int fillIndex =  wcVolumeGroup.size() -1; fillIndex < index;fillIndex++) {
		       wcVolumeGroup.add(null);
		    }
			wcVolumeGroup.set(index,
			   	   	new WcVolumeGroup(this,beginWcVolumeGroup + index * WcVolumeGroup.getWcVolumeGroupFieldLength()) 
				                        ); 	
		} 
   	   WcVolumeGroup value = wcVolumeGroup.get(index);
   	   if (value == null) {
   	      wcVolumeGroup.set(index,
			   	   	new WcVolumeGroup(this,beginWcVolumeGroup + index * WcVolumeGroup.getWcVolumeGroupFieldLength()) 
				                        ); 
		  value = wcVolumeGroup.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WcVolumeGroup at index with the passed value
	 *  Corresponding COBOL Variable is WC-VOLUME-GROUP
	 *  @param index
	 *	@param value
	 */
  public void setWcVolumeGroup(int index,char[] value) {
   	getWcVolumeGroup(index).setString(value);
   }
   
	

	
	
	

		public static int getWcVolumeTableFieldLength() {
			return WC_VOLUME_TABLE_LENGTH;
		}

}
  
