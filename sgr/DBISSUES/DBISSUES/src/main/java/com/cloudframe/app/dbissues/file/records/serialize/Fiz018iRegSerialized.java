package com.cloudframe.app.dbissues.file.records.serialize;

/**
*  The class Fiz018iRegSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Fiz018iRegSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Fiz018iRegSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FIZ_018I_REG_LENGTH = 1600;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLngreg018i;
           protected int beginFiz018iRegArray1;
           protected static final int FIZ_018I_REG_ARRAY_1_SIZE = 1000;
	
	/**
	* Constructor for Fiz018iRegSerialized
	**/
    public Fiz018iRegSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Fiz018iRegSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FIZ_018I_REG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLngreg018i = getStartOffset() + 595;	// set offset for serialization
  
	        beginFiz018iRegArray1 = getStartOffset() + 600; // set offset for serialization
  
	   /*  end of offset */
	}
     int localLngreg018iCounter = -1;
     public boolean isLngreg018iModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLngreg018iCounter != sharedCounter;
         localLngreg018iCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lngreg018i
	 *	@return lngreg018i
	 */
	public char[]  getLngreg018iString() {
	     return getCharArray(beginLngreg018i,LNGREG_018I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lngreg018iIsNumeric() {
	    return isNumeric(beginLngreg018i
	                    ,beginLngreg018i + LNGREG_018I_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LNGREG_018I_LEN = 5;
  	/**
	 * serializeLngreg018i
	 */
	protected void serializeLngreg018i(long lngreg018i) {
		 putNumber(beginLngreg018i,lngreg018i,LNGREG_018I_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLngreg018iCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLngreg018i
	 */
   	protected  long serializeLngreg018i(char[] value) {
	    long  lngreg018i;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lngreg018i = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginLngreg018i
		       ,5
		      );
		 localLngreg018iCounter = shareString.getSerializedField().getModifiedCounter();
		return  lngreg018i;
    }

   protected long checkLngreg018iMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLngreg018i is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLngreg018i() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLngreg018i
			                 ,LNGREG_018I_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lngreg018i", beginLngreg018i,LNGREG_018I_LEN);
    }
   	}
 
   
  protected  static final int FIZ_018I_REG_ARRAY_1_LEN = 1;
   /**
	 *	serializeFiz018iRegArray1 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeFiz018iRegArray1(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginFiz018iRegArray1 + index*FIZ_018I_REG_ARRAY_1_LEN)
   	          , FIZ_018I_REG_ARRAY_1_LEN 
   	          );
   }

		public int fiz018iRegArray1Size() {
			return FIZ_018I_REG_ARRAY_1_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 600 + (dependValue *  1);
     }
     
     public int getVariableLength(int idx) {
     	return 600 + (idx *  1);
     }
}
  
