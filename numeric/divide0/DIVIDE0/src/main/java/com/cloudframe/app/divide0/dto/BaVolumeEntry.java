package com.cloudframe.app.divide0.dto;

/**
*  The class BaVolumeEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:09. using version 5.0.0.256
**/


import com.cloudframe.app.divide0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BaVolumeEntry extends BaVolumeEntrySerialized { 
   

								private long baVolEntry;
	
	/**
	* Constructor for BaVolumeEntry
	**/
    public BaVolumeEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BaVolumeEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BaVolumeEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of baVolEntry
	 *	@return baVolEntry
	 */
	public long getBaVolEntry() throws CFException {
       if (isBaVolEntryModified()) { 
           baVolEntry = refreshBaVolEntry();
        }
   		return baVolEntry;
	}
	

	
	   
	/**
	 * 	Update BaVolEntry with the passed value
	 *  Corresponding COBOL Variable is BA-VOL-ENTRY
	 *	@param number
	 */
	public void setBaVolEntry(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    baVolEntry = checkBaVolEntryMaxLimit(number); 
		serializeBaVolEntry(baVolEntry);
	}
	

	/**
	 * 	Update BaVolEntry with the passed value
	 *	@param value (String or char[])
	 */
	public void setBaVolEntry(char[] value) throws CFException {
		 baVolEntry = serializeBaVolEntry(value);
	}
	/**
	 * 	Update BaVolEntry with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBaVolEntryString(char[] value) throws CFException {
		 setBaVolEntry(value);
	}

	
	
	

		public static int getBaVolumeEntryFieldLength() {
			return BA_VOLUME_ENTRY_LENGTH;
		}

}
  
