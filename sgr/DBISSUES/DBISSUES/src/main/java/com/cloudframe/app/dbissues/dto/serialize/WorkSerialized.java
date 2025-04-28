package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 23;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBodyHeight;
            protected  int beginBodyHeightAux;
            protected  int beginHeightBloqtotal;
	
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
  
  
             beginBodyHeight = getStartOffset() + 0;	// set offset for serialization
  
             beginBodyHeightAux = getStartOffset() + 9;	// set offset for serialization
  
             beginHeightBloqtotal = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFsFiz018iCounter = -1;
     public boolean isFsFiz018iModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsFiz018iCounter != sharedCounter;
         localFsFiz018iCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFsFiz018iConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localFsFiz018oCounter = -1;
     public boolean isFsFiz018oModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsFiz018oCounter != sharedCounter;
         localFsFiz018oCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFsFiz018oConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localBodyHeightCounter = -1;
     
     public boolean isBodyHeightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBodyHeightCounter != sharedCounter;
         localBodyHeightCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightString() {
	    return getCharArray(beginBodyHeight,BODY_HEIGHT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bodyHeightIsNumeric() {
		    return isNumeric(beginBodyHeight
	                    ,beginBodyHeight + BODY_HEIGHT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BODY_HEIGHT_LEN = 9;
  protected  static final int BODY_HEIGHT_SCALE = 4;

   protected BigDecimal checkBodyHeightMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeBodyHeight
	 */
	protected void serializeBodyHeight(BigDecimal bodyHeight) {
	       putNumber(beginBodyHeight,bodyHeight,BODY_HEIGHT_LEN,BODY_HEIGHT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBodyHeightCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBodyHeight
	 */
   	protected  BigDecimal serializeBodyHeight(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginBodyHeight
		       ,9
		      );		 localBodyHeightCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BODY_HEIGHT_LEN,BODY_HEIGHT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bodyHeight", beginBodyHeight,BODY_HEIGHT_LEN);
    	}
    }
    /**
	 *	refreshBodyHeight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBodyHeight() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBodyHeight
			            ,BODY_HEIGHT_LEN
			            ,BODY_HEIGHT_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bodyHeight", beginBodyHeight,BODY_HEIGHT_LEN);
    }
   	}
     int localBodyHeightAuxCounter = -1;
     
     public boolean isBodyHeightAuxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBodyHeightAuxCounter != sharedCounter;
         localBodyHeightAuxCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public char[]  getBodyHeightAuxString() {
	    return getCharArray(beginBodyHeightAux,BODY_HEIGHT_AUX_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bodyHeightAuxIsNumeric() {
		    return isNumeric(beginBodyHeightAux
	                    ,beginBodyHeightAux + BODY_HEIGHT_AUX_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BODY_HEIGHT_AUX_LEN = 9;
  protected  static final int BODY_HEIGHT_AUX_SCALE = 4;

   protected BigDecimal checkBodyHeightAuxMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeBodyHeightAux
	 */
	protected void serializeBodyHeightAux(BigDecimal bodyHeightAux) {
	       putNumber(beginBodyHeightAux,bodyHeightAux,BODY_HEIGHT_AUX_LEN,BODY_HEIGHT_AUX_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBodyHeightAuxCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBodyHeightAux
	 */
   	protected  BigDecimal serializeBodyHeightAux(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginBodyHeightAux
		       ,9
		      );		 localBodyHeightAuxCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BODY_HEIGHT_AUX_LEN,BODY_HEIGHT_AUX_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bodyHeightAux", beginBodyHeightAux,BODY_HEIGHT_AUX_LEN);
    	}
    }
    /**
	 *	refreshBodyHeightAux is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBodyHeightAux() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBodyHeightAux
			            ,BODY_HEIGHT_AUX_LEN
			            ,BODY_HEIGHT_AUX_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bodyHeightAux", beginBodyHeightAux,BODY_HEIGHT_AUX_LEN);
    }
   	}
     int localHeightBloqtotalCounter = -1;
     public boolean isHeightBloqtotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeightBloqtotalCounter != sharedCounter;
         localHeightBloqtotalCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalString() {
	     return getCharArray(beginHeightBloqtotal,HEIGHT_BLOQTOTAL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean heightBloqtotalIsNumeric() {
	    return isNumeric(beginHeightBloqtotal
	                    ,beginHeightBloqtotal + HEIGHT_BLOQTOTAL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HEIGHT_BLOQTOTAL_LEN = 5;
  	/**
	 * serializeHeightBloqtotal
	 */
	protected void serializeHeightBloqtotal(int heightBloqtotal) {
		 putNumber(beginHeightBloqtotal,heightBloqtotal,HEIGHT_BLOQTOTAL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHeightBloqtotalCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHeightBloqtotal
	 */
   	protected  int serializeHeightBloqtotal(char[] value) {
	    int  heightBloqtotal;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    heightBloqtotal = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginHeightBloqtotal
		       ,5
		      );
		 localHeightBloqtotalCounter = shareString.getSerializedField().getModifiedCounter();
		return  heightBloqtotal;
    }

   protected int checkHeightBloqtotalMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshHeightBloqtotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHeightBloqtotal() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHeightBloqtotal
			                 ,HEIGHT_BLOQTOTAL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("heightBloqtotal", beginHeightBloqtotal,HEIGHT_BLOQTOTAL_LEN);
    }
   	}




}
  
