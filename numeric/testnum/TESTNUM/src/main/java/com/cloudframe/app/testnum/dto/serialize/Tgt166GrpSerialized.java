package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt166GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt166GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt166GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_166_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt166;
           protected static final int TGT_166_SIZE = 10;
	
	/**
	* Constructor for Tgt166GrpSerialized
	**/
    public Tgt166GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt166GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_166_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt166 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_166_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt166(int index, long value) {
	       replaceValue( pad(TGT_166_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt166 + index*TGT_166_LEN)
	              , TGT_166_LEN
	              );
   }

		public int tgt166Size() {
			return TGT_166_SIZE;
		}



}
  
