package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldcrLnShrGrpRemDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldcrLnShrGrpRemDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldcrLnShrGrpRemDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCR_LN_SHR_GRP_REM_DATA_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for IldcrLnShrGrpRemDataSerialized
	**/
    public IldcrLnShrGrpRemDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IldcrLnShrGrpRemDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCR_LN_SHR_GRP_REM_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
