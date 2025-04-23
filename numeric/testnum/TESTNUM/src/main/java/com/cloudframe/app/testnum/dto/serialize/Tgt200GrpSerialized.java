package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt200GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt200GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt200GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_200_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt200;
           protected static final int TGT_200_SIZE = 10;
	
	/**
	* Constructor for Tgt200GrpSerialized
	**/
    public Tgt200GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt200GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_200_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt200 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_200_LEN = 5;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt200(int index, long value) {
	       replaceValue( pad(TGT_200_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt200 + index*TGT_200_LEN)
	              , TGT_200_LEN
	              );
   }

		public int tgt200Size() {
			return TGT_200_SIZE;
		}



}
  
