package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
            protected  int beginPrtBookId;
            protected  int beginPrtIsbn;
            protected  int beginPrtPublishedDateLen;
            protected  int beginPrtPublisherId;
            protected  int beginPrtRating;
            protected  int beginPrtTitleLen;
            protected  int beginPrtTotalPages;
	
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
  
             beginSqlcode_Ws = getStartOffset() + 0;	// set offset for serialization
  
  
             beginPrtBookId = getStartOffset() + 4;	// set offset for serialization
  
             beginPrtIsbn = getStartOffset() + 14;	// set offset for serialization
  
             beginPrtPublishedDateLen = getStartOffset() + 24;	// set offset for serialization
  
  
             beginPrtPublisherId = getStartOffset() + 28;	// set offset for serialization
  
             beginPrtRating = getStartOffset() + 38;	// set offset for serialization
  
             beginPrtTitleLen = getStartOffset() + 48;	// set offset for serialization
  
  
             beginPrtTotalPages = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb2varcl01Counter = -1;
     public boolean isDb2varcl01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2varcl01Counter != sharedCounter;
         localDb2varcl01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2varcl01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE__WS_LEN = 4;
	/**
	 * 	serialize this Sqlcode_Ws
	 */
   protected void serializeSqlcode_Ws(char[] sqlcode_Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcode_Ws,0,getStringValue(),beginSqlcode_Ws,SQLCODE__WS_LEN);
       localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcode_WsConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcode_Ws() {	 
   		return (substring(getStringValue(),beginSqlcode_Ws,beginSqlcode_Ws + SQLCODE__WS_LEN));
   	}
     int localEofFlagCounter = -1;
     public boolean isEofFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofFlagCounter != sharedCounter;
         localEofFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrtBookIdCounter = -1;
     public boolean isPrtBookIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtBookIdCounter != sharedCounter;
         localPrtBookIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_BOOK_ID_LEN = 10;
	/**
	 * 	serialize this PrtBookId
	 */
   protected void serializePrtBookId(char[] prtBookId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtBookId,0,getStringValue(),beginPrtBookId,PRT_BOOK_ID_LEN);
       localPrtBookIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtBookIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPrtBookId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtBookId() {	 
   		return (substring(getStringValue(),beginPrtBookId,beginPrtBookId + PRT_BOOK_ID_LEN));
   	}
     int localPrtIsbnCounter = -1;
     public boolean isPrtIsbnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtIsbnCounter != sharedCounter;
         localPrtIsbnCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_ISBN_LEN = 10;
	/**
	 * 	serialize this PrtIsbn
	 */
   protected void serializePrtIsbn(char[] prtIsbn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtIsbn,0,getStringValue(),beginPrtIsbn,PRT_ISBN_LEN);
       localPrtIsbnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtIsbnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPrtIsbn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtIsbn() {	 
   		return (substring(getStringValue(),beginPrtIsbn,beginPrtIsbn + PRT_ISBN_LEN));
   	}
     int localPrtPublishedDateLenCounter = -1;
     public boolean isPrtPublishedDateLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtPublishedDateLenCounter != sharedCounter;
         localPrtPublishedDateLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public char[]  getPrtPublishedDateLenString() {
	     return getCharArray(beginPrtPublishedDateLen,PRT_PUBLISHED_DATE_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtPublishedDateLenIsNumeric() {
	    return isNumeric(beginPrtPublishedDateLen
	                    ,beginPrtPublishedDateLen + PRT_PUBLISHED_DATE_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PRT_PUBLISHED_DATE_LEN_LEN = 4;
  	/**
	 * serializePrtPublishedDateLen
	 */
	protected void serializePrtPublishedDateLen(int prtPublishedDateLen) {
		 putNumber(beginPrtPublishedDateLen,prtPublishedDateLen,PRT_PUBLISHED_DATE_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPrtPublishedDateLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePrtPublishedDateLen
	 */
   	protected  int serializePrtPublishedDateLen(char[] value) {
	    int  prtPublishedDateLen;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    prtPublishedDateLen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPrtPublishedDateLen
		       ,4
		      );
		 localPrtPublishedDateLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  prtPublishedDateLen;
    }

   protected int checkPrtPublishedDateLenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPrtPublishedDateLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrtPublishedDateLen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPrtPublishedDateLen
			                 ,PRT_PUBLISHED_DATE_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("prtPublishedDateLen", beginPrtPublishedDateLen,PRT_PUBLISHED_DATE_LEN_LEN);
    }
   	}
     int localPrtPublishedDateTextCounter = -1;
     public boolean isPrtPublishedDateTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtPublishedDateTextCounter != sharedCounter;
         localPrtPublishedDateTextCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrtPublishedDateTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
     int localPrtPublisherIdCounter = -1;
     public boolean isPrtPublisherIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtPublisherIdCounter != sharedCounter;
         localPrtPublisherIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_PUBLISHER_ID_LEN = 10;
	/**
	 * 	serialize this PrtPublisherId
	 */
   protected void serializePrtPublisherId(char[] prtPublisherId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtPublisherId,0,getStringValue(),beginPrtPublisherId,PRT_PUBLISHER_ID_LEN);
       localPrtPublisherIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtPublisherIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPrtPublisherId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtPublisherId() {	 
   		return (substring(getStringValue(),beginPrtPublisherId,beginPrtPublisherId + PRT_PUBLISHER_ID_LEN));
   	}
     int localPrtRatingCounter = -1;
     public boolean isPrtRatingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtRatingCounter != sharedCounter;
         localPrtRatingCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_RATING_LEN = 10;
	/**
	 * 	serialize this PrtRating
	 */
   protected void serializePrtRating(char[] prtRating) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtRating,0,getStringValue(),beginPrtRating,PRT_RATING_LEN);
       localPrtRatingCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtRatingConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPrtRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtRating() {	 
   		return (substring(getStringValue(),beginPrtRating,beginPrtRating + PRT_RATING_LEN));
   	}
     int localPrtTitleLenCounter = -1;
     public boolean isPrtTitleLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtTitleLenCounter != sharedCounter;
         localPrtTitleLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public char[]  getPrtTitleLenString() {
	     return getCharArray(beginPrtTitleLen,PRT_TITLE_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtTitleLenIsNumeric() {
	    return isNumeric(beginPrtTitleLen
	                    ,beginPrtTitleLen + PRT_TITLE_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PRT_TITLE_LEN_LEN = 4;
  	/**
	 * serializePrtTitleLen
	 */
	protected void serializePrtTitleLen(int prtTitleLen) {
		 putNumber(beginPrtTitleLen,prtTitleLen,PRT_TITLE_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPrtTitleLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePrtTitleLen
	 */
   	protected  int serializePrtTitleLen(char[] value) {
	    int  prtTitleLen;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    prtTitleLen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPrtTitleLen
		       ,4
		      );
		 localPrtTitleLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  prtTitleLen;
    }

   protected int checkPrtTitleLenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPrtTitleLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrtTitleLen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPrtTitleLen
			                 ,PRT_TITLE_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("prtTitleLen", beginPrtTitleLen,PRT_TITLE_LEN_LEN);
    }
   	}
     int localPrtTitleTextCounter = -1;
     public boolean isPrtTitleTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtTitleTextCounter != sharedCounter;
         localPrtTitleTextCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrtTitleTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
     int localPrtTotalPagesCounter = -1;
     public boolean isPrtTotalPagesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrtTotalPagesCounter != sharedCounter;
         localPrtTotalPagesCounter = sharedCounter; return hasModified;
     }
	protected static final int PRT_TOTAL_PAGES_LEN = 10;
	/**
	 * 	serialize this PrtTotalPages
	 */
   protected void serializePrtTotalPages(char[] prtTotalPages) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prtTotalPages,0,getStringValue(),beginPrtTotalPages,PRT_TOTAL_PAGES_LEN);
       localPrtTotalPagesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrtTotalPagesConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPrtTotalPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrtTotalPages() {	 
   		return (substring(getStringValue(),beginPrtTotalPages,beginPrtTotalPages + PRT_TOTAL_PAGES_LEN));
   	}




}
  
