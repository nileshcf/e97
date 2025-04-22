package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class Db2ErrModuleMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2ErrModuleMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2ErrModuleMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2_ERR_MODULE_MSG_600_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb2ErrRtnCode600;
	
	/**
	* Constructor for Db2ErrModuleMsg600Serialized
	**/
    public Db2ErrModuleMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db2ErrModuleMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2_ERR_MODULE_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDb2ErrRtnCode600 = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb2ErrRtnCode600Counter = -1;
     public boolean isDb2ErrRtnCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ErrRtnCode600Counter != sharedCounter;
         localDb2ErrRtnCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_ERR_RTN_CODE_600_LEN = 18;
	/**
	 * 	serialize this Db2ErrRtnCode600
	 */
   protected void serializeDb2ErrRtnCode600(char[] db2ErrRtnCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2ErrRtnCode600,0,getStringValue(),beginDb2ErrRtnCode600,DB_2_ERR_RTN_CODE_600_LEN);
       localDb2ErrRtnCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2ErrRtnCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDb2ErrRtnCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2ErrRtnCode600() {	 
   		return (substring(getStringValue(),beginDb2ErrRtnCode600,beginDb2ErrRtnCode600 + DB_2_ERR_RTN_CODE_600_LEN));
   	}




}
  
