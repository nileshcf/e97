package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ApiLayoutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApiLayoutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApiLayoutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int API_LAYOUT_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginActnCd100;
            protected  int beginQueryNo;
            protected  int beginNoOfRows;
            protected  int beginApiStatus100;
            protected  int beginApiSwitch100;
            protected  int beginAbendSwitch100;
            protected  int beginIsItConnectedToDb2100;
            protected  int beginIsItNull100;
	
	/**
	* Constructor for ApiLayoutSerialized
	**/
    public ApiLayoutSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ApiLayoutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(API_LAYOUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginActnCd100 = getStartOffset() + 0;	// set offset for serialization
  
             beginQueryNo = getStartOffset() + 1;	// set offset for serialization
  
             beginNoOfRows = getStartOffset() + 3;	// set offset for serialization
  
             beginApiStatus100 = getStartOffset() + 13;	// set offset for serialization
  
             beginApiSwitch100 = getStartOffset() + 14;	// set offset for serialization
  
             beginAbendSwitch100 = getStartOffset() + 15;	// set offset for serialization
  
             beginIsItConnectedToDb2100 = getStartOffset() + 16;	// set offset for serialization
  
             beginIsItNull100 = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localActnCd100Counter = -1;
     public boolean isActnCd100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localActnCd100Counter != sharedCounter;
         localActnCd100Counter = sharedCounter; return hasModified;
     }
	protected static final int ACTN_CD_100_LEN = 1;
	/**
	 * 	serialize this ActnCd100
	 */
   protected void serializeActnCd100(char[] actnCd100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(actnCd100,0,getStringValue(),beginActnCd100,ACTN_CD_100_LEN);
       localActnCd100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkActnCd100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshActnCd100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshActnCd100() {	 
   		return (substring(getStringValue(),beginActnCd100,beginActnCd100 + ACTN_CD_100_LEN));
   	}
         int localQueryNoCounter = -1;
         public boolean isQueryNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localQueryNoCounter != sharedCounter;
            localQueryNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int QUERY_NO_LEN = 2;
  	/**
	 * serializeQueryNo
	 */
	protected void serializeQueryNo(short queryNo) {
           replaceValue( //  save the value as string
                   getBinaryString( queryNo,QUERY_NO_LEN)
                  ,beginQueryNo
                  ,QUERY_NO_LEN
                 );
            localQueryNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkQueryNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshQueryNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshQueryNo() {	 
			return (getShort(beginQueryNo));
   	}
     int localNoOfRowsCounter = -1;
     public boolean isNoOfRowsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoOfRowsCounter != sharedCounter;
         localNoOfRowsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of noOfRows
	 *	@return noOfRows
	 */
	public char[]  getNoOfRowsString() {
	     return getCharArray(beginNoOfRows,NO_OF_ROWS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noOfRowsIsNumeric() {
	    return isNumeric(beginNoOfRows
	                    ,beginNoOfRows + NO_OF_ROWS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NO_OF_ROWS_LEN = 10;
  	/**
	 * serializeNoOfRows
	 */
	protected void serializeNoOfRows(long noOfRows) {
		 putNumber(beginNoOfRows,noOfRows,NO_OF_ROWS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNoOfRowsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNoOfRows
	 */
   	protected  long serializeNoOfRows(char[] value) {
	    long  noOfRows;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    noOfRows = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginNoOfRows
		       ,10
		      );
		 localNoOfRowsCounter = shareString.getSerializedField().getModifiedCounter();
		return  noOfRows;
    }

   protected long checkNoOfRowsMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNoOfRows is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNoOfRows() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNoOfRows
			                 ,NO_OF_ROWS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("noOfRows", beginNoOfRows,NO_OF_ROWS_LEN);
    }
   	}
     int localApiStatus100Counter = -1;
     public boolean isApiStatus100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApiStatus100Counter != sharedCounter;
         localApiStatus100Counter = sharedCounter; return hasModified;
     }
	protected static final int API_STATUS_100_LEN = 1;
	/**
	 * 	serialize this ApiStatus100
	 */
   protected void serializeApiStatus100(char[] apiStatus100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(apiStatus100,0,getStringValue(),beginApiStatus100,API_STATUS_100_LEN);
       localApiStatus100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApiStatus100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshApiStatus100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApiStatus100() {	 
   		return (substring(getStringValue(),beginApiStatus100,beginApiStatus100 + API_STATUS_100_LEN));
   	}
     int localApiSwitch100Counter = -1;
     public boolean isApiSwitch100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApiSwitch100Counter != sharedCounter;
         localApiSwitch100Counter = sharedCounter; return hasModified;
     }
	protected static final int API_SWITCH_100_LEN = 1;
	/**
	 * 	serialize this ApiSwitch100
	 */
   protected void serializeApiSwitch100(char[] apiSwitch100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(apiSwitch100,0,getStringValue(),beginApiSwitch100,API_SWITCH_100_LEN);
       localApiSwitch100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApiSwitch100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshApiSwitch100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApiSwitch100() {	 
   		return (substring(getStringValue(),beginApiSwitch100,beginApiSwitch100 + API_SWITCH_100_LEN));
   	}
     int localAbendSwitch100Counter = -1;
     public boolean isAbendSwitch100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSwitch100Counter != sharedCounter;
         localAbendSwitch100Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_SWITCH_100_LEN = 1;
	/**
	 * 	serialize this AbendSwitch100
	 */
   protected void serializeAbendSwitch100(char[] abendSwitch100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendSwitch100,0,getStringValue(),beginAbendSwitch100,ABEND_SWITCH_100_LEN);
       localAbendSwitch100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendSwitch100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAbendSwitch100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendSwitch100() {	 
   		return (substring(getStringValue(),beginAbendSwitch100,beginAbendSwitch100 + ABEND_SWITCH_100_LEN));
   	}
     int localIsItConnectedToDb2100Counter = -1;
     public boolean isIsItConnectedToDb2100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItConnectedToDb2100Counter != sharedCounter;
         localIsItConnectedToDb2100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_IT_CONNECTED_TO_DB_2100_LEN = 1;
	/**
	 * 	serialize this IsItConnectedToDb2100
	 */
   protected void serializeIsItConnectedToDb2100(char[] isItConnectedToDb2100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isItConnectedToDb2100,0,getStringValue(),beginIsItConnectedToDb2100,IS_IT_CONNECTED_TO_DB_2100_LEN);
       localIsItConnectedToDb2100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsItConnectedToDb2100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsItConnectedToDb2100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsItConnectedToDb2100() {	 
   		return (substring(getStringValue(),beginIsItConnectedToDb2100,beginIsItConnectedToDb2100 + IS_IT_CONNECTED_TO_DB_2100_LEN));
   	}
     int localIsItNull100Counter = -1;
     public boolean isIsItNull100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItNull100Counter != sharedCounter;
         localIsItNull100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_IT_NULL_100_LEN = 1;
	/**
	 * 	serialize this IsItNull100
	 */
   protected void serializeIsItNull100(char[] isItNull100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isItNull100,0,getStringValue(),beginIsItNull100,IS_IT_NULL_100_LEN);
       localIsItNull100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsItNull100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsItNull100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsItNull100() {	 
   		return (substring(getStringValue(),beginIsItNull100,beginIsItNull100 + IS_IT_NULL_100_LEN));
   	}




}
  
