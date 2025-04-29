package com.cloudframe.app.evalpgm.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
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
            protected  int beginInpCountd;
            protected  int beginOutCountd;
	
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
             beginInpCountd = getStartOffset() + 0;	// set offset for serialization
  
             beginOutCountd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInpCountdCounter = -1;
     public boolean isInpCountdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInpCountdCounter != sharedCounter;
         localInpCountdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inpCountd
	 *	@return inpCountd
	 */
	public char[]  getInpCountdString() {
	     return getCharArray(beginInpCountd,INP_COUNTD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inpCountdIsNumeric() {
	    return isNumeric(beginInpCountd
	                    ,beginInpCountd + INP_COUNTD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INP_COUNTD_LEN = 2;
  	/**
	 * serializeInpCountd
	 */
	protected void serializeInpCountd(int inpCountd) {
		 putNumber(beginInpCountd,inpCountd,INP_COUNTD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInpCountdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInpCountd
	 */
   	protected  int serializeInpCountd(char[] value) {
	    int  inpCountd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inpCountd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginInpCountd
		       ,2
		      );
		 localInpCountdCounter = shareString.getSerializedField().getModifiedCounter();
		return  inpCountd;
    }

   protected int checkInpCountdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInpCountd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInpCountd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInpCountd
			                 ,INP_COUNTD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inpCountd", beginInpCountd,INP_COUNTD_LEN);
    }
   	}
     int localOutCountdCounter = -1;
     public boolean isOutCountdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutCountdCounter != sharedCounter;
         localOutCountdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outCountd
	 *	@return outCountd
	 */
	public char[]  getOutCountdString() {
	     return getCharArray(beginOutCountd,OUT_COUNTD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outCountdIsNumeric() {
	    return isNumeric(beginOutCountd
	                    ,beginOutCountd + OUT_COUNTD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUT_COUNTD_LEN = 2;
  	/**
	 * serializeOutCountd
	 */
	protected void serializeOutCountd(int outCountd) {
		 putNumber(beginOutCountd,outCountd,OUT_COUNTD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutCountdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutCountd
	 */
   	protected  int serializeOutCountd(char[] value) {
	    int  outCountd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outCountd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOutCountd
		       ,2
		      );
		 localOutCountdCounter = shareString.getSerializedField().getModifiedCounter();
		return  outCountd;
    }

   protected int checkOutCountdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutCountd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutCountd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOutCountd
			                 ,OUT_COUNTD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outCountd", beginOutCountd,OUT_COUNTD_LEN);
    }
   	}




}
  
