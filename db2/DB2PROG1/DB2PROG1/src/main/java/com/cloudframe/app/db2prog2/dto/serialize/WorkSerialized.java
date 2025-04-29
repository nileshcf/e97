package com.cloudframe.app.db2prog2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcodeDisp;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlcodeDisp = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlcodeDispCounter = -1;
     public boolean isSqlcodeDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcodeDispCounter != sharedCounter;
         localSqlcodeDispCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE_DISP_LEN = 4;
	/**
	 * 	serialize this SqlcodeDisp
	 */
   protected void serializeSqlcodeDisp(char[] sqlcodeDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcodeDisp,0,getStringValue(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
       localSqlcodeDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcodeDispConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcodeDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcodeDisp() {	 
   		return (substring(getStringValue(),beginSqlcodeDisp,beginSqlcodeDisp + SQLCODE_DISP_LEN));
   	}




}
  
