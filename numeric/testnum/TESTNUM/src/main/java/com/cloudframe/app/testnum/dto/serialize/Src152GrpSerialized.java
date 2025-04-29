package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src152GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src152GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src152GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_152_GRP_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc152;
           protected static final int SRC_152_SIZE = 10;
	
	/**
	* Constructor for Src152GrpSerialized
	**/
    public Src152GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src152GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_152_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc152 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_152_LEN = 4;
    /**
	 * 	serialize this Src152 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc152(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginSrc152 + index*SRC_152_LEN), SRC_152_LEN);
   }

		public int src152Size() {
			return SRC_152_SIZE;
		}



}
  
