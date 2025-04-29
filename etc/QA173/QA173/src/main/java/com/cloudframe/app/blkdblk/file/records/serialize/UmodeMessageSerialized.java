package com.cloudframe.app.blkdblk.file.records.serialize;

/**
*  The class UmodeMessageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UmodeMessageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UmodeMessageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UMODE_MESSAGE_LENGTH = 1014;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller1;
           protected static final int FILLER_1_SIZE = 1014;
	
	/**
	* Constructor for UmodeMessageSerialized
	**/
    public UmodeMessageSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in UmodeMessageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UMODE_MESSAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginFiller1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int FILLER_1_LEN = 1;
   /**
	 *	serializeFiller1 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeFiller1(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginFiller1 + index*FILLER_1_LEN)
   	          , FILLER_1_LEN 
   	          );
   }

		public int filler1Size() {
			return FILLER_1_SIZE;
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
  
