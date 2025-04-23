package com.cloudframe.app.comput.dto.serialize;

/**
*  The class Msp3pprcsIcaNum300RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Msp3pprcsIcaNum300RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Msp3pprcsIcaNum300RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSP_3PPRCS_ICA_NUM_300_REDEFINED_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginByte7300;
            protected  int beginByte6300;
            protected  int beginByte5300;
            protected  int beginByte4300;
            protected  int beginByte3300;
            protected  int beginByte2300;
            protected  int beginByte1300;
            protected  int beginByte0300;
	
	/**
	* Constructor for Msp3pprcsIcaNum300RedefinedSerialized
	**/
    public Msp3pprcsIcaNum300RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Msp3pprcsIcaNum300RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Msp3pprcsIcaNum300RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Msp3pprcsIcaNum300RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Msp3pprcsIcaNum300RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Msp3pprcsIcaNum300RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSP_3PPRCS_ICA_NUM_300_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginByte7300 = getStartOffset() + 3;	// set offset for serialization
  
             beginByte6300 = getStartOffset() + 4;	// set offset for serialization
  
             beginByte5300 = getStartOffset() + 5;	// set offset for serialization
  
             beginByte4300 = getStartOffset() + 6;	// set offset for serialization
  
             beginByte3300 = getStartOffset() + 7;	// set offset for serialization
  
             beginByte2300 = getStartOffset() + 8;	// set offset for serialization
  
             beginByte1300 = getStartOffset() + 9;	// set offset for serialization
  
             beginByte0300 = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localByte7300Counter = -1;
     public boolean isByte7300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte7300Counter != sharedCounter;
         localByte7300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte7300
	 *	@return byte7300
	 */
	public char[]  getByte7300String() {
	     return getCharArray(beginByte7300,BYTE_7300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte7300IsNumeric() {
	    return isNumeric(beginByte7300
	                    ,beginByte7300 + BYTE_7300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_7300_LEN = 1;
  	/**
	 * serializeByte7300
	 */
	protected void serializeByte7300(int byte7300) {
		 putNumber(beginByte7300,byte7300,BYTE_7300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte7300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte7300
	 */
   	protected  int serializeByte7300(char[] value) {
	    int  byte7300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte7300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte7300
		       ,1
		      );
		 localByte7300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte7300;
    }

   protected int checkByte7300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte7300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte7300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte7300
			                 ,BYTE_7300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte7300", beginByte7300,BYTE_7300_LEN);
    }
   	}
     int localByte6300Counter = -1;
     public boolean isByte6300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte6300Counter != sharedCounter;
         localByte6300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte6300
	 *	@return byte6300
	 */
	public char[]  getByte6300String() {
	     return getCharArray(beginByte6300,BYTE_6300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte6300IsNumeric() {
	    return isNumeric(beginByte6300
	                    ,beginByte6300 + BYTE_6300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_6300_LEN = 1;
  	/**
	 * serializeByte6300
	 */
	protected void serializeByte6300(int byte6300) {
		 putNumber(beginByte6300,byte6300,BYTE_6300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte6300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte6300
	 */
   	protected  int serializeByte6300(char[] value) {
	    int  byte6300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte6300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte6300
		       ,1
		      );
		 localByte6300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte6300;
    }

   protected int checkByte6300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte6300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte6300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte6300
			                 ,BYTE_6300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte6300", beginByte6300,BYTE_6300_LEN);
    }
   	}
     int localByte5300Counter = -1;
     public boolean isByte5300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte5300Counter != sharedCounter;
         localByte5300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte5300
	 *	@return byte5300
	 */
	public char[]  getByte5300String() {
	     return getCharArray(beginByte5300,BYTE_5300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte5300IsNumeric() {
	    return isNumeric(beginByte5300
	                    ,beginByte5300 + BYTE_5300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_5300_LEN = 1;
  	/**
	 * serializeByte5300
	 */
	protected void serializeByte5300(int byte5300) {
		 putNumber(beginByte5300,byte5300,BYTE_5300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte5300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte5300
	 */
   	protected  int serializeByte5300(char[] value) {
	    int  byte5300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte5300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte5300
		       ,1
		      );
		 localByte5300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte5300;
    }

   protected int checkByte5300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte5300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte5300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte5300
			                 ,BYTE_5300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte5300", beginByte5300,BYTE_5300_LEN);
    }
   	}
     int localByte4300Counter = -1;
     public boolean isByte4300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte4300Counter != sharedCounter;
         localByte4300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte4300
	 *	@return byte4300
	 */
	public char[]  getByte4300String() {
	     return getCharArray(beginByte4300,BYTE_4300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte4300IsNumeric() {
	    return isNumeric(beginByte4300
	                    ,beginByte4300 + BYTE_4300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_4300_LEN = 1;
  	/**
	 * serializeByte4300
	 */
	protected void serializeByte4300(int byte4300) {
		 putNumber(beginByte4300,byte4300,BYTE_4300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte4300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte4300
	 */
   	protected  int serializeByte4300(char[] value) {
	    int  byte4300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte4300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte4300
		       ,1
		      );
		 localByte4300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte4300;
    }

   protected int checkByte4300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte4300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte4300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte4300
			                 ,BYTE_4300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte4300", beginByte4300,BYTE_4300_LEN);
    }
   	}
     int localByte3300Counter = -1;
     public boolean isByte3300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte3300Counter != sharedCounter;
         localByte3300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte3300
	 *	@return byte3300
	 */
	public char[]  getByte3300String() {
	     return getCharArray(beginByte3300,BYTE_3300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte3300IsNumeric() {
	    return isNumeric(beginByte3300
	                    ,beginByte3300 + BYTE_3300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_3300_LEN = 1;
  	/**
	 * serializeByte3300
	 */
	protected void serializeByte3300(int byte3300) {
		 putNumber(beginByte3300,byte3300,BYTE_3300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte3300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte3300
	 */
   	protected  int serializeByte3300(char[] value) {
	    int  byte3300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte3300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte3300
		       ,1
		      );
		 localByte3300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte3300;
    }

   protected int checkByte3300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte3300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte3300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte3300
			                 ,BYTE_3300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte3300", beginByte3300,BYTE_3300_LEN);
    }
   	}
     int localByte2300Counter = -1;
     public boolean isByte2300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte2300Counter != sharedCounter;
         localByte2300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte2300
	 *	@return byte2300
	 */
	public char[]  getByte2300String() {
	     return getCharArray(beginByte2300,BYTE_2300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte2300IsNumeric() {
	    return isNumeric(beginByte2300
	                    ,beginByte2300 + BYTE_2300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_2300_LEN = 1;
  	/**
	 * serializeByte2300
	 */
	protected void serializeByte2300(int byte2300) {
		 putNumber(beginByte2300,byte2300,BYTE_2300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte2300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte2300
	 */
   	protected  int serializeByte2300(char[] value) {
	    int  byte2300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte2300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte2300
		       ,1
		      );
		 localByte2300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte2300;
    }

   protected int checkByte2300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte2300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte2300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte2300
			                 ,BYTE_2300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte2300", beginByte2300,BYTE_2300_LEN);
    }
   	}
     int localByte1300Counter = -1;
     public boolean isByte1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte1300Counter != sharedCounter;
         localByte1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte1300
	 *	@return byte1300
	 */
	public char[]  getByte1300String() {
	     return getCharArray(beginByte1300,BYTE_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte1300IsNumeric() {
	    return isNumeric(beginByte1300
	                    ,beginByte1300 + BYTE_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_1300_LEN = 1;
  	/**
	 * serializeByte1300
	 */
	protected void serializeByte1300(int byte1300) {
		 putNumber(beginByte1300,byte1300,BYTE_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte1300
	 */
   	protected  int serializeByte1300(char[] value) {
	    int  byte1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte1300
		       ,1
		      );
		 localByte1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte1300;
    }

   protected int checkByte1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte1300
			                 ,BYTE_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte1300", beginByte1300,BYTE_1300_LEN);
    }
   	}
     int localByte0300Counter = -1;
     public boolean isByte0300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByte0300Counter != sharedCounter;
         localByte0300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of byte0300
	 *	@return byte0300
	 */
	public char[]  getByte0300String() {
	     return getCharArray(beginByte0300,BYTE_0300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte0300IsNumeric() {
	    return isNumeric(beginByte0300
	                    ,beginByte0300 + BYTE_0300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTE_0300_LEN = 1;
  	/**
	 * serializeByte0300
	 */
	protected void serializeByte0300(int byte0300) {
		 putNumber(beginByte0300,byte0300,BYTE_0300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localByte0300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeByte0300
	 */
   	protected  int serializeByte0300(char[] value) {
	    int  byte0300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    byte0300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginByte0300
		       ,1
		      );
		 localByte0300Counter = shareString.getSerializedField().getModifiedCounter();
		return  byte0300;
    }

   protected int checkByte0300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshByte0300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByte0300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginByte0300
			                 ,BYTE_0300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("byte0300", beginByte0300,BYTE_0300_LEN);
    }
   	}




}
  
