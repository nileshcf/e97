package com.cloudframe.app.casecb01.dto.serialize;

/**
*  The class ManufacturersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ManufacturersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ManufacturersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MANUFACTURERS_LENGTH = 1205;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginManufacturer;
            protected  int beginCountry;
            protected  int beginModelcounter;
           protected int beginModelsin;
           protected static final int MODELSIN_SIZE = 5;
            protected  int beginLevel1NumIn;
	
	/**
	* Constructor for ManufacturersSerialized
	**/
    public ManufacturersSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ManufacturersSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ManufacturersSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ManufacturersSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,138); // serialize this field at offset 138 by default 
    }
    
	/**
	* sets parent for this ManufacturersSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 138 by default
    }    
	/**
	* initializes the field in ManufacturersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MANUFACTURERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginManufacturer = getStartOffset() + 0;	// set offset for serialization
  
             beginCountry = getStartOffset() + 20;	// set offset for serialization
  
             beginModelcounter = getStartOffset() + 35;	// set offset for serialization
  
	        beginModelsin = getStartOffset() + 37; // set offset for serialization
  
             beginLevel1NumIn = getStartOffset() + 1197;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localManufacturerCounter = -1;
     public boolean isManufacturerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localManufacturerCounter != sharedCounter;
         localManufacturerCounter = sharedCounter; return hasModified;
     }
	protected static final int MANUFACTURER_LEN = 20;
	/**
	 * 	serialize this Manufacturer
	 */
   protected void serializeManufacturer(char[] manufacturer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(manufacturer,0,getStringValue(),beginManufacturer,MANUFACTURER_LEN);
       localManufacturerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkManufacturerConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshManufacturer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshManufacturer() {	 
   		return (substring(getStringValue(),beginManufacturer,beginManufacturer + MANUFACTURER_LEN));
   	}
     int localCountryCounter = -1;
     public boolean isCountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCounter != sharedCounter;
         localCountryCounter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_LEN = 15;
	/**
	 * 	serialize this Country
	 */
   protected void serializeCountry(char[] country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(country,0,getStringValue(),beginCountry,COUNTRY_LEN);
       localCountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshCountry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountry() {	 
   		return (substring(getStringValue(),beginCountry,beginCountry + COUNTRY_LEN));
   	}
         int localModelcounterCounter = -1;
         public boolean isModelcounterModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localModelcounterCounter != sharedCounter;
            localModelcounterCounter = sharedCounter; return hasModified; 
         }
   protected static final int MODELCOUNTER_LEN = 2;
  	/**
	 * serializeModelcounter
	 */
	protected void serializeModelcounter(short modelcounter) {
           replaceValue( //  save the value as string
                   getBinaryString( modelcounter,MODELCOUNTER_LEN)
                  ,beginModelcounter
                  ,MODELCOUNTER_LEN
                 );
            localModelcounterCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkModelcounterMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshModelcounter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshModelcounter() {	 
			return (getShort(beginModelcounter));
   	}
        int localLevel1NumInCounter = -1;
        public boolean isLevel1NumInModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLevel1NumInCounter != sharedCounter;
           localLevel1NumInCounter = sharedCounter; return hasModified; 
        }
	    public boolean level1NumInIsNumeric() {
	      return decimalIsNumeric(beginLevel1NumIn,LEVEL_1_NUM_IN_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] level1NumInString() {
            return getPackedString(beginLevel1NumIn,LEVEL_1_NUM_IN_LEN);
         }
   protected static final int LEVEL_1_NUM_IN_LEN = 8;
   protected static final int LEVEL_1_NUM_IN_SCALE = 4;
  	/**
	 * 	serializeLevel1NumIn
	 */
	protected void serializeLevel1NumIn(BigDecimal level1NumIn) {
		   putDecimal(beginLevel1NumIn,level1NumIn,LEVEL_1_NUM_IN_LEN,LEVEL_1_NUM_IN_SCALE,true);
		 localLevel1NumInCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkLevel1NumInMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshLevel1NumIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshLevel1NumIn() throws CFException {	
   	try { 
		 return (getDecimal(beginLevel1NumIn,LEVEL_1_NUM_IN_LEN,LEVEL_1_NUM_IN_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("level1NumIn", beginLevel1NumIn,LEVEL_1_NUM_IN_LEN);
     }
   	}

		public int modelsinSize() {
			return MODELSIN_SIZE;
		}



}
  
