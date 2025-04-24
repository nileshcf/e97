package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src154GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src154GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src154GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_154_GRP_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc154;
           protected static final int SRC_154_SIZE = 10;
	
	/**
	* Constructor for Src154GrpSerialized
	**/
    public Src154GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src154GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_154_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc154 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int SRC_154_LEN = 4;
    /**
	 * 	serialize this Src154 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSrc154(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginSrc154 + index*SRC_154_LEN), SRC_154_LEN);
   }

		public int src154Size() {
			return SRC_154_SIZE;
		}



}
  
