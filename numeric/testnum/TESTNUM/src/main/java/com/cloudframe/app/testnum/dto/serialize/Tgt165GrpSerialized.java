package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt165GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt165GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt165GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_165_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt165;
           protected static final int TGT_165_SIZE = 10;
	
	/**
	* Constructor for Tgt165GrpSerialized
	**/
    public Tgt165GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt165GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_165_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt165 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_165_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt165(int index, long value) {
	       replaceValue( pad(TGT_165_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt165 + index*TGT_165_LEN)
	              , TGT_165_LEN
	              );
   }

		public int tgt165Size() {
			return TGT_165_SIZE;
		}



}
  
