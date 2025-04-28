package com.cloudframe.app.d5427dt1.dto.serialize;

/**
*  The class Dt1ReqContainerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ReqContainerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ReqContainerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_REQ_CONTAINER_LENGTH = 400;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dt1ReqContainerSerialized
	**/
    public Dt1ReqContainerSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Dt1ReqContainerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_REQ_CONTAINER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
