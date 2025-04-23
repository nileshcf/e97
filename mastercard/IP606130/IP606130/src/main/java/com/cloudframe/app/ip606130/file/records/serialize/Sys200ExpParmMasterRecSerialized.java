package com.cloudframe.app.ip606130.file.records.serialize;

/**
*  The class Sys200ExpParmMasterRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys200ExpParmMasterRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys200ExpParmMasterRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_200_EXP_PARM_MASTER_REC_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller3;
           protected static final int FILLER_3_SIZE = 32752;
	
	/**
	* Constructor for Sys200ExpParmMasterRecSerialized
	**/
    public Sys200ExpParmMasterRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys200ExpParmMasterRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_200_EXP_PARM_MASTER_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginFiller3 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int FILLER_3_LEN = 1;
   /**
	 *	serializeFiller3 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeFiller3(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginFiller3 + index*FILLER_3_LEN)
   	          , FILLER_3_LEN 
   	          );
   }

		public int filler3Size() {
			return FILLER_3_SIZE;
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
  
