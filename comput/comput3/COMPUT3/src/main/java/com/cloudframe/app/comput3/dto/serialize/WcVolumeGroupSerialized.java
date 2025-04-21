package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcVolumeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcVolumeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcVolumeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_VOLUME_GROUP_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWcVolumes;
           protected static final int WC_VOLUMES_SIZE = 12;
	
	/**
	* Constructor for WcVolumeGroupSerialized
	**/
    public WcVolumeGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcVolumeGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcVolumeGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WcVolumeGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WcVolumeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_VOLUME_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWcVolumes = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
   protected static final int WC_VOLUMES_LEN = 9;
   protected static final int WC_VOLUMES_SCALE = 4;
     /**
	 * 	serializes this WcVolumes as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeWcVolumes(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,WC_VOLUMES_LEN,WC_VOLUMES_SCALE,true)
		        ,(beginWcVolumes + index*WC_VOLUMES_LEN) 
		        ,WC_VOLUMES_LEN
		      );
   }

		public int wcVolumesSize() {
			return WC_VOLUMES_SIZE;
		}



}
  
