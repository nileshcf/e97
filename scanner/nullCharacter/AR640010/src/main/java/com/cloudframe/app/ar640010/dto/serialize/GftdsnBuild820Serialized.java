package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftdsnBuild820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftdsnBuild820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftdsnBuild820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFTDSN_BUILD_820_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftdsnSystemId820;
            protected  int beginGftdsnBulkId820;
            protected  int beginGftdsnXferMthdCd820;
            protected  int beginGftdsnEndptId820;
            protected  int beginGftdsnYear820;
            protected  int beginGftdsnMonth820;
            protected  int beginGftdsnDay820;
            protected  int beginGftdsnHour820;
            protected  int beginGftdsnMinute820;
            protected  int beginGftdsnSecond820;
            protected  int beginGftdsnRotorChar820;
            protected  int beginGftdsnCyclNum820;
	
	/**
	* Constructor for GftdsnBuild820Serialized
	**/
    public GftdsnBuild820Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GftdsnBuild820Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnBuild820Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GftdsnBuild820Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this GftdsnBuild820Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in GftdsnBuild820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFTDSN_BUILD_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginGftdsnSystemId820 = getStartOffset() + 1;	// set offset for serialization
  
  
             beginGftdsnBulkId820 = getStartOffset() + 4;	// set offset for serialization
  
  
             beginGftdsnXferMthdCd820 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginGftdsnEndptId820 = getStartOffset() + 12;	// set offset for serialization
  
  
             beginGftdsnYear820 = getStartOffset() + 21;	// set offset for serialization
  
             beginGftdsnMonth820 = getStartOffset() + 23;	// set offset for serialization
  
             beginGftdsnDay820 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginGftdsnHour820 = getStartOffset() + 29;	// set offset for serialization
  
             beginGftdsnMinute820 = getStartOffset() + 31;	// set offset for serialization
  
             beginGftdsnSecond820 = getStartOffset() + 33;	// set offset for serialization
  
  
             beginGftdsnRotorChar820 = getStartOffset() + 36;	// set offset for serialization
  
             beginGftdsnCyclNum820 = getStartOffset() + 37;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localGftdsnSystemId820Counter = -1;
     public boolean isGftdsnSystemId820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnSystemId820Counter != sharedCounter;
         localGftdsnSystemId820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_SYSTEM_ID_820_LEN = 2;
	/**
	 * 	serialize this GftdsnSystemId820
	 */
   protected void serializeGftdsnSystemId820(char[] gftdsnSystemId820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnSystemId820,0,getStringValue(),beginGftdsnSystemId820,GFTDSN_SYSTEM_ID_820_LEN);
       localGftdsnSystemId820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnSystemId820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnSystemId820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnSystemId820() {	 
   		return (substring(getStringValue(),beginGftdsnSystemId820,beginGftdsnSystemId820 + GFTDSN_SYSTEM_ID_820_LEN));
   	}
     int localGftdsnBulkId820Counter = -1;
     public boolean isGftdsnBulkId820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnBulkId820Counter != sharedCounter;
         localGftdsnBulkId820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_BULK_ID_820_LEN = 4;
	/**
	 * 	serialize this GftdsnBulkId820
	 */
   protected void serializeGftdsnBulkId820(char[] gftdsnBulkId820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnBulkId820,0,getStringValue(),beginGftdsnBulkId820,GFTDSN_BULK_ID_820_LEN);
       localGftdsnBulkId820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnBulkId820Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshGftdsnBulkId820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnBulkId820() {	 
   		return (substring(getStringValue(),beginGftdsnBulkId820,beginGftdsnBulkId820 + GFTDSN_BULK_ID_820_LEN));
   	}
     int localGftdsnXferMthdCd820Counter = -1;
     public boolean isGftdsnXferMthdCd820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnXferMthdCd820Counter != sharedCounter;
         localGftdsnXferMthdCd820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_XFER_MTHD_CD_820_LEN = 1;
	/**
	 * 	serialize this GftdsnXferMthdCd820
	 */
   protected void serializeGftdsnXferMthdCd820(char[] gftdsnXferMthdCd820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnXferMthdCd820,0,getStringValue(),beginGftdsnXferMthdCd820,GFTDSN_XFER_MTHD_CD_820_LEN);
       localGftdsnXferMthdCd820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnXferMthdCd820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGftdsnXferMthdCd820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnXferMthdCd820() {	 
   		return (substring(getStringValue(),beginGftdsnXferMthdCd820,beginGftdsnXferMthdCd820 + GFTDSN_XFER_MTHD_CD_820_LEN));
   	}
     int localGftdsnEndptId820Counter = -1;
     public boolean isGftdsnEndptId820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnEndptId820Counter != sharedCounter;
         localGftdsnEndptId820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_ENDPT_ID_820_LEN = 7;
	/**
	 * 	serialize this GftdsnEndptId820
	 */
   protected void serializeGftdsnEndptId820(char[] gftdsnEndptId820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnEndptId820,0,getStringValue(),beginGftdsnEndptId820,GFTDSN_ENDPT_ID_820_LEN);
       localGftdsnEndptId820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnEndptId820Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshGftdsnEndptId820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnEndptId820() {	 
   		return (substring(getStringValue(),beginGftdsnEndptId820,beginGftdsnEndptId820 + GFTDSN_ENDPT_ID_820_LEN));
   	}
     int localGftdsnYear820Counter = -1;
     public boolean isGftdsnYear820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnYear820Counter != sharedCounter;
         localGftdsnYear820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_YEAR_820_LEN = 2;
	/**
	 * 	serialize this GftdsnYear820
	 */
   protected void serializeGftdsnYear820(char[] gftdsnYear820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnYear820,0,getStringValue(),beginGftdsnYear820,GFTDSN_YEAR_820_LEN);
       localGftdsnYear820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnYear820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnYear820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnYear820() {	 
   		return (substring(getStringValue(),beginGftdsnYear820,beginGftdsnYear820 + GFTDSN_YEAR_820_LEN));
   	}
     int localGftdsnMonth820Counter = -1;
     public boolean isGftdsnMonth820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnMonth820Counter != sharedCounter;
         localGftdsnMonth820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_MONTH_820_LEN = 2;
	/**
	 * 	serialize this GftdsnMonth820
	 */
   protected void serializeGftdsnMonth820(char[] gftdsnMonth820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnMonth820,0,getStringValue(),beginGftdsnMonth820,GFTDSN_MONTH_820_LEN);
       localGftdsnMonth820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnMonth820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnMonth820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnMonth820() {	 
   		return (substring(getStringValue(),beginGftdsnMonth820,beginGftdsnMonth820 + GFTDSN_MONTH_820_LEN));
   	}
     int localGftdsnDay820Counter = -1;
     public boolean isGftdsnDay820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnDay820Counter != sharedCounter;
         localGftdsnDay820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_DAY_820_LEN = 2;
	/**
	 * 	serialize this GftdsnDay820
	 */
   protected void serializeGftdsnDay820(char[] gftdsnDay820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnDay820,0,getStringValue(),beginGftdsnDay820,GFTDSN_DAY_820_LEN);
       localGftdsnDay820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnDay820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnDay820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnDay820() {	 
   		return (substring(getStringValue(),beginGftdsnDay820,beginGftdsnDay820 + GFTDSN_DAY_820_LEN));
   	}
     int localGftdsnHour820Counter = -1;
     public boolean isGftdsnHour820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnHour820Counter != sharedCounter;
         localGftdsnHour820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_HOUR_820_LEN = 2;
	/**
	 * 	serialize this GftdsnHour820
	 */
   protected void serializeGftdsnHour820(char[] gftdsnHour820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnHour820,0,getStringValue(),beginGftdsnHour820,GFTDSN_HOUR_820_LEN);
       localGftdsnHour820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnHour820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnHour820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnHour820() {	 
   		return (substring(getStringValue(),beginGftdsnHour820,beginGftdsnHour820 + GFTDSN_HOUR_820_LEN));
   	}
     int localGftdsnMinute820Counter = -1;
     public boolean isGftdsnMinute820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnMinute820Counter != sharedCounter;
         localGftdsnMinute820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_MINUTE_820_LEN = 2;
	/**
	 * 	serialize this GftdsnMinute820
	 */
   protected void serializeGftdsnMinute820(char[] gftdsnMinute820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnMinute820,0,getStringValue(),beginGftdsnMinute820,GFTDSN_MINUTE_820_LEN);
       localGftdsnMinute820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnMinute820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnMinute820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnMinute820() {	 
   		return (substring(getStringValue(),beginGftdsnMinute820,beginGftdsnMinute820 + GFTDSN_MINUTE_820_LEN));
   	}
     int localGftdsnSecond820Counter = -1;
     public boolean isGftdsnSecond820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnSecond820Counter != sharedCounter;
         localGftdsnSecond820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_SECOND_820_LEN = 2;
	/**
	 * 	serialize this GftdsnSecond820
	 */
   protected void serializeGftdsnSecond820(char[] gftdsnSecond820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnSecond820,0,getStringValue(),beginGftdsnSecond820,GFTDSN_SECOND_820_LEN);
       localGftdsnSecond820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnSecond820Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshGftdsnSecond820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnSecond820() {	 
   		return (substring(getStringValue(),beginGftdsnSecond820,beginGftdsnSecond820 + GFTDSN_SECOND_820_LEN));
   	}
     int localGftdsnRotorChar820Counter = -1;
     public boolean isGftdsnRotorChar820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnRotorChar820Counter != sharedCounter;
         localGftdsnRotorChar820Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_ROTOR_CHAR_820_LEN = 1;
	/**
	 * 	serialize this GftdsnRotorChar820
	 */
   protected void serializeGftdsnRotorChar820(char[] gftdsnRotorChar820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnRotorChar820,0,getStringValue(),beginGftdsnRotorChar820,GFTDSN_ROTOR_CHAR_820_LEN);
       localGftdsnRotorChar820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnRotorChar820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGftdsnRotorChar820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnRotorChar820() {	 
   		return (substring(getStringValue(),beginGftdsnRotorChar820,beginGftdsnRotorChar820 + GFTDSN_ROTOR_CHAR_820_LEN));
   	}
     int localGftdsnCyclNum820Counter = -1;
     public boolean isGftdsnCyclNum820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnCyclNum820Counter != sharedCounter;
         localGftdsnCyclNum820Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of gftdsnCyclNum820
	 *	@return gftdsnCyclNum820
	 */
	public char[]  getGftdsnCyclNum820String() {
	     return getCharArray(beginGftdsnCyclNum820,GFTDSN_CYCL_NUM_820_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gftdsnCyclNum820IsNumeric() {
	    return isNumeric(beginGftdsnCyclNum820
	                    ,beginGftdsnCyclNum820 + GFTDSN_CYCL_NUM_820_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GFTDSN_CYCL_NUM_820_LEN = 3;
  	/**
	 * serializeGftdsnCyclNum820
	 */
	protected void serializeGftdsnCyclNum820(int gftdsnCyclNum820) {
		 putNumber(beginGftdsnCyclNum820,gftdsnCyclNum820,GFTDSN_CYCL_NUM_820_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGftdsnCyclNum820Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGftdsnCyclNum820
	 */
   	protected  int serializeGftdsnCyclNum820(char[] value) {
	    int  gftdsnCyclNum820;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    gftdsnCyclNum820 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginGftdsnCyclNum820
		       ,3
		      );
		 localGftdsnCyclNum820Counter = shareString.getSerializedField().getModifiedCounter();
		return  gftdsnCyclNum820;
    }

   protected int checkGftdsnCyclNum820MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGftdsnCyclNum820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGftdsnCyclNum820() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginGftdsnCyclNum820
			                 ,GFTDSN_CYCL_NUM_820_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("gftdsnCyclNum820", beginGftdsnCyclNum820,GFTDSN_CYCL_NUM_820_LEN);
    }
   	}




}
  
