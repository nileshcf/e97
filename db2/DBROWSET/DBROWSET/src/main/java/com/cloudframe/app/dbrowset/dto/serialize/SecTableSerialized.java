package com.cloudframe.app.dbrowset.dto.serialize;

/**
*  The class SecTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SecTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SecTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEC_TABLE_LENGTH = 1000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIsin;
           protected static final int ISIN_SIZE = 20;
           protected int beginSedol;
           protected static final int SEDOL_SIZE = 20;
           protected int beginRic;
           protected static final int RIC_SIZE = 20;
	
	/**
	* Constructor for SecTableSerialized
	**/
    public SecTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SecTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEC_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIsin = getStartOffset() + 0; // set offset for serialization
  
	        beginSedol = getStartOffset() + 640; // set offset for serialization
  
	        beginRic = getStartOffset() + 800; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int ISIN_LEN = 32;
   /**
	 *	serializeIsin as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIsin(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIsin + index*ISIN_LEN)
   	          , ISIN_LEN 
   	          );
   }
 
   
  protected  static final int SEDOL_LEN = 8;
   /**
	 *	serializeSedol as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSedol(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSedol + index*SEDOL_LEN)
   	          , SEDOL_LEN 
   	          );
   }
 
   
  protected  static final int RIC_LEN = 10;
   /**
	 *	serializeRic as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeRic(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginRic + index*RIC_LEN)
   	          , RIC_LEN 
   	          );
   }

		public int isinSize() {
			return ISIN_SIZE;
		}
		public int sedolSize() {
			return SEDOL_SIZE;
		}
		public int ricSize() {
			return RIC_SIZE;
		}



}
  
