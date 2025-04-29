package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip3oo8o1EditsPerfTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip3oo8o1EditsPerfTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip3oo8o1EditsPerfTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp3oo8o1EditsHolder;
            protected  int beginIp3oo8o1EditsInitStr;
	
	/**
	* Constructor for Ip3oo8o1EditsPerfTblSerialized
	**/
    public Ip3oo8o1EditsPerfTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip3oo8o1EditsPerfTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp3oo8o1EditsHolder = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp3oo8o1EditsInitStr = getStartOffset() + 4000;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp3oo8o1EditsHolderCounter = -1;
     public boolean isIp3oo8o1EditsHolderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp3oo8o1EditsHolderCounter != sharedCounter;
         localIp3oo8o1EditsHolderCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_3OO_8O_1_EDITS_HOLDER_LEN = 4000;
	/**
	 * 	serialize this Ip3oo8o1EditsHolder
	 */
   protected void serializeIp3oo8o1EditsHolder(char[] ip3oo8o1EditsHolder) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip3oo8o1EditsHolder,0,getStringValue(),beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
       localIp3oo8o1EditsHolderCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp3oo8o1EditsHolderConstraints(char[] value) {
   			return super.checkConstraints(value , 4000 ,false, false);
   }
    /**
	 *	refreshIp3oo8o1EditsHolder is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp3oo8o1EditsHolder() {	 
   		return (substring(getStringValue(),beginIp3oo8o1EditsHolder,beginIp3oo8o1EditsHolder + IP_3OO_8O_1_EDITS_HOLDER_LEN));
   	}
     int localIp3oo8o1EditsInitStrCounter = -1;
     public boolean isIp3oo8o1EditsInitStrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp3oo8o1EditsInitStrCounter != sharedCounter;
         localIp3oo8o1EditsInitStrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_3OO_8O_1_EDITS_INIT_STR_LEN = 4000;
	/**
	 * 	serialize this Ip3oo8o1EditsInitStr
	 */
   protected void serializeIp3oo8o1EditsInitStr(char[] ip3oo8o1EditsInitStr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip3oo8o1EditsInitStr,0,getStringValue(),beginIp3oo8o1EditsInitStr,IP_3OO_8O_1_EDITS_INIT_STR_LEN);
       localIp3oo8o1EditsInitStrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp3oo8o1EditsInitStrConstraints(char[] value) {
   			return super.checkConstraints(value , 4000 ,false, false);
   }
    /**
	 *	refreshIp3oo8o1EditsInitStr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp3oo8o1EditsInitStr() {	 
   		return (substring(getStringValue(),beginIp3oo8o1EditsInitStr,beginIp3oo8o1EditsInitStr + IP_3OO_8O_1_EDITS_INIT_STR_LEN));
   	}




}
  
