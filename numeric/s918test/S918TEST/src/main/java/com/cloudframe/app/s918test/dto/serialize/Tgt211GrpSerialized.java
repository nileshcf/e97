package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class Tgt211GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt211GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt211GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_211_GRP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt211;
           protected static final int TGT_211_SIZE = 10;
	
	/**
	* Constructor for Tgt211GrpSerialized
	**/
    public Tgt211GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt211GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_211_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt211 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_211_LEN = 5;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt211(int index, long value) {
	       replaceValue( pad(TGT_211_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt211 + index*TGT_211_LEN)
	              , TGT_211_LEN
	              );
   }

		public int tgt211Size() {
			return TGT_211_SIZE;
		}



}
  
