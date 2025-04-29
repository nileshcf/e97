package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys201OutRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201OutRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201OutRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_OUT_REC_LENGTH = 27990;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller;
           protected static final int FILLER_SIZE = 27990;
	
	/**
	* Constructor for Sys201OutRecSerialized
	**/
    public Sys201OutRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201OutRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_OUT_REC_LENGTH);
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
  
