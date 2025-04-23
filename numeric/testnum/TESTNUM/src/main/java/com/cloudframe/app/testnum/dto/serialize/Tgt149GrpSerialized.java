package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt149GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt149GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt149GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_149_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt149;
           protected static final int TGT_149_SIZE = 10;
	
	/**
	* Constructor for Tgt149GrpSerialized
	**/
    public Tgt149GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt149GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_149_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt149 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_149_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt149(int index, long value) {
	       replaceValue( pad(TGT_149_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt149 + index*TGT_149_LEN)
	              , TGT_149_LEN
	              );
   }

		public int tgt149Size() {
			return TGT_149_SIZE;
		}



}
  
