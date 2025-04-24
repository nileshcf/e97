package com.cloudframe.app.alltype.dto.serialize;

/**
*  The class GroupWithValueSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:46. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class GroupWithValueSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GroupWithValueSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_WITH_VALUE_LENGTH = 209;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBBinarySign1;
            protected  int beginBBinarySign2;
            protected  int beginBBinarySign3;
            protected  int beginBBinaryUnsign1;
            protected  int beginBBinaryUnsign2;
            protected  int beginBBinaryUnsign3;
            protected  int beginBDisplaySign1;
            protected  int beginBDisplaySign2;
            protected  int beginBDisplaySign3;
            protected  int beginBDisplayUnsign1;
            protected  int beginBDisplayUnsign2;
            protected  int beginBDisplayUnsign3;
            protected  int beginBPackedSign1;
            protected  int beginBPackedSign2;
            protected  int beginBPackedSign3;
            protected  int beginBPackedUnsign1;
            protected  int beginBPackedUnsign2;
            protected  int beginBPackedUnsign3;
            protected  int beginBDecBinarySign1;
            protected  int beginBDecBinarySign2;
            protected  int beginBDecBinarySign3;
            protected  int beginBDecBinaryUnsign1;
            protected  int beginBDecBinaryUnsign2;
            protected  int beginBDecBinaryUnsign3;
            protected  int beginBDecDisplaySign1;
            protected  int beginBDecDisplaySign2;
            protected  int beginBDecDisplaySign3;
            protected  int beginBDecDisplayUnsign1;
            protected  int beginBDecDisplayUnsign2;
            protected  int beginBDecDisplayUnsign3;
            protected  int beginBDecPackedSign1;
            protected  int beginBDecPackedSign2;
            protected  int beginBDecPackedSign3;
            protected  int beginBDecPackedUnsign1;
            protected  int beginBDecPackedUnsign2;
            protected  int beginBDecPackedUnsign3;
            protected  int beginBChar;
            protected  int beginBCharJustRight;
            protected  int beginBCharZero;
	
	/**
	* Constructor for GroupWithValueSerialized
	**/
    public GroupWithValueSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GroupWithValueSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithValueSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GroupWithValueSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,627); // serialize this field at offset 627 by default 
    }
    
	/**
	* sets parent for this GroupWithValueSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 627 by default
    }    
	/**
	* initializes the field in GroupWithValueSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_WITH_VALUE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBBinarySign1 = getStartOffset() + 0;	// set offset for serialization
  
             beginBBinarySign2 = getStartOffset() + 2;	// set offset for serialization
  
             beginBBinarySign3 = getStartOffset() + 6;	// set offset for serialization
  
             beginBBinaryUnsign1 = getStartOffset() + 14;	// set offset for serialization
  
             beginBBinaryUnsign2 = getStartOffset() + 16;	// set offset for serialization
  
             beginBBinaryUnsign3 = getStartOffset() + 20;	// set offset for serialization
  
             beginBDisplaySign1 = getStartOffset() + 28;	// set offset for serialization
  
             beginBDisplaySign2 = getStartOffset() + 32;	// set offset for serialization
  
             beginBDisplaySign3 = getStartOffset() + 40;	// set offset for serialization
  
             beginBDisplayUnsign1 = getStartOffset() + 50;	// set offset for serialization
  
             beginBDisplayUnsign2 = getStartOffset() + 54;	// set offset for serialization
  
             beginBDisplayUnsign3 = getStartOffset() + 62;	// set offset for serialization
  
             beginBPackedSign1 = getStartOffset() + 72;	// set offset for serialization
  
             beginBPackedSign2 = getStartOffset() + 75;	// set offset for serialization
  
             beginBPackedSign3 = getStartOffset() + 80;	// set offset for serialization
  
             beginBPackedUnsign1 = getStartOffset() + 86;	// set offset for serialization
  
             beginBPackedUnsign2 = getStartOffset() + 89;	// set offset for serialization
  
             beginBPackedUnsign3 = getStartOffset() + 94;	// set offset for serialization
  
             beginBDecBinarySign1 = getStartOffset() + 100;	// set offset for serialization
  
             beginBDecBinarySign2 = getStartOffset() + 102;	// set offset for serialization
  
             beginBDecBinarySign3 = getStartOffset() + 106;	// set offset for serialization
  
             beginBDecBinaryUnsign1 = getStartOffset() + 114;	// set offset for serialization
  
             beginBDecBinaryUnsign2 = getStartOffset() + 116;	// set offset for serialization
  
             beginBDecBinaryUnsign3 = getStartOffset() + 120;	// set offset for serialization
  
             beginBDecDisplaySign1 = getStartOffset() + 128;	// set offset for serialization
  
             beginBDecDisplaySign2 = getStartOffset() + 131;	// set offset for serialization
  
             beginBDecDisplaySign3 = getStartOffset() + 139;	// set offset for serialization
  
             beginBDecDisplayUnsign1 = getStartOffset() + 149;	// set offset for serialization
  
             beginBDecDisplayUnsign2 = getStartOffset() + 152;	// set offset for serialization
  
             beginBDecDisplayUnsign3 = getStartOffset() + 159;	// set offset for serialization
  
             beginBDecPackedSign1 = getStartOffset() + 169;	// set offset for serialization
  
             beginBDecPackedSign2 = getStartOffset() + 171;	// set offset for serialization
  
             beginBDecPackedSign3 = getStartOffset() + 176;	// set offset for serialization
  
             beginBDecPackedUnsign1 = getStartOffset() + 182;	// set offset for serialization
  
             beginBDecPackedUnsign2 = getStartOffset() + 184;	// set offset for serialization
  
             beginBDecPackedUnsign3 = getStartOffset() + 188;	// set offset for serialization
  
             beginBChar = getStartOffset() + 194;	// set offset for serialization
  
             beginBCharJustRight = getStartOffset() + 199;	// set offset for serialization
  
             beginBCharZero = getStartOffset() + 204;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBBinarySign1Counter = -1;
         public boolean isBBinarySign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinarySign1Counter != sharedCounter;
            localBBinarySign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_SIGN_1_LEN = 2;
  	/**
	 * serializeBBinarySign1
	 */
	protected void serializeBBinarySign1(short bBinarySign1) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinarySign1,B_BINARY_SIGN_1_LEN)
                  ,beginBBinarySign1
                  ,B_BINARY_SIGN_1_LEN
                 );
            localBBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBBinarySign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBBinarySign1() {	 
			return (getShort(beginBBinarySign1));
   	}
         int localBBinarySign2Counter = -1;
         public boolean isBBinarySign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinarySign2Counter != sharedCounter;
            localBBinarySign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_SIGN_2_LEN = 4;
  	/**
	 * serializeBBinarySign2
	 */
	protected void serializeBBinarySign2(int bBinarySign2) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinarySign2,B_BINARY_SIGN_2_LEN)
                  ,beginBBinarySign2
                  ,B_BINARY_SIGN_2_LEN
                 );
            localBBinarySign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBBinarySign2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBBinarySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBBinarySign2() {	 
			return (getInt(beginBBinarySign2));
   	}
         int localBBinarySign3Counter = -1;
         public boolean isBBinarySign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinarySign3Counter != sharedCounter;
            localBBinarySign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_SIGN_3_LEN = 8;
  	/**
	 * serializeBBinarySign3
	 */
	protected void serializeBBinarySign3(long bBinarySign3) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinarySign3,B_BINARY_SIGN_3_LEN)
                  ,beginBBinarySign3
                  ,B_BINARY_SIGN_3_LEN
                 );
            localBBinarySign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBBinarySign3MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshBBinarySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBBinarySign3() {	 
			return (getLong(beginBBinarySign3));
   	}
         int localBBinaryUnsign1Counter = -1;
         public boolean isBBinaryUnsign1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinaryUnsign1Counter != sharedCounter;
            localBBinaryUnsign1Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_UNSIGN_1_LEN = 2;
  	/**
	 * serializeBBinaryUnsign1
	 */
	protected void serializeBBinaryUnsign1(int bBinaryUnsign1) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinaryUnsign1,B_BINARY_UNSIGN_1_LEN)
                  ,beginBBinaryUnsign1
                  ,B_BINARY_UNSIGN_1_LEN
                 );
            localBBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBBinaryUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBBinaryUnsign1() {	 
			return (getUnsignedShort(beginBBinaryUnsign1));
   	}
         int localBBinaryUnsign2Counter = -1;
         public boolean isBBinaryUnsign2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinaryUnsign2Counter != sharedCounter;
            localBBinaryUnsign2Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_UNSIGN_2_LEN = 4;
  	/**
	 * serializeBBinaryUnsign2
	 */
	protected void serializeBBinaryUnsign2(long bBinaryUnsign2) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinaryUnsign2,B_BINARY_UNSIGN_2_LEN)
                  ,beginBBinaryUnsign2
                  ,B_BINARY_UNSIGN_2_LEN
                 );
            localBBinaryUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBBinaryUnsign2MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBBinaryUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBBinaryUnsign2() {	 
			return (getUnsignedInt(beginBBinaryUnsign2));
   	}
         int localBBinaryUnsign3Counter = -1;
         public boolean isBBinaryUnsign3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBBinaryUnsign3Counter != sharedCounter;
            localBBinaryUnsign3Counter = sharedCounter; return hasModified; 
         }
   protected static final int B_BINARY_UNSIGN_3_LEN = 8;
  	/**
	 * serializeBBinaryUnsign3
	 */
	protected void serializeBBinaryUnsign3(long bBinaryUnsign3) {
           replaceValue( //  save the value as string
                   getBinaryString( bBinaryUnsign3,B_BINARY_UNSIGN_3_LEN)
                  ,beginBBinaryUnsign3
                  ,B_BINARY_UNSIGN_3_LEN
                 );
            localBBinaryUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkBBinaryUnsign3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshBBinaryUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBBinaryUnsign3() {	 
			return (getLong(beginBBinaryUnsign3));
   	}
     int localBDisplaySign1Counter = -1;
     public boolean isBDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplaySign1Counter != sharedCounter;
         localBDisplaySign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplaySign1
	 *	@return bDisplaySign1
	 */
	public char[]  getBDisplaySign1String() {
	     return getCharArray(beginBDisplaySign1,B_DISPLAY_SIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplaySign1IsNumeric() {
	    return isNumeric(beginBDisplaySign1
	                    ,beginBDisplaySign1 + B_DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_SIGN_1_LEN = 4;
  	/**
	 * serializeBDisplaySign1
	 */
	protected void serializeBDisplaySign1(short bDisplaySign1) {
		 putNumber(beginBDisplaySign1,bDisplaySign1,B_DISPLAY_SIGN_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplaySign1
	 */
   	protected  short serializeBDisplaySign1(char[] value) {
	    short  bDisplaySign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplaySign1 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginBDisplaySign1
		       ,4
		      );
		 localBDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplaySign1;
    }

   protected short checkBDisplaySign1MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshBDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBDisplaySign1() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginBDisplaySign1
			                 ,B_DISPLAY_SIGN_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplaySign1", beginBDisplaySign1,B_DISPLAY_SIGN_1_LEN);
    }
   	}
     int localBDisplaySign2Counter = -1;
     public boolean isBDisplaySign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplaySign2Counter != sharedCounter;
         localBDisplaySign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplaySign2
	 *	@return bDisplaySign2
	 */
	public char[]  getBDisplaySign2String() {
	     return getCharArray(beginBDisplaySign2,B_DISPLAY_SIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplaySign2IsNumeric() {
	    return isNumeric(beginBDisplaySign2
	                    ,beginBDisplaySign2 + B_DISPLAY_SIGN_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_SIGN_2_LEN = 8;
  	/**
	 * serializeBDisplaySign2
	 */
	protected void serializeBDisplaySign2(int bDisplaySign2) {
		 putNumber(beginBDisplaySign2,bDisplaySign2,B_DISPLAY_SIGN_2_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplaySign2
	 */
   	protected  int serializeBDisplaySign2(char[] value) {
	    int  bDisplaySign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplaySign2 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginBDisplaySign2
		       ,8
		      );
		 localBDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplaySign2;
    }

   protected int checkBDisplaySign2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshBDisplaySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBDisplaySign2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBDisplaySign2
			                 ,B_DISPLAY_SIGN_2_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplaySign2", beginBDisplaySign2,B_DISPLAY_SIGN_2_LEN);
    }
   	}
     int localBDisplaySign3Counter = -1;
     public boolean isBDisplaySign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplaySign3Counter != sharedCounter;
         localBDisplaySign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplaySign3
	 *	@return bDisplaySign3
	 */
	public char[]  getBDisplaySign3String() {
	     return getCharArray(beginBDisplaySign3,B_DISPLAY_SIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplaySign3IsNumeric() {
	    return isNumeric(beginBDisplaySign3
	                    ,beginBDisplaySign3 + B_DISPLAY_SIGN_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_SIGN_3_LEN = 10;
  	/**
	 * serializeBDisplaySign3
	 */
	protected void serializeBDisplaySign3(long bDisplaySign3) {
		 putNumber(beginBDisplaySign3,bDisplaySign3,B_DISPLAY_SIGN_3_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplaySign3
	 */
   	protected  long serializeBDisplaySign3(char[] value) {
	    long  bDisplaySign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplaySign3 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginBDisplaySign3
		       ,10
		      );
		 localBDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplaySign3;
    }

   protected long checkBDisplaySign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshBDisplaySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBDisplaySign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBDisplaySign3
			                 ,B_DISPLAY_SIGN_3_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplaySign3", beginBDisplaySign3,B_DISPLAY_SIGN_3_LEN);
    }
   	}
     int localBDisplayUnsign1Counter = -1;
     public boolean isBDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplayUnsign1Counter != sharedCounter;
         localBDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplayUnsign1
	 *	@return bDisplayUnsign1
	 */
	public char[]  getBDisplayUnsign1String() {
	     return getCharArray(beginBDisplayUnsign1,B_DISPLAY_UNSIGN_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplayUnsign1IsNumeric() {
	    return isNumeric(beginBDisplayUnsign1
	                    ,beginBDisplayUnsign1 + B_DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_UNSIGN_1_LEN = 4;
  	/**
	 * serializeBDisplayUnsign1
	 */
	protected void serializeBDisplayUnsign1(int bDisplayUnsign1) {
		 putNumber(beginBDisplayUnsign1,bDisplayUnsign1,B_DISPLAY_UNSIGN_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplayUnsign1
	 */
   	protected  int serializeBDisplayUnsign1(char[] value) {
	    int  bDisplayUnsign1;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplayUnsign1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBDisplayUnsign1
		       ,4
		      );
		 localBDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplayUnsign1;
    }

   protected int checkBDisplayUnsign1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBDisplayUnsign1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBDisplayUnsign1
			                 ,B_DISPLAY_UNSIGN_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplayUnsign1", beginBDisplayUnsign1,B_DISPLAY_UNSIGN_1_LEN);
    }
   	}
     int localBDisplayUnsign2Counter = -1;
     public boolean isBDisplayUnsign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplayUnsign2Counter != sharedCounter;
         localBDisplayUnsign2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplayUnsign2
	 *	@return bDisplayUnsign2
	 */
	public char[]  getBDisplayUnsign2String() {
	     return getCharArray(beginBDisplayUnsign2,B_DISPLAY_UNSIGN_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplayUnsign2IsNumeric() {
	    return isNumeric(beginBDisplayUnsign2
	                    ,beginBDisplayUnsign2 + B_DISPLAY_UNSIGN_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_UNSIGN_2_LEN = 8;
  	/**
	 * serializeBDisplayUnsign2
	 */
	protected void serializeBDisplayUnsign2(long bDisplayUnsign2) {
		 putNumber(beginBDisplayUnsign2,bDisplayUnsign2,B_DISPLAY_UNSIGN_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplayUnsign2
	 */
   	protected  long serializeBDisplayUnsign2(char[] value) {
	    long  bDisplayUnsign2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplayUnsign2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBDisplayUnsign2
		       ,8
		      );
		 localBDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplayUnsign2;
    }

   protected long checkBDisplayUnsign2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBDisplayUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBDisplayUnsign2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBDisplayUnsign2
			                 ,B_DISPLAY_UNSIGN_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplayUnsign2", beginBDisplayUnsign2,B_DISPLAY_UNSIGN_2_LEN);
    }
   	}
     int localBDisplayUnsign3Counter = -1;
     public boolean isBDisplayUnsign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDisplayUnsign3Counter != sharedCounter;
         localBDisplayUnsign3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bDisplayUnsign3
	 *	@return bDisplayUnsign3
	 */
	public char[]  getBDisplayUnsign3String() {
	     return getCharArray(beginBDisplayUnsign3,B_DISPLAY_UNSIGN_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDisplayUnsign3IsNumeric() {
	    return isNumeric(beginBDisplayUnsign3
	                    ,beginBDisplayUnsign3 + B_DISPLAY_UNSIGN_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int B_DISPLAY_UNSIGN_3_LEN = 10;
  	/**
	 * serializeBDisplayUnsign3
	 */
	protected void serializeBDisplayUnsign3(long bDisplayUnsign3) {
		 putNumber(beginBDisplayUnsign3,bDisplayUnsign3,B_DISPLAY_UNSIGN_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBDisplayUnsign3
	 */
   	protected  long serializeBDisplayUnsign3(char[] value) {
	    long  bDisplayUnsign3;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bDisplayUnsign3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginBDisplayUnsign3
		       ,10
		      );
		 localBDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
		return  bDisplayUnsign3;
    }

   protected long checkBDisplayUnsign3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBDisplayUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBDisplayUnsign3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBDisplayUnsign3
			                 ,B_DISPLAY_UNSIGN_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bDisplayUnsign3", beginBDisplayUnsign3,B_DISPLAY_UNSIGN_3_LEN);
    }
   	}
        int localBPackedSign1Counter = -1;
        public boolean isBPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedSign1Counter != sharedCounter;
           localBPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedSign1IsNumeric() {
	      return decimalIsNumeric(beginBPackedSign1,B_PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_SIGN_1_LEN = 3;
  	/**
	 * 	serializeBPackedSign1
	 */
	protected void serializeBPackedSign1(short bPackedSign1) {
		   putDecimal(beginBPackedSign1,bPackedSign1,B_PACKED_SIGN_1_LEN,true);
   }
   

   protected short checkBPackedSign1MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshBPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBPackedSign1() throws CFException {	
   	try { 
		 return (getShortDecimal(beginBPackedSign1,B_PACKED_SIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedSign1", beginBPackedSign1,B_PACKED_SIGN_1_LEN);
     }
   	}
        int localBPackedSign2Counter = -1;
        public boolean isBPackedSign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedSign2Counter != sharedCounter;
           localBPackedSign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedSign2IsNumeric() {
	      return decimalIsNumeric(beginBPackedSign2,B_PACKED_SIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_SIGN_2_LEN = 5;
  	/**
	 * 	serializeBPackedSign2
	 */
	protected void serializeBPackedSign2(int bPackedSign2) {
		   putDecimal(beginBPackedSign2,bPackedSign2,B_PACKED_SIGN_2_LEN,true);
   }
   

   protected int checkBPackedSign2MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshBPackedSign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBPackedSign2() throws CFException {	
   	try { 
		 return (getIntDecimal(beginBPackedSign2,B_PACKED_SIGN_2_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedSign2", beginBPackedSign2,B_PACKED_SIGN_2_LEN);
     }
   	}
        int localBPackedSign3Counter = -1;
        public boolean isBPackedSign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedSign3Counter != sharedCounter;
           localBPackedSign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedSign3IsNumeric() {
	      return decimalIsNumeric(beginBPackedSign3,B_PACKED_SIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_SIGN_3_LEN = 6;
  	/**
	 * 	serializeBPackedSign3
	 */
	protected void serializeBPackedSign3(long bPackedSign3) {
		   putDecimal(beginBPackedSign3,bPackedSign3,B_PACKED_SIGN_3_LEN,true);
   }
   

   protected long checkBPackedSign3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_10G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshBPackedSign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBPackedSign3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginBPackedSign3,B_PACKED_SIGN_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedSign3", beginBPackedSign3,B_PACKED_SIGN_3_LEN);
     }
   	}
        int localBPackedUnsign1Counter = -1;
        public boolean isBPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedUnsign1Counter != sharedCounter;
           localBPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginBPackedUnsign1,B_PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_UNSIGN_1_LEN = 3;
  	/**
	 * 	serializeBPackedUnsign1
	 */
	protected void serializeBPackedUnsign1(int bPackedUnsign1) {
		   putDecimal(beginBPackedUnsign1,bPackedUnsign1,B_PACKED_UNSIGN_1_LEN,false);
   }
   

   protected int checkBPackedUnsign1MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshBPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBPackedUnsign1() throws CFException {	
   	try { 
		 return (getIntDecimal(beginBPackedUnsign1,B_PACKED_UNSIGN_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedUnsign1", beginBPackedUnsign1,B_PACKED_UNSIGN_1_LEN);
     }
   	}
        int localBPackedUnsign2Counter = -1;
        public boolean isBPackedUnsign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedUnsign2Counter != sharedCounter;
           localBPackedUnsign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedUnsign2IsNumeric() {
	      return decimalIsNumeric(beginBPackedUnsign2,B_PACKED_UNSIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_UNSIGN_2_LEN = 5;
  	/**
	 * 	serializeBPackedUnsign2
	 */
	protected void serializeBPackedUnsign2(long bPackedUnsign2) {
		   putDecimal(beginBPackedUnsign2,bPackedUnsign2,B_PACKED_UNSIGN_2_LEN,false);
   }
   

   protected long checkBPackedUnsign2MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshBPackedUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBPackedUnsign2() throws CFException {	
   	try { 
		 return (getLongDecimal(beginBPackedUnsign2,B_PACKED_UNSIGN_2_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedUnsign2", beginBPackedUnsign2,B_PACKED_UNSIGN_2_LEN);
     }
   	}
        int localBPackedUnsign3Counter = -1;
        public boolean isBPackedUnsign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBPackedUnsign3Counter != sharedCounter;
           localBPackedUnsign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean bPackedUnsign3IsNumeric() {
	      return decimalIsNumeric(beginBPackedUnsign3,B_PACKED_UNSIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int B_PACKED_UNSIGN_3_LEN = 6;
  	/**
	 * 	serializeBPackedUnsign3
	 */
	protected void serializeBPackedUnsign3(long bPackedUnsign3) {
		   putDecimal(beginBPackedUnsign3,bPackedUnsign3,B_PACKED_UNSIGN_3_LEN,false);
   }
   

   protected long checkBPackedUnsign3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_10G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshBPackedUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBPackedUnsign3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginBPackedUnsign3,B_PACKED_UNSIGN_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("bPackedUnsign3", beginBPackedUnsign3,B_PACKED_UNSIGN_3_LEN);
     }
   	}
         int localBDecBinarySign1Counter = -1;
         public boolean isBDecBinarySign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinarySign1Counter != sharedCounter;
             localBDecBinarySign1Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_SIGN_1_LEN = 2;
   protected static final int B_DEC_BINARY_SIGN_1_SCALE = 2;
  	/**
	 * serializeBDecBinarySign1
	 */
	protected void serializeBDecBinarySign1(BigDecimal bDecBinarySign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinarySign1,B_DEC_BINARY_SIGN_1_LEN,B_DEC_BINARY_SIGN_1_SCALE)
                  ,beginBDecBinarySign1
                  ,B_DEC_BINARY_SIGN_1_LEN
                 );
         localBDecBinarySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinarySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinarySign1() {	 
			return (BigDecimal.valueOf(getShort(beginBDecBinarySign1)).movePointLeft(B_DEC_BINARY_SIGN_1_SCALE));
   	}
         int localBDecBinarySign2Counter = -1;
         public boolean isBDecBinarySign2Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinarySign2Counter != sharedCounter;
             localBDecBinarySign2Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_SIGN_2_LEN = 4;
   protected static final int B_DEC_BINARY_SIGN_2_SCALE = 7;
  	/**
	 * serializeBDecBinarySign2
	 */
	protected void serializeBDecBinarySign2(BigDecimal bDecBinarySign2) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinarySign2,B_DEC_BINARY_SIGN_2_LEN,B_DEC_BINARY_SIGN_2_SCALE)
                  ,beginBDecBinarySign2
                  ,B_DEC_BINARY_SIGN_2_LEN
                 );
         localBDecBinarySign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinarySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinarySign2() {	 
			return (BigDecimal.valueOf(getInt(beginBDecBinarySign2)).movePointLeft(B_DEC_BINARY_SIGN_2_SCALE));
   	}
         int localBDecBinarySign3Counter = -1;
         public boolean isBDecBinarySign3Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinarySign3Counter != sharedCounter;
             localBDecBinarySign3Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_SIGN_3_LEN = 8;
   protected static final int B_DEC_BINARY_SIGN_3_SCALE = 9;
  	/**
	 * serializeBDecBinarySign3
	 */
	protected void serializeBDecBinarySign3(BigDecimal bDecBinarySign3) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinarySign3,B_DEC_BINARY_SIGN_3_LEN,B_DEC_BINARY_SIGN_3_SCALE)
                  ,beginBDecBinarySign3
                  ,B_DEC_BINARY_SIGN_3_LEN
                 );
         localBDecBinarySign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinarySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinarySign3() {	 
			return (BigDecimal.valueOf(getLong(beginBDecBinarySign3)).movePointLeft(B_DEC_BINARY_SIGN_3_SCALE));
   	}
         int localBDecBinaryUnsign1Counter = -1;
         public boolean isBDecBinaryUnsign1Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinaryUnsign1Counter != sharedCounter;
             localBDecBinaryUnsign1Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_UNSIGN_1_LEN = 2;
   protected static final int B_DEC_BINARY_UNSIGN_1_SCALE = 2;
  	/**
	 * serializeBDecBinaryUnsign1
	 */
	protected void serializeBDecBinaryUnsign1(BigDecimal bDecBinaryUnsign1) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinaryUnsign1,B_DEC_BINARY_UNSIGN_1_LEN,B_DEC_BINARY_UNSIGN_1_SCALE)
                  ,beginBDecBinaryUnsign1
                  ,B_DEC_BINARY_UNSIGN_1_LEN
                 );
         localBDecBinaryUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinaryUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinaryUnsign1() {	 
			return (BigDecimal.valueOf(getShort(beginBDecBinaryUnsign1)).movePointLeft(B_DEC_BINARY_UNSIGN_1_SCALE));
   	}
         int localBDecBinaryUnsign2Counter = -1;
         public boolean isBDecBinaryUnsign2Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinaryUnsign2Counter != sharedCounter;
             localBDecBinaryUnsign2Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_UNSIGN_2_LEN = 4;
   protected static final int B_DEC_BINARY_UNSIGN_2_SCALE = 6;
  	/**
	 * serializeBDecBinaryUnsign2
	 */
	protected void serializeBDecBinaryUnsign2(BigDecimal bDecBinaryUnsign2) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinaryUnsign2,B_DEC_BINARY_UNSIGN_2_LEN,B_DEC_BINARY_UNSIGN_2_SCALE)
                  ,beginBDecBinaryUnsign2
                  ,B_DEC_BINARY_UNSIGN_2_LEN
                 );
         localBDecBinaryUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinaryUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinaryUnsign2() {	 
			return (BigDecimal.valueOf(getInt(beginBDecBinaryUnsign2)).movePointLeft(B_DEC_BINARY_UNSIGN_2_SCALE));
   	}
         int localBDecBinaryUnsign3Counter = -1;
         public boolean isBDecBinaryUnsign3Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localBDecBinaryUnsign3Counter != sharedCounter;
             localBDecBinaryUnsign3Counter = sharedCounter; return hasModified;
         }
   protected static final int B_DEC_BINARY_UNSIGN_3_LEN = 8;
   protected static final int B_DEC_BINARY_UNSIGN_3_SCALE = 9;
  	/**
	 * serializeBDecBinaryUnsign3
	 */
	protected void serializeBDecBinaryUnsign3(BigDecimal bDecBinaryUnsign3) {
	      replaceValue( //  save the value as string
                   getBinaryString(bDecBinaryUnsign3,B_DEC_BINARY_UNSIGN_3_LEN,B_DEC_BINARY_UNSIGN_3_SCALE)
                  ,beginBDecBinaryUnsign3
                  ,B_DEC_BINARY_UNSIGN_3_LEN
                 );
         localBDecBinaryUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshBDecBinaryUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecBinaryUnsign3() {	 
			return (BigDecimal.valueOf(getLong(beginBDecBinaryUnsign3)).movePointLeft(B_DEC_BINARY_UNSIGN_3_SCALE));
   	}
     int localBDecDisplaySign1Counter = -1;
     
     public boolean isBDecDisplaySign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplaySign1Counter != sharedCounter;
         localBDecDisplaySign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplaySign1
	 *	@return bDecDisplaySign1
	 */
	public char[]  getBDecDisplaySign1String() {
	    return getCharArray(beginBDecDisplaySign1,B_DEC_DISPLAY_SIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplaySign1IsNumeric() {
		    return isNumeric(beginBDecDisplaySign1
	                    ,beginBDecDisplaySign1 + B_DEC_DISPLAY_SIGN_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_SIGN_1_LEN = 3;
  protected  static final int B_DEC_DISPLAY_SIGN_1_SCALE = 2;

   protected BigDecimal checkBDecDisplaySign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeBDecDisplaySign1
	 */
	protected void serializeBDecDisplaySign1(BigDecimal bDecDisplaySign1) {
	       putNumber(beginBDecDisplaySign1,bDecDisplaySign1,B_DEC_DISPLAY_SIGN_1_LEN,B_DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplaySign1
	 */
   	protected  BigDecimal serializeBDecDisplaySign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginBDecDisplaySign1
		       ,3
		      );		 localBDecDisplaySign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_SIGN_1_LEN,B_DEC_DISPLAY_SIGN_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplaySign1", beginBDecDisplaySign1,B_DEC_DISPLAY_SIGN_1_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplaySign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplaySign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplaySign1
			            ,B_DEC_DISPLAY_SIGN_1_LEN
			            ,B_DEC_DISPLAY_SIGN_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplaySign1", beginBDecDisplaySign1,B_DEC_DISPLAY_SIGN_1_LEN);
    }
   	}
     int localBDecDisplaySign2Counter = -1;
     
     public boolean isBDecDisplaySign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplaySign2Counter != sharedCounter;
         localBDecDisplaySign2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplaySign2
	 *	@return bDecDisplaySign2
	 */
	public char[]  getBDecDisplaySign2String() {
	    return getCharArray(beginBDecDisplaySign2,B_DEC_DISPLAY_SIGN_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplaySign2IsNumeric() {
		    return isNumeric(beginBDecDisplaySign2
	                    ,beginBDecDisplaySign2 + B_DEC_DISPLAY_SIGN_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_SIGN_2_LEN = 8;
  protected  static final int B_DEC_DISPLAY_SIGN_2_SCALE = 7;

   protected BigDecimal checkBDecDisplaySign2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeBDecDisplaySign2
	 */
	protected void serializeBDecDisplaySign2(BigDecimal bDecDisplaySign2) {
	       putNumber(beginBDecDisplaySign2,bDecDisplaySign2,B_DEC_DISPLAY_SIGN_2_LEN,B_DEC_DISPLAY_SIGN_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplaySign2
	 */
   	protected  BigDecimal serializeBDecDisplaySign2(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginBDecDisplaySign2
		       ,8
		      );		 localBDecDisplaySign2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_SIGN_2_LEN,B_DEC_DISPLAY_SIGN_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplaySign2", beginBDecDisplaySign2,B_DEC_DISPLAY_SIGN_2_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplaySign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplaySign2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplaySign2
			            ,B_DEC_DISPLAY_SIGN_2_LEN
			            ,B_DEC_DISPLAY_SIGN_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplaySign2", beginBDecDisplaySign2,B_DEC_DISPLAY_SIGN_2_LEN);
    }
   	}
     int localBDecDisplaySign3Counter = -1;
     
     public boolean isBDecDisplaySign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplaySign3Counter != sharedCounter;
         localBDecDisplaySign3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplaySign3
	 *	@return bDecDisplaySign3
	 */
	public char[]  getBDecDisplaySign3String() {
	    return getCharArray(beginBDecDisplaySign3,B_DEC_DISPLAY_SIGN_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplaySign3IsNumeric() {
		    return isNumeric(beginBDecDisplaySign3
	                    ,beginBDecDisplaySign3 + B_DEC_DISPLAY_SIGN_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_SIGN_3_LEN = 10;
  protected  static final int B_DEC_DISPLAY_SIGN_3_SCALE = 9;

   protected BigDecimal checkBDecDisplaySign3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeBDecDisplaySign3
	 */
	protected void serializeBDecDisplaySign3(BigDecimal bDecDisplaySign3) {
	       putNumber(beginBDecDisplaySign3,bDecDisplaySign3,B_DEC_DISPLAY_SIGN_3_LEN,B_DEC_DISPLAY_SIGN_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplaySign3
	 */
   	protected  BigDecimal serializeBDecDisplaySign3(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginBDecDisplaySign3
		       ,10
		      );		 localBDecDisplaySign3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_SIGN_3_LEN,B_DEC_DISPLAY_SIGN_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplaySign3", beginBDecDisplaySign3,B_DEC_DISPLAY_SIGN_3_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplaySign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplaySign3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplaySign3
			            ,B_DEC_DISPLAY_SIGN_3_LEN
			            ,B_DEC_DISPLAY_SIGN_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplaySign3", beginBDecDisplaySign3,B_DEC_DISPLAY_SIGN_3_LEN);
    }
   	}
     int localBDecDisplayUnsign1Counter = -1;
     
     public boolean isBDecDisplayUnsign1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplayUnsign1Counter != sharedCounter;
         localBDecDisplayUnsign1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplayUnsign1
	 *	@return bDecDisplayUnsign1
	 */
	public char[]  getBDecDisplayUnsign1String() {
	    return getCharArray(beginBDecDisplayUnsign1,B_DEC_DISPLAY_UNSIGN_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplayUnsign1IsNumeric() {
		    return isNumeric(beginBDecDisplayUnsign1
	                    ,beginBDecDisplayUnsign1 + B_DEC_DISPLAY_UNSIGN_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_UNSIGN_1_LEN = 3;
  protected  static final int B_DEC_DISPLAY_UNSIGN_1_SCALE = 2;

   protected BigDecimal checkBDecDisplayUnsign1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeBDecDisplayUnsign1
	 */
	protected void serializeBDecDisplayUnsign1(BigDecimal bDecDisplayUnsign1) {
	       putNumber(beginBDecDisplayUnsign1,bDecDisplayUnsign1,B_DEC_DISPLAY_UNSIGN_1_LEN,B_DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplayUnsign1
	 */
   	protected  BigDecimal serializeBDecDisplayUnsign1(char[] value) throws CFException {
        if (value.length < 3) value = pad(3, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBDecDisplayUnsign1
		       ,3
		      );		 localBDecDisplayUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_UNSIGN_1_LEN,B_DEC_DISPLAY_UNSIGN_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplayUnsign1", beginBDecDisplayUnsign1,B_DEC_DISPLAY_UNSIGN_1_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplayUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplayUnsign1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplayUnsign1
			            ,B_DEC_DISPLAY_UNSIGN_1_LEN
			            ,B_DEC_DISPLAY_UNSIGN_1_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplayUnsign1", beginBDecDisplayUnsign1,B_DEC_DISPLAY_UNSIGN_1_LEN);
    }
   	}
     int localBDecDisplayUnsign2Counter = -1;
     
     public boolean isBDecDisplayUnsign2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplayUnsign2Counter != sharedCounter;
         localBDecDisplayUnsign2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplayUnsign2
	 *	@return bDecDisplayUnsign2
	 */
	public char[]  getBDecDisplayUnsign2String() {
	    return getCharArray(beginBDecDisplayUnsign2,B_DEC_DISPLAY_UNSIGN_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplayUnsign2IsNumeric() {
		    return isNumeric(beginBDecDisplayUnsign2
	                    ,beginBDecDisplayUnsign2 + B_DEC_DISPLAY_UNSIGN_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_UNSIGN_2_LEN = 7;
  protected  static final int B_DEC_DISPLAY_UNSIGN_2_SCALE = 6;

   protected BigDecimal checkBDecDisplayUnsign2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeBDecDisplayUnsign2
	 */
	protected void serializeBDecDisplayUnsign2(BigDecimal bDecDisplayUnsign2) {
	       putNumber(beginBDecDisplayUnsign2,bDecDisplayUnsign2,B_DEC_DISPLAY_UNSIGN_2_LEN,B_DEC_DISPLAY_UNSIGN_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplayUnsign2
	 */
   	protected  BigDecimal serializeBDecDisplayUnsign2(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginBDecDisplayUnsign2
		       ,7
		      );		 localBDecDisplayUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_UNSIGN_2_LEN,B_DEC_DISPLAY_UNSIGN_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplayUnsign2", beginBDecDisplayUnsign2,B_DEC_DISPLAY_UNSIGN_2_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplayUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplayUnsign2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplayUnsign2
			            ,B_DEC_DISPLAY_UNSIGN_2_LEN
			            ,B_DEC_DISPLAY_UNSIGN_2_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplayUnsign2", beginBDecDisplayUnsign2,B_DEC_DISPLAY_UNSIGN_2_LEN);
    }
   	}
     int localBDecDisplayUnsign3Counter = -1;
     
     public boolean isBDecDisplayUnsign3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBDecDisplayUnsign3Counter != sharedCounter;
         localBDecDisplayUnsign3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bDecDisplayUnsign3
	 *	@return bDecDisplayUnsign3
	 */
	public char[]  getBDecDisplayUnsign3String() {
	    return getCharArray(beginBDecDisplayUnsign3,B_DEC_DISPLAY_UNSIGN_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bDecDisplayUnsign3IsNumeric() {
		    return isNumeric(beginBDecDisplayUnsign3
	                    ,beginBDecDisplayUnsign3 + B_DEC_DISPLAY_UNSIGN_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int B_DEC_DISPLAY_UNSIGN_3_LEN = 10;
  protected  static final int B_DEC_DISPLAY_UNSIGN_3_SCALE = 9;

   protected BigDecimal checkBDecDisplayUnsign3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeBDecDisplayUnsign3
	 */
	protected void serializeBDecDisplayUnsign3(BigDecimal bDecDisplayUnsign3) {
	       putNumber(beginBDecDisplayUnsign3,bDecDisplayUnsign3,B_DEC_DISPLAY_UNSIGN_3_LEN,B_DEC_DISPLAY_UNSIGN_3_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBDecDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBDecDisplayUnsign3
	 */
   	protected  BigDecimal serializeBDecDisplayUnsign3(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginBDecDisplayUnsign3
		       ,10
		      );		 localBDecDisplayUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,B_DEC_DISPLAY_UNSIGN_3_LEN,B_DEC_DISPLAY_UNSIGN_3_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bDecDisplayUnsign3", beginBDecDisplayUnsign3,B_DEC_DISPLAY_UNSIGN_3_LEN);
    	}
    }
    /**
	 *	refreshBDecDisplayUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecDisplayUnsign3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBDecDisplayUnsign3
			            ,B_DEC_DISPLAY_UNSIGN_3_LEN
			            ,B_DEC_DISPLAY_UNSIGN_3_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bDecDisplayUnsign3", beginBDecDisplayUnsign3,B_DEC_DISPLAY_UNSIGN_3_LEN);
    }
   	}
        int localBDecPackedSign1Counter = -1;
        public boolean isBDecPackedSign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedSign1Counter != sharedCounter;
           localBDecPackedSign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedSign1IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedSign1,B_DEC_PACKED_SIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedSign1String() {
            return getPackedString(beginBDecPackedSign1,B_DEC_PACKED_SIGN_1_LEN);
         }
   protected static final int B_DEC_PACKED_SIGN_1_LEN = 2;
   protected static final int B_DEC_PACKED_SIGN_1_SCALE = 2;
  	/**
	 * 	serializeBDecPackedSign1
	 */
	protected void serializeBDecPackedSign1(BigDecimal bDecPackedSign1) {
		   putDecimal(beginBDecPackedSign1,bDecPackedSign1,B_DEC_PACKED_SIGN_1_LEN,B_DEC_PACKED_SIGN_1_SCALE,true);
		 localBDecPackedSign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedSign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshBDecPackedSign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedSign1() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedSign1,B_DEC_PACKED_SIGN_1_LEN,B_DEC_PACKED_SIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedSign1", beginBDecPackedSign1,B_DEC_PACKED_SIGN_1_LEN);
     }
   	}
        int localBDecPackedSign2Counter = -1;
        public boolean isBDecPackedSign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedSign2Counter != sharedCounter;
           localBDecPackedSign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedSign2IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedSign2,B_DEC_PACKED_SIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedSign2String() {
            return getPackedString(beginBDecPackedSign2,B_DEC_PACKED_SIGN_2_LEN);
         }
   protected static final int B_DEC_PACKED_SIGN_2_LEN = 5;
   protected static final int B_DEC_PACKED_SIGN_2_SCALE = 7;
  	/**
	 * 	serializeBDecPackedSign2
	 */
	protected void serializeBDecPackedSign2(BigDecimal bDecPackedSign2) {
		   putDecimal(beginBDecPackedSign2,bDecPackedSign2,B_DEC_PACKED_SIGN_2_LEN,B_DEC_PACKED_SIGN_2_SCALE,true);
		 localBDecPackedSign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedSign2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,7/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshBDecPackedSign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedSign2() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedSign2,B_DEC_PACKED_SIGN_2_LEN,B_DEC_PACKED_SIGN_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedSign2", beginBDecPackedSign2,B_DEC_PACKED_SIGN_2_LEN);
     }
   	}
        int localBDecPackedSign3Counter = -1;
        public boolean isBDecPackedSign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedSign3Counter != sharedCounter;
           localBDecPackedSign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedSign3IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedSign3,B_DEC_PACKED_SIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedSign3String() {
            return getPackedString(beginBDecPackedSign3,B_DEC_PACKED_SIGN_3_LEN);
         }
   protected static final int B_DEC_PACKED_SIGN_3_LEN = 6;
   protected static final int B_DEC_PACKED_SIGN_3_SCALE = 9;
  	/**
	 * 	serializeBDecPackedSign3
	 */
	protected void serializeBDecPackedSign3(BigDecimal bDecPackedSign3) {
		   putDecimal(beginBDecPackedSign3,bDecPackedSign3,B_DEC_PACKED_SIGN_3_LEN,B_DEC_PACKED_SIGN_3_SCALE,true);
		 localBDecPackedSign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedSign3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshBDecPackedSign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedSign3() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedSign3,B_DEC_PACKED_SIGN_3_LEN,B_DEC_PACKED_SIGN_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedSign3", beginBDecPackedSign3,B_DEC_PACKED_SIGN_3_LEN);
     }
   	}
        int localBDecPackedUnsign1Counter = -1;
        public boolean isBDecPackedUnsign1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedUnsign1Counter != sharedCounter;
           localBDecPackedUnsign1Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedUnsign1IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedUnsign1,B_DEC_PACKED_UNSIGN_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedUnsign1String() {
            return getPackedString(beginBDecPackedUnsign1,B_DEC_PACKED_UNSIGN_1_LEN);
         }
   protected static final int B_DEC_PACKED_UNSIGN_1_LEN = 2;
   protected static final int B_DEC_PACKED_UNSIGN_1_SCALE = 2;
  	/**
	 * 	serializeBDecPackedUnsign1
	 */
	protected void serializeBDecPackedUnsign1(BigDecimal bDecPackedUnsign1) {
		   putDecimal(beginBDecPackedUnsign1,bDecPackedUnsign1,B_DEC_PACKED_UNSIGN_1_LEN,B_DEC_PACKED_UNSIGN_1_SCALE,false);
		 localBDecPackedUnsign1Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedUnsign1MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,3/*precision*/);
   }
     /**
	 *	refreshBDecPackedUnsign1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedUnsign1() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedUnsign1,B_DEC_PACKED_UNSIGN_1_LEN,B_DEC_PACKED_UNSIGN_1_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedUnsign1", beginBDecPackedUnsign1,B_DEC_PACKED_UNSIGN_1_LEN);
     }
   	}
        int localBDecPackedUnsign2Counter = -1;
        public boolean isBDecPackedUnsign2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedUnsign2Counter != sharedCounter;
           localBDecPackedUnsign2Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedUnsign2IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedUnsign2,B_DEC_PACKED_UNSIGN_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedUnsign2String() {
            return getPackedString(beginBDecPackedUnsign2,B_DEC_PACKED_UNSIGN_2_LEN);
         }
   protected static final int B_DEC_PACKED_UNSIGN_2_LEN = 4;
   protected static final int B_DEC_PACKED_UNSIGN_2_SCALE = 6;
  	/**
	 * 	serializeBDecPackedUnsign2
	 */
	protected void serializeBDecPackedUnsign2(BigDecimal bDecPackedUnsign2) {
		   putDecimal(beginBDecPackedUnsign2,bDecPackedUnsign2,B_DEC_PACKED_UNSIGN_2_LEN,B_DEC_PACKED_UNSIGN_2_SCALE,false);
		 localBDecPackedUnsign2Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedUnsign2MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshBDecPackedUnsign2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedUnsign2() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedUnsign2,B_DEC_PACKED_UNSIGN_2_LEN,B_DEC_PACKED_UNSIGN_2_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedUnsign2", beginBDecPackedUnsign2,B_DEC_PACKED_UNSIGN_2_LEN);
     }
   	}
        int localBDecPackedUnsign3Counter = -1;
        public boolean isBDecPackedUnsign3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBDecPackedUnsign3Counter != sharedCounter;
           localBDecPackedUnsign3Counter = sharedCounter; return hasModified; 
        }
	    public boolean bDecPackedUnsign3IsNumeric() {
	      return decimalIsNumeric(beginBDecPackedUnsign3,B_DEC_PACKED_UNSIGN_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bDecPackedUnsign3String() {
            return getPackedString(beginBDecPackedUnsign3,B_DEC_PACKED_UNSIGN_3_LEN);
         }
   protected static final int B_DEC_PACKED_UNSIGN_3_LEN = 6;
   protected static final int B_DEC_PACKED_UNSIGN_3_SCALE = 9;
  	/**
	 * 	serializeBDecPackedUnsign3
	 */
	protected void serializeBDecPackedUnsign3(BigDecimal bDecPackedUnsign3) {
		   putDecimal(beginBDecPackedUnsign3,bDecPackedUnsign3,B_DEC_PACKED_UNSIGN_3_LEN,B_DEC_PACKED_UNSIGN_3_SCALE,false);
		 localBDecPackedUnsign3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBDecPackedUnsign3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,9/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshBDecPackedUnsign3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBDecPackedUnsign3() throws CFException {	
   	try { 
		 return (getDecimal(beginBDecPackedUnsign3,B_DEC_PACKED_UNSIGN_3_LEN,B_DEC_PACKED_UNSIGN_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bDecPackedUnsign3", beginBDecPackedUnsign3,B_DEC_PACKED_UNSIGN_3_LEN);
     }
   	}
     int localBCharCounter = -1;
     public boolean isBCharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBCharCounter != sharedCounter;
         localBCharCounter = sharedCounter; return hasModified;
     }
	protected static final int B_CHAR_LEN = 5;
	/**
	 * 	serialize this BChar
	 */
   protected void serializeBChar(char[] bChar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bChar,0,getStringValue(),beginBChar,B_CHAR_LEN);
       localBCharCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBCharConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBChar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBChar() {	 
   		return (substring(getStringValue(),beginBChar,beginBChar + B_CHAR_LEN));
   	}
     int localBCharJustRightCounter = -1;
     public boolean isBCharJustRightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBCharJustRightCounter != sharedCounter;
         localBCharJustRightCounter = sharedCounter; return hasModified;
     }
	protected static final int B_CHAR_JUST_RIGHT_LEN = 5;
	/**
	 * 	serialize this BCharJustRight
	 */
   protected void serializeBCharJustRight(char[] bCharJustRight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bCharJustRight,0,getStringValue(),beginBCharJustRight,B_CHAR_JUST_RIGHT_LEN);
       localBCharJustRightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBCharJustRightConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,true, false);
   }
    /**
	 *	refreshBCharJustRight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBCharJustRight() {	 
   		return (substring(getStringValue(),beginBCharJustRight,beginBCharJustRight + B_CHAR_JUST_RIGHT_LEN));
   	}
     int localBCharZeroCounter = -1;
     public boolean isBCharZeroModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBCharZeroCounter != sharedCounter;
         localBCharZeroCounter = sharedCounter; return hasModified;
     }
	protected static final int B_CHAR_ZERO_LEN = 5;
	/**
	 * 	serialize this BCharZero
	 */
   protected void serializeBCharZero(char[] bCharZero) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bCharZero,0,getStringValue(),beginBCharZero,B_CHAR_ZERO_LEN);
       localBCharZeroCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBCharZeroConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, true);
   }
    /**
	 *	refreshBCharZero is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBCharZero() {	 
   		return (substring(getStringValue(),beginBCharZero,beginBCharZero + B_CHAR_ZERO_LEN));
   	}




}
  
