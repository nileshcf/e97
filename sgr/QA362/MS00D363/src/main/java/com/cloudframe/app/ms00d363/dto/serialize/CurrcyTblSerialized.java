package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurrcyTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrcyTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrcyTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRCY_TBL_LENGTH = 9900;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginCurcyTable2;
           protected static final int CURCY_TABLE_2_SIZE = 300;
	
	/**
	* Constructor for CurrcyTblSerialized
	**/
    public CurrcyTblSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrcyTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRCY_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginCurcyTable2 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int curcyTable2Size() {
			return CURCY_TABLE_2_SIZE;
		}



}
  
