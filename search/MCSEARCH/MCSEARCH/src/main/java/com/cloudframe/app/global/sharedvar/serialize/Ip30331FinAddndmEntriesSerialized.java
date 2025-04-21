package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30331FinAddndmEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30331FinAddndmEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30331FinAddndmEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30331_FIN_ADDNDM_ENTRIES_LENGTH = 130004;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30331Subscript;
           protected int beginIp30331FaFileIdStatusTbl;
           protected static final int IP_30331_FA_FILE_ID_STATUS_TBL_SIZE = 5000;
	
	/**
	* Constructor for Ip30331FinAddndmEntriesSerialized
	**/
    public Ip30331FinAddndmEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip30331FinAddndmEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30331_FIN_ADDNDM_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30331Subscript = getStartOffset() + 0;	// set offset for serialization
  
	        beginIp30331FaFileIdStatusTbl = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localIp30331SubscriptCounter = -1;
         public boolean isIp30331SubscriptModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp30331SubscriptCounter != sharedCounter;
            localIp30331SubscriptCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_30331_SUBSCRIPT_LEN = 4;
  	/**
	 * serializeIp30331Subscript
	 */
	protected void serializeIp30331Subscript(int ip30331Subscript) {
           replaceValue( //  save the value as string
                   getBinaryString( ip30331Subscript,IP_30331_SUBSCRIPT_LEN)
                  ,beginIp30331Subscript
                  ,IP_30331_SUBSCRIPT_LEN
                 );
            localIp30331SubscriptCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp30331SubscriptMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp30331Subscript is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30331Subscript() {	 
			return (getInt(beginIp30331Subscript));
   	}

		public int ip30331FaFileIdStatusTblSize() {
			return IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;
		}



}
  
