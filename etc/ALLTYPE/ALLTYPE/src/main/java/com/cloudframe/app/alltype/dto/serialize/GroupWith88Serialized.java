package com.cloudframe.app.alltype.dto.serialize;

/**
*  The class GroupWith88Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class GroupWith88Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GroupWith88Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_WITH_88_LENGTH = 112;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCBinarySign1;
            protected  int beginCBinarySign2;
            protected  int beginCBinarySign3;
            protected  int beginCBinaryUnsign1;
            protected  int beginCBinaryUnsign2;
            protected  int beginCBinaryUnsign3;
            protected  int beginCDisplaySign1;
            protected  int beginCDisplaySign2;
            protected  int beginCDisplaySign3;
            protected  int beginCDisplayUnsign1;
            protected  int beginCDisplayUnsign2;
            protected  int beginCDisplayUnsign3;
            protected  int beginCPackedSign1;
            protected  int beginCPackedUnsign1;
            protected  int beginCDecBinarySign1;
            protected  int beginCDecBinaryUnsign1;
            protected  int beginCDecDisplaySign1;
            protected  int beginCDecDisplayUnsign1;
            protected  int beginCDecPackedSign1;
            protected  int beginCDecPackedUnsign1;
            protected  int beginCChar;
            protected  int beginCCharJustRight;
            protected  int beginCCharZero9;
            protected  int beginCCharZero0;
            protected  int beginCCharZero;
	
	/**
	* Constructor for GroupWith88Serialized
	**/
    public GroupWith88Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GroupWith88Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWith88Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GroupWith88Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,836); // serialize this field at offset 836 by default 
    }
    
	/**
	* sets parent for this GroupWith88Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 836 by default
    }    
	/**
	* initializes the field in GroupWith88Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_WITH_88_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCBinarySign1 = getStartOffset() + 0;	// set offset for serialization
  
             beginCBinarySign2 = getStartOffset() + 2;	// set offset for serialization
  
             beginCBinarySign3 = getStartOffset() + 6;	// set offset for serialization
  
             beginCBinaryUnsign1 = getStartOffset() + 14;	// set offset for serialization
  
             beginCBinaryUnsign2 = getStartOffset() + 16;	// set offset for serialization
  
             beginCBinaryUnsign3 = getStartOffset() + 20;	// set offset for serialization
  
             beginCDisplaySign1 = getStartOffset() + 28;	// set offset for serialization
  
             beginCDisplaySign2 = getStartOffset() + 32;	// set offset for serialization
  
             beginCDisplaySign3 = getStartOffset() + 40;	// set offset for serialization
  
             beginCDisplayUnsign1 = getStartOffset() + 50;	// set offset for serialization
  
             beginCDisplayUnsign2 = getStartOffset() + 54;	// set offset for serialization
  
             beginCDisplayUnsign3 = getStartOffset() + 62;	// set offset for serialization
  
             beginCPackedSign1 = getStartOffset() + 72;	// set offset for serialization
  
             beginCPackedUnsign1 = getStartOffset() + 75;	// set offset for serialization
  
             beginCDecBinarySign1 = getStartOffset() + 78;	// set offset for serialization
  
             beginCDecBinaryUnsign1 = getStartOffset() + 80;	// set offset for serialization
  
             beginCDecDisplaySign1 = getStartOffset() + 82;	// set offset for serialization
  
             beginCDecDisplayUnsign1 = getStartOffset() + 85;	// set offset for serialization
  
             beginCDecPackedSign1 = getStartOffset() + 88;	// set offset for serialization
  
             beginCDecPackedUnsign1 = getStartOffset() + 90;	// set offset for serialization
  
             beginCChar = getStartOffset() + 92;	// set offset for serialization
  
             beginCCharJustRight = getStartOffset() + 97;	// set offset for serialization
  
             beginCCharZero9 = getStartOffset() + 102;	// set offset for serialization
  
             beginCCharZero0 = getStartOffset() + 102;	// set offset for serialization
  
             beginCCharZero = getStartOffset() + 107;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCBinarySign1Counter = -1;
         public boolean isCBinarySign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinarySign1Counter != sharedCounter;
            localCBinarySign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_SIGN_1_LEN = 2;
  	/**
	 * serializeCBinarySign1
	 */
	protected void serializeCBinarySign1(short cBinarySign1) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinarySign1,C_BINARY_SIGN_1_LEN)
                  ,beginCBinarySign1
                  ,C_BINARY_SIGN_1_LEN
                 );
            localCBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCBinarySign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCBinarySign1() {	 
			return (getShort(beginCBinarySign1));
   	}
         int localCBinarySign2Counter = -1;
         public boolean isCBinarySign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinarySign2Counter != sharedCounter;
            localCBinarySign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_SIGN_2_LEN = 4;
  	/**
	 * serializeCBinarySign2
	 */
	protected void serializeCBinarySign2(int cBinarySign2) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinarySign2,C_BINARY_SIGN_2_LEN)
                  ,beginCBinarySign2
                  ,C_BINARY_SIGN_2_LEN
                 );
            localCBinarySign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCBinarySign2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCBinarySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCBinarySign2() {	 
			return (getInt(beginCBinarySign2));
   	}
         int localCBinarySign3Counter = -1;
         public boolean isCBinarySign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinarySign3Counter != sharedCounter;
            localCBinarySign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_SIGN_3_LEN = 8;
  	/**
	 * serializeCBinarySign3
	 */
	protected void serializeCBinarySign3(long cBinarySign3) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinarySign3,C_BINARY_SIGN_3_LEN)
                  ,beginCBinarySign3
                  ,C_BINARY_SIGN_3_LEN
                 );
            localCBinarySign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkCBinarySign3MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshCBinarySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCBinarySign3() {	 
			return (getLong(beginCBinarySign3));
   	}
         int localCBinaryUnsign1Counter = -1;
         public boolean isCBinaryUnsign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinaryUnsign1Counter != sharedCounter;
            localCBinaryUnsign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_UNSIGN_1_LEN = 2;
  	/**
	 * serializeCBinaryUnsign1
	 */
	protected void serializeCBinaryUnsign1(int cBinaryUnsign1) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinaryUnsign1,C_BINARY_UNSIGN_1_LEN)
                  ,beginCBinaryUnsign1
                  ,C_BINARY_UNSIGN_1_LEN
                 );
            localCBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCBinaryUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCBinaryUnsign1() {	 
			return (getUnsignedShort(beginCBinaryUnsign1));
   	}
         int localCBinaryUnsign2Counter = -1;
         public boolean isCBinaryUnsign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinaryUnsign2Counter != sharedCounter;
            localCBinaryUnsign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_UNSIGN_2_LEN = 4;
  	/**
	 * serializeCBinaryUnsign2
	 */
	protected void serializeCBinaryUnsign2(long cBinaryUnsign2) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinaryUnsign2,C_BINARY_UNSIGN_2_LEN)
                  ,beginCBinaryUnsign2
                  ,C_BINARY_UNSIGN_2_LEN
                 );
            localCBinaryUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkCBinaryUnsign2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCBinaryUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCBinaryUnsign2() {	 
			return (getUnsignedInt(beginCBinaryUnsign2));
   	}
         int localCBinaryUnsign3Counter = -1;
         public boolean isCBinaryUnsign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCBinaryUnsign3Counter != sharedCounter;
            localCBinaryUnsign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int C_BINARY_UNSIGN_3_LEN = 8;
  	/**
	 * serializeCBinaryUnsign3
	 */
	protected void serializeCBinaryUnsign3(long cBinaryUnsign3) {
           replaceValue( //  save the value as string
                   getBinaryString( cBinaryUnsign3,C_BINARY_UNSIGN_3_LEN)
                  ,beginCBinaryUnsign3
                  ,C_BINARY_UNSIGN_3_LEN
                 );
            localCBinaryUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkCBinaryUnsign3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshCBinaryUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCBinaryUnsign3() {	 
			return (getLong(beginCBinaryUnsign3));
   	}
     int localCDisplaySign1Counter = -1;
     public boolean isCDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplaySign1Counter != sharedCounter;
         localCDisplaySign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplaySign1
	 *	@return cDisplaySign1
	 */
	public char[]  getCDisplaySign1String() {
	     return getCharArray(beginCDisplaySign1,C_DISPLAY_SIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplaySign1IsNumeric() {
	    return isNumeric(beginCDisplaySign1
	                    ,beginCDisplaySign1 + C_DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_SIGN_1_LEN = 4;
  	/**
	 * serializeCDisplaySign1
	 */
	protected void serializeCDisplaySign1(short cDisplaySign1) {
		 putNumber(beginCDisplaySign1,cDisplaySign1,C_DISPLAY_SIGN_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplaySign1
	 */
   	protected  short serializeCDisplaySign1(char[] value) {
	    short  cDisplaySign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplaySign1 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginCDisplaySign1
		       ,4
		      );
		 localCDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplaySign1;
    }

   protected short checkCDisplaySign1MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCDisplaySign1() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCDisplaySign1
			                 ,C_DISPLAY_SIGN_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplaySign1", beginCDisplaySign1,C_DISPLAY_SIGN_1_LEN);
    }
   	}
     int localCDisplaySign2Counter = -1;
     public boolean isCDisplaySign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplaySign2Counter != sharedCounter;
         localCDisplaySign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplaySign2
	 *	@return cDisplaySign2
	 */
	public char[]  getCDisplaySign2String() {
	     return getCharArray(beginCDisplaySign2,C_DISPLAY_SIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplaySign2IsNumeric() {
	    return isNumeric(beginCDisplaySign2
	                    ,beginCDisplaySign2 + C_DISPLAY_SIGN_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_SIGN_2_LEN = 8;
  	/**
	 * serializeCDisplaySign2
	 */
	protected void serializeCDisplaySign2(int cDisplaySign2) {
		 putNumber(beginCDisplaySign2,cDisplaySign2,C_DISPLAY_SIGN_2_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplaySign2
	 */
   	protected  int serializeCDisplaySign2(char[] value) {
	    int  cDisplaySign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplaySign2 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginCDisplaySign2
		       ,8
		      );
		 localCDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplaySign2;
    }

   protected int checkCDisplaySign2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCDisplaySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCDisplaySign2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCDisplaySign2
			                 ,C_DISPLAY_SIGN_2_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplaySign2", beginCDisplaySign2,C_DISPLAY_SIGN_2_LEN);
    }
   	}
     int localCDisplaySign3Counter = -1;
     public boolean isCDisplaySign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplaySign3Counter != sharedCounter;
         localCDisplaySign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplaySign3
	 *	@return cDisplaySign3
	 */
	public char[]  getCDisplaySign3String() {
	     return getCharArray(beginCDisplaySign3,C_DISPLAY_SIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplaySign3IsNumeric() {
	    return isNumeric(beginCDisplaySign3
	                    ,beginCDisplaySign3 + C_DISPLAY_SIGN_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_SIGN_3_LEN = 10;
  	/**
	 * serializeCDisplaySign3
	 */
	protected void serializeCDisplaySign3(long cDisplaySign3) {
		 putNumber(beginCDisplaySign3,cDisplaySign3,C_DISPLAY_SIGN_3_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplaySign3
	 */
   	protected  long serializeCDisplaySign3(char[] value) {
	    long  cDisplaySign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplaySign3 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginCDisplaySign3
		       ,10
		      );
		 localCDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplaySign3;
    }

   protected long checkCDisplaySign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCDisplaySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCDisplaySign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCDisplaySign3
			                 ,C_DISPLAY_SIGN_3_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplaySign3", beginCDisplaySign3,C_DISPLAY_SIGN_3_LEN);
    }
   	}
     int localCDisplayUnsign1Counter = -1;
     public boolean isCDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplayUnsign1Counter != sharedCounter;
         localCDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplayUnsign1
	 *	@return cDisplayUnsign1
	 */
	public char[]  getCDisplayUnsign1String() {
	     return getCharArray(beginCDisplayUnsign1,C_DISPLAY_UNSIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplayUnsign1IsNumeric() {
	    return isNumeric(beginCDisplayUnsign1
	                    ,beginCDisplayUnsign1 + C_DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_UNSIGN_1_LEN = 4;
  	/**
	 * serializeCDisplayUnsign1
	 */
	protected void serializeCDisplayUnsign1(int cDisplayUnsign1) {
		 putNumber(beginCDisplayUnsign1,cDisplayUnsign1,C_DISPLAY_UNSIGN_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplayUnsign1
	 */
   	protected  int serializeCDisplayUnsign1(char[] value) {
	    int  cDisplayUnsign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplayUnsign1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCDisplayUnsign1
		       ,4
		      );
		 localCDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplayUnsign1;
    }

   protected int checkCDisplayUnsign1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCDisplayUnsign1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCDisplayUnsign1
			                 ,C_DISPLAY_UNSIGN_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplayUnsign1", beginCDisplayUnsign1,C_DISPLAY_UNSIGN_1_LEN);
    }
   	}
     int localCDisplayUnsign2Counter = -1;
     public boolean isCDisplayUnsign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplayUnsign2Counter != sharedCounter;
         localCDisplayUnsign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplayUnsign2
	 *	@return cDisplayUnsign2
	 */
	public char[]  getCDisplayUnsign2String() {
	     return getCharArray(beginCDisplayUnsign2,C_DISPLAY_UNSIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplayUnsign2IsNumeric() {
	    return isNumeric(beginCDisplayUnsign2
	                    ,beginCDisplayUnsign2 + C_DISPLAY_UNSIGN_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_UNSIGN_2_LEN = 8;
  	/**
	 * serializeCDisplayUnsign2
	 */
	protected void serializeCDisplayUnsign2(long cDisplayUnsign2) {
		 putNumber(beginCDisplayUnsign2,cDisplayUnsign2,C_DISPLAY_UNSIGN_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplayUnsign2
	 */
   	protected  long serializeCDisplayUnsign2(char[] value) {
	    long  cDisplayUnsign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplayUnsign2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCDisplayUnsign2
		       ,8
		      );
		 localCDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplayUnsign2;
    }

   protected long checkCDisplayUnsign2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCDisplayUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCDisplayUnsign2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCDisplayUnsign2
			                 ,C_DISPLAY_UNSIGN_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplayUnsign2", beginCDisplayUnsign2,C_DISPLAY_UNSIGN_2_LEN);
    }
   	}
     int localCDisplayUnsign3Counter = -1;
     public boolean isCDisplayUnsign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDisplayUnsign3Counter != sharedCounter;
         localCDisplayUnsign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cDisplayUnsign3
	 *	@return cDisplayUnsign3
	 */
	public char[]  getCDisplayUnsign3String() {
	     return getCharArray(beginCDisplayUnsign3,C_DISPLAY_UNSIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDisplayUnsign3IsNumeric() {
	    return isNumeric(beginCDisplayUnsign3
	                    ,beginCDisplayUnsign3 + C_DISPLAY_UNSIGN_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int C_DISPLAY_UNSIGN_3_LEN = 10;
  	/**
	 * serializeCDisplayUnsign3
	 */
	protected void serializeCDisplayUnsign3(long cDisplayUnsign3) {
		 putNumber(beginCDisplayUnsign3,cDisplayUnsign3,C_DISPLAY_UNSIGN_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCDisplayUnsign3
	 */
   	protected  long serializeCDisplayUnsign3(char[] value) {
	    long  cDisplayUnsign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cDisplayUnsign3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginCDisplayUnsign3
		       ,10
		      );
		 localCDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  cDisplayUnsign3;
    }

   protected long checkCDisplayUnsign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCDisplayUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCDisplayUnsign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCDisplayUnsign3
			                 ,C_DISPLAY_UNSIGN_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cDisplayUnsign3", beginCDisplayUnsign3,C_DISPLAY_UNSIGN_3_LEN);
    }
   	}
        int localCPackedSign1Counter = -1;
        public boolean isCPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCPackedSign1Counter != sharedCounter;
           localCPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean cPackedSign1IsNumeric() {
	      return decimalIsNumeric(beginCPackedSign1,C_PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int C_PACKED_SIGN_1_LEN = 3;
  	/**
	 * 	serializeCPackedSign1
	 */
	protected void serializeCPackedSign1(short cPackedSign1) {
		   putDecimal(beginCPackedSign1,cPackedSign1,C_PACKED_SIGN_1_LEN,true);
   }
   

   protected short checkCPackedSign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshCPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCPackedSign1() throws CFException {	
   	try { 
		 return (getShortDecimal(beginCPackedSign1,C_PACKED_SIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cPackedSign1", beginCPackedSign1,C_PACKED_SIGN_1_LEN);
     }
   	}
        int localCPackedUnsign1Counter = -1;
        public boolean isCPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCPackedUnsign1Counter != sharedCounter;
           localCPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean cPackedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginCPackedUnsign1,C_PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int C_PACKED_UNSIGN_1_LEN = 3;
  	/**
	 * 	serializeCPackedUnsign1
	 */
	protected void serializeCPackedUnsign1(int cPackedUnsign1) {
		   putDecimal(beginCPackedUnsign1,cPackedUnsign1,C_PACKED_UNSIGN_1_LEN,false);
   }
   

   protected int checkCPackedUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshCPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCPackedUnsign1() throws CFException {	
   	try { 
		 return (getIntDecimal(beginCPackedUnsign1,C_PACKED_UNSIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cPackedUnsign1", beginCPackedUnsign1,C_PACKED_UNSIGN_1_LEN);
     }
   	}
         int localCDecBinarySign1Counter = -1;
         public boolean isCDecBinarySign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localCDecBinarySign1Counter != sharedCounter;
             localCDecBinarySign1Counter = sharedCounter; return hasModified;
         }
   protected static final int C_DEC_BINARY_SIGN_1_LEN = 2;
   protected static final int C_DEC_BINARY_SIGN_1_SCALE = 2;
  	/**
	 * serializeCDecBinarySign1
	 */
	protected void serializeCDecBinarySign1(BigDecimal cDecBinarySign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(cDecBinarySign1,C_DEC_BINARY_SIGN_1_LEN,C_DEC_BINARY_SIGN_1_SCALE)
                  ,beginCDecBinarySign1
                  ,C_DEC_BINARY_SIGN_1_LEN
                 );
         localCDecBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshCDecBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecBinarySign1() {	 
			return (BigDecimal.valueOf(getShort(beginCDecBinarySign1)).movePointLeft(C_DEC_BINARY_SIGN_1_SCALE));
   	}
         int localCDecBinaryUnsign1Counter = -1;
         public boolean isCDecBinaryUnsign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localCDecBinaryUnsign1Counter != sharedCounter;
             localCDecBinaryUnsign1Counter = sharedCounter; return hasModified;
         }
   protected static final int C_DEC_BINARY_UNSIGN_1_LEN = 2;
   protected static final int C_DEC_BINARY_UNSIGN_1_SCALE = 2;
  	/**
	 * serializeCDecBinaryUnsign1
	 */
	protected void serializeCDecBinaryUnsign1(BigDecimal cDecBinaryUnsign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(cDecBinaryUnsign1,C_DEC_BINARY_UNSIGN_1_LEN,C_DEC_BINARY_UNSIGN_1_SCALE)
                  ,beginCDecBinaryUnsign1
                  ,C_DEC_BINARY_UNSIGN_1_LEN
                 );
         localCDecBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshCDecBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecBinaryUnsign1() {	 
			return (BigDecimal.valueOf(getShort(beginCDecBinaryUnsign1)).movePointLeft(C_DEC_BINARY_UNSIGN_1_SCALE));
   	}
     int localCDecDisplaySign1Counter = -1;
     
     public boolean isCDecDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDecDisplaySign1Counter != sharedCounter;
         localCDecDisplaySign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of cDecDisplaySign1
	 *	@return cDecDisplaySign1
	 */
	public char[]  getCDecDisplaySign1String() {
	    return getCharArray(beginCDecDisplaySign1,C_DEC_DISPLAY_SIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDecDisplaySign1IsNumeric() {
		    return isNumeric(beginCDecDisplaySign1
	                    ,beginCDecDisplaySign1 + C_DEC_DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_DEC_DISPLAY_SIGN_1_LEN = 3;
  protected  static final int C_DEC_DISPLAY_SIGN_1_SCALE = 2;

   protected BigDecimal checkCDecDisplaySign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeCDecDisplaySign1
	 */
	protected void serializeCDecDisplaySign1(BigDecimal cDecDisplaySign1) {
	       putNumber(beginCDecDisplaySign1,cDecDisplaySign1,C_DEC_DISPLAY_SIGN_1_LEN,C_DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeCDecDisplaySign1
	 */
   	protected  BigDecimal serializeCDecDisplaySign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginCDecDisplaySign1
		       ,3
		      );		 localCDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_DEC_DISPLAY_SIGN_1_LEN,C_DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("cDecDisplaySign1", beginCDecDisplaySign1,C_DEC_DISPLAY_SIGN_1_LEN);
    	}
    }
    /**
	 *	refreshCDecDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecDisplaySign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginCDecDisplaySign1
			            ,C_DEC_DISPLAY_SIGN_1_LEN
			            ,C_DEC_DISPLAY_SIGN_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("cDecDisplaySign1", beginCDecDisplaySign1,C_DEC_DISPLAY_SIGN_1_LEN);
    }
   	}
     int localCDecDisplayUnsign1Counter = -1;
     
     public boolean isCDecDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCDecDisplayUnsign1Counter != sharedCounter;
         localCDecDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of cDecDisplayUnsign1
	 *	@return cDecDisplayUnsign1
	 */
	public char[]  getCDecDisplayUnsign1String() {
	    return getCharArray(beginCDecDisplayUnsign1,C_DEC_DISPLAY_UNSIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cDecDisplayUnsign1IsNumeric() {
		    return isNumeric(beginCDecDisplayUnsign1
	                    ,beginCDecDisplayUnsign1 + C_DEC_DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_DEC_DISPLAY_UNSIGN_1_LEN = 3;
  protected  static final int C_DEC_DISPLAY_UNSIGN_1_SCALE = 2;

   protected BigDecimal checkCDecDisplayUnsign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeCDecDisplayUnsign1
	 */
	protected void serializeCDecDisplayUnsign1(BigDecimal cDecDisplayUnsign1) {
	       putNumber(beginCDecDisplayUnsign1,cDecDisplayUnsign1,C_DEC_DISPLAY_UNSIGN_1_LEN,C_DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeCDecDisplayUnsign1
	 */
   	protected  BigDecimal serializeCDecDisplayUnsign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCDecDisplayUnsign1
		       ,3
		      );		 localCDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_DEC_DISPLAY_UNSIGN_1_LEN,C_DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("cDecDisplayUnsign1", beginCDecDisplayUnsign1,C_DEC_DISPLAY_UNSIGN_1_LEN);
    	}
    }
    /**
	 *	refreshCDecDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecDisplayUnsign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginCDecDisplayUnsign1
			            ,C_DEC_DISPLAY_UNSIGN_1_LEN
			            ,C_DEC_DISPLAY_UNSIGN_1_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("cDecDisplayUnsign1", beginCDecDisplayUnsign1,C_DEC_DISPLAY_UNSIGN_1_LEN);
    }
   	}
        int localCDecPackedSign1Counter = -1;
        public boolean isCDecPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCDecPackedSign1Counter != sharedCounter;
           localCDecPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean cDecPackedSign1IsNumeric() {
	      return decimalIsNumeric(beginCDecPackedSign1,C_DEC_PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] cDecPackedSign1String() {
            return getPackedString(beginCDecPackedSign1,C_DEC_PACKED_SIGN_1_LEN);
         }
   protected static final int C_DEC_PACKED_SIGN_1_LEN = 2;
   protected static final int C_DEC_PACKED_SIGN_1_SCALE = 2;
  	/**
	 * 	serializeCDecPackedSign1
	 */
	protected void serializeCDecPackedSign1(BigDecimal cDecPackedSign1) {
		   putDecimal(beginCDecPackedSign1,cDecPackedSign1,C_DEC_PACKED_SIGN_1_LEN,C_DEC_PACKED_SIGN_1_SCALE,true);
		 localCDecPackedSign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCDecPackedSign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshCDecPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecPackedSign1() throws CFException {	
   	try { 
		 return (getDecimal(beginCDecPackedSign1,C_DEC_PACKED_SIGN_1_LEN,C_DEC_PACKED_SIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("cDecPackedSign1", beginCDecPackedSign1,C_DEC_PACKED_SIGN_1_LEN);
     }
   	}
        int localCDecPackedUnsign1Counter = -1;
        public boolean isCDecPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCDecPackedUnsign1Counter != sharedCounter;
           localCDecPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean cDecPackedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginCDecPackedUnsign1,C_DEC_PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] cDecPackedUnsign1String() {
            return getPackedString(beginCDecPackedUnsign1,C_DEC_PACKED_UNSIGN_1_LEN);
         }
   protected static final int C_DEC_PACKED_UNSIGN_1_LEN = 2;
   protected static final int C_DEC_PACKED_UNSIGN_1_SCALE = 2;
  	/**
	 * 	serializeCDecPackedUnsign1
	 */
	protected void serializeCDecPackedUnsign1(BigDecimal cDecPackedUnsign1) {
		   putDecimal(beginCDecPackedUnsign1,cDecPackedUnsign1,C_DEC_PACKED_UNSIGN_1_LEN,C_DEC_PACKED_UNSIGN_1_SCALE,false);
		 localCDecPackedUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCDecPackedUnsign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshCDecPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCDecPackedUnsign1() throws CFException {	
   	try { 
		 return (getDecimal(beginCDecPackedUnsign1,C_DEC_PACKED_UNSIGN_1_LEN,C_DEC_PACKED_UNSIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("cDecPackedUnsign1", beginCDecPackedUnsign1,C_DEC_PACKED_UNSIGN_1_LEN);
     }
   	}
     int localCCharCounter = -1;
     public boolean isCCharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCCharCounter != sharedCounter;
         localCCharCounter = sharedCounter; return hasModified;
     }
	protected static final int C_CHAR_LEN = 5;
	/**
	 * 	serialize this CChar
	 */
   protected void serializeCChar(char[] cChar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cChar,0,getStringValue(),beginCChar,C_CHAR_LEN);
       localCCharCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCCharConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCChar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCChar() {	 
   		return (substring(getStringValue(),beginCChar,beginCChar + C_CHAR_LEN));
   	}
     int localCCharJustRightCounter = -1;
     public boolean isCCharJustRightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCCharJustRightCounter != sharedCounter;
         localCCharJustRightCounter = sharedCounter; return hasModified;
     }
	protected static final int C_CHAR_JUST_RIGHT_LEN = 5;
	/**
	 * 	serialize this CCharJustRight
	 */
   protected void serializeCCharJustRight(char[] cCharJustRight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cCharJustRight,0,getStringValue(),beginCCharJustRight,C_CHAR_JUST_RIGHT_LEN);
       localCCharJustRightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCCharJustRightConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,true, false);
   }
    /**
	 *	refreshCCharJustRight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCCharJustRight() {	 
   		return (substring(getStringValue(),beginCCharJustRight,beginCCharJustRight + C_CHAR_JUST_RIGHT_LEN));
   	}
     int localCCharZero9Counter = -1;
     public boolean isCCharZero9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCCharZero9Counter != sharedCounter;
         localCCharZero9Counter = sharedCounter; return hasModified;
     }
	protected static final int C_CHAR_ZERO_9_LEN = 5;
	/**
	 * 	serialize this CCharZero9
	 */
   protected void serializeCCharZero9(char[] cCharZero9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cCharZero9,0,getStringValue(),beginCCharZero9,C_CHAR_ZERO_9_LEN);
       localCCharZero9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCCharZero9Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCCharZero9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCCharZero9() {	 
   		return (substring(getStringValue(),beginCCharZero9,beginCCharZero9 + C_CHAR_ZERO_9_LEN));
   	}
     int localCCharZero0Counter = -1;
     public boolean isCCharZero0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCCharZero0Counter != sharedCounter;
         localCCharZero0Counter = sharedCounter; return hasModified;
     }
	protected static final int C_CHAR_ZERO_0_LEN = 5;
	/**
	 * 	serialize this CCharZero0
	 */
   protected void serializeCCharZero0(char[] cCharZero0) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cCharZero0,0,getStringValue(),beginCCharZero0,C_CHAR_ZERO_0_LEN);
       localCCharZero0Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCCharZero0Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, true);
   }
    /**
	 *	refreshCCharZero0 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCCharZero0() {	 
   		return (substring(getStringValue(),beginCCharZero0,beginCCharZero0 + C_CHAR_ZERO_0_LEN));
   	}
     int localCCharZeroCounter = -1;
     public boolean isCCharZeroModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCCharZeroCounter != sharedCounter;
         localCCharZeroCounter = sharedCounter; return hasModified;
     }
	protected static final int C_CHAR_ZERO_LEN = 5;
	/**
	 * 	serialize this CCharZero
	 */
   protected void serializeCCharZero(char[] cCharZero) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cCharZero,0,getStringValue(),beginCCharZero,C_CHAR_ZERO_LEN);
       localCCharZeroCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCCharZeroConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, true);
   }
    /**
	 *	refreshCCharZero is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCCharZero() {	 
   		return (substring(getStringValue(),beginCCharZero,beginCCharZero + C_CHAR_ZERO_LEN));
   	}




}
  
