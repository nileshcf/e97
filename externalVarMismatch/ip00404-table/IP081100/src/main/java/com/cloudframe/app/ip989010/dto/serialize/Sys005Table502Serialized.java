package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Sys005Table502Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys005Table502Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys005Table502Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_005_TABLE_502_LENGTH = 6000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSys005Data502;
           protected static final int SYS_005_DATA_502_SIZE = 1000;
	
	/**
	* Constructor for Sys005Table502Serialized
	**/
    public Sys005Table502Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys005Table502Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_005_TABLE_502_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSys005Data502 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int SYS_005_DATA_502_LEN = 6;
   /**
	 *	serializeSys005Data502 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSys005Data502(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSys005Data502 + index*SYS_005_DATA_502_LEN)
   	          , SYS_005_DATA_502_LEN 
   	          );
   }

		public int sys005Data502Size() {
			return SYS_005_DATA_502_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  6);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  6);
     }
}
  
