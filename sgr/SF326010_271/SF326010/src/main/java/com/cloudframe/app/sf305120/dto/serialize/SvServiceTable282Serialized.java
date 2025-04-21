package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class SvServiceTable282Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SvServiceTable282Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SvServiceTable282Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SV_SERVICE_TABLE_282_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvServiceId282;
            protected  int beginSvServiceLnth282;
            protected  int beginSvServiceStatus282;
            protected  int beginSvElapsedTimeX282;
	
	/**
	* Constructor for SvServiceTable282Serialized
	**/
    public SvServiceTable282Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SvServiceTable282Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SvServiceTable282Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SvServiceTable282Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this SvServiceTable282Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in SvServiceTable282Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SV_SERVICE_TABLE_282_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvServiceId282 = getStartOffset() + 0;	// set offset for serialization
  
             beginSvServiceLnth282 = getStartOffset() + 4;	// set offset for serialization
  
             beginSvServiceStatus282 = getStartOffset() + 6;	// set offset for serialization
  
             beginSvElapsedTimeX282 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSvServiceId282Counter = -1;
     public boolean isSvServiceId282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvServiceId282Counter != sharedCounter;
         localSvServiceId282Counter = sharedCounter; return hasModified;
     }
	protected static final int SV_SERVICE_ID_282_LEN = 4;
	/**
	 * 	serialize this SvServiceId282
	 */
   protected void serializeSvServiceId282(char[] svServiceId282) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svServiceId282,0,getStringValue(),beginSvServiceId282,SV_SERVICE_ID_282_LEN);
       localSvServiceId282Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvServiceId282Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSvServiceId282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvServiceId282() {	 
   		return (substring(getStringValue(),beginSvServiceId282,beginSvServiceId282 + SV_SERVICE_ID_282_LEN));
   	}
     int localSvServiceLnth282Counter = -1;
     public boolean isSvServiceLnth282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvServiceLnth282Counter != sharedCounter;
         localSvServiceLnth282Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of svServiceLnth282
	 *	@return svServiceLnth282
	 */
	public char[]  getSvServiceLnth282String() {
	     return getCharArray(beginSvServiceLnth282,SV_SERVICE_LNTH_282_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean svServiceLnth282IsNumeric() {
	    return isNumeric(beginSvServiceLnth282
	                    ,beginSvServiceLnth282 + SV_SERVICE_LNTH_282_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SV_SERVICE_LNTH_282_LEN = 2;
  	/**
	 * serializeSvServiceLnth282
	 */
	protected void serializeSvServiceLnth282(int svServiceLnth282) {
		 putNumber(beginSvServiceLnth282,svServiceLnth282,SV_SERVICE_LNTH_282_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSvServiceLnth282Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSvServiceLnth282
	 */
   	protected  int serializeSvServiceLnth282(char[] value) {
	    int  svServiceLnth282;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    svServiceLnth282 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSvServiceLnth282
		       ,2
		      );
		 localSvServiceLnth282Counter = shareString.getSerializedField().getModifiedCounter();
		return  svServiceLnth282;
    }

   protected int checkSvServiceLnth282MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSvServiceLnth282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSvServiceLnth282() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSvServiceLnth282
			                 ,SV_SERVICE_LNTH_282_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("svServiceLnth282", beginSvServiceLnth282,SV_SERVICE_LNTH_282_LEN);
    }
   	}
     int localSvServiceStatus282Counter = -1;
     public boolean isSvServiceStatus282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvServiceStatus282Counter != sharedCounter;
         localSvServiceStatus282Counter = sharedCounter; return hasModified;
     }
	protected static final int SV_SERVICE_STATUS_282_LEN = 1;
	/**
	 * 	serialize this SvServiceStatus282
	 */
   protected void serializeSvServiceStatus282(char[] svServiceStatus282) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svServiceStatus282,0,getStringValue(),beginSvServiceStatus282,SV_SERVICE_STATUS_282_LEN);
       localSvServiceStatus282Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvServiceStatus282Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSvServiceStatus282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvServiceStatus282() {	 
   		return (substring(getStringValue(),beginSvServiceStatus282,beginSvServiceStatus282 + SV_SERVICE_STATUS_282_LEN));
   	}
     int localSvElapsedTimeX282Counter = -1;
     public boolean isSvElapsedTimeX282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvElapsedTimeX282Counter != sharedCounter;
         localSvElapsedTimeX282Counter = sharedCounter; return hasModified;
     }
	protected static final int SV_ELAPSED_TIME_X_282_LEN = 6;
	/**
	 * 	serialize this SvElapsedTimeX282
	 */
   protected void serializeSvElapsedTimeX282(char[] svElapsedTimeX282) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svElapsedTimeX282,0,getStringValue(),beginSvElapsedTimeX282,SV_ELAPSED_TIME_X_282_LEN);
       localSvElapsedTimeX282Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvElapsedTimeX282Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSvElapsedTimeX282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvElapsedTimeX282() {	 
   		return (substring(getStringValue(),beginSvElapsedTimeX282,beginSvElapsedTimeX282 + SV_ELAPSED_TIME_X_282_LEN));
   	}




}
  
