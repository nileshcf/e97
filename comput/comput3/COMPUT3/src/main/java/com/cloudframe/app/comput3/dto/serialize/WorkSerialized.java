package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvTempVolume;
            protected  int beginWvWorkingQty;
            protected  int beginWvSourceScale;
            protected  int beginWvUnsignedVolume;
            protected  int beginDexr001SourceQty;
            protected  int beginDexr001TargetQty;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvTempVolume = getStartOffset() + 0;	// set offset for serialization
  
             beginWvWorkingQty = getStartOffset() + 8;	// set offset for serialization
  
             beginWvSourceScale = getStartOffset() + 16;	// set offset for serialization
  
             beginWvUnsignedVolume = getStartOffset() + 23;	// set offset for serialization
  
             beginDexr001SourceQty = getStartOffset() + 37;	// set offset for serialization
  
             beginDexr001TargetQty = getStartOffset() + 44;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localWvTempVolumeCounter = -1;
     public boolean isWvTempVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvTempVolumeCounter != sharedCounter;
         localWvTempVolumeCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this WvTempVolume
	 */
   protected void serializeWvTempVolume(BigDecimal wvTempVolume) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginWvTempVolume, wvTempVolume);
		localWvTempVolumeCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshWvTempVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshWvTempVolume() {
	 	return getComp2(beginWvTempVolume);
	}
     int localWvWorkingQtyCounter = -1;
     public boolean isWvWorkingQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvWorkingQtyCounter != sharedCounter;
         localWvWorkingQtyCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this WvWorkingQty
	 */
   protected void serializeWvWorkingQty(BigDecimal wvWorkingQty) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginWvWorkingQty, wvWorkingQty);
		localWvWorkingQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshWvWorkingQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshWvWorkingQty() {
	 	return getComp2(beginWvWorkingQty);
	}
        int localWvSourceScaleCounter = -1;
        public boolean isWvSourceScaleModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvSourceScaleCounter != sharedCounter;
           localWvSourceScaleCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvSourceScaleIsNumeric() {
	      return decimalIsNumeric(beginWvSourceScale,WV_SOURCE_SCALE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WV_SOURCE_SCALE_LEN = 7;
  	/**
	 * 	serializeWvSourceScale
	 */
	protected void serializeWvSourceScale(long wvSourceScale) {
		   putDecimal(beginWvSourceScale,wvSourceScale,WV_SOURCE_SCALE_LEN,true);
   }
   

   protected long checkWvSourceScaleMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshWvSourceScale is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWvSourceScale() throws CFException {	
   	try { 
		 return (getLongDecimal(beginWvSourceScale,WV_SOURCE_SCALE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvSourceScale", beginWvSourceScale,WV_SOURCE_SCALE_LEN);
     }
   	}
     int localWvUnsignedVolumeCounter = -1;
     
     public boolean isWvUnsignedVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvUnsignedVolumeCounter != sharedCounter;
         localWvUnsignedVolumeCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wvUnsignedVolume
	 *	@return wvUnsignedVolume
	 */
	public char[]  getWvUnsignedVolumeString() {
	    return getCharArray(beginWvUnsignedVolume,WV_UNSIGNED_VOLUME_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvUnsignedVolumeIsNumeric() {
		    return isNumeric(beginWvUnsignedVolume
	                    ,beginWvUnsignedVolume + WV_UNSIGNED_VOLUME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WV_UNSIGNED_VOLUME_LEN = 14;
  protected  static final int WV_UNSIGNED_VOLUME_SCALE = 5;

   protected BigDecimal checkWvUnsignedVolumeMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeWvUnsignedVolume
	 */
	protected void serializeWvUnsignedVolume(BigDecimal wvUnsignedVolume) {
	       putNumber(beginWvUnsignedVolume,wvUnsignedVolume,WV_UNSIGNED_VOLUME_LEN,WV_UNSIGNED_VOLUME_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWvUnsignedVolumeCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWvUnsignedVolume
	 */
   	protected  BigDecimal serializeWvUnsignedVolume(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginWvUnsignedVolume
		       ,14
		      );		 localWvUnsignedVolumeCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WV_UNSIGNED_VOLUME_LEN,WV_UNSIGNED_VOLUME_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wvUnsignedVolume", beginWvUnsignedVolume,WV_UNSIGNED_VOLUME_LEN);
    	}
    }
    /**
	 *	refreshWvUnsignedVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvUnsignedVolume() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWvUnsignedVolume
			            ,WV_UNSIGNED_VOLUME_LEN
			            ,WV_UNSIGNED_VOLUME_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wvUnsignedVolume", beginWvUnsignedVolume,WV_UNSIGNED_VOLUME_LEN);
    }
   	}
        int localDexr001SourceQtyCounter = -1;
        public boolean isDexr001SourceQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDexr001SourceQtyCounter != sharedCounter;
           localDexr001SourceQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean dexr001SourceQtyIsNumeric() {
	      return decimalIsNumeric(beginDexr001SourceQty,DEXR_001_SOURCE_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dexr001SourceQtyString() {
            return getPackedString(beginDexr001SourceQty,DEXR_001_SOURCE_QTY_LEN);
         }
   protected static final int DEXR_001_SOURCE_QTY_LEN = 7;
   protected static final int DEXR_001_SOURCE_QTY_SCALE = 4;
  	/**
	 * 	serializeDexr001SourceQty
	 */
	protected void serializeDexr001SourceQty(BigDecimal dexr001SourceQty) {
		   putDecimal(beginDexr001SourceQty,dexr001SourceQty,DEXR_001_SOURCE_QTY_LEN,DEXR_001_SOURCE_QTY_SCALE,true);
		 localDexr001SourceQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDexr001SourceQtyMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshDexr001SourceQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDexr001SourceQty() throws CFException {	
   	try { 
		 return (getDecimal(beginDexr001SourceQty,DEXR_001_SOURCE_QTY_LEN,DEXR_001_SOURCE_QTY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dexr001SourceQty", beginDexr001SourceQty,DEXR_001_SOURCE_QTY_LEN);
     }
   	}
        int localDexr001TargetQtyCounter = -1;
        public boolean isDexr001TargetQtyModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDexr001TargetQtyCounter != sharedCounter;
           localDexr001TargetQtyCounter = sharedCounter; return hasModified; 
        }
	    public boolean dexr001TargetQtyIsNumeric() {
	      return decimalIsNumeric(beginDexr001TargetQty,DEXR_001_TARGET_QTY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dexr001TargetQtyString() {
            return getPackedString(beginDexr001TargetQty,DEXR_001_TARGET_QTY_LEN);
         }
   protected static final int DEXR_001_TARGET_QTY_LEN = 7;
   protected static final int DEXR_001_TARGET_QTY_SCALE = 4;
  	/**
	 * 	serializeDexr001TargetQty
	 */
	protected void serializeDexr001TargetQty(BigDecimal dexr001TargetQty) {
		   putDecimal(beginDexr001TargetQty,dexr001TargetQty,DEXR_001_TARGET_QTY_LEN,DEXR_001_TARGET_QTY_SCALE,true);
		 localDexr001TargetQtyCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDexr001TargetQtyMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshDexr001TargetQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDexr001TargetQty() throws CFException {	
   	try { 
		 return (getDecimal(beginDexr001TargetQty,DEXR_001_TARGET_QTY_LEN,DEXR_001_TARGET_QTY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dexr001TargetQty", beginDexr001TargetQty,DEXR_001_TARGET_QTY_LEN);
     }
   	}
         int localWvSourceSubCounter = -1;
         public boolean isWvSourceSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvSourceSubCounter != sharedCounter;
            localWvSourceSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkWvSourceSubMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localWvTargetSubCounter = -1;
         public boolean isWvTargetSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvTargetSubCounter != sharedCounter;
            localWvTargetSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkWvTargetSubMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
