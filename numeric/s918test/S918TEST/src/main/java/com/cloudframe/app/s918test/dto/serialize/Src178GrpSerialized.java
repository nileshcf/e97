package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Src178GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Src178GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Src178GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRC_178_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSrc178;
           protected static final int SRC_178_SIZE = 10;
	
	/**
	* Constructor for Src178GrpSerialized
	**/
    public Src178GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Src178GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRC_178_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSrc178 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int SRC_178_LEN = 5;
   /**
	 *	serializeSrc178 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSrc178(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSrc178 + index*SRC_178_LEN)
   	          , SRC_178_LEN 
   	          );
   }

		public int src178Size() {
			return SRC_178_SIZE;
		}



}
  
