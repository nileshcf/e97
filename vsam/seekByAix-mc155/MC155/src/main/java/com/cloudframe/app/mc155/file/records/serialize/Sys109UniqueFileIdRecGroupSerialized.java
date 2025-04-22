package com.cloudframe.app.mc155.file.records.serialize;

/**
*  The class Sys109UniqueFileIdRecGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys109UniqueFileIdRecGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys109UniqueFileIdRecGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_109_UNIQUE_FILE_ID_REC_GROUP_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sys109UniqueFileIdRecGroupSerialized
	**/
    public Sys109UniqueFileIdRecGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys109UniqueFileIdRecGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_109_UNIQUE_FILE_ID_REC_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
