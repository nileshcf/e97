package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MsgOut260Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgOut260Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgOut260Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_OUT_260_LENGTH = 1904;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSysMsgOutArray260;
           protected static final int SYS_MSG_OUT_ARRAY_260_SIZE = 20;
            protected  int beginSysMsgOutMaxCnt260;
            protected  int beginSysMsgOutCnt260;
            protected  int beginConsMsgOut260;
	
	/**
	* Constructor for MsgOut260Serialized
	**/
    public MsgOut260Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgOut260Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_OUT_260_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSysMsgOutArray260 = getStartOffset() + 0; // set offset for serialization
  
             beginSysMsgOutMaxCnt260 = getStartOffset() + 1600;	// set offset for serialization
  
             beginSysMsgOutCnt260 = getStartOffset() + 1602;	// set offset for serialization
  
             beginConsMsgOut260 = getStartOffset() + 1604;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSysMsgOutMaxCnt260Counter = -1;
     public boolean isSysMsgOutMaxCnt260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysMsgOutMaxCnt260Counter != sharedCounter;
         localSysMsgOutMaxCnt260Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sysMsgOutMaxCnt260
	 *	@return sysMsgOutMaxCnt260
	 */
	public char[]  getSysMsgOutMaxCnt260String() {
	     return getCharArray(beginSysMsgOutMaxCnt260,SYS_MSG_OUT_MAX_CNT_260_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sysMsgOutMaxCnt260IsNumeric() {
	    return isNumeric(beginSysMsgOutMaxCnt260
	                    ,beginSysMsgOutMaxCnt260 + SYS_MSG_OUT_MAX_CNT_260_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_MSG_OUT_MAX_CNT_260_LEN = 2;
  	/**
	 * serializeSysMsgOutMaxCnt260
	 */
	protected void serializeSysMsgOutMaxCnt260(int sysMsgOutMaxCnt260) {
		 putNumber(beginSysMsgOutMaxCnt260,sysMsgOutMaxCnt260,SYS_MSG_OUT_MAX_CNT_260_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSysMsgOutMaxCnt260Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSysMsgOutMaxCnt260
	 */
   	protected  int serializeSysMsgOutMaxCnt260(char[] value) {
	    int  sysMsgOutMaxCnt260;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sysMsgOutMaxCnt260 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSysMsgOutMaxCnt260
		       ,2
		      );
		 localSysMsgOutMaxCnt260Counter = shareString.getSerializedField().getModifiedCounter();
		return  sysMsgOutMaxCnt260;
    }

   protected int checkSysMsgOutMaxCnt260MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSysMsgOutMaxCnt260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysMsgOutMaxCnt260() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSysMsgOutMaxCnt260
			                 ,SYS_MSG_OUT_MAX_CNT_260_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sysMsgOutMaxCnt260", beginSysMsgOutMaxCnt260,SYS_MSG_OUT_MAX_CNT_260_LEN);
    }
   	}
     int localSysMsgOutCnt260Counter = -1;
     public boolean isSysMsgOutCnt260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysMsgOutCnt260Counter != sharedCounter;
         localSysMsgOutCnt260Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sysMsgOutCnt260
	 *	@return sysMsgOutCnt260
	 */
	public char[]  getSysMsgOutCnt260String() {
	     return getCharArray(beginSysMsgOutCnt260,SYS_MSG_OUT_CNT_260_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sysMsgOutCnt260IsNumeric() {
	    return isNumeric(beginSysMsgOutCnt260
	                    ,beginSysMsgOutCnt260 + SYS_MSG_OUT_CNT_260_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_MSG_OUT_CNT_260_LEN = 2;
  	/**
	 * serializeSysMsgOutCnt260
	 */
	protected void serializeSysMsgOutCnt260(int sysMsgOutCnt260) {
		 putNumber(beginSysMsgOutCnt260,sysMsgOutCnt260,SYS_MSG_OUT_CNT_260_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSysMsgOutCnt260Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSysMsgOutCnt260
	 */
   	protected  int serializeSysMsgOutCnt260(char[] value) {
	    int  sysMsgOutCnt260;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sysMsgOutCnt260 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSysMsgOutCnt260
		       ,2
		      );
		 localSysMsgOutCnt260Counter = shareString.getSerializedField().getModifiedCounter();
		return  sysMsgOutCnt260;
    }

   protected int checkSysMsgOutCnt260MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSysMsgOutCnt260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysMsgOutCnt260() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSysMsgOutCnt260
			                 ,SYS_MSG_OUT_CNT_260_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sysMsgOutCnt260", beginSysMsgOutCnt260,SYS_MSG_OUT_CNT_260_LEN);
    }
   	}
     int localConsMsgOut260Counter = -1;
     public boolean isConsMsgOut260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConsMsgOut260Counter != sharedCounter;
         localConsMsgOut260Counter = sharedCounter; return hasModified;
     }
	protected static final int CONS_MSG_OUT_260_LEN = 300;
	/**
	 * 	serialize this ConsMsgOut260
	 */
   protected void serializeConsMsgOut260(char[] consMsgOut260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(consMsgOut260,0,getStringValue(),beginConsMsgOut260,CONS_MSG_OUT_260_LEN);
       localConsMsgOut260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConsMsgOut260Constraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
    /**
	 *	refreshConsMsgOut260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConsMsgOut260() {	 
   		return (substring(getStringValue(),beginConsMsgOut260,beginConsMsgOut260 + CONS_MSG_OUT_260_LEN));
   	}

		public int sysMsgOutArray260Size() {
			return SYS_MSG_OUT_ARRAY_260_SIZE;
		}



}
  
