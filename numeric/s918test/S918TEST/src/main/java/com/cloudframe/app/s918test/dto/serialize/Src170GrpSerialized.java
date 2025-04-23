package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src170GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Src170GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src170GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_170_GRP_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc170;
           protected static final int SRC_170_SIZE = 10;
	
	/**
	* Constructor for Src170GrpSerialized
	**/
    public Src170GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src170GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_170_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc170 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
   protected static final int SRC_170_LEN = 4;
   protected static final int SRC_170_SCALE = 2;
     /**
	 * 	serializes this Src170 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeSrc170(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,SRC_170_LEN,SRC_170_SCALE,true)
		        ,(beginSrc170 + index*SRC_170_LEN) 
		        ,SRC_170_LEN
		      );
   }

		public int src170Size() {
			return SRC_170_SIZE;
		}



}
  
