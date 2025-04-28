package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class BussServDftls600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BussServDftls600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BussServDftls600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BUSS_SERV_DFTLS_600_LENGTH = 340000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTable36Bsl600;
           protected static final int TABLE_36_BSL_600_SIZE = 20000;
	
	/**
	* Constructor for BussServDftls600Serialized
	**/
    public BussServDftls600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BussServDftls600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BUSS_SERV_DFTLS_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTable36Bsl600 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int table36Bsl600Size() {
			return TABLE_36_BSL_600_SIZE;
		}



}
  
