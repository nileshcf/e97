package com.cloudframe.app.init4.dto.serialize;

/**
*  The class DataTableArray1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DataTableArray1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DataTableArray1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATA_TABLE_ARRAY_1_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCharWs;
            protected  int beginDispNum;
            protected  int beginSmallint;
	
	/**
	* Constructor for DataTableArray1Serialized
	**/
    public DataTableArray1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DataTableArray1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DataTableArray1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DataTableArray1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DataTableArray1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DataTableArray1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATA_TABLE_ARRAY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCharWs = getStartOffset() + 0;	// set offset for serialization
  
             beginDispNum = getStartOffset() + 10;	// set offset for serialization
  
             beginSmallint = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCharWsCounter = -1;
     public boolean isCharWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharWsCounter != sharedCounter;
         localCharWsCounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_WS_LEN = 10;
	/**
	 * 	serialize this CharWs
	 */
   protected void serializeCharWs(char[] charWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charWs,0,getStringValue(),beginCharWs,CHAR_WS_LEN);
       localCharWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharWsConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCharWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharWs() {	 
   		return (substring(getStringValue(),beginCharWs,beginCharWs + CHAR_WS_LEN));
   	}
     int localDispNumCounter = -1;
     public boolean isDispNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispNumCounter != sharedCounter;
         localDispNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString() {
	     return getCharArray(beginDispNum,DISP_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric() {
	    return isNumeric(beginDispNum
	                    ,beginDispNum + DISP_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISP_NUM_LEN = 2;
  	/**
	 * serializeDispNum
	 */
	protected void serializeDispNum(int dispNum) {
		 putNumber(beginDispNum,dispNum,DISP_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDispNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDispNum
	 */
   	protected  int serializeDispNum(char[] value) {
	    int  dispNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dispNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDispNum
		       ,2
		      );
		 localDispNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  dispNum;
    }

   protected int checkDispNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDispNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDispNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDispNum
			                 ,DISP_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dispNum", beginDispNum,DISP_NUM_LEN);
    }
   	}
         int localSmallintCounter = -1;
         public boolean isSmallintModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSmallintCounter != sharedCounter;
            localSmallintCounter = sharedCounter; return hasModified; 
         }
   protected static final int SMALLINT_LEN = 2;
  	/**
	 * serializeSmallint
	 */
	protected void serializeSmallint(int smallint) {
           replaceValue( //  save the value as string
                   getBinaryString( smallint,SMALLINT_LEN)
                  ,beginSmallint
                  ,SMALLINT_LEN
                 );
            localSmallintCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSmallintMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSmallint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSmallint() {	 
			return (getUnsignedShort(beginSmallint));
   	}




}
  
