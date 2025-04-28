package com.cloudframe.app.mcsort02.file.records.serialize;

/**
*  The class Sys002IpmParmMasterRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys002IpmParmMasterRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys002IpmParmMasterRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_002_IPM_PARM_MASTER_RECORD_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFiller1;
           protected static final int FILLER_1_SIZE = 32752;
	
	/**
	* Constructor for Sys002IpmParmMasterRecordSerialized
	**/
    public Sys002IpmParmMasterRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys002IpmParmMasterRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_002_IPM_PARM_MASTER_RECORD_LENGTH);
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
  
