package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class Ip66601UserTagInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66601UserTagInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66601UserTagInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66601_USER_TAG_INFORMATION_LENGTH = 9102;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip66601UserTagInformationSerialized
	**/
    public Ip66601UserTagInformationSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip66601UserTagInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66601_USER_TAG_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
