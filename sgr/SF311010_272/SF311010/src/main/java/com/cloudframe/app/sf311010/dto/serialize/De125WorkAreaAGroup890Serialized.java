package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De125WorkAreaAGroup890Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De125WorkAreaAGroup890Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De125WorkAreaAGroup890Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_125_WORK_AREA_AGROUP_890_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for De125WorkAreaAGroup890Serialized
	**/
    public De125WorkAreaAGroup890Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De125WorkAreaAGroup890Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_125_WORK_AREA_AGROUP_890_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
