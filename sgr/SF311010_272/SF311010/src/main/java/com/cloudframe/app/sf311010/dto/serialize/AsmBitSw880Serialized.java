package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AsmBitSw880Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsmBitSw880Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsmBitSw880Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASM_BIT_SW_880_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBit0880;
            protected  int beginBit1880;
            protected  int beginBit2880;
            protected  int beginBit3880;
            protected  int beginBit4880;
            protected  int beginBit5880;
            protected  int beginBit6880;
            protected  int beginBit7880;
	
	/**
	* Constructor for AsmBitSw880Serialized
	**/
    public AsmBitSw880Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsmBitSw880Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsmBitSw880Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsmBitSw880Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this AsmBitSw880Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in AsmBitSw880Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASM_BIT_SW_880_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBit0880 = getStartOffset() + 0;	// set offset for serialization
  
             beginBit1880 = getStartOffset() + 1;	// set offset for serialization
  
             beginBit2880 = getStartOffset() + 2;	// set offset for serialization
  
             beginBit3880 = getStartOffset() + 3;	// set offset for serialization
  
             beginBit4880 = getStartOffset() + 4;	// set offset for serialization
  
             beginBit5880 = getStartOffset() + 5;	// set offset for serialization
  
             beginBit6880 = getStartOffset() + 6;	// set offset for serialization
  
             beginBit7880 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBit0880Counter = -1;
     public boolean isBit0880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit0880Counter != sharedCounter;
         localBit0880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit0880
	 *	@return bit0880
	 */
	public char[]  getBit0880String() {
	     return getCharArray(beginBit0880,BIT_0880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit0880IsNumeric() {
	    return isNumeric(beginBit0880
	                    ,beginBit0880 + BIT_0880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_0880_LEN = 1;
  	/**
	 * serializeBit0880
	 */
	protected void serializeBit0880(int bit0880) {
		 putNumber(beginBit0880,bit0880,BIT_0880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit0880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit0880
	 */
   	protected  int serializeBit0880(char[] value) {
	    int  bit0880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit0880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit0880
		       ,1
		      );
		 localBit0880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit0880;
    }

   protected int checkBit0880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit0880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit0880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit0880
			                 ,BIT_0880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit0880", beginBit0880,BIT_0880_LEN);
    }
   	}
     int localBit1880Counter = -1;
     public boolean isBit1880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit1880Counter != sharedCounter;
         localBit1880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit1880
	 *	@return bit1880
	 */
	public char[]  getBit1880String() {
	     return getCharArray(beginBit1880,BIT_1880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit1880IsNumeric() {
	    return isNumeric(beginBit1880
	                    ,beginBit1880 + BIT_1880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_1880_LEN = 1;
  	/**
	 * serializeBit1880
	 */
	protected void serializeBit1880(int bit1880) {
		 putNumber(beginBit1880,bit1880,BIT_1880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit1880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit1880
	 */
   	protected  int serializeBit1880(char[] value) {
	    int  bit1880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit1880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit1880
		       ,1
		      );
		 localBit1880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit1880;
    }

   protected int checkBit1880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit1880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit1880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit1880
			                 ,BIT_1880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit1880", beginBit1880,BIT_1880_LEN);
    }
   	}
     int localBit2880Counter = -1;
     public boolean isBit2880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit2880Counter != sharedCounter;
         localBit2880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit2880
	 *	@return bit2880
	 */
	public char[]  getBit2880String() {
	     return getCharArray(beginBit2880,BIT_2880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit2880IsNumeric() {
	    return isNumeric(beginBit2880
	                    ,beginBit2880 + BIT_2880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_2880_LEN = 1;
  	/**
	 * serializeBit2880
	 */
	protected void serializeBit2880(int bit2880) {
		 putNumber(beginBit2880,bit2880,BIT_2880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit2880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit2880
	 */
   	protected  int serializeBit2880(char[] value) {
	    int  bit2880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit2880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit2880
		       ,1
		      );
		 localBit2880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit2880;
    }

   protected int checkBit2880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit2880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit2880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit2880
			                 ,BIT_2880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit2880", beginBit2880,BIT_2880_LEN);
    }
   	}
     int localBit3880Counter = -1;
     public boolean isBit3880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit3880Counter != sharedCounter;
         localBit3880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit3880
	 *	@return bit3880
	 */
	public char[]  getBit3880String() {
	     return getCharArray(beginBit3880,BIT_3880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit3880IsNumeric() {
	    return isNumeric(beginBit3880
	                    ,beginBit3880 + BIT_3880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_3880_LEN = 1;
  	/**
	 * serializeBit3880
	 */
	protected void serializeBit3880(int bit3880) {
		 putNumber(beginBit3880,bit3880,BIT_3880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit3880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit3880
	 */
   	protected  int serializeBit3880(char[] value) {
	    int  bit3880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit3880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit3880
		       ,1
		      );
		 localBit3880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit3880;
    }

   protected int checkBit3880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit3880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit3880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit3880
			                 ,BIT_3880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit3880", beginBit3880,BIT_3880_LEN);
    }
   	}
     int localBit4880Counter = -1;
     public boolean isBit4880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit4880Counter != sharedCounter;
         localBit4880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit4880
	 *	@return bit4880
	 */
	public char[]  getBit4880String() {
	     return getCharArray(beginBit4880,BIT_4880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit4880IsNumeric() {
	    return isNumeric(beginBit4880
	                    ,beginBit4880 + BIT_4880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_4880_LEN = 1;
  	/**
	 * serializeBit4880
	 */
	protected void serializeBit4880(int bit4880) {
		 putNumber(beginBit4880,bit4880,BIT_4880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit4880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit4880
	 */
   	protected  int serializeBit4880(char[] value) {
	    int  bit4880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit4880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit4880
		       ,1
		      );
		 localBit4880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit4880;
    }

   protected int checkBit4880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit4880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit4880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit4880
			                 ,BIT_4880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit4880", beginBit4880,BIT_4880_LEN);
    }
   	}
     int localBit5880Counter = -1;
     public boolean isBit5880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit5880Counter != sharedCounter;
         localBit5880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit5880
	 *	@return bit5880
	 */
	public char[]  getBit5880String() {
	     return getCharArray(beginBit5880,BIT_5880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit5880IsNumeric() {
	    return isNumeric(beginBit5880
	                    ,beginBit5880 + BIT_5880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_5880_LEN = 1;
  	/**
	 * serializeBit5880
	 */
	protected void serializeBit5880(int bit5880) {
		 putNumber(beginBit5880,bit5880,BIT_5880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit5880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit5880
	 */
   	protected  int serializeBit5880(char[] value) {
	    int  bit5880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit5880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit5880
		       ,1
		      );
		 localBit5880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit5880;
    }

   protected int checkBit5880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit5880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit5880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit5880
			                 ,BIT_5880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit5880", beginBit5880,BIT_5880_LEN);
    }
   	}
     int localBit6880Counter = -1;
     public boolean isBit6880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit6880Counter != sharedCounter;
         localBit6880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit6880
	 *	@return bit6880
	 */
	public char[]  getBit6880String() {
	     return getCharArray(beginBit6880,BIT_6880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit6880IsNumeric() {
	    return isNumeric(beginBit6880
	                    ,beginBit6880 + BIT_6880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_6880_LEN = 1;
  	/**
	 * serializeBit6880
	 */
	protected void serializeBit6880(int bit6880) {
		 putNumber(beginBit6880,bit6880,BIT_6880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit6880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit6880
	 */
   	protected  int serializeBit6880(char[] value) {
	    int  bit6880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit6880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit6880
		       ,1
		      );
		 localBit6880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit6880;
    }

   protected int checkBit6880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit6880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit6880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit6880
			                 ,BIT_6880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit6880", beginBit6880,BIT_6880_LEN);
    }
   	}
     int localBit7880Counter = -1;
     public boolean isBit7880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBit7880Counter != sharedCounter;
         localBit7880Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bit7880
	 *	@return bit7880
	 */
	public char[]  getBit7880String() {
	     return getCharArray(beginBit7880,BIT_7880_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bit7880IsNumeric() {
	    return isNumeric(beginBit7880
	                    ,beginBit7880 + BIT_7880_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIT_7880_LEN = 1;
  	/**
	 * serializeBit7880
	 */
	protected void serializeBit7880(int bit7880) {
		 putNumber(beginBit7880,bit7880,BIT_7880_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBit7880Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBit7880
	 */
   	protected  int serializeBit7880(char[] value) {
	    int  bit7880;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bit7880 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBit7880
		       ,1
		      );
		 localBit7880Counter = shareString.getSerializedField().getModifiedCounter();
		return  bit7880;
    }

   protected int checkBit7880MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBit7880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBit7880() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBit7880
			                 ,BIT_7880_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bit7880", beginBit7880,BIT_7880_LEN);
    }
   	}




}
  
