package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src198GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src198GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src198GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_198_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc198;
           protected static final int SRC_198_SIZE = 10;
	
	/**
	* Constructor for Src198GrpSerialized
	**/
    public Src198GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src198GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_198_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc198 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_198_LEN = 2;
    /**
	 * 	serialize this Src198 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc198(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc198 + index*SRC_198_LEN), SRC_198_LEN);
   }

		public int src198Size() {
			return SRC_198_SIZE;
		}



}
  
