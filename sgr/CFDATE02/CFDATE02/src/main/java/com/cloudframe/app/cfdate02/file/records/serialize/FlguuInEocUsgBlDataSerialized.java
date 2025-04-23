package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class FlguuInEocUsgBlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlguuInEocUsgBlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlguuInEocUsgBlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUU_IN_EOC_USG_BL_DATA_LENGTH = 1017;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FlguuInEocUsgBlDataSerialized
	**/
    public FlguuInEocUsgBlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FlguuInEocUsgBlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUU_IN_EOC_USG_BL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
