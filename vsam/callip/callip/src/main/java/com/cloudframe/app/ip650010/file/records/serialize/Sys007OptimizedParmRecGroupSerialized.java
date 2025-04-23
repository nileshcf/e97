package com.cloudframe.app.ip650010.file.records.serialize;

/**
*  The class Sys007OptimizedParmRecGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys007OptimizedParmRecGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys007OptimizedParmRecGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_007_OPTIMIZED_PARM_REC_GROUP_LENGTH = 32756;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sys007OptimizedParmRecGroupSerialized
	**/
    public Sys007OptimizedParmRecGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys007OptimizedParmRecGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_007_OPTIMIZED_PARM_REC_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
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
  
