package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src160GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src160GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src160GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_160_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc160;
           protected static final int SRC_160_SIZE = 10;
	
	/**
	* Constructor for Src160GrpSerialized
	**/
    public Src160GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src160GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_160_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc160 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_160_LEN = 2;
    /**
	 * 	serialize this Src160 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc160(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc160 + index*SRC_160_LEN), SRC_160_LEN);
   }

		public int src160Size() {
			return SRC_160_SIZE;
		}



}
  
