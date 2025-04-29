package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Table36Bsl600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Table36Bsl600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Table36Bsl600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_36_BSL_600_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRegion600;
            protected  int beginFromRegion600;
            protected  int beginToRegion600;
            protected  int beginAccBrand600;
            protected  int beginBsPriority600;
            protected  int beginBusSrvLvl600;
            protected  int beginBusSrvId600;
            protected  int beginBsLifecylInd600;
            protected  int beginBsBsseCd600;
	
	/**
	* Constructor for Table36Bsl600Serialized
	**/
    public Table36Bsl600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Table36Bsl600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Table36Bsl600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Table36Bsl600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Table36Bsl600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Table36Bsl600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_36_BSL_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRegion600 = getStartOffset() + 0;	// set offset for serialization
  
             beginFromRegion600 = getStartOffset() + 1;	// set offset for serialization
  
             beginToRegion600 = getStartOffset() + 2;	// set offset for serialization
  
             beginAccBrand600 = getStartOffset() + 3;	// set offset for serialization
  
             beginBsPriority600 = getStartOffset() + 6;	// set offset for serialization
  
             beginBusSrvLvl600 = getStartOffset() + 8;	// set offset for serialization
  
             beginBusSrvId600 = getStartOffset() + 9;	// set offset for serialization
  
             beginBsLifecylInd600 = getStartOffset() + 15;	// set offset for serialization
  
             beginBsBsseCd600 = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRegion600Counter = -1;
     public boolean isRegion600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegion600Counter != sharedCounter;
         localRegion600Counter = sharedCounter; return hasModified;
     }
	protected static final int REGION_600_LEN = 1;
	/**
	 * 	serialize this Region600
	 */
   protected void serializeRegion600(char[] region600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(region600,0,getStringValue(),beginRegion600,REGION_600_LEN);
       localRegion600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRegion600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRegion600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRegion600() {	 
   		return (substring(getStringValue(),beginRegion600,beginRegion600 + REGION_600_LEN));
   	}
     int localFromRegion600Counter = -1;
     public boolean isFromRegion600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromRegion600Counter != sharedCounter;
         localFromRegion600Counter = sharedCounter; return hasModified;
     }
	protected static final int FROM_REGION_600_LEN = 1;
	/**
	 * 	serialize this FromRegion600
	 */
   protected void serializeFromRegion600(char[] fromRegion600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fromRegion600,0,getStringValue(),beginFromRegion600,FROM_REGION_600_LEN);
       localFromRegion600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFromRegion600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFromRegion600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFromRegion600() {	 
   		return (substring(getStringValue(),beginFromRegion600,beginFromRegion600 + FROM_REGION_600_LEN));
   	}
     int localToRegion600Counter = -1;
     public boolean isToRegion600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localToRegion600Counter != sharedCounter;
         localToRegion600Counter = sharedCounter; return hasModified;
     }
	protected static final int TO_REGION_600_LEN = 1;
	/**
	 * 	serialize this ToRegion600
	 */
   protected void serializeToRegion600(char[] toRegion600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(toRegion600,0,getStringValue(),beginToRegion600,TO_REGION_600_LEN);
       localToRegion600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkToRegion600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshToRegion600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshToRegion600() {	 
   		return (substring(getStringValue(),beginToRegion600,beginToRegion600 + TO_REGION_600_LEN));
   	}
     int localAccBrand600Counter = -1;
     public boolean isAccBrand600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccBrand600Counter != sharedCounter;
         localAccBrand600Counter = sharedCounter; return hasModified;
     }
	protected static final int ACC_BRAND_600_LEN = 3;
	/**
	 * 	serialize this AccBrand600
	 */
   protected void serializeAccBrand600(char[] accBrand600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(accBrand600,0,getStringValue(),beginAccBrand600,ACC_BRAND_600_LEN);
       localAccBrand600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAccBrand600Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAccBrand600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAccBrand600() {	 
   		return (substring(getStringValue(),beginAccBrand600,beginAccBrand600 + ACC_BRAND_600_LEN));
   	}
     int localBsPriority600Counter = -1;
     public boolean isBsPriority600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsPriority600Counter != sharedCounter;
         localBsPriority600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bsPriority600
	 *	@return bsPriority600
	 */
	public char[]  getBsPriority600String() {
	     return getCharArray(beginBsPriority600,BS_PRIORITY_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bsPriority600IsNumeric() {
	    return isNumeric(beginBsPriority600
	                    ,beginBsPriority600 + BS_PRIORITY_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BS_PRIORITY_600_LEN = 2;
  	/**
	 * serializeBsPriority600
	 */
	protected void serializeBsPriority600(int bsPriority600) {
		 putNumber(beginBsPriority600,bsPriority600,BS_PRIORITY_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBsPriority600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBsPriority600
	 */
   	protected  int serializeBsPriority600(char[] value) {
	    int  bsPriority600;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bsPriority600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginBsPriority600
		       ,2
		      );
		 localBsPriority600Counter = shareString.getSerializedField().getModifiedCounter();
		return  bsPriority600;
    }

   protected int checkBsPriority600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBsPriority600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBsPriority600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBsPriority600
			                 ,BS_PRIORITY_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bsPriority600", beginBsPriority600,BS_PRIORITY_600_LEN);
    }
   	}
     int localBusSrvLvl600Counter = -1;
     public boolean isBusSrvLvl600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBusSrvLvl600Counter != sharedCounter;
         localBusSrvLvl600Counter = sharedCounter; return hasModified;
     }
	protected static final int BUS_SRV_LVL_600_LEN = 1;
	/**
	 * 	serialize this BusSrvLvl600
	 */
   protected void serializeBusSrvLvl600(char[] busSrvLvl600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(busSrvLvl600,0,getStringValue(),beginBusSrvLvl600,BUS_SRV_LVL_600_LEN);
       localBusSrvLvl600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBusSrvLvl600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBusSrvLvl600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBusSrvLvl600() {	 
   		return (substring(getStringValue(),beginBusSrvLvl600,beginBusSrvLvl600 + BUS_SRV_LVL_600_LEN));
   	}
     int localBusSrvId600Counter = -1;
     public boolean isBusSrvId600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBusSrvId600Counter != sharedCounter;
         localBusSrvId600Counter = sharedCounter; return hasModified;
     }
	protected static final int BUS_SRV_ID_600_LEN = 6;
	/**
	 * 	serialize this BusSrvId600
	 */
   protected void serializeBusSrvId600(char[] busSrvId600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(busSrvId600,0,getStringValue(),beginBusSrvId600,BUS_SRV_ID_600_LEN);
       localBusSrvId600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBusSrvId600Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBusSrvId600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBusSrvId600() {	 
   		return (substring(getStringValue(),beginBusSrvId600,beginBusSrvId600 + BUS_SRV_ID_600_LEN));
   	}
     int localBsLifecylInd600Counter = -1;
     public boolean isBsLifecylInd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsLifecylInd600Counter != sharedCounter;
         localBsLifecylInd600Counter = sharedCounter; return hasModified;
     }
	protected static final int BS_LIFECYL_IND_600_LEN = 1;
	/**
	 * 	serialize this BsLifecylInd600
	 */
   protected void serializeBsLifecylInd600(char[] bsLifecylInd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsLifecylInd600,0,getStringValue(),beginBsLifecylInd600,BS_LIFECYL_IND_600_LEN);
       localBsLifecylInd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsLifecylInd600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBsLifecylInd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsLifecylInd600() {	 
   		return (substring(getStringValue(),beginBsLifecylInd600,beginBsLifecylInd600 + BS_LIFECYL_IND_600_LEN));
   	}
     int localBsBsseCd600Counter = -1;
     public boolean isBsBsseCd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsBsseCd600Counter != sharedCounter;
         localBsBsseCd600Counter = sharedCounter; return hasModified;
     }
	protected static final int BS_BSSE_CD_600_LEN = 1;
	/**
	 * 	serialize this BsBsseCd600
	 */
   protected void serializeBsBsseCd600(char[] bsBsseCd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsBsseCd600,0,getStringValue(),beginBsBsseCd600,BS_BSSE_CD_600_LEN);
       localBsBsseCd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsBsseCd600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBsBsseCd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsBsseCd600() {	 
   		return (substring(getStringValue(),beginBsBsseCd600,beginBsBsseCd600 + BS_BSSE_CD_600_LEN));
   	}




}
  
