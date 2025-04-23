package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src148GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src148GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src148GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_148_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc148;
           protected static final int SRC_148_SIZE = 10;
	
	/**
	* Constructor for Src148GrpSerialized
	**/
    public Src148GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src148GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_148_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc148 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_148_LEN = 2;
    /**
	 * 	serialize this Src148 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc148(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc148 + index*SRC_148_LEN), SRC_148_LEN);
   }

		public int src148Size() {
			return SRC_148_SIZE;
		}



}
  
