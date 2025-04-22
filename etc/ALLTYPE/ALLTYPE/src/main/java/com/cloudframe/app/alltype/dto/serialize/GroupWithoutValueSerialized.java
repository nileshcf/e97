package com.cloudframe.app.alltype.dto.serialize;

/**
*  The class GroupWithoutValueSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class GroupWithoutValueSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GroupWithoutValueSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_WITHOUT_VALUE_LENGTH = 209;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBinarySign1;
            protected  int beginBinarySign2;
            protected  int beginBinarySign3;
            protected  int beginBinaryUnsign1;
            protected  int beginBinaryUnsign2;
            protected  int beginBinaryUnsign3;
            protected  int beginDisplaySign1;
            protected  int beginDisplaySign2;
            protected  int beginDisplaySign3;
            protected  int beginDisplayUnsign1;
            protected  int beginDisplayUnsign2;
            protected  int beginDisplayUnsign3;
            protected  int beginPackedSign1;
            protected  int beginPackedSign2;
            protected  int beginPackedSign3;
            protected  int beginPackedUnsign1;
            protected  int beginPackedUnsign2;
            protected  int beginPackedUnsign3;
            protected  int beginDecBinarySign1;
            protected  int beginDecBinarySign2;
            protected  int beginDecBinarySign3;
            protected  int beginDecBinaryUnsign1;
            protected  int beginDecBinaryUnsign2;
            protected  int beginDecBinaryUnsign3;
            protected  int beginDecDisplaySign1;
            protected  int beginDecDisplaySign2;
            protected  int beginDecDisplaySign3;
            protected  int beginDecDisplayUnsign1;
            protected  int beginDecDisplayUnsign2;
            protected  int beginDecDisplayUnsign3;
            protected  int beginDecPackedSign1;
            protected  int beginDecPackedSign2;
            protected  int beginDecPackedSign3;
            protected  int beginDecPackedUnsign1;
            protected  int beginDecPackedUnsign2;
            protected  int beginDecPackedUnsign3;
            protected  int beginCharWs;
            protected  int beginCharJustRight;
            protected  int beginCharZero;
	
	/**
	* Constructor for GroupWithoutValueSerialized
	**/
    public GroupWithoutValueSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GroupWithoutValueSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithoutValueSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GroupWithoutValueSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this GroupWithoutValueSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in GroupWithoutValueSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_WITHOUT_VALUE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBinarySign1 = getStartOffset() + 0;	// set offset for serialization
  
             beginBinarySign2 = getStartOffset() + 2;	// set offset for serialization
  
             beginBinarySign3 = getStartOffset() + 6;	// set offset for serialization
  
             beginBinaryUnsign1 = getStartOffset() + 14;	// set offset for serialization
  
             beginBinaryUnsign2 = getStartOffset() + 16;	// set offset for serialization
  
             beginBinaryUnsign3 = getStartOffset() + 20;	// set offset for serialization
  
             beginDisplaySign1 = getStartOffset() + 28;	// set offset for serialization
  
             beginDisplaySign2 = getStartOffset() + 32;	// set offset for serialization
  
             beginDisplaySign3 = getStartOffset() + 40;	// set offset for serialization
  
             beginDisplayUnsign1 = getStartOffset() + 50;	// set offset for serialization
  
             beginDisplayUnsign2 = getStartOffset() + 54;	// set offset for serialization
  
             beginDisplayUnsign3 = getStartOffset() + 62;	// set offset for serialization
  
             beginPackedSign1 = getStartOffset() + 72;	// set offset for serialization
  
             beginPackedSign2 = getStartOffset() + 75;	// set offset for serialization
  
             beginPackedSign3 = getStartOffset() + 80;	// set offset for serialization
  
             beginPackedUnsign1 = getStartOffset() + 86;	// set offset for serialization
  
             beginPackedUnsign2 = getStartOffset() + 89;	// set offset for serialization
  
             beginPackedUnsign3 = getStartOffset() + 94;	// set offset for serialization
  
             beginDecBinarySign1 = getStartOffset() + 100;	// set offset for serialization
  
             beginDecBinarySign2 = getStartOffset() + 102;	// set offset for serialization
  
             beginDecBinarySign3 = getStartOffset() + 106;	// set offset for serialization
  
             beginDecBinaryUnsign1 = getStartOffset() + 114;	// set offset for serialization
  
             beginDecBinaryUnsign2 = getStartOffset() + 116;	// set offset for serialization
  
             beginDecBinaryUnsign3 = getStartOffset() + 120;	// set offset for serialization
  
             beginDecDisplaySign1 = getStartOffset() + 128;	// set offset for serialization
  
             beginDecDisplaySign2 = getStartOffset() + 131;	// set offset for serialization
  
             beginDecDisplaySign3 = getStartOffset() + 139;	// set offset for serialization
  
             beginDecDisplayUnsign1 = getStartOffset() + 149;	// set offset for serialization
  
             beginDecDisplayUnsign2 = getStartOffset() + 152;	// set offset for serialization
  
             beginDecDisplayUnsign3 = getStartOffset() + 159;	// set offset for serialization
  
             beginDecPackedSign1 = getStartOffset() + 169;	// set offset for serialization
  
             beginDecPackedSign2 = getStartOffset() + 171;	// set offset for serialization
  
             beginDecPackedSign3 = getStartOffset() + 176;	// set offset for serialization
  
             beginDecPackedUnsign1 = getStartOffset() + 182;	// set offset for serialization
  
             beginDecPackedUnsign2 = getStartOffset() + 184;	// set offset for serialization
  
             beginDecPackedUnsign3 = getStartOffset() + 188;	// set offset for serialization
  
             beginCharWs = getStartOffset() + 194;	// set offset for serialization
  
             beginCharJustRight = getStartOffset() + 199;	// set offset for serialization
  
             beginCharZero = getStartOffset() + 204;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBinarySign1Counter = -1;
         public boolean isBinarySign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinarySign1Counter != sharedCounter;
            localBinarySign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_SIGN_1_LEN = 2;
  	/**
	 * serializeBinarySign1
	 */
	protected void serializeBinarySign1(short binarySign1) {
           replaceValue( //  save the value as string
                   getBinaryString( binarySign1,BINARY_SIGN_1_LEN)
                  ,beginBinarySign1
                  ,BINARY_SIGN_1_LEN
                 );
            localBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBinarySign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBinarySign1() {	 
			return (getShort(beginBinarySign1));
   	}
         int localBinarySign2Counter = -1;
         public boolean isBinarySign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinarySign2Counter != sharedCounter;
            localBinarySign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_SIGN_2_LEN = 4;
  	/**
	 * serializeBinarySign2
	 */
	protected void serializeBinarySign2(int binarySign2) {
           replaceValue( //  save the value as string
                   getBinaryString( binarySign2,BINARY_SIGN_2_LEN)
                  ,beginBinarySign2
                  ,BINARY_SIGN_2_LEN
                 );
            localBinarySign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBinarySign2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBinarySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBinarySign2() {	 
			return (getInt(beginBinarySign2));
   	}
         int localBinarySign3Counter = -1;
         public boolean isBinarySign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinarySign3Counter != sharedCounter;
            localBinarySign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_SIGN_3_LEN = 8;
  	/**
	 * serializeBinarySign3
	 */
	protected void serializeBinarySign3(long binarySign3) {
           replaceValue( //  save the value as string
                   getBinaryString( binarySign3,BINARY_SIGN_3_LEN)
                  ,beginBinarySign3
                  ,BINARY_SIGN_3_LEN
                 );
            localBinarySign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBinarySign3MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshBinarySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBinarySign3() {	 
			return (getLong(beginBinarySign3));
   	}
         int localBinaryUnsign1Counter = -1;
         public boolean isBinaryUnsign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryUnsign1Counter != sharedCounter;
            localBinaryUnsign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_UNSIGN_1_LEN = 2;
  	/**
	 * serializeBinaryUnsign1
	 */
	protected void serializeBinaryUnsign1(int binaryUnsign1) {
           replaceValue( //  save the value as string
                   getBinaryString( binaryUnsign1,BINARY_UNSIGN_1_LEN)
                  ,beginBinaryUnsign1
                  ,BINARY_UNSIGN_1_LEN
                 );
            localBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBinaryUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBinaryUnsign1() {	 
			return (getUnsignedShort(beginBinaryUnsign1));
   	}
         int localBinaryUnsign2Counter = -1;
         public boolean isBinaryUnsign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryUnsign2Counter != sharedCounter;
            localBinaryUnsign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_UNSIGN_2_LEN = 4;
  	/**
	 * serializeBinaryUnsign2
	 */
	protected void serializeBinaryUnsign2(long binaryUnsign2) {
           replaceValue( //  save the value as string
                   getBinaryString( binaryUnsign2,BINARY_UNSIGN_2_LEN)
                  ,beginBinaryUnsign2
                  ,BINARY_UNSIGN_2_LEN
                 );
            localBinaryUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBinaryUnsign2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBinaryUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBinaryUnsign2() {	 
			return (getUnsignedInt(beginBinaryUnsign2));
   	}
         int localBinaryUnsign3Counter = -1;
         public boolean isBinaryUnsign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryUnsign3Counter != sharedCounter;
            localBinaryUnsign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int BINARY_UNSIGN_3_LEN = 8;
  	/**
	 * serializeBinaryUnsign3
	 */
	protected void serializeBinaryUnsign3(long binaryUnsign3) {
           replaceValue( //  save the value as string
                   getBinaryString( binaryUnsign3,BINARY_UNSIGN_3_LEN)
                  ,beginBinaryUnsign3
                  ,BINARY_UNSIGN_3_LEN
                 );
            localBinaryUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBinaryUnsign3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshBinaryUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBinaryUnsign3() {	 
			return (getLong(beginBinaryUnsign3));
   	}
     int localDisplaySign1Counter = -1;
     public boolean isDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplaySign1Counter != sharedCounter;
         localDisplaySign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displaySign1
	 *	@return displaySign1
	 */
	public char[]  getDisplaySign1String() {
	     return getCharArray(beginDisplaySign1,DISPLAY_SIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displaySign1IsNumeric() {
	    return isNumeric(beginDisplaySign1
	                    ,beginDisplaySign1 + DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_SIGN_1_LEN = 4;
  	/**
	 * serializeDisplaySign1
	 */
	protected void serializeDisplaySign1(short displaySign1) {
		 putNumber(beginDisplaySign1,displaySign1,DISPLAY_SIGN_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplaySign1
	 */
   	protected  short serializeDisplaySign1(char[] value) {
	    short  displaySign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displaySign1 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginDisplaySign1
		       ,4
		      );
		 localDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  displaySign1;
    }

   protected short checkDisplaySign1MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDisplaySign1() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginDisplaySign1
			                 ,DISPLAY_SIGN_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displaySign1", beginDisplaySign1,DISPLAY_SIGN_1_LEN);
    }
   	}
     int localDisplaySign2Counter = -1;
     public boolean isDisplaySign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplaySign2Counter != sharedCounter;
         localDisplaySign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displaySign2
	 *	@return displaySign2
	 */
	public char[]  getDisplaySign2String() {
	     return getCharArray(beginDisplaySign2,DISPLAY_SIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displaySign2IsNumeric() {
	    return isNumeric(beginDisplaySign2
	                    ,beginDisplaySign2 + DISPLAY_SIGN_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_SIGN_2_LEN = 8;
  	/**
	 * serializeDisplaySign2
	 */
	protected void serializeDisplaySign2(int displaySign2) {
		 putNumber(beginDisplaySign2,displaySign2,DISPLAY_SIGN_2_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplaySign2
	 */
   	protected  int serializeDisplaySign2(char[] value) {
	    int  displaySign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displaySign2 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginDisplaySign2
		       ,8
		      );
		 localDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  displaySign2;
    }

   protected int checkDisplaySign2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshDisplaySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDisplaySign2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDisplaySign2
			                 ,DISPLAY_SIGN_2_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displaySign2", beginDisplaySign2,DISPLAY_SIGN_2_LEN);
    }
   	}
     int localDisplaySign3Counter = -1;
     public boolean isDisplaySign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplaySign3Counter != sharedCounter;
         localDisplaySign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displaySign3
	 *	@return displaySign3
	 */
	public char[]  getDisplaySign3String() {
	     return getCharArray(beginDisplaySign3,DISPLAY_SIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displaySign3IsNumeric() {
	    return isNumeric(beginDisplaySign3
	                    ,beginDisplaySign3 + DISPLAY_SIGN_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_SIGN_3_LEN = 10;
  	/**
	 * serializeDisplaySign3
	 */
	protected void serializeDisplaySign3(long displaySign3) {
		 putNumber(beginDisplaySign3,displaySign3,DISPLAY_SIGN_3_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplaySign3
	 */
   	protected  long serializeDisplaySign3(char[] value) {
	    long  displaySign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displaySign3 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginDisplaySign3
		       ,10
		      );
		 localDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  displaySign3;
    }

   protected long checkDisplaySign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshDisplaySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDisplaySign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDisplaySign3
			                 ,DISPLAY_SIGN_3_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displaySign3", beginDisplaySign3,DISPLAY_SIGN_3_LEN);
    }
   	}
     int localDisplayUnsign1Counter = -1;
     public boolean isDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayUnsign1Counter != sharedCounter;
         localDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displayUnsign1
	 *	@return displayUnsign1
	 */
	public char[]  getDisplayUnsign1String() {
	     return getCharArray(beginDisplayUnsign1,DISPLAY_UNSIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displayUnsign1IsNumeric() {
	    return isNumeric(beginDisplayUnsign1
	                    ,beginDisplayUnsign1 + DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_UNSIGN_1_LEN = 4;
  	/**
	 * serializeDisplayUnsign1
	 */
	protected void serializeDisplayUnsign1(int displayUnsign1) {
		 putNumber(beginDisplayUnsign1,displayUnsign1,DISPLAY_UNSIGN_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplayUnsign1
	 */
   	protected  int serializeDisplayUnsign1(char[] value) {
	    int  displayUnsign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displayUnsign1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDisplayUnsign1
		       ,4
		      );
		 localDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  displayUnsign1;
    }

   protected int checkDisplayUnsign1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDisplayUnsign1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDisplayUnsign1
			                 ,DISPLAY_UNSIGN_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displayUnsign1", beginDisplayUnsign1,DISPLAY_UNSIGN_1_LEN);
    }
   	}
     int localDisplayUnsign2Counter = -1;
     public boolean isDisplayUnsign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayUnsign2Counter != sharedCounter;
         localDisplayUnsign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displayUnsign2
	 *	@return displayUnsign2
	 */
	public char[]  getDisplayUnsign2String() {
	     return getCharArray(beginDisplayUnsign2,DISPLAY_UNSIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displayUnsign2IsNumeric() {
	    return isNumeric(beginDisplayUnsign2
	                    ,beginDisplayUnsign2 + DISPLAY_UNSIGN_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_UNSIGN_2_LEN = 8;
  	/**
	 * serializeDisplayUnsign2
	 */
	protected void serializeDisplayUnsign2(long displayUnsign2) {
		 putNumber(beginDisplayUnsign2,displayUnsign2,DISPLAY_UNSIGN_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplayUnsign2
	 */
   	protected  long serializeDisplayUnsign2(char[] value) {
	    long  displayUnsign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displayUnsign2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDisplayUnsign2
		       ,8
		      );
		 localDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  displayUnsign2;
    }

   protected long checkDisplayUnsign2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDisplayUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDisplayUnsign2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDisplayUnsign2
			                 ,DISPLAY_UNSIGN_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displayUnsign2", beginDisplayUnsign2,DISPLAY_UNSIGN_2_LEN);
    }
   	}
     int localDisplayUnsign3Counter = -1;
     public boolean isDisplayUnsign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayUnsign3Counter != sharedCounter;
         localDisplayUnsign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of displayUnsign3
	 *	@return displayUnsign3
	 */
	public char[]  getDisplayUnsign3String() {
	     return getCharArray(beginDisplayUnsign3,DISPLAY_UNSIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean displayUnsign3IsNumeric() {
	    return isNumeric(beginDisplayUnsign3
	                    ,beginDisplayUnsign3 + DISPLAY_UNSIGN_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISPLAY_UNSIGN_3_LEN = 10;
  	/**
	 * serializeDisplayUnsign3
	 */
	protected void serializeDisplayUnsign3(long displayUnsign3) {
		 putNumber(beginDisplayUnsign3,displayUnsign3,DISPLAY_UNSIGN_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDisplayUnsign3
	 */
   	protected  long serializeDisplayUnsign3(char[] value) {
	    long  displayUnsign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    displayUnsign3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDisplayUnsign3
		       ,10
		      );
		 localDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  displayUnsign3;
    }

   protected long checkDisplayUnsign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDisplayUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDisplayUnsign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDisplayUnsign3
			                 ,DISPLAY_UNSIGN_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("displayUnsign3", beginDisplayUnsign3,DISPLAY_UNSIGN_3_LEN);
    }
   	}
        int localPackedSign1Counter = -1;
        public boolean isPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedSign1Counter != sharedCounter;
           localPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedSign1IsNumeric() {
	      return decimalIsNumeric(beginPackedSign1,PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_SIGN_1_LEN = 3;
  	/**
	 * 	serializePackedSign1
	 */
	protected void serializePackedSign1(short packedSign1) {
		   putDecimal(beginPackedSign1,packedSign1,PACKED_SIGN_1_LEN,true);
   }
   

   protected short checkPackedSign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPackedSign1() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPackedSign1,PACKED_SIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedSign1", beginPackedSign1,PACKED_SIGN_1_LEN);
     }
   	}
        int localPackedSign2Counter = -1;
        public boolean isPackedSign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedSign2Counter != sharedCounter;
           localPackedSign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedSign2IsNumeric() {
	      return decimalIsNumeric(beginPackedSign2,PACKED_SIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_SIGN_2_LEN = 5;
  	/**
	 * 	serializePackedSign2
	 */
	protected void serializePackedSign2(int packedSign2) {
		   putDecimal(beginPackedSign2,packedSign2,PACKED_SIGN_2_LEN,true);
   }
   

   protected int checkPackedSign2MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPackedSign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPackedSign2() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPackedSign2,PACKED_SIGN_2_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedSign2", beginPackedSign2,PACKED_SIGN_2_LEN);
     }
   	}
        int localPackedSign3Counter = -1;
        public boolean isPackedSign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedSign3Counter != sharedCounter;
           localPackedSign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedSign3IsNumeric() {
	      return decimalIsNumeric(beginPackedSign3,PACKED_SIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_SIGN_3_LEN = 6;
  	/**
	 * 	serializePackedSign3
	 */
	protected void serializePackedSign3(long packedSign3) {
		   putDecimal(beginPackedSign3,packedSign3,PACKED_SIGN_3_LEN,true);
   }
   

   protected long checkPackedSign3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_10G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPackedSign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPackedSign3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPackedSign3,PACKED_SIGN_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedSign3", beginPackedSign3,PACKED_SIGN_3_LEN);
     }
   	}
        int localPackedUnsign1Counter = -1;
        public boolean isPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedUnsign1Counter != sharedCounter;
           localPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginPackedUnsign1,PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_UNSIGN_1_LEN = 3;
  	/**
	 * 	serializePackedUnsign1
	 */
	protected void serializePackedUnsign1(int packedUnsign1) {
		   putDecimal(beginPackedUnsign1,packedUnsign1,PACKED_UNSIGN_1_LEN,false);
   }
   

   protected int checkPackedUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPackedUnsign1() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPackedUnsign1,PACKED_UNSIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedUnsign1", beginPackedUnsign1,PACKED_UNSIGN_1_LEN);
     }
   	}
        int localPackedUnsign2Counter = -1;
        public boolean isPackedUnsign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedUnsign2Counter != sharedCounter;
           localPackedUnsign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedUnsign2IsNumeric() {
	      return decimalIsNumeric(beginPackedUnsign2,PACKED_UNSIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_UNSIGN_2_LEN = 5;
  	/**
	 * 	serializePackedUnsign2
	 */
	protected void serializePackedUnsign2(long packedUnsign2) {
		   putDecimal(beginPackedUnsign2,packedUnsign2,PACKED_UNSIGN_2_LEN,false);
   }
   

   protected long checkPackedUnsign2MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshPackedUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPackedUnsign2() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPackedUnsign2,PACKED_UNSIGN_2_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedUnsign2", beginPackedUnsign2,PACKED_UNSIGN_2_LEN);
     }
   	}
        int localPackedUnsign3Counter = -1;
        public boolean isPackedUnsign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedUnsign3Counter != sharedCounter;
           localPackedUnsign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedUnsign3IsNumeric() {
	      return decimalIsNumeric(beginPackedUnsign3,PACKED_UNSIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_UNSIGN_3_LEN = 6;
  	/**
	 * 	serializePackedUnsign3
	 */
	protected void serializePackedUnsign3(long packedUnsign3) {
		   putDecimal(beginPackedUnsign3,packedUnsign3,PACKED_UNSIGN_3_LEN,false);
   }
   

   protected long checkPackedUnsign3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_10G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshPackedUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPackedUnsign3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPackedUnsign3,PACKED_UNSIGN_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedUnsign3", beginPackedUnsign3,PACKED_UNSIGN_3_LEN);
     }
   	}
         int localDecBinarySign1Counter = -1;
         public boolean isDecBinarySign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinarySign1Counter != sharedCounter;
             localDecBinarySign1Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_SIGN_1_LEN = 2;
   protected static final int DEC_BINARY_SIGN_1_SCALE = 2;
  	/**
	 * serializeDecBinarySign1
	 */
	protected void serializeDecBinarySign1(BigDecimal decBinarySign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinarySign1,DEC_BINARY_SIGN_1_LEN,DEC_BINARY_SIGN_1_SCALE)
                  ,beginDecBinarySign1
                  ,DEC_BINARY_SIGN_1_LEN
                 );
         localDecBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinarySign1() {	 
			return (BigDecimal.valueOf(getShort(beginDecBinarySign1)).movePointLeft(DEC_BINARY_SIGN_1_SCALE));
   	}
         int localDecBinarySign2Counter = -1;
         public boolean isDecBinarySign2Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinarySign2Counter != sharedCounter;
             localDecBinarySign2Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_SIGN_2_LEN = 4;
   protected static final int DEC_BINARY_SIGN_2_SCALE = 7;
  	/**
	 * serializeDecBinarySign2
	 */
	protected void serializeDecBinarySign2(BigDecimal decBinarySign2) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinarySign2,DEC_BINARY_SIGN_2_LEN,DEC_BINARY_SIGN_2_SCALE)
                  ,beginDecBinarySign2
                  ,DEC_BINARY_SIGN_2_LEN
                 );
         localDecBinarySign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinarySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinarySign2() {	 
			return (BigDecimal.valueOf(getInt(beginDecBinarySign2)).movePointLeft(DEC_BINARY_SIGN_2_SCALE));
   	}
         int localDecBinarySign3Counter = -1;
         public boolean isDecBinarySign3Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinarySign3Counter != sharedCounter;
             localDecBinarySign3Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_SIGN_3_LEN = 8;
   protected static final int DEC_BINARY_SIGN_3_SCALE = 9;
  	/**
	 * serializeDecBinarySign3
	 */
	protected void serializeDecBinarySign3(BigDecimal decBinarySign3) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinarySign3,DEC_BINARY_SIGN_3_LEN,DEC_BINARY_SIGN_3_SCALE)
                  ,beginDecBinarySign3
                  ,DEC_BINARY_SIGN_3_LEN
                 );
         localDecBinarySign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinarySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinarySign3() {	 
			return (BigDecimal.valueOf(getLong(beginDecBinarySign3)).movePointLeft(DEC_BINARY_SIGN_3_SCALE));
   	}
         int localDecBinaryUnsign1Counter = -1;
         public boolean isDecBinaryUnsign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinaryUnsign1Counter != sharedCounter;
             localDecBinaryUnsign1Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_UNSIGN_1_LEN = 2;
   protected static final int DEC_BINARY_UNSIGN_1_SCALE = 2;
  	/**
	 * serializeDecBinaryUnsign1
	 */
	protected void serializeDecBinaryUnsign1(BigDecimal decBinaryUnsign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinaryUnsign1,DEC_BINARY_UNSIGN_1_LEN,DEC_BINARY_UNSIGN_1_SCALE)
                  ,beginDecBinaryUnsign1
                  ,DEC_BINARY_UNSIGN_1_LEN
                 );
         localDecBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinaryUnsign1() {	 
			return (BigDecimal.valueOf(getShort(beginDecBinaryUnsign1)).movePointLeft(DEC_BINARY_UNSIGN_1_SCALE));
   	}
         int localDecBinaryUnsign2Counter = -1;
         public boolean isDecBinaryUnsign2Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinaryUnsign2Counter != sharedCounter;
             localDecBinaryUnsign2Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_UNSIGN_2_LEN = 4;
   protected static final int DEC_BINARY_UNSIGN_2_SCALE = 6;
  	/**
	 * serializeDecBinaryUnsign2
	 */
	protected void serializeDecBinaryUnsign2(BigDecimal decBinaryUnsign2) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinaryUnsign2,DEC_BINARY_UNSIGN_2_LEN,DEC_BINARY_UNSIGN_2_SCALE)
                  ,beginDecBinaryUnsign2
                  ,DEC_BINARY_UNSIGN_2_LEN
                 );
         localDecBinaryUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinaryUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinaryUnsign2() {	 
			return (BigDecimal.valueOf(getInt(beginDecBinaryUnsign2)).movePointLeft(DEC_BINARY_UNSIGN_2_SCALE));
   	}
         int localDecBinaryUnsign3Counter = -1;
         public boolean isDecBinaryUnsign3Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localDecBinaryUnsign3Counter != sharedCounter;
             localDecBinaryUnsign3Counter = sharedCounter; return hasModified;
         }
   protected static final int DEC_BINARY_UNSIGN_3_LEN = 8;
   protected static final int DEC_BINARY_UNSIGN_3_SCALE = 9;
  	/**
	 * serializeDecBinaryUnsign3
	 */
	protected void serializeDecBinaryUnsign3(BigDecimal decBinaryUnsign3) {
	      replaceValue( //  save the value as string
                   getBinaryString(decBinaryUnsign3,DEC_BINARY_UNSIGN_3_LEN,DEC_BINARY_UNSIGN_3_SCALE)
                  ,beginDecBinaryUnsign3
                  ,DEC_BINARY_UNSIGN_3_LEN
                 );
         localDecBinaryUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshDecBinaryUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecBinaryUnsign3() {	 
			return (BigDecimal.valueOf(getLong(beginDecBinaryUnsign3)).movePointLeft(DEC_BINARY_UNSIGN_3_SCALE));
   	}
     int localDecDisplaySign1Counter = -1;
     
     public boolean isDecDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplaySign1Counter != sharedCounter;
         localDecDisplaySign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplaySign1
	 *	@return decDisplaySign1
	 */
	public char[]  getDecDisplaySign1String() {
	    return getCharArray(beginDecDisplaySign1,DEC_DISPLAY_SIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplaySign1IsNumeric() {
		    return isNumeric(beginDecDisplaySign1
	                    ,beginDecDisplaySign1 + DEC_DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_SIGN_1_LEN = 3;
  protected  static final int DEC_DISPLAY_SIGN_1_SCALE = 2;

   protected BigDecimal checkDecDisplaySign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeDecDisplaySign1
	 */
	protected void serializeDecDisplaySign1(BigDecimal decDisplaySign1) {
	       putNumber(beginDecDisplaySign1,decDisplaySign1,DEC_DISPLAY_SIGN_1_LEN,DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplaySign1
	 */
   	protected  BigDecimal serializeDecDisplaySign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginDecDisplaySign1
		       ,3
		      );		 localDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_SIGN_1_LEN,DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplaySign1", beginDecDisplaySign1,DEC_DISPLAY_SIGN_1_LEN);
    	}
    }
    /**
	 *	refreshDecDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplaySign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplaySign1
			            ,DEC_DISPLAY_SIGN_1_LEN
			            ,DEC_DISPLAY_SIGN_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplaySign1", beginDecDisplaySign1,DEC_DISPLAY_SIGN_1_LEN);
    }
   	}
     int localDecDisplaySign2Counter = -1;
     
     public boolean isDecDisplaySign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplaySign2Counter != sharedCounter;
         localDecDisplaySign2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplaySign2
	 *	@return decDisplaySign2
	 */
	public char[]  getDecDisplaySign2String() {
	    return getCharArray(beginDecDisplaySign2,DEC_DISPLAY_SIGN_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplaySign2IsNumeric() {
		    return isNumeric(beginDecDisplaySign2
	                    ,beginDecDisplaySign2 + DEC_DISPLAY_SIGN_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_SIGN_2_LEN = 8;
  protected  static final int DEC_DISPLAY_SIGN_2_SCALE = 7;

   protected BigDecimal checkDecDisplaySign2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeDecDisplaySign2
	 */
	protected void serializeDecDisplaySign2(BigDecimal decDisplaySign2) {
	       putNumber(beginDecDisplaySign2,decDisplaySign2,DEC_DISPLAY_SIGN_2_LEN,DEC_DISPLAY_SIGN_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplaySign2
	 */
   	protected  BigDecimal serializeDecDisplaySign2(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginDecDisplaySign2
		       ,8
		      );		 localDecDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_SIGN_2_LEN,DEC_DISPLAY_SIGN_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplaySign2", beginDecDisplaySign2,DEC_DISPLAY_SIGN_2_LEN);
    	}
    }
    /**
	 *	refreshDecDisplaySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplaySign2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplaySign2
			            ,DEC_DISPLAY_SIGN_2_LEN
			            ,DEC_DISPLAY_SIGN_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplaySign2", beginDecDisplaySign2,DEC_DISPLAY_SIGN_2_LEN);
    }
   	}
     int localDecDisplaySign3Counter = -1;
     
     public boolean isDecDisplaySign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplaySign3Counter != sharedCounter;
         localDecDisplaySign3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplaySign3
	 *	@return decDisplaySign3
	 */
	public char[]  getDecDisplaySign3String() {
	    return getCharArray(beginDecDisplaySign3,DEC_DISPLAY_SIGN_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplaySign3IsNumeric() {
		    return isNumeric(beginDecDisplaySign3
	                    ,beginDecDisplaySign3 + DEC_DISPLAY_SIGN_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_SIGN_3_LEN = 10;
  protected  static final int DEC_DISPLAY_SIGN_3_SCALE = 9;

   protected BigDecimal checkDecDisplaySign3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeDecDisplaySign3
	 */
	protected void serializeDecDisplaySign3(BigDecimal decDisplaySign3) {
	       putNumber(beginDecDisplaySign3,decDisplaySign3,DEC_DISPLAY_SIGN_3_LEN,DEC_DISPLAY_SIGN_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplaySign3
	 */
   	protected  BigDecimal serializeDecDisplaySign3(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginDecDisplaySign3
		       ,10
		      );		 localDecDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_SIGN_3_LEN,DEC_DISPLAY_SIGN_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplaySign3", beginDecDisplaySign3,DEC_DISPLAY_SIGN_3_LEN);
    	}
    }
    /**
	 *	refreshDecDisplaySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplaySign3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplaySign3
			            ,DEC_DISPLAY_SIGN_3_LEN
			            ,DEC_DISPLAY_SIGN_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplaySign3", beginDecDisplaySign3,DEC_DISPLAY_SIGN_3_LEN);
    }
   	}
     int localDecDisplayUnsign1Counter = -1;
     
     public boolean isDecDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplayUnsign1Counter != sharedCounter;
         localDecDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplayUnsign1
	 *	@return decDisplayUnsign1
	 */
	public char[]  getDecDisplayUnsign1String() {
	    return getCharArray(beginDecDisplayUnsign1,DEC_DISPLAY_UNSIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplayUnsign1IsNumeric() {
		    return isNumeric(beginDecDisplayUnsign1
	                    ,beginDecDisplayUnsign1 + DEC_DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_UNSIGN_1_LEN = 3;
  protected  static final int DEC_DISPLAY_UNSIGN_1_SCALE = 2;

   protected BigDecimal checkDecDisplayUnsign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeDecDisplayUnsign1
	 */
	protected void serializeDecDisplayUnsign1(BigDecimal decDisplayUnsign1) {
	       putNumber(beginDecDisplayUnsign1,decDisplayUnsign1,DEC_DISPLAY_UNSIGN_1_LEN,DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplayUnsign1
	 */
   	protected  BigDecimal serializeDecDisplayUnsign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDecDisplayUnsign1
		       ,3
		      );		 localDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_UNSIGN_1_LEN,DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplayUnsign1", beginDecDisplayUnsign1,DEC_DISPLAY_UNSIGN_1_LEN);
    	}
    }
    /**
	 *	refreshDecDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplayUnsign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplayUnsign1
			            ,DEC_DISPLAY_UNSIGN_1_LEN
			            ,DEC_DISPLAY_UNSIGN_1_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplayUnsign1", beginDecDisplayUnsign1,DEC_DISPLAY_UNSIGN_1_LEN);
    }
   	}
     int localDecDisplayUnsign2Counter = -1;
     
     public boolean isDecDisplayUnsign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplayUnsign2Counter != sharedCounter;
         localDecDisplayUnsign2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplayUnsign2
	 *	@return decDisplayUnsign2
	 */
	public char[]  getDecDisplayUnsign2String() {
	    return getCharArray(beginDecDisplayUnsign2,DEC_DISPLAY_UNSIGN_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplayUnsign2IsNumeric() {
		    return isNumeric(beginDecDisplayUnsign2
	                    ,beginDecDisplayUnsign2 + DEC_DISPLAY_UNSIGN_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_UNSIGN_2_LEN = 7;
  protected  static final int DEC_DISPLAY_UNSIGN_2_SCALE = 6;

   protected BigDecimal checkDecDisplayUnsign2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeDecDisplayUnsign2
	 */
	protected void serializeDecDisplayUnsign2(BigDecimal decDisplayUnsign2) {
	       putNumber(beginDecDisplayUnsign2,decDisplayUnsign2,DEC_DISPLAY_UNSIGN_2_LEN,DEC_DISPLAY_UNSIGN_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplayUnsign2
	 */
   	protected  BigDecimal serializeDecDisplayUnsign2(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginDecDisplayUnsign2
		       ,7
		      );		 localDecDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_UNSIGN_2_LEN,DEC_DISPLAY_UNSIGN_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplayUnsign2", beginDecDisplayUnsign2,DEC_DISPLAY_UNSIGN_2_LEN);
    	}
    }
    /**
	 *	refreshDecDisplayUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplayUnsign2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplayUnsign2
			            ,DEC_DISPLAY_UNSIGN_2_LEN
			            ,DEC_DISPLAY_UNSIGN_2_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplayUnsign2", beginDecDisplayUnsign2,DEC_DISPLAY_UNSIGN_2_LEN);
    }
   	}
     int localDecDisplayUnsign3Counter = -1;
     
     public boolean isDecDisplayUnsign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecDisplayUnsign3Counter != sharedCounter;
         localDecDisplayUnsign3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of decDisplayUnsign3
	 *	@return decDisplayUnsign3
	 */
	public char[]  getDecDisplayUnsign3String() {
	    return getCharArray(beginDecDisplayUnsign3,DEC_DISPLAY_UNSIGN_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decDisplayUnsign3IsNumeric() {
		    return isNumeric(beginDecDisplayUnsign3
	                    ,beginDecDisplayUnsign3 + DEC_DISPLAY_UNSIGN_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DEC_DISPLAY_UNSIGN_3_LEN = 10;
  protected  static final int DEC_DISPLAY_UNSIGN_3_SCALE = 9;

   protected BigDecimal checkDecDisplayUnsign3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeDecDisplayUnsign3
	 */
	protected void serializeDecDisplayUnsign3(BigDecimal decDisplayUnsign3) {
	       putNumber(beginDecDisplayUnsign3,decDisplayUnsign3,DEC_DISPLAY_UNSIGN_3_LEN,DEC_DISPLAY_UNSIGN_3_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDecDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDecDisplayUnsign3
	 */
   	protected  BigDecimal serializeDecDisplayUnsign3(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDecDisplayUnsign3
		       ,10
		      );		 localDecDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DEC_DISPLAY_UNSIGN_3_LEN,DEC_DISPLAY_UNSIGN_3_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("decDisplayUnsign3", beginDecDisplayUnsign3,DEC_DISPLAY_UNSIGN_3_LEN);
    	}
    }
    /**
	 *	refreshDecDisplayUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecDisplayUnsign3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDecDisplayUnsign3
			            ,DEC_DISPLAY_UNSIGN_3_LEN
			            ,DEC_DISPLAY_UNSIGN_3_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("decDisplayUnsign3", beginDecDisplayUnsign3,DEC_DISPLAY_UNSIGN_3_LEN);
    }
   	}
        int localDecPackedSign1Counter = -1;
        public boolean isDecPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedSign1Counter != sharedCounter;
           localDecPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedSign1IsNumeric() {
	      return decimalIsNumeric(beginDecPackedSign1,DEC_PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedSign1String() {
            return getPackedString(beginDecPackedSign1,DEC_PACKED_SIGN_1_LEN);
         }
   protected static final int DEC_PACKED_SIGN_1_LEN = 2;
   protected static final int DEC_PACKED_SIGN_1_SCALE = 2;
  	/**
	 * 	serializeDecPackedSign1
	 */
	protected void serializeDecPackedSign1(BigDecimal decPackedSign1) {
		   putDecimal(beginDecPackedSign1,decPackedSign1,DEC_PACKED_SIGN_1_LEN,DEC_PACKED_SIGN_1_SCALE,true);
		 localDecPackedSign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedSign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshDecPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedSign1() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedSign1,DEC_PACKED_SIGN_1_LEN,DEC_PACKED_SIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedSign1", beginDecPackedSign1,DEC_PACKED_SIGN_1_LEN);
     }
   	}
        int localDecPackedSign2Counter = -1;
        public boolean isDecPackedSign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedSign2Counter != sharedCounter;
           localDecPackedSign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedSign2IsNumeric() {
	      return decimalIsNumeric(beginDecPackedSign2,DEC_PACKED_SIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedSign2String() {
            return getPackedString(beginDecPackedSign2,DEC_PACKED_SIGN_2_LEN);
         }
   protected static final int DEC_PACKED_SIGN_2_LEN = 5;
   protected static final int DEC_PACKED_SIGN_2_SCALE = 7;
  	/**
	 * 	serializeDecPackedSign2
	 */
	protected void serializeDecPackedSign2(BigDecimal decPackedSign2) {
		   putDecimal(beginDecPackedSign2,decPackedSign2,DEC_PACKED_SIGN_2_LEN,DEC_PACKED_SIGN_2_SCALE,true);
		 localDecPackedSign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedSign2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,7/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshDecPackedSign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedSign2() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedSign2,DEC_PACKED_SIGN_2_LEN,DEC_PACKED_SIGN_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedSign2", beginDecPackedSign2,DEC_PACKED_SIGN_2_LEN);
     }
   	}
        int localDecPackedSign3Counter = -1;
        public boolean isDecPackedSign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedSign3Counter != sharedCounter;
           localDecPackedSign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedSign3IsNumeric() {
	      return decimalIsNumeric(beginDecPackedSign3,DEC_PACKED_SIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedSign3String() {
            return getPackedString(beginDecPackedSign3,DEC_PACKED_SIGN_3_LEN);
         }
   protected static final int DEC_PACKED_SIGN_3_LEN = 6;
   protected static final int DEC_PACKED_SIGN_3_SCALE = 9;
  	/**
	 * 	serializeDecPackedSign3
	 */
	protected void serializeDecPackedSign3(BigDecimal decPackedSign3) {
		   putDecimal(beginDecPackedSign3,decPackedSign3,DEC_PACKED_SIGN_3_LEN,DEC_PACKED_SIGN_3_SCALE,true);
		 localDecPackedSign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedSign3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshDecPackedSign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedSign3() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedSign3,DEC_PACKED_SIGN_3_LEN,DEC_PACKED_SIGN_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedSign3", beginDecPackedSign3,DEC_PACKED_SIGN_3_LEN);
     }
   	}
        int localDecPackedUnsign1Counter = -1;
        public boolean isDecPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedUnsign1Counter != sharedCounter;
           localDecPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginDecPackedUnsign1,DEC_PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedUnsign1String() {
            return getPackedString(beginDecPackedUnsign1,DEC_PACKED_UNSIGN_1_LEN);
         }
   protected static final int DEC_PACKED_UNSIGN_1_LEN = 2;
   protected static final int DEC_PACKED_UNSIGN_1_SCALE = 2;
  	/**
	 * 	serializeDecPackedUnsign1
	 */
	protected void serializeDecPackedUnsign1(BigDecimal decPackedUnsign1) {
		   putDecimal(beginDecPackedUnsign1,decPackedUnsign1,DEC_PACKED_UNSIGN_1_LEN,DEC_PACKED_UNSIGN_1_SCALE,false);
		 localDecPackedUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedUnsign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshDecPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedUnsign1() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedUnsign1,DEC_PACKED_UNSIGN_1_LEN,DEC_PACKED_UNSIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedUnsign1", beginDecPackedUnsign1,DEC_PACKED_UNSIGN_1_LEN);
     }
   	}
        int localDecPackedUnsign2Counter = -1;
        public boolean isDecPackedUnsign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedUnsign2Counter != sharedCounter;
           localDecPackedUnsign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedUnsign2IsNumeric() {
	      return decimalIsNumeric(beginDecPackedUnsign2,DEC_PACKED_UNSIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedUnsign2String() {
            return getPackedString(beginDecPackedUnsign2,DEC_PACKED_UNSIGN_2_LEN);
         }
   protected static final int DEC_PACKED_UNSIGN_2_LEN = 4;
   protected static final int DEC_PACKED_UNSIGN_2_SCALE = 6;
  	/**
	 * 	serializeDecPackedUnsign2
	 */
	protected void serializeDecPackedUnsign2(BigDecimal decPackedUnsign2) {
		   putDecimal(beginDecPackedUnsign2,decPackedUnsign2,DEC_PACKED_UNSIGN_2_LEN,DEC_PACKED_UNSIGN_2_SCALE,false);
		 localDecPackedUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedUnsign2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshDecPackedUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedUnsign2() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedUnsign2,DEC_PACKED_UNSIGN_2_LEN,DEC_PACKED_UNSIGN_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedUnsign2", beginDecPackedUnsign2,DEC_PACKED_UNSIGN_2_LEN);
     }
   	}
        int localDecPackedUnsign3Counter = -1;
        public boolean isDecPackedUnsign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecPackedUnsign3Counter != sharedCounter;
           localDecPackedUnsign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean decPackedUnsign3IsNumeric() {
	      return decimalIsNumeric(beginDecPackedUnsign3,DEC_PACKED_UNSIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decPackedUnsign3String() {
            return getPackedString(beginDecPackedUnsign3,DEC_PACKED_UNSIGN_3_LEN);
         }
   protected static final int DEC_PACKED_UNSIGN_3_LEN = 6;
   protected static final int DEC_PACKED_UNSIGN_3_SCALE = 9;
  	/**
	 * 	serializeDecPackedUnsign3
	 */
	protected void serializeDecPackedUnsign3(BigDecimal decPackedUnsign3) {
		   putDecimal(beginDecPackedUnsign3,decPackedUnsign3,DEC_PACKED_UNSIGN_3_LEN,DEC_PACKED_UNSIGN_3_SCALE,false);
		 localDecPackedUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecPackedUnsign3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshDecPackedUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecPackedUnsign3() throws CFException {	
   	try { 
		 return (getDecimal(beginDecPackedUnsign3,DEC_PACKED_UNSIGN_3_LEN,DEC_PACKED_UNSIGN_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decPackedUnsign3", beginDecPackedUnsign3,DEC_PACKED_UNSIGN_3_LEN);
     }
   	}
     int localCharWsCounter = -1;
     public boolean isCharWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharWsCounter != sharedCounter;
         localCharWsCounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_WS_LEN = 5;
	/**
	 * 	serialize this CharWs
	 */
   protected void serializeCharWs(char[] charWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charWs,0,getStringValue(),beginCharWs,CHAR_WS_LEN);
       localCharWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharWsConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCharWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharWs() {	 
   		return (substring(getStringValue(),beginCharWs,beginCharWs + CHAR_WS_LEN));
   	}
     int localCharJustRightCounter = -1;
     public boolean isCharJustRightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharJustRightCounter != sharedCounter;
         localCharJustRightCounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_JUST_RIGHT_LEN = 5;
	/**
	 * 	serialize this CharJustRight
	 */
   protected void serializeCharJustRight(char[] charJustRight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charJustRight,0,getStringValue(),beginCharJustRight,CHAR_JUST_RIGHT_LEN);
       localCharJustRightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharJustRightConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,true, false);
   }
    /**
	 *	refreshCharJustRight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharJustRight() {	 
   		return (substring(getStringValue(),beginCharJustRight,beginCharJustRight + CHAR_JUST_RIGHT_LEN));
   	}
     int localCharZeroCounter = -1;
     public boolean isCharZeroModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharZeroCounter != sharedCounter;
         localCharZeroCounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_ZERO_LEN = 5;
	/**
	 * 	serialize this CharZero
	 */
   protected void serializeCharZero(char[] charZero) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charZero,0,getStringValue(),beginCharZero,CHAR_ZERO_LEN);
       localCharZeroCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharZeroConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, true);
   }
    /**
	 *	refreshCharZero is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharZero() {	 
   		return (substring(getStringValue(),beginCharZero,beginCharZero + CHAR_ZERO_LEN));
   	}




}
  
