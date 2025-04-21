package com.cloudframe.app.comput3.dto;

/**
*  The class WcVolumeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import java.math.RoundingMode;


public class WcVolumeGroup extends WcVolumeGroupSerialized { 
   
      private List<BigDecimal> wcVolumes; 

	
	/**
	* Constructor for WcVolumeGroup
	**/
    public WcVolumeGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcVolumeGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


    /**
	 *	Returns the value of wcVolumes
	 *  Corresponding COBOL Variable is WC-VOLUMES
	 *	@return wcVolumes
	 */
	public List<BigDecimal> getWcVolumes() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < WC_VOLUMES_SIZE;index++) {
        	list.add( getWcVolumes( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return wcVolumes
	 */
	public BigDecimal getWcVolumes(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getWcVolumes(), resetting it to 0",index);
		    index = 0;
        } else if (index >= WC_VOLUMES_SIZE) {
             	index = WC_VOLUMES_SIZE -1; // can't exceed max array size
             	logger.trace("wcVolumes - Array index exceeded max Size "+WC_VOLUMES_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginWcVolumes+ index*WC_VOLUMES_LEN ,
		WC_VOLUMES_LEN, WC_VOLUMES_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("wcVolumes", beginWcVolumes+ index*WC_VOLUMES_LEN,WC_VOLUMES_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean wcVolumesIsNumeric(int index) {
	    return decimalIsNumeric( beginWcVolumes+ index*WC_VOLUMES_LEN ,WC_VOLUMES_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WC-VOLUMES
	 *  @param index
	 *	@param number
	 */
	public void setWcVolumes(int index,BigDecimal number) {	
		setWcVolumes(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setWcVolumes(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setWcVolumes(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= WC_VOLUMES_SIZE) {
             	index = WC_VOLUMES_SIZE -1; // can't exceed max array size
             	logger.trace("wcVolumes - Array index exceeded max Size {}, resetting it to max allowed",WC_VOLUMES_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(4,RoundingMode.DOWN);
	    if (value.precision() > 17) value =   truncate(value,17) ;
		if (setModified) {
			serializeWcVolumes(index,value);
		}
   }


	
	
	

		public static int getWcVolumeGroupFieldLength() {
			return WC_VOLUME_GROUP_LENGTH;
		}

}
  
