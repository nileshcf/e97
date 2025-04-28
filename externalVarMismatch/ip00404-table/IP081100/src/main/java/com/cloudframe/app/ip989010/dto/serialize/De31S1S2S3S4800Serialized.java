package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class De31S1S2S3S4800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De31S1S2S3S4800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De31S1S2S3S4800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_31_S_1_S_2_S_3_S_4800_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe31S1800;
            protected  int beginDe31S2800;
            protected  int beginDe31S3800;
            protected  int beginDe31S4800;
	
	/**
	* Constructor for De31S1S2S3S4800Serialized
	**/
    public De31S1S2S3S4800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De31S1S2S3S4800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31S1S2S3S4800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De31S1S2S3S4800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,107); // serialize this field at offset 107 by default 
    }
    
	/**
	* sets parent for this De31S1S2S3S4800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 107 by default
    }    
	/**
	* initializes the field in De31S1S2S3S4800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_31_S_1_S_2_S_3_S_4800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe31S1800 = getStartOffset() + 0;	// set offset for serialization
  
             beginDe31S2800 = getStartOffset() + 1;	// set offset for serialization
  
             beginDe31S3800 = getStartOffset() + 7;	// set offset for serialization
  
             beginDe31S4800 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe31S1800Counter = -1;
     public boolean isDe31S1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe31S1800Counter != sharedCounter;
         localDe31S1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de31S1800
	 *	@return de31S1800
	 */
	public char[]  getDe31S1800String() {
	     return getCharArray(beginDe31S1800,DE_31_S_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de31S1800IsNumeric() {
	    return isNumeric(beginDe31S1800
	                    ,beginDe31S1800 + DE_31_S_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_31_S_1800_LEN = 1;
  	/**
	 * serializeDe31S1800
	 */
	protected void serializeDe31S1800(int de31S1800) {
		 putNumber(beginDe31S1800,de31S1800,DE_31_S_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe31S1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe31S1800
	 */
   	protected  int serializeDe31S1800(char[] value) {
	    int  de31S1800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de31S1800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginDe31S1800
		       ,1
		      );
		 localDe31S1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de31S1800;
    }

   protected int checkDe31S1800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe31S1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe31S1800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe31S1800
			                 ,DE_31_S_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de31S1800", beginDe31S1800,DE_31_S_1800_LEN);
    }
   	}
     int localDe31S2800Counter = -1;
     public boolean isDe31S2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe31S2800Counter != sharedCounter;
         localDe31S2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de31S2800
	 *	@return de31S2800
	 */
	public char[]  getDe31S2800String() {
	     return getCharArray(beginDe31S2800,DE_31_S_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de31S2800IsNumeric() {
	    return isNumeric(beginDe31S2800
	                    ,beginDe31S2800 + DE_31_S_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_31_S_2800_LEN = 6;
  	/**
	 * serializeDe31S2800
	 */
	protected void serializeDe31S2800(long de31S2800) {
		 putNumber(beginDe31S2800,de31S2800,DE_31_S_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe31S2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe31S2800
	 */
   	protected  long serializeDe31S2800(char[] value) {
	    long  de31S2800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de31S2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginDe31S2800
		       ,6
		      );
		 localDe31S2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de31S2800;
    }

   protected long checkDe31S2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe31S2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDe31S2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDe31S2800
			                 ,DE_31_S_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de31S2800", beginDe31S2800,DE_31_S_2800_LEN);
    }
   	}
     int localDe31S3800Counter = -1;
     public boolean isDe31S3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe31S3800Counter != sharedCounter;
         localDe31S3800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de31S3800
	 *	@return de31S3800
	 */
	public char[]  getDe31S3800String() {
	     return getCharArray(beginDe31S3800,DE_31_S_3800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de31S3800IsNumeric() {
	    return isNumeric(beginDe31S3800
	                    ,beginDe31S3800 + DE_31_S_3800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_31_S_3800_LEN = 4;
  	/**
	 * serializeDe31S3800
	 */
	protected void serializeDe31S3800(int de31S3800) {
		 putNumber(beginDe31S3800,de31S3800,DE_31_S_3800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe31S3800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe31S3800
	 */
   	protected  int serializeDe31S3800(char[] value) {
	    int  de31S3800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de31S3800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDe31S3800
		       ,4
		      );
		 localDe31S3800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de31S3800;
    }

   protected int checkDe31S3800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe31S3800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe31S3800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe31S3800
			                 ,DE_31_S_3800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de31S3800", beginDe31S3800,DE_31_S_3800_LEN);
    }
   	}
     int localDe31S4800Counter = -1;
     public boolean isDe31S4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe31S4800Counter != sharedCounter;
         localDe31S4800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de31S4800
	 *	@return de31S4800
	 */
	public char[]  getDe31S4800String() {
	     return getCharArray(beginDe31S4800,DE_31_S_4800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de31S4800IsNumeric() {
	    return isNumeric(beginDe31S4800
	                    ,beginDe31S4800 + DE_31_S_4800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_31_S_4800_LEN = 11;
  	/**
	 * serializeDe31S4800
	 */
	protected void serializeDe31S4800(long de31S4800) {
		 putNumber(beginDe31S4800,de31S4800,DE_31_S_4800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe31S4800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe31S4800
	 */
   	protected  long serializeDe31S4800(char[] value) {
	    long  de31S4800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de31S4800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginDe31S4800
		       ,11
		      );
		 localDe31S4800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de31S4800;
    }

   protected long checkDe31S4800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe31S4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDe31S4800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDe31S4800
			                 ,DE_31_S_4800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de31S4800", beginDe31S4800,DE_31_S_4800_LEN);
    }
   	}




}
  
