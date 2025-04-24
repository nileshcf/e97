package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class IpmErrorElementId600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IpmErrorElementId600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IpmErrorElementId600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IPM_ERROR_ELEMENT_ID_600_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIpmErrorElementType600;
            protected  int beginIpmErrorElementNo600;
	
	/**
	* Constructor for IpmErrorElementId600Serialized
	**/
    public IpmErrorElementId600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IpmErrorElementId600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpmErrorElementId600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IpmErrorElementId600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32); // serialize this field at offset 32 by default 
    }
    
	/**
	* sets parent for this IpmErrorElementId600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32 by default
    }    
	/**
	* initializes the field in IpmErrorElementId600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IPM_ERROR_ELEMENT_ID_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIpmErrorElementType600 = getStartOffset() + 0;	// set offset for serialization
  
             beginIpmErrorElementNo600 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIpmErrorElementType600Counter = -1;
     public boolean isIpmErrorElementType600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorElementType600Counter != sharedCounter;
         localIpmErrorElementType600Counter = sharedCounter; return hasModified;
     }
	protected static final int IPM_ERROR_ELEMENT_TYPE_600_LEN = 1;
	/**
	 * 	serialize this IpmErrorElementType600
	 */
   protected void serializeIpmErrorElementType600(char[] ipmErrorElementType600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ipmErrorElementType600,0,getStringValue(),beginIpmErrorElementType600,IPM_ERROR_ELEMENT_TYPE_600_LEN);
       localIpmErrorElementType600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIpmErrorElementType600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIpmErrorElementType600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIpmErrorElementType600() {	 
   		return (substring(getStringValue(),beginIpmErrorElementType600,beginIpmErrorElementType600 + IPM_ERROR_ELEMENT_TYPE_600_LEN));
   	}
     int localIpmErrorElementNo600Counter = -1;
     public boolean isIpmErrorElementNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorElementNo600Counter != sharedCounter;
         localIpmErrorElementNo600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public char[]  getIpmErrorElementNo600String() {
	     return getCharArray(beginIpmErrorElementNo600,IPM_ERROR_ELEMENT_NO_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ipmErrorElementNo600IsNumeric() {
	    return isNumeric(beginIpmErrorElementNo600
	                    ,beginIpmErrorElementNo600 + IPM_ERROR_ELEMENT_NO_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IPM_ERROR_ELEMENT_NO_600_LEN = 4;
  	/**
	 * serializeIpmErrorElementNo600
	 */
	protected void serializeIpmErrorElementNo600(int ipmErrorElementNo600) {
		 putNumber(beginIpmErrorElementNo600,ipmErrorElementNo600,IPM_ERROR_ELEMENT_NO_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIpmErrorElementNo600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIpmErrorElementNo600
	 */
   	protected  int serializeIpmErrorElementNo600(char[] value) {
	    int  ipmErrorElementNo600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ipmErrorElementNo600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIpmErrorElementNo600
		       ,4
		      );
		 localIpmErrorElementNo600Counter = shareString.getSerializedField().getModifiedCounter();
		return  ipmErrorElementNo600;
    }

   protected int checkIpmErrorElementNo600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIpmErrorElementNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIpmErrorElementNo600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIpmErrorElementNo600
			                 ,IPM_ERROR_ELEMENT_NO_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ipmErrorElementNo600", beginIpmErrorElementNo600,IPM_ERROR_ELEMENT_NO_600_LEN);
    }
   	}




}
  
