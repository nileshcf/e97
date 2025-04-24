package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WpReptextSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WpReptextSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WpReptextSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WP_REPTEXT_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for WpReptextSerialized
	**/
    public WpReptextSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WpReptextSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WP_REPTEXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
