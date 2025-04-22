package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class Sys004IpmParmMasterRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys004IpmParmMasterRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys004IpmParmMasterRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_004_IPM_PARM_MASTER_RECORD_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller2;
           protected static final int FILLER_2_SIZE = 32752;
	
	/**
	* Constructor for Sys004IpmParmMasterRecordSerialized
	**/
    public Sys004IpmParmMasterRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys004IpmParmMasterRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_004_IPM_PARM_MASTER_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginFiller2 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int FILLER_2_LEN = 1;
   /**
	 *	serializeFiller2 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeFiller2(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginFiller2 + index*FILLER_2_LEN)
   	          , FILLER_2_LEN 
   	          );
   }

		public int filler2Size() {
			return FILLER_2_SIZE;
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
  
