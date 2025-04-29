package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src150GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:12. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src150GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src150GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_150_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc150;
           protected static final int SRC_150_SIZE = 10;
	
	/**
	* Constructor for Src150GrpSerialized
	**/
    public Src150GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src150GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_150_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc150 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_150_LEN = 2;
    /**
	 * 	serialize this Src150 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc150(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc150 + index*SRC_150_LEN), SRC_150_LEN);
   }

		public int src150Size() {
			return SRC_150_SIZE;
		}



}
  
