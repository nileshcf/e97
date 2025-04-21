package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class Tgt161GrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tgt161GrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tgt161GrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TGT_161_GRP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTgt161;
           protected static final int TGT_161_SIZE = 10;
	
	/**
	* Constructor for Tgt161GrpSerialized
	**/
    public Tgt161GrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tgt161GrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TGT_161_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTgt161 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
  protected  static final int TGT_161_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeTgt161(int index, long value) {
	       replaceValue( pad(TGT_161_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginTgt161 + index*TGT_161_LEN)
	              , TGT_161_LEN
	              );
   }

		public int tgt161Size() {
			return TGT_161_SIZE;
		}



}
  
