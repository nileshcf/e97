package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src162GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src162GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src162GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_162_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc162;
           protected static final int SRC_162_SIZE = 10;
	
	/**
	* Constructor for Src162GrpSerialized
	**/
    public Src162GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src162GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_162_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc162 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_162_LEN = 2;
    /**
	 * 	serialize this Src162 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc162(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc162 + index*SRC_162_LEN), SRC_162_LEN);
   }

		public int src162Size() {
			return SRC_162_SIZE;
		}



}
  
