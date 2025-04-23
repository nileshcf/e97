package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamAllocParms850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamAllocParms850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamAllocParms850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_ALLOC_PARMS_850_LENGTH = 224;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamDd850;
            protected  int beginDynamDsn850;
            protected  int beginDynamExtTyp850;
            protected  int beginDynamExtId850;
            protected int beginDynamWorkAreas850ConditionGroup3;
            protected  int beginDynamDcType850;
            protected  int beginDynamRecfm850;
            protected  int beginDynamLrecl850;
            protected  int beginDynamBlksz850;
            protected  int beginDynamSpcPri850;
            protected  int beginDynamSpcSec850;
	
	/**
	* Constructor for DynamAllocParms850Serialized
	**/
    public DynamAllocParms850Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DynamAllocParms850Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAllocParms850Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DynamAllocParms850Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this DynamAllocParms850Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in DynamAllocParms850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_ALLOC_PARMS_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDynamDd850 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginDynamDsn850 = getStartOffset() + 16;	// set offset for serialization
  
             beginDynamExtTyp850 = getStartOffset() + 60;	// set offset for serialization
  
             beginDynamExtId850 = getStartOffset() + 65;	// set offset for serialization
  
                beginDynamWorkAreas850ConditionGroup3 = getStartOffset() + 73;	// filler with 88
  
  
  
             beginDynamDcType850 = getStartOffset() + 103;	// set offset for serialization
  
  
             beginDynamRecfm850 = getStartOffset() + 127;	// set offset for serialization
  
  
             beginDynamLrecl850 = getStartOffset() + 137;	// set offset for serialization
  
  
             beginDynamBlksz850 = getStartOffset() + 155;	// set offset for serialization
  
  
  
             beginDynamSpcPri850 = getStartOffset() + 189;	// set offset for serialization
  
  
             beginDynamSpcSec850 = getStartOffset() + 209;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDynamDd850Counter = -1;
     public boolean isDynamDd850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamDd850Counter != sharedCounter;
         localDynamDd850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_DD_850_LEN = 8;
	/**
	 * 	serialize this DynamDd850
	 */
   protected void serializeDynamDd850(char[] dynamDd850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamDd850,0,getStringValue(),beginDynamDd850,DYNAM_DD_850_LEN);
       localDynamDd850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamDd850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamDd850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamDd850() {	 
   		return (substring(getStringValue(),beginDynamDd850,beginDynamDd850 + DYNAM_DD_850_LEN));
   	}
     int localDynamDsn850Counter = -1;
     public boolean isDynamDsn850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamDsn850Counter != sharedCounter;
         localDynamDsn850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_DSN_850_LEN = 44;
	/**
	 * 	serialize this DynamDsn850
	 */
   protected void serializeDynamDsn850(char[] dynamDsn850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamDsn850,0,getStringValue(),beginDynamDsn850,DYNAM_DSN_850_LEN);
       localDynamDsn850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamDsn850Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshDynamDsn850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamDsn850() {	 
   		return (substring(getStringValue(),beginDynamDsn850,beginDynamDsn850 + DYNAM_DSN_850_LEN));
   	}
     int localDynamExtTyp850Counter = -1;
     public boolean isDynamExtTyp850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamExtTyp850Counter != sharedCounter;
         localDynamExtTyp850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_EXT_TYP_850_LEN = 5;
	/**
	 * 	serialize this DynamExtTyp850
	 */
   protected void serializeDynamExtTyp850(char[] dynamExtTyp850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamExtTyp850,0,getStringValue(),beginDynamExtTyp850,DYNAM_EXT_TYP_850_LEN);
       localDynamExtTyp850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamExtTyp850Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDynamExtTyp850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamExtTyp850() {	 
   		return (substring(getStringValue(),beginDynamExtTyp850,beginDynamExtTyp850 + DYNAM_EXT_TYP_850_LEN));
   	}
     int localDynamExtId850Counter = -1;
     public boolean isDynamExtId850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamExtId850Counter != sharedCounter;
         localDynamExtId850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_EXT_ID_850_LEN = 8;
	/**
	 * 	serialize this DynamExtId850
	 */
   protected void serializeDynamExtId850(char[] dynamExtId850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamExtId850,0,getStringValue(),beginDynamExtId850,DYNAM_EXT_ID_850_LEN);
       localDynamExtId850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamExtId850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamExtId850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamExtId850() {	 
   		return (substring(getStringValue(),beginDynamExtId850,beginDynamExtId850 + DYNAM_EXT_ID_850_LEN));
   	}
     int localDynamWorkAreas850ConditionGroup3Counter = -1;
     public boolean isDynamWorkAreas850ConditionGroup3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamWorkAreas850ConditionGroup3Counter != sharedCounter;
         localDynamWorkAreas850ConditionGroup3Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_WORK_AREAS_850_CONDITION_GROUP_3_LEN = 16;
	/**
	 * 	serialize this DynamWorkAreas850ConditionGroup3
	 */
   protected void serializeDynamWorkAreas850ConditionGroup3(char[] dynamWorkAreas850ConditionGroup3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamWorkAreas850ConditionGroup3,0,getStringValue(),beginDynamWorkAreas850ConditionGroup3,DYNAM_WORK_AREAS_850_CONDITION_GROUP_3_LEN);
       localDynamWorkAreas850ConditionGroup3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamWorkAreas850ConditionGroup3Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDynamWorkAreas850ConditionGroup3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamWorkAreas850ConditionGroup3() {	 
   		return (substring(getStringValue(),beginDynamWorkAreas850ConditionGroup3,beginDynamWorkAreas850ConditionGroup3 + DYNAM_WORK_AREAS_850_CONDITION_GROUP_3_LEN));
   	}
     int localDynamDcType850Counter = -1;
     public boolean isDynamDcType850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamDcType850Counter != sharedCounter;
         localDynamDcType850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_DC_TYPE_850_LEN = 7;
	/**
	 * 	serialize this DynamDcType850
	 */
   protected void serializeDynamDcType850(char[] dynamDcType850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamDcType850,0,getStringValue(),beginDynamDcType850,DYNAM_DC_TYPE_850_LEN);
       localDynamDcType850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamDcType850Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshDynamDcType850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamDcType850() {	 
   		return (substring(getStringValue(),beginDynamDcType850,beginDynamDcType850 + DYNAM_DC_TYPE_850_LEN));
   	}
     int localDynamRecfm850Counter = -1;
     public boolean isDynamRecfm850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamRecfm850Counter != sharedCounter;
         localDynamRecfm850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_RECFM_850_LEN = 3;
	/**
	 * 	serialize this DynamRecfm850
	 */
   protected void serializeDynamRecfm850(char[] dynamRecfm850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamRecfm850,0,getStringValue(),beginDynamRecfm850,DYNAM_RECFM_850_LEN);
       localDynamRecfm850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamRecfm850Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDynamRecfm850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamRecfm850() {	 
   		return (substring(getStringValue(),beginDynamRecfm850,beginDynamRecfm850 + DYNAM_RECFM_850_LEN));
   	}
     int localDynamLrecl850Counter = -1;
     public boolean isDynamLrecl850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamLrecl850Counter != sharedCounter;
         localDynamLrecl850Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dynamLrecl850
	 *	@return dynamLrecl850
	 */
	public char[]  getDynamLrecl850String() {
	     return getCharArray(beginDynamLrecl850,DYNAM_LRECL_850_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dynamLrecl850IsNumeric() {
	    return isNumeric(beginDynamLrecl850
	                    ,beginDynamLrecl850 + DYNAM_LRECL_850_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DYNAM_LRECL_850_LEN = 9;
  	/**
	 * serializeDynamLrecl850
	 */
	protected void serializeDynamLrecl850(long dynamLrecl850) {
		 putNumber(beginDynamLrecl850,dynamLrecl850,DYNAM_LRECL_850_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDynamLrecl850Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDynamLrecl850
	 */
   	protected  long serializeDynamLrecl850(char[] value) {
	    long  dynamLrecl850;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dynamLrecl850 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDynamLrecl850
		       ,9
		      );
		 localDynamLrecl850Counter = shareString.getSerializedField().getModifiedCounter();
		return  dynamLrecl850;
    }

   protected long checkDynamLrecl850MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDynamLrecl850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamLrecl850() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDynamLrecl850
			                 ,DYNAM_LRECL_850_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dynamLrecl850", beginDynamLrecl850,DYNAM_LRECL_850_LEN);
    }
   	}
     int localDynamBlksz850Counter = -1;
     public boolean isDynamBlksz850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamBlksz850Counter != sharedCounter;
         localDynamBlksz850Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dynamBlksz850
	 *	@return dynamBlksz850
	 */
	public char[]  getDynamBlksz850String() {
	     return getCharArray(beginDynamBlksz850,DYNAM_BLKSZ_850_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dynamBlksz850IsNumeric() {
	    return isNumeric(beginDynamBlksz850
	                    ,beginDynamBlksz850 + DYNAM_BLKSZ_850_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DYNAM_BLKSZ_850_LEN = 9;
  	/**
	 * serializeDynamBlksz850
	 */
	protected void serializeDynamBlksz850(long dynamBlksz850) {
		 putNumber(beginDynamBlksz850,dynamBlksz850,DYNAM_BLKSZ_850_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDynamBlksz850Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDynamBlksz850
	 */
   	protected  long serializeDynamBlksz850(char[] value) {
	    long  dynamBlksz850;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dynamBlksz850 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDynamBlksz850
		       ,9
		      );
		 localDynamBlksz850Counter = shareString.getSerializedField().getModifiedCounter();
		return  dynamBlksz850;
    }

   protected long checkDynamBlksz850MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDynamBlksz850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamBlksz850() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDynamBlksz850
			                 ,DYNAM_BLKSZ_850_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dynamBlksz850", beginDynamBlksz850,DYNAM_BLKSZ_850_LEN);
    }
   	}
     int localDynamSpcPri850Counter = -1;
     public boolean isDynamSpcPri850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamSpcPri850Counter != sharedCounter;
         localDynamSpcPri850Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dynamSpcPri850
	 *	@return dynamSpcPri850
	 */
	public char[]  getDynamSpcPri850String() {
	     return getCharArray(beginDynamSpcPri850,DYNAM_SPC_PRI_850_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dynamSpcPri850IsNumeric() {
	    return isNumeric(beginDynamSpcPri850
	                    ,beginDynamSpcPri850 + DYNAM_SPC_PRI_850_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DYNAM_SPC_PRI_850_LEN = 9;
  	/**
	 * serializeDynamSpcPri850
	 */
	protected void serializeDynamSpcPri850(long dynamSpcPri850) {
		 putNumber(beginDynamSpcPri850,dynamSpcPri850,DYNAM_SPC_PRI_850_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDynamSpcPri850Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDynamSpcPri850
	 */
   	protected  long serializeDynamSpcPri850(char[] value) {
	    long  dynamSpcPri850;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dynamSpcPri850 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDynamSpcPri850
		       ,9
		      );
		 localDynamSpcPri850Counter = shareString.getSerializedField().getModifiedCounter();
		return  dynamSpcPri850;
    }

   protected long checkDynamSpcPri850MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDynamSpcPri850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamSpcPri850() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDynamSpcPri850
			                 ,DYNAM_SPC_PRI_850_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dynamSpcPri850", beginDynamSpcPri850,DYNAM_SPC_PRI_850_LEN);
    }
   	}
     int localDynamSpcSec850Counter = -1;
     public boolean isDynamSpcSec850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamSpcSec850Counter != sharedCounter;
         localDynamSpcSec850Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dynamSpcSec850
	 *	@return dynamSpcSec850
	 */
	public char[]  getDynamSpcSec850String() {
	     return getCharArray(beginDynamSpcSec850,DYNAM_SPC_SEC_850_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dynamSpcSec850IsNumeric() {
	    return isNumeric(beginDynamSpcSec850
	                    ,beginDynamSpcSec850 + DYNAM_SPC_SEC_850_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DYNAM_SPC_SEC_850_LEN = 9;
  	/**
	 * serializeDynamSpcSec850
	 */
	protected void serializeDynamSpcSec850(long dynamSpcSec850) {
		 putNumber(beginDynamSpcSec850,dynamSpcSec850,DYNAM_SPC_SEC_850_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDynamSpcSec850Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDynamSpcSec850
	 */
   	protected  long serializeDynamSpcSec850(char[] value) {
	    long  dynamSpcSec850;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dynamSpcSec850 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDynamSpcSec850
		       ,9
		      );
		 localDynamSpcSec850Counter = shareString.getSerializedField().getModifiedCounter();
		return  dynamSpcSec850;
    }

   protected long checkDynamSpcSec850MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDynamSpcSec850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamSpcSec850() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDynamSpcSec850
			                 ,DYNAM_SPC_SEC_850_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dynamSpcSec850", beginDynamSpcSec850,DYNAM_SPC_SEC_850_LEN);
    }
   	}




}
  
