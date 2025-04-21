package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class SortRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_REC_LENGTH = 27986;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SortRecSerialized
	**/
    public SortRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SortRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
