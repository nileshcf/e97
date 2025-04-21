package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt178GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt178GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt178GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_178_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt178;
           protected static final int TGT_178_SIZE = 10;
	
	/**
	* Constructor for Tgt178GrpSerialized
	**/
    public Tgt178GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt178GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_178_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt178 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_178_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt178(int index, long value) {
	       replaceValue( pad(TGT_178_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt178 + index*TGT_178_LEN)
	              , TGT_178_LEN
	              );
   }

		public int tgt178Size() {
			return TGT_178_SIZE;
		}



}
  
