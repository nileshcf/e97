package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class IoPe8090pSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IoPe8090pSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IoPe8090pSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IO_PE_8090P_LENGTH = 11870;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for IoPe8090pSerialized
	**/
    public IoPe8090pSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IoPe8090pSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IO_PE_8090P_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
