package com.cloudframe.app.ip809050.file.records.serialize;

/**
*  The class Sys001InputIpmOutboundRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001InputIpmOutboundRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001InputIpmOutboundRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_INPUT_IPM_OUTBOUND_REC_LENGTH = 32756;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller;
           protected static final int FILLER_SIZE = 32756;
	
	/**
	* Constructor for Sys001InputIpmOutboundRecSerialized
	**/
    public Sys001InputIpmOutboundRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001InputIpmOutboundRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_INPUT_IPM_OUTBOUND_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginFiller = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int FILLER_LEN = 1;
   /**
	 *	serializeFiller as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeFiller(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginFiller + index*FILLER_LEN)
   	          , FILLER_LEN 
   	          );
   }

		public int fillerSize() {
			return FILLER_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  1);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  1);
     }
}
  
