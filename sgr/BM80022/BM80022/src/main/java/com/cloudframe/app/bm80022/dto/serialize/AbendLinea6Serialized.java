package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class AbendLinea6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendLinea6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendLinea6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_LINEA_6_LENGTH = 79;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller601;
            protected  int beginFiller10;
            protected  int beginAbendSqlcode;
            protected  int beginFiller14;
            protected  int beginAbendCodigo;
            protected  int beginFiller15;
            protected  int beginFiller12;
            protected  int beginAbendSqlwarn;
            protected  int beginFiller16;
            protected  int beginFiller13;
            protected  int beginAbendTabla;
            protected  int beginFiller17;
            protected  int beginFiller801;
	
	/**
	* Constructor for AbendLinea6Serialized
	**/
    public AbendLinea6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendLinea6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_LINEA_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFiller601 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller10 = getStartOffset() + 1;	// set offset for serialization
  
             beginAbendSqlcode = getStartOffset() + 10;	// set offset for serialization
  
             beginFiller14 = getStartOffset() + 20;	// set offset for serialization
  
             beginAbendCodigo = getStartOffset() + 21;	// set offset for serialization
  
             beginFiller15 = getStartOffset() + 24;	// set offset for serialization
  
             beginFiller12 = getStartOffset() + 25;	// set offset for serialization
  
             beginAbendSqlwarn = getStartOffset() + 34;	// set offset for serialization
  
             beginFiller16 = getStartOffset() + 42;	// set offset for serialization
  
             beginFiller13 = getStartOffset() + 49;	// set offset for serialization
  
             beginAbendTabla = getStartOffset() + 58;	// set offset for serialization
  
             beginFiller17 = getStartOffset() + 65;	// set offset for serialization
  
             beginFiller801 = getStartOffset() + 78;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFiller601Counter = -1;
     public boolean isFiller601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller601Counter != sharedCounter;
         localFiller601Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_601_LEN = 1;
	/**
	 * 	serialize this Filler601
	 */
   protected void serializeFiller601(char[] filler601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler601,0,getStringValue(),beginFiller601,FILLER_601_LEN);
       localFiller601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller601Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller601() {	 
   		return (substring(getStringValue(),beginFiller601,beginFiller601 + FILLER_601_LEN));
   	}
     int localFiller10Counter = -1;
     public boolean isFiller10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller10Counter != sharedCounter;
         localFiller10Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_10_LEN = 9;
	/**
	 * 	serialize this Filler10
	 */
   protected void serializeFiller10(char[] filler10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler10,0,getStringValue(),beginFiller10,FILLER_10_LEN);
       localFiller10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller10Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFiller10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller10() {	 
   		return (substring(getStringValue(),beginFiller10,beginFiller10 + FILLER_10_LEN));
   	}
     int localAbendSqlcodeCounter = -1;
     public boolean isAbendSqlcodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSqlcodeCounter != sharedCounter;
         localAbendSqlcodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeString() {
	     return getCharArray(beginAbendSqlcode,ABEND_SQLCODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendSqlcodeIsNumeric() {
	    return isNumeric(beginAbendSqlcode
	                    ,beginAbendSqlcode + ABEND_SQLCODE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_SQLCODE_LEN = 10;
  	/**
	 * serializeAbendSqlcode
	 */
	protected void serializeAbendSqlcode(long abendSqlcode) {
		 putNumber(beginAbendSqlcode,abendSqlcode,ABEND_SQLCODE_LEN,true/*isSigned?*/,true/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localAbendSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendSqlcode
	 */
   	protected  long serializeAbendSqlcode(char[] value) {
	    long  abendSqlcode;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendSqlcode = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,true/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginAbendSqlcode
		       ,10
		      );
		 localAbendSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  abendSqlcode;
    }

   protected long checkAbendSqlcodeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAbendSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAbendSqlcode() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAbendSqlcode
			                 ,ABEND_SQLCODE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendSqlcode", beginAbendSqlcode,ABEND_SQLCODE_LEN);
    }
   	}
     int localFiller14Counter = -1;
     public boolean isFiller14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller14Counter != sharedCounter;
         localFiller14Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_14_LEN = 1;
	/**
	 * 	serialize this Filler14
	 */
   protected void serializeFiller14(char[] filler14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler14,0,getStringValue(),beginFiller14,FILLER_14_LEN);
       localFiller14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller14Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller14() {	 
   		return (substring(getStringValue(),beginFiller14,beginFiller14 + FILLER_14_LEN));
   	}
     int localAbendCodigoCounter = -1;
     public boolean isAbendCodigoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCodigoCounter != sharedCounter;
         localAbendCodigoCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_CODIGO_LEN = 3;
	/**
	 * 	serialize this AbendCodigo
	 */
   protected void serializeAbendCodigo(char[] abendCodigo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendCodigo,0,getStringValue(),beginAbendCodigo,ABEND_CODIGO_LEN);
       localAbendCodigoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendCodigoConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAbendCodigo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendCodigo() {	 
   		return (substring(getStringValue(),beginAbendCodigo,beginAbendCodigo + ABEND_CODIGO_LEN));
   	}
     int localFiller15Counter = -1;
     public boolean isFiller15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller15Counter != sharedCounter;
         localFiller15Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_15_LEN = 1;
	/**
	 * 	serialize this Filler15
	 */
   protected void serializeFiller15(char[] filler15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler15,0,getStringValue(),beginFiller15,FILLER_15_LEN);
       localFiller15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller15Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller15() {	 
   		return (substring(getStringValue(),beginFiller15,beginFiller15 + FILLER_15_LEN));
   	}
     int localFiller12Counter = -1;
     public boolean isFiller12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller12Counter != sharedCounter;
         localFiller12Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_12_LEN = 9;
	/**
	 * 	serialize this Filler12
	 */
   protected void serializeFiller12(char[] filler12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler12,0,getStringValue(),beginFiller12,FILLER_12_LEN);
       localFiller12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller12Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFiller12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller12() {	 
   		return (substring(getStringValue(),beginFiller12,beginFiller12 + FILLER_12_LEN));
   	}
     int localAbendSqlwarnCounter = -1;
     public boolean isAbendSqlwarnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSqlwarnCounter != sharedCounter;
         localAbendSqlwarnCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_SQLWARN_LEN = 8;
	/**
	 * 	serialize this AbendSqlwarn
	 */
   protected void serializeAbendSqlwarn(char[] abendSqlwarn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendSqlwarn,0,getStringValue(),beginAbendSqlwarn,ABEND_SQLWARN_LEN);
       localAbendSqlwarnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendSqlwarnConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAbendSqlwarn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendSqlwarn() {	 
   		return (substring(getStringValue(),beginAbendSqlwarn,beginAbendSqlwarn + ABEND_SQLWARN_LEN));
   	}
     int localFiller16Counter = -1;
     public boolean isFiller16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller16Counter != sharedCounter;
         localFiller16Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_16_LEN = 7;
	/**
	 * 	serialize this Filler16
	 */
   protected void serializeFiller16(char[] filler16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler16,0,getStringValue(),beginFiller16,FILLER_16_LEN);
       localFiller16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller16Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshFiller16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller16() {	 
   		return (substring(getStringValue(),beginFiller16,beginFiller16 + FILLER_16_LEN));
   	}
     int localFiller13Counter = -1;
     public boolean isFiller13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller13Counter != sharedCounter;
         localFiller13Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_13_LEN = 9;
	/**
	 * 	serialize this Filler13
	 */
   protected void serializeFiller13(char[] filler13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler13,0,getStringValue(),beginFiller13,FILLER_13_LEN);
       localFiller13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller13Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFiller13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller13() {	 
   		return (substring(getStringValue(),beginFiller13,beginFiller13 + FILLER_13_LEN));
   	}
     int localAbendTablaCounter = -1;
     public boolean isAbendTablaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendTablaCounter != sharedCounter;
         localAbendTablaCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_TABLA_LEN = 7;
	/**
	 * 	serialize this AbendTabla
	 */
   protected void serializeAbendTabla(char[] abendTabla) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendTabla,0,getStringValue(),beginAbendTabla,ABEND_TABLA_LEN);
       localAbendTablaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendTablaConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshAbendTabla is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendTabla() {	 
   		return (substring(getStringValue(),beginAbendTabla,beginAbendTabla + ABEND_TABLA_LEN));
   	}
     int localFiller17Counter = -1;
     public boolean isFiller17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller17Counter != sharedCounter;
         localFiller17Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_17_LEN = 13;
	/**
	 * 	serialize this Filler17
	 */
   protected void serializeFiller17(char[] filler17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler17,0,getStringValue(),beginFiller17,FILLER_17_LEN);
       localFiller17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller17Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshFiller17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller17() {	 
   		return (substring(getStringValue(),beginFiller17,beginFiller17 + FILLER_17_LEN));
   	}
     int localFiller801Counter = -1;
     public boolean isFiller801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller801Counter != sharedCounter;
         localFiller801Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_801_LEN = 1;
	/**
	 * 	serialize this Filler801
	 */
   protected void serializeFiller801(char[] filler801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler801,0,getStringValue(),beginFiller801,FILLER_801_LEN);
       localFiller801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller801() {	 
   		return (substring(getStringValue(),beginFiller801,beginFiller801 + FILLER_801_LEN));
   	}




}
  
