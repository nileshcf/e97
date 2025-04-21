package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt199GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt199GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt199GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_199_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt199;
           protected static final int TGT_199_SIZE = 10;
	
	/**
	* Constructor for Tgt199GrpSerialized
	**/
    public Tgt199GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt199GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_199_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt199 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_199_LEN = 5;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt199(int index, long value) {
	       replaceValue( pad(TGT_199_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt199 + index*TGT_199_LEN)
	              , TGT_199_LEN
	              );
   }

		public int tgt199Size() {
			return TGT_199_SIZE;
		}



}
  
