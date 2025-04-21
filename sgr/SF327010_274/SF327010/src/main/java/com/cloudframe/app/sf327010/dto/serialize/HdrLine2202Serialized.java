package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class HdrLine2202Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrLine2202Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrLine2202Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_LINE_2202_LENGTH = 124;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginServerId202;
            protected  int beginPageCount202;
	
	/**
	* Constructor for HdrLine2202Serialized
	**/
    public HdrLine2202Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrLine2202Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_LINE_2202_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginServerId202 = getStartOffset() + 11;	// set offset for serialization
  
  
  
  
  
  
             beginPageCount202 = getStartOffset() + 113;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localServerId202Counter = -1;
     public boolean isServerId202Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localServerId202Counter != sharedCounter;
         localServerId202Counter = sharedCounter; return hasModified;
     }
	protected static final int SERVER_ID_202_LEN = 3;
	/**
	 * 	serialize this ServerId202
	 */
   protected void serializeServerId202(char[] serverId202) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(serverId202,0,getStringValue(),beginServerId202,SERVER_ID_202_LEN);
       localServerId202Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkServerId202Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshServerId202 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshServerId202() {	 
   		return (substring(getStringValue(),beginServerId202,beginServerId202 + SERVER_ID_202_LEN));
   	}
     int localPageCount202Counter = -1;
     public boolean isPageCount202Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPageCount202Counter != sharedCounter;
         localPageCount202Counter = sharedCounter; return hasModified;
     }
	protected static final int PAGE_COUNT_202_LEN = 11;
	/**
	 * 	serialize this PageCount202
	 */
   protected void serializePageCount202(char[] pageCount202) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pageCount202,0,getStringValue(),beginPageCount202,PAGE_COUNT_202_LEN);
       localPageCount202Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPageCount202Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPageCount202 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPageCount202() {	 
   		return (substring(getStringValue(),beginPageCount202,beginPageCount202 + PAGE_COUNT_202_LEN));
   	}




}
  
