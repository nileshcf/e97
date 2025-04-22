package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt154GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt154GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt154GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_154_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt154;
           protected static final int TGT_154_SIZE = 10;
	
	/**
	* Constructor for Tgt154GrpSerialized
	**/
    public Tgt154GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt154GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_154_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt154 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_154_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt154(int index, long value) {
	       replaceValue( pad(TGT_154_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt154 + index*TGT_154_LEN)
	              , TGT_154_LEN
	              );
   }

		public int tgt154Size() {
			return TGT_154_SIZE;
		}



}
  
