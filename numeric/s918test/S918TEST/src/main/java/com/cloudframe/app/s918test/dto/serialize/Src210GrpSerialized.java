package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src210GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src210GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src210GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_210_GRP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc210;
           protected static final int SRC_210_SIZE = 10;
	
	/**
	* Constructor for Src210GrpSerialized
	**/
    public Src210GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src210GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_210_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc210 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_210_LEN = 2;
    /**
	 * 	serialize this Src210 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc210(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSrc210 + index*SRC_210_LEN), SRC_210_LEN);
   }

		public int src210Size() {
			return SRC_210_SIZE;
		}



}
  
