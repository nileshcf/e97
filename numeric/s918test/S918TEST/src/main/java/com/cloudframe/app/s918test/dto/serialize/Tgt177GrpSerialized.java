package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt177GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt177GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt177GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_177_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt177;
           protected static final int TGT_177_SIZE = 10;
	
	/**
	* Constructor for Tgt177GrpSerialized
	**/
    public Tgt177GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt177GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_177_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt177 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_177_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt177(int index, long value) {
	       replaceValue( pad(TGT_177_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt177 + index*TGT_177_LEN)
	              , TGT_177_LEN
	              );
   }

		public int tgt177Size() {
			return TGT_177_SIZE;
		}



}
  
