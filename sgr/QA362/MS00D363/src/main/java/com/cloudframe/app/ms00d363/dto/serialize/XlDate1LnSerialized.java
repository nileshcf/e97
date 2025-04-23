package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class XlDate1LnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XlDate1LnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XlDate1LnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XL_DATE_1_LN_LENGTH = 500;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXl1Mm;
            protected  int beginXl1Dd;
            protected  int beginXl1Yy;
	
	/**
	* Constructor for XlDate1LnSerialized
	**/
    public XlDate1LnSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in XlDate1LnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XL_DATE_1_LN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginXl1Mm = getStartOffset() + 1;	// set offset for serialization
  
  
             beginXl1Dd = getStartOffset() + 4;	// set offset for serialization
  
  
             beginXl1Yy = getStartOffset() + 7;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localXl1MmCounter = -1;
     public boolean isXl1MmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1MmCounter != sharedCounter;
         localXl1MmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xl1Mm
	 *	@return xl1Mm
	 */
	public char[]  getXl1MmString() {
	     return getCharArray(beginXl1Mm,XL_1_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xl1MmIsNumeric() {
	    return isNumeric(beginXl1Mm
	                    ,beginXl1Mm + XL_1_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XL_1_MM_LEN = 2;
  	/**
	 * serializeXl1Mm
	 */
	protected void serializeXl1Mm(int xl1Mm) {
		 putNumber(beginXl1Mm,xl1Mm,XL_1_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXl1MmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXl1Mm
	 */
   	protected  int serializeXl1Mm(char[] value) {
	    int  xl1Mm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xl1Mm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginXl1Mm
		       ,2
		      );
		 localXl1MmCounter = shareString.getSerializedField().getModifiedCounter();
		return  xl1Mm;
    }

   protected int checkXl1MmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXl1Mm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXl1Mm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXl1Mm
			                 ,XL_1_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xl1Mm", beginXl1Mm,XL_1_MM_LEN);
    }
   	}
     int localXl1DdCounter = -1;
     public boolean isXl1DdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1DdCounter != sharedCounter;
         localXl1DdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xl1Dd
	 *	@return xl1Dd
	 */
	public char[]  getXl1DdString() {
	     return getCharArray(beginXl1Dd,XL_1_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xl1DdIsNumeric() {
	    return isNumeric(beginXl1Dd
	                    ,beginXl1Dd + XL_1_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XL_1_DD_LEN = 2;
  	/**
	 * serializeXl1Dd
	 */
	protected void serializeXl1Dd(int xl1Dd) {
		 putNumber(beginXl1Dd,xl1Dd,XL_1_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXl1DdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXl1Dd
	 */
   	protected  int serializeXl1Dd(char[] value) {
	    int  xl1Dd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xl1Dd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginXl1Dd
		       ,2
		      );
		 localXl1DdCounter = shareString.getSerializedField().getModifiedCounter();
		return  xl1Dd;
    }

   protected int checkXl1DdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXl1Dd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXl1Dd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXl1Dd
			                 ,XL_1_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xl1Dd", beginXl1Dd,XL_1_DD_LEN);
    }
   	}
     int localXl1YyCounter = -1;
     public boolean isXl1YyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXl1YyCounter != sharedCounter;
         localXl1YyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xl1Yy
	 *	@return xl1Yy
	 */
	public char[]  getXl1YyString() {
	     return getCharArray(beginXl1Yy,XL_1_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xl1YyIsNumeric() {
	    return isNumeric(beginXl1Yy
	                    ,beginXl1Yy + XL_1_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XL_1_YY_LEN = 2;
  	/**
	 * serializeXl1Yy
	 */
	protected void serializeXl1Yy(int xl1Yy) {
		 putNumber(beginXl1Yy,xl1Yy,XL_1_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXl1YyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXl1Yy
	 */
   	protected  int serializeXl1Yy(char[] value) {
	    int  xl1Yy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xl1Yy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginXl1Yy
		       ,2
		      );
		 localXl1YyCounter = shareString.getSerializedField().getModifiedCounter();
		return  xl1Yy;
    }

   protected int checkXl1YyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXl1Yy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXl1Yy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXl1Yy
			                 ,XL_1_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xl1Yy", beginXl1Yy,XL_1_YY_LEN);
    }
   	}




}
  
