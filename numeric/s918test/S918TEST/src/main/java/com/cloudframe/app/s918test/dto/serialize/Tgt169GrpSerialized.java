package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt169GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt169GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt169GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_169_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt169;
           protected static final int TGT_169_SIZE = 10;
	
	/**
	* Constructor for Tgt169GrpSerialized
	**/
    public Tgt169GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt169GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_169_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt169 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_169_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt169(int index, long value) {
	       replaceValue( pad(TGT_169_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt169 + index*TGT_169_LEN)
	              , TGT_169_LEN
	              );
   }

		public int tgt169Size() {
			return TGT_169_SIZE;
		}



}
  
