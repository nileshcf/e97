package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnAcmn009pParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnAcmn009pParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnAcmn009pParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_ACMN_009P_PARMS_LENGTH = 1100;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CmnAcmn009pParmsSerialized
	**/
    public CmnAcmn009pParmsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CmnAcmn009pParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_ACMN_009P_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
