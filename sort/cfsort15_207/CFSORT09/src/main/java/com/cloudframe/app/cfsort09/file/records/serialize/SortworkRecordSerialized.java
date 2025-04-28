package com.cloudframe.app.cfsort09.file.records.serialize;

/**
*  The class SortworkRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SortworkRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortworkRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORTWORK_RECORD_LENGTH = 59;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSortworkKeyZoneDec;
            protected  int beginSortworkKeyComp3;
            protected  int beginSortworkKeyBinary;
            protected  int beginSortworkKeyComp;
            protected  int beginSortworkKeyComp4;
            protected  int beginSortworkKeyComp5;
	
	/**
	* Constructor for SortworkRecordSerialized
	**/
    public SortworkRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SortworkRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORTWORK_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSortworkKeyZoneDec = getStartOffset() + 0;	// set offset for serialization
  
             beginSortworkKeyComp3 = getStartOffset() + 21;	// set offset for serialization
  
             beginSortworkKeyBinary = getStartOffset() + 34;	// set offset for serialization
  
             beginSortworkKeyComp = getStartOffset() + 41;	// set offset for serialization
  
             beginSortworkKeyComp4 = getStartOffset() + 48;	// set offset for serialization
  
             beginSortworkKeyComp5 = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSortworkKeyZoneDecCounter = -1;
     public boolean isSortworkKeyZoneDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortworkKeyZoneDecCounter != sharedCounter;
         localSortworkKeyZoneDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public char[]  getSortworkKeyZoneDecString() {
	     return getCharArray(beginSortworkKeyZoneDec,SORTWORK_KEY_ZONE_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sortworkKeyZoneDecIsNumeric() {
	    return isNumeric(beginSortworkKeyZoneDec
	                    ,beginSortworkKeyZoneDec + SORTWORK_KEY_ZONE_DEC_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SORTWORK_KEY_ZONE_DEC_LEN = 18;
  	/**
	 * serializeSortworkKeyZoneDec
	 */
	protected void serializeSortworkKeyZoneDec(long sortworkKeyZoneDec) {
		 putNumber(beginSortworkKeyZoneDec,sortworkKeyZoneDec,SORTWORK_KEY_ZONE_DEC_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSortworkKeyZoneDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSortworkKeyZoneDec
	 */
   	protected  long serializeSortworkKeyZoneDec(char[] value) {
	    long  sortworkKeyZoneDec;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sortworkKeyZoneDec = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginSortworkKeyZoneDec
		       ,18
		      );
		 localSortworkKeyZoneDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  sortworkKeyZoneDec;
    }

   protected long checkSortworkKeyZoneDecMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSortworkKeyZoneDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSortworkKeyZoneDec() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSortworkKeyZoneDec
			                 ,SORTWORK_KEY_ZONE_DEC_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sortworkKeyZoneDec", beginSortworkKeyZoneDec,SORTWORK_KEY_ZONE_DEC_LEN);
    }
   	}
        int localSortworkKeyComp3Counter = -1;
        public boolean isSortworkKeyComp3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSortworkKeyComp3Counter != sharedCounter;
           localSortworkKeyComp3Counter = sharedCounter; return hasModified; 
        }
	    public boolean sortworkKeyComp3IsNumeric() {
	      return decimalIsNumeric(beginSortworkKeyComp3,SORTWORK_KEY_COMP_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SORTWORK_KEY_COMP_3_LEN = 10;
  	/**
	 * 	serializeSortworkKeyComp3
	 */
	protected void serializeSortworkKeyComp3(long sortworkKeyComp3) {
		   putDecimal(beginSortworkKeyComp3,sortworkKeyComp3,SORTWORK_KEY_COMP_3_LEN,true);
   }
   

   protected long checkSortworkKeyComp3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSortworkKeyComp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSortworkKeyComp3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSortworkKeyComp3,SORTWORK_KEY_COMP_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sortworkKeyComp3", beginSortworkKeyComp3,SORTWORK_KEY_COMP_3_LEN);
     }
   	}
         int localSortworkKeyBinaryCounter = -1;
         public boolean isSortworkKeyBinaryModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortworkKeyBinaryCounter != sharedCounter;
            localSortworkKeyBinaryCounter = sharedCounter; return hasModified; 
         }
   protected static final int SORTWORK_KEY_BINARY_LEN = 4;
  	/**
	 * serializeSortworkKeyBinary
	 */
	protected void serializeSortworkKeyBinary(int sortworkKeyBinary) {
           replaceValue( //  save the value as string
                   getBinaryString( sortworkKeyBinary,SORTWORK_KEY_BINARY_LEN)
                  ,beginSortworkKeyBinary
                  ,SORTWORK_KEY_BINARY_LEN
                 );
            localSortworkKeyBinaryCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSortworkKeyBinaryMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSortworkKeyBinary is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSortworkKeyBinary() {	 
			return (getInt(beginSortworkKeyBinary));
   	}
         int localSortworkKeyCompCounter = -1;
         public boolean isSortworkKeyCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortworkKeyCompCounter != sharedCounter;
            localSortworkKeyCompCounter = sharedCounter; return hasModified; 
         }
   protected static final int SORTWORK_KEY_COMP_LEN = 4;
  	/**
	 * serializeSortworkKeyComp
	 */
	protected void serializeSortworkKeyComp(int sortworkKeyComp) {
           replaceValue( //  save the value as string
                   getBinaryString( sortworkKeyComp,SORTWORK_KEY_COMP_LEN)
                  ,beginSortworkKeyComp
                  ,SORTWORK_KEY_COMP_LEN
                 );
            localSortworkKeyCompCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSortworkKeyCompMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSortworkKeyComp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSortworkKeyComp() {	 
			return (getInt(beginSortworkKeyComp));
   	}
         int localSortworkKeyComp4Counter = -1;
         public boolean isSortworkKeyComp4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortworkKeyComp4Counter != sharedCounter;
            localSortworkKeyComp4Counter = sharedCounter; return hasModified; 
         }
   protected static final int SORTWORK_KEY_COMP_4_LEN = 4;
  	/**
	 * serializeSortworkKeyComp4
	 */
	protected void serializeSortworkKeyComp4(int sortworkKeyComp4) {
           replaceValue( //  save the value as string
                   getBinaryString( sortworkKeyComp4,SORTWORK_KEY_COMP_4_LEN)
                  ,beginSortworkKeyComp4
                  ,SORTWORK_KEY_COMP_4_LEN
                 );
            localSortworkKeyComp4Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSortworkKeyComp4MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSortworkKeyComp4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSortworkKeyComp4() {	 
			return (getInt(beginSortworkKeyComp4));
   	}
         int localSortworkKeyComp5Counter = -1;
         public boolean isSortworkKeyComp5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSortworkKeyComp5Counter != sharedCounter;
            localSortworkKeyComp5Counter = sharedCounter; return hasModified; 
         }
   protected static final int SORTWORK_KEY_COMP_5_LEN = 4;
  	/**
	 * serializeSortworkKeyComp5
	 */
	protected void serializeSortworkKeyComp5(int sortworkKeyComp5) {
           replaceValue( //  save the value as string
                   getBinaryString( sortworkKeyComp5,SORTWORK_KEY_COMP_5_LEN)
                  ,beginSortworkKeyComp5
                  ,SORTWORK_KEY_COMP_5_LEN
                 );
            localSortworkKeyComp5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSortworkKeyComp5MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSortworkKeyComp5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSortworkKeyComp5() {	 
			return (getInt(beginSortworkKeyComp5));
   	}




}
  
