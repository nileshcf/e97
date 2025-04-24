package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt174GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt174GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt174GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_174_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt174;
           protected static final int TGT_174_SIZE = 10;
	
	/**
	* Constructor for Tgt174GrpSerialized
	**/
    public Tgt174GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt174GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_174_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt174 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_174_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt174(int index, long value) {
	       replaceValue( pad(TGT_174_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt174 + index*TGT_174_LEN)
	              , TGT_174_LEN
	              );
   }

		public int tgt174Size() {
			return TGT_174_SIZE;
		}



}
  
