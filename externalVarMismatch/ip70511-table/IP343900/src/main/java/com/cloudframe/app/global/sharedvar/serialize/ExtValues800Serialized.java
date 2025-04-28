package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ExtValues800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtValues800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtValues800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_VALUES_800_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOperationCode800;
            protected  int beginClrCyclId800;
            protected  int beginUpdateModFileInd800;
	
	/**
	* Constructor for ExtValues800Serialized
	**/
    public ExtValues800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExtValues800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_VALUES_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOperationCode800 = getStartOffset() + 0;	// set offset for serialization
  
             beginClrCyclId800 = getStartOffset() + 2;	// set offset for serialization
  
             beginUpdateModFileInd800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOperationCode800Counter = -1;
     public boolean isOperationCode800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOperationCode800Counter != sharedCounter;
         localOperationCode800Counter = sharedCounter; return hasModified;
     }
	protected static final int OPERATION_CODE_800_LEN = 2;
	/**
	 * 	serialize this OperationCode800
	 */
   protected void serializeOperationCode800(char[] operationCode800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(operationCode800,0,getStringValue(),beginOperationCode800,OPERATION_CODE_800_LEN);
       localOperationCode800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOperationCode800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshOperationCode800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOperationCode800() {	 
   		return (substring(getStringValue(),beginOperationCode800,beginOperationCode800 + OPERATION_CODE_800_LEN));
   	}
     int localClrCyclId800Counter = -1;
     public boolean isClrCyclId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClrCyclId800Counter != sharedCounter;
         localClrCyclId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public char[]  getClrCyclId800String() {
	     return getCharArray(beginClrCyclId800,CLR_CYCL_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clrCyclId800IsNumeric() {
	    return isNumeric(beginClrCyclId800
	                    ,beginClrCyclId800 + CLR_CYCL_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLR_CYCL_ID_800_LEN = 2;
  	/**
	 * serializeClrCyclId800
	 */
	protected void serializeClrCyclId800(int clrCyclId800) {
		 putNumber(beginClrCyclId800,clrCyclId800,CLR_CYCL_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeClrCyclId800
	 */
   	protected  int serializeClrCyclId800(char[] value) {
	    int  clrCyclId800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    clrCyclId800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginClrCyclId800
		       ,2
		      );
		 localClrCyclId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  clrCyclId800;
    }

   protected int checkClrCyclId800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshClrCyclId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshClrCyclId800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginClrCyclId800
			                 ,CLR_CYCL_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("clrCyclId800", beginClrCyclId800,CLR_CYCL_ID_800_LEN);
    }
   	}
     int localUpdateModFileInd800Counter = -1;
     public boolean isUpdateModFileInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUpdateModFileInd800Counter != sharedCounter;
         localUpdateModFileInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int UPDATE_MOD_FILE_IND_800_LEN = 3;
	/**
	 * 	serialize this UpdateModFileInd800
	 */
   protected void serializeUpdateModFileInd800(char[] updateModFileInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(updateModFileInd800,0,getStringValue(),beginUpdateModFileInd800,UPDATE_MOD_FILE_IND_800_LEN);
       localUpdateModFileInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUpdateModFileInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUpdateModFileInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUpdateModFileInd800() {	 
   		return (substring(getStringValue(),beginUpdateModFileInd800,beginUpdateModFileInd800 + UPDATE_MOD_FILE_IND_800_LEN));
   	}




}
  
