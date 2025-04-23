package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class Gp004760CabTccArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Gp004760CabTccArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Gp004760CabTccArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GP_004760_CAB_TCC_ARRAY_LENGTH = 250;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginGp004760AuthTxnCatCd;
           protected static final int GP_004760_AUTH_TXN_CAT_CD_SIZE = 250;
	
	/**
	* Constructor for Gp004760CabTccArraySerialized
	**/
    public Gp004760CabTccArraySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Gp004760CabTccArraySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Gp004760CabTccArraySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Gp004760CabTccArraySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Gp004760CabTccArraySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Gp004760CabTccArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GP_004760_CAB_TCC_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginGp004760AuthTxnCatCd = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int GP_004760_AUTH_TXN_CAT_CD_LEN = 1;
   /**
	 *	serializeGp004760AuthTxnCatCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGp004760AuthTxnCatCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGp004760AuthTxnCatCd + index*GP_004760_AUTH_TXN_CAT_CD_LEN)
   	          , GP_004760_AUTH_TXN_CAT_CD_LEN 
   	          );
   }

		public int gp004760AuthTxnCatCdSize() {
			return GP_004760_AUTH_TXN_CAT_CD_SIZE;
		}



}
  
