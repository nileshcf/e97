package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src158GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Src158GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src158GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_158_GRP_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc158;
           protected static final int SRC_158_SIZE = 10;
	
	/**
	* Constructor for Src158GrpSerialized
	**/
    public Src158GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src158GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_158_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc158 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
   protected static final int SRC_158_LEN = 4;
   protected static final int SRC_158_SCALE = 2;
     /**
	 * 	serializes this Src158 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeSrc158(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,SRC_158_LEN,SRC_158_SCALE,true)
		        ,(beginSrc158 + index*SRC_158_LEN) 
		        ,SRC_158_LEN
		      );
   }

		public int src158Size() {
			return SRC_158_SIZE;
		}



}
  
