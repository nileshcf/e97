package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src212GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src212GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src212GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_212_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc212;
           protected static final int SRC_212_SIZE = 10;
	
	/**
	* Constructor for Src212GrpSerialized
	**/
    public Src212GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src212GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_212_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc212 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_212_LEN = 2;
    /**
	 * 	serialize this Src212 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc212(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc212 + index*SRC_212_LEN), SRC_212_LEN);
   }

		public int src212Size() {
			return SRC_212_SIZE;
		}



}
  
