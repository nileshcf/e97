package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src176GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src176GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src176GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_176_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc176;
           protected static final int SRC_176_SIZE = 10;
	
	/**
	* Constructor for Src176GrpSerialized
	**/
    public Src176GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src176GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_176_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc176 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int SRC_176_LEN = 5;
   /**
	 *	serializeSrc176 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSrc176(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSrc176 + index*SRC_176_LEN)
   	          , SRC_176_LEN 
   	          );
   }

		public int src176Size() {
			return SRC_176_SIZE;
		}



}
  
