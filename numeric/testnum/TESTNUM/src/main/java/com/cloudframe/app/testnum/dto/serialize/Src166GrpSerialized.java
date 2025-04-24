package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Src166GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src166GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src166GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_166_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc166;
           protected static final int SRC_166_SIZE = 10;
	
	/**
	* Constructor for Src166GrpSerialized
	**/
    public Src166GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src166GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_166_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc166 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int SRC_166_LEN = 5;
   /**
	 *	serializeSrc166 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSrc166(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSrc166 + index*SRC_166_LEN)
   	          , SRC_166_LEN 
   	          );
   }

		public int src166Size() {
			return SRC_166_SIZE;
		}



}
  
