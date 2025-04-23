package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt162GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt162GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt162GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_162_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt162;
           protected static final int TGT_162_SIZE = 10;
	
	/**
	* Constructor for Tgt162GrpSerialized
	**/
    public Tgt162GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt162GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_162_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt162 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_162_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt162(int index, long value) {
	       replaceValue( pad(TGT_162_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt162 + index*TGT_162_LEN)
	              , TGT_162_LEN
	              );
   }

		public int tgt162Size() {
			return TGT_162_SIZE;
		}



}
  
