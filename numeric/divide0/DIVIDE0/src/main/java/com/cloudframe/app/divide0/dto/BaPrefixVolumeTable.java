package com.cloudframe.app.divide0.dto;

/**
*  The class BaPrefixVolumeTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.divide0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class BaPrefixVolumeTable extends BaPrefixVolumeTableSerialized { 
   
			private List<BaVolumeEntry> baVolumeEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for BaPrefixVolumeTable
	**/
    public BaPrefixVolumeTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < BA_VOLUME_ENTRY_SIZE;arrayIndex++) {
						baVolumeEntry.add(new BaVolumeEntry(this, beginBaVolumeEntry + 
						arrayIndex * BaVolumeEntry.getBaVolumeEntryFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of baVolumeEntry
	 *  Corresponding COBOL Variable is BA-VOLUME-ENTRY
	 *	@return baVolumeEntry
	 */
   public List<BaVolumeEntry> getBaVolumeEntry() {
       return baVolumeEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return baVolumeEntry
	 */
	public BaVolumeEntry getBaVolumeEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBaVolumeEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BA_VOLUME_ENTRY_SIZE) {
             	index = BA_VOLUME_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("baVolumeEntry - Array index exceeded max Size {}, resetting it to max allowed",BA_VOLUME_ENTRY_SIZE); 
	    }
		if (index >= baVolumeEntry.size()) {
       		for (int fillIndex =  baVolumeEntry.size() -1; fillIndex < index;fillIndex++) {
		       baVolumeEntry.add(null);
		    }
			baVolumeEntry.set(index,
			   	   	new BaVolumeEntry(this,beginBaVolumeEntry + index * BaVolumeEntry.getBaVolumeEntryFieldLength()) 
				                        ); 	
		} 
   	   BaVolumeEntry value = baVolumeEntry.get(index);
   	   if (value == null) {
   	      baVolumeEntry.set(index,
			   	   	new BaVolumeEntry(this,beginBaVolumeEntry + index * BaVolumeEntry.getBaVolumeEntryFieldLength()) 
				                        ); 
		  value = baVolumeEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update BaVolumeEntry at index with the passed value
	 *  Corresponding COBOL Variable is BA-VOLUME-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setBaVolumeEntry(int index,char[] value) {
   	getBaVolumeEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getBaPrefixVolumeTableFieldLength() {
			return BA_PREFIX_VOLUME_TABLE_LENGTH;
		}

}
  
