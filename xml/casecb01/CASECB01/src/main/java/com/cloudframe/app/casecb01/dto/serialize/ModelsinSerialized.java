package com.cloudframe.app.casecb01.dto.serialize;

/**
*  The class ModelsinSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ModelsinSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ModelsinSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MODELSIN_LENGTH = 232;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginModelname;
            protected  int beginEnginesizecc;
            protected  int beginColorcounter;
           protected int beginAccessory;
           protected static final int ACCESSORY_SIZE = 5;
            protected  int beginLevel2NumIn;
	
	/**
	* Constructor for ModelsinSerialized
	**/
    public ModelsinSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ModelsinSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ModelsinSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ModelsinSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,175); // serialize this field at offset 175 by default 
    }
    
	/**
	* sets parent for this ModelsinSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 175 by default
    }    
	/**
	* initializes the field in ModelsinSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MODELSIN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginModelname = getStartOffset() + 0;	// set offset for serialization
  
             beginEnginesizecc = getStartOffset() + 20;	// set offset for serialization
  
             beginColorcounter = getStartOffset() + 22;	// set offset for serialization
  
  
	        beginAccessory = getStartOffset() + 74; // set offset for serialization
  
             beginLevel2NumIn = getStartOffset() + 224;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localModelnameCounter = -1;
     public boolean isModelnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localModelnameCounter != sharedCounter;
         localModelnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MODELNAME_LEN = 20;
	/**
	 * 	serialize this Modelname
	 */
   protected void serializeModelname(char[] modelname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(modelname,0,getStringValue(),beginModelname,MODELNAME_LEN);
       localModelnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkModelnameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshModelname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshModelname() {	 
   		return (substring(getStringValue(),beginModelname,beginModelname + MODELNAME_LEN));
   	}
         int localEnginesizeccCounter = -1;
         public boolean isEnginesizeccModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEnginesizeccCounter != sharedCounter;
            localEnginesizeccCounter = sharedCounter; return hasModified; 
         }
   protected static final int ENGINESIZECC_LEN = 2;
  	/**
	 * serializeEnginesizecc
	 */
	protected void serializeEnginesizecc(short enginesizecc) {
           replaceValue( //  save the value as string
                   getBinaryString( enginesizecc,ENGINESIZECC_LEN)
                  ,beginEnginesizecc
                  ,ENGINESIZECC_LEN
                 );
            localEnginesizeccCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEnginesizeccMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEnginesizecc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEnginesizecc() {	 
			return (getShort(beginEnginesizecc));
   	}
         int localColorcounterCounter = -1;
         public boolean isColorcounterModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localColorcounterCounter != sharedCounter;
            localColorcounterCounter = sharedCounter; return hasModified; 
         }
   protected static final int COLORCOUNTER_LEN = 2;
  	/**
	 * serializeColorcounter
	 */
	protected void serializeColorcounter(short colorcounter) {
           replaceValue( //  save the value as string
                   getBinaryString( colorcounter,COLORCOUNTER_LEN)
                  ,beginColorcounter
                  ,COLORCOUNTER_LEN
                 );
            localColorcounterCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkColorcounterMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshColorcounter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshColorcounter() {	 
			return (getShort(beginColorcounter));
   	}
 
   
  protected  static final int ACCESSORY_LEN = 30;
   /**
	 *	serializeAccessory as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeAccessory(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginAccessory + index*ACCESSORY_LEN)
   	          , ACCESSORY_LEN 
   	          );
   }
        int localLevel2NumInCounter = -1;
        public boolean isLevel2NumInModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLevel2NumInCounter != sharedCounter;
           localLevel2NumInCounter = sharedCounter; return hasModified; 
        }
	    public boolean level2NumInIsNumeric() {
	      return decimalIsNumeric(beginLevel2NumIn,LEVEL_2_NUM_IN_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] level2NumInString() {
            return getPackedString(beginLevel2NumIn,LEVEL_2_NUM_IN_LEN);
         }
   protected static final int LEVEL_2_NUM_IN_LEN = 8;
   protected static final int LEVEL_2_NUM_IN_SCALE = 4;
  	/**
	 * 	serializeLevel2NumIn
	 */
	protected void serializeLevel2NumIn(BigDecimal level2NumIn) {
		   putDecimal(beginLevel2NumIn,level2NumIn,LEVEL_2_NUM_IN_LEN,LEVEL_2_NUM_IN_SCALE,true);
		 localLevel2NumInCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkLevel2NumInMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshLevel2NumIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshLevel2NumIn() throws CFException {	
   	try { 
		 return (getDecimal(beginLevel2NumIn,LEVEL_2_NUM_IN_LEN,LEVEL_2_NUM_IN_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("level2NumIn", beginLevel2NumIn,LEVEL_2_NUM_IN_LEN);
     }
   	}

		public int accessorySize() {
			return ACCESSORY_SIZE;
		}



}
  
