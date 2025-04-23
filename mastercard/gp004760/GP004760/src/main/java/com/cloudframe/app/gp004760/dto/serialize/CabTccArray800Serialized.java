package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class CabTccArray800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CabTccArray800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CabTccArray800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CAB_TCC_ARRAY_800_LENGTH = 9999;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginAuthTxnCatCd800;
           protected static final int AUTH_TXN_CAT_CD_800_SIZE = 9999;
	
	/**
	* Constructor for CabTccArray800Serialized
	**/
    public CabTccArray800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CabTccArray800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CAB_TCC_ARRAY_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginAuthTxnCatCd800 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int AUTH_TXN_CAT_CD_800_LEN = 1;
   /**
	 *	serializeAuthTxnCatCd800 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeAuthTxnCatCd800(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginAuthTxnCatCd800 + index*AUTH_TXN_CAT_CD_800_LEN)
   	          , AUTH_TXN_CAT_CD_800_LEN 
   	          );
   }

		public int authTxnCatCd800Size() {
			return AUTH_TXN_CAT_CD_800_SIZE;
		}



}
  
