package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WpReptextPrintLineSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WpReptextPrintLineSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WpReptextPrintLineSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WP_REPTEXT_PRINT_LINE_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWpSettlDate;
            protected  int beginWpClient;
            protected  int beginWpParcel;
            protected  int beginWpSetlRef;
            protected  int beginWpOperator;
            protected  int beginWpSettlValue;
            protected  int beginWpDexValue;
            protected  int beginWpQuarter;
	
	/**
	* Constructor for WpReptextPrintLineSerialized
	**/
    public WpReptextPrintLineSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WpReptextPrintLineSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WpReptextPrintLineSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WpReptextPrintLineSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WpReptextPrintLineSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WpReptextPrintLineSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WP_REPTEXT_PRINT_LINE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWpSettlDate = getStartOffset() + 10;	// set offset for serialization
  
  
             beginWpClient = getStartOffset() + 22;	// set offset for serialization
  
  
             beginWpParcel = getStartOffset() + 33;	// set offset for serialization
  
  
             beginWpSetlRef = getStartOffset() + 45;	// set offset for serialization
  
  
             beginWpOperator = getStartOffset() + 56;	// set offset for serialization
  
  
             beginWpSettlValue = getStartOffset() + 68;	// set offset for serialization
  
  
             beginWpDexValue = getStartOffset() + 85;	// set offset for serialization
  
  
             beginWpQuarter = getStartOffset() + 103;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWpSettlDateCounter = -1;
     public boolean isWpSettlDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpSettlDateCounter != sharedCounter;
         localWpSettlDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_SETTL_DATE_LEN = 8;
	/**
	 * 	serialize this WpSettlDate
	 */
   protected void serializeWpSettlDate(char[] wpSettlDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpSettlDate,0,getStringValue(),beginWpSettlDate,WP_SETTL_DATE_LEN);
       localWpSettlDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpSettlDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWpSettlDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpSettlDate() {	 
   		return (substring(getStringValue(),beginWpSettlDate,beginWpSettlDate + WP_SETTL_DATE_LEN));
   	}
     int localWpClientCounter = -1;
     public boolean isWpClientModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpClientCounter != sharedCounter;
         localWpClientCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_CLIENT_LEN = 9;
	/**
	 * 	serialize this WpClient
	 */
   protected void serializeWpClient(char[] wpClient) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpClient,0,getStringValue(),beginWpClient,WP_CLIENT_LEN);
       localWpClientCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpClientConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWpClient is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpClient() {	 
   		return (substring(getStringValue(),beginWpClient,beginWpClient + WP_CLIENT_LEN));
   	}
     int localWpParcelCounter = -1;
     public boolean isWpParcelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpParcelCounter != sharedCounter;
         localWpParcelCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_PARCEL_LEN = 10;
	/**
	 * 	serialize this WpParcel
	 */
   protected void serializeWpParcel(char[] wpParcel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpParcel,0,getStringValue(),beginWpParcel,WP_PARCEL_LEN);
       localWpParcelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpParcelConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWpParcel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpParcel() {	 
   		return (substring(getStringValue(),beginWpParcel,beginWpParcel + WP_PARCEL_LEN));
   	}
     int localWpSetlRefCounter = -1;
     public boolean isWpSetlRefModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpSetlRefCounter != sharedCounter;
         localWpSetlRefCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_SETL_REF_LEN = 10;
	/**
	 * 	serialize this WpSetlRef
	 */
   protected void serializeWpSetlRef(char[] wpSetlRef) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpSetlRef,0,getStringValue(),beginWpSetlRef,WP_SETL_REF_LEN);
       localWpSetlRefCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpSetlRefConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWpSetlRef is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpSetlRef() {	 
   		return (substring(getStringValue(),beginWpSetlRef,beginWpSetlRef + WP_SETL_REF_LEN));
   	}
     int localWpOperatorCounter = -1;
     public boolean isWpOperatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpOperatorCounter != sharedCounter;
         localWpOperatorCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_OPERATOR_LEN = 8;
	/**
	 * 	serialize this WpOperator
	 */
   protected void serializeWpOperator(char[] wpOperator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpOperator,0,getStringValue(),beginWpOperator,WP_OPERATOR_LEN);
       localWpOperatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpOperatorConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWpOperator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpOperator() {	 
   		return (substring(getStringValue(),beginWpOperator,beginWpOperator + WP_OPERATOR_LEN));
   	}
     int localWpSettlValueCounter = -1;
     public boolean isWpSettlValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpSettlValueCounter != sharedCounter;
         localWpSettlValueCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_SETTL_VALUE_LEN = 15;
	/**
	 * 	serialize this WpSettlValue
	 */
   protected void serializeWpSettlValue(char[] wpSettlValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpSettlValue,0,getStringValue(),beginWpSettlValue,WP_SETTL_VALUE_LEN);
       localWpSettlValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpSettlValueConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWpSettlValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpSettlValue() {	 
   		return (substring(getStringValue(),beginWpSettlValue,beginWpSettlValue + WP_SETTL_VALUE_LEN));
   	}
     int localWpDexValueCounter = -1;
     public boolean isWpDexValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpDexValueCounter != sharedCounter;
         localWpDexValueCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_DEX_VALUE_LEN = 15;
	/**
	 * 	serialize this WpDexValue
	 */
   protected void serializeWpDexValue(char[] wpDexValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpDexValue,0,getStringValue(),beginWpDexValue,WP_DEX_VALUE_LEN);
       localWpDexValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpDexValueConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWpDexValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpDexValue() {	 
   		return (substring(getStringValue(),beginWpDexValue,beginWpDexValue + WP_DEX_VALUE_LEN));
   	}
     int localWpQuarterCounter = -1;
     public boolean isWpQuarterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWpQuarterCounter != sharedCounter;
         localWpQuarterCounter = sharedCounter; return hasModified;
     }
	protected static final int WP_QUARTER_LEN = 4;
	/**
	 * 	serialize this WpQuarter
	 */
   protected void serializeWpQuarter(char[] wpQuarter) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wpQuarter,0,getStringValue(),beginWpQuarter,WP_QUARTER_LEN);
       localWpQuarterCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWpQuarterConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWpQuarter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWpQuarter() {	 
   		return (substring(getStringValue(),beginWpQuarter,beginWpQuarter + WP_QUARTER_LEN));
   	}




}
  
