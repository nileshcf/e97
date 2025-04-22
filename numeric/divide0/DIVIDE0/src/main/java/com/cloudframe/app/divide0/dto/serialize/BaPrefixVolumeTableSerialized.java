package com.cloudframe.app.divide0.dto.serialize;

/**
*  The class BaPrefixVolumeTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BaPrefixVolumeTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BaPrefixVolumeTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BA_PREFIX_VOLUME_TABLE_LENGTH = 9000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginBaVolumeEntry;
           protected static final int BA_VOLUME_ENTRY_SIZE = 1000;
	
	/**
	* Constructor for BaPrefixVolumeTableSerialized
	**/
    public BaPrefixVolumeTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BaPrefixVolumeTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BA_PREFIX_VOLUME_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginBaVolumeEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int baVolumeEntrySize() {
			return BA_VOLUME_ENTRY_SIZE;
		}



}
  
