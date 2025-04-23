package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt212GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt212GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt212GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_212_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt212;
           protected static final int TGT_212_SIZE = 10;
	
	/**
	* Constructor for Tgt212GrpSerialized
	**/
    public Tgt212GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt212GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_212_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt212 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_212_LEN = 5;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt212(int index, long value) {
	       replaceValue( pad(TGT_212_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt212 + index*TGT_212_LEN)
	              , TGT_212_LEN
	              );
   }

		public int tgt212Size() {
			return TGT_212_SIZE;
		}



}
  
