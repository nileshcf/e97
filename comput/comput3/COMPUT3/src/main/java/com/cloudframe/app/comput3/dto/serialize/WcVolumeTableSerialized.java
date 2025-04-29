package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcVolumeTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:11. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcVolumeTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcVolumeTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_VOLUME_TABLE_LENGTH = 1296;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWcVolumeGroup;
           protected static final int WC_VOLUME_GROUP_SIZE = 12;
	
	/**
	* Constructor for WcVolumeTableSerialized
	**/
    public WcVolumeTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcVolumeTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcVolumeTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcVolumeTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WcVolumeTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WcVolumeTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_VOLUME_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWcVolumeGroup = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int wcVolumeGroupSize() {
			return WC_VOLUME_GROUP_SIZE;
		}



}
  
