package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501ErrorInfoRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501ErrorInfoRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501ErrorInfoRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_ERROR_INFO_REC_LENGTH = 1358;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip43501ErrorInfoRecSerialized
	**/
    public Ip43501ErrorInfoRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip43501ErrorInfoRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_ERROR_INFO_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
