package com.cloudframe.app.search3.dto.serialize;

/**
*  The class AccGrp500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AccGrp500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AccGrp500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACC_GRP_500_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginAccFinTbl500;
           protected static final int ACC_FIN_TBL_500_SIZE = 10;
	
	/**
	* Constructor for AccGrp500Serialized
	**/
    public AccGrp500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AccGrp500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACC_GRP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginAccFinTbl500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int accFinTbl500Size() {
			return ACC_FIN_TBL_500_SIZE;
		}



}
  
