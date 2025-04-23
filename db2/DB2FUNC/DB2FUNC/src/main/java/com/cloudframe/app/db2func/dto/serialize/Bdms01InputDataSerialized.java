package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01InputDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01InputDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01InputDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_INPUT_DATA_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01Db2Function;
            protected  int beginBdms01SearchKeyField;
            protected  int beginBdms01SearchKeyWiCode;
            protected  int beginBdms01SearchKeyType;
            protected  int beginBdms01AdpMasterSegInd;
            protected  int beginBdms01BaseSecuritySegInd;
            protected  int beginBdms01SecurityTypeSegInd;
            protected  int beginBdms01PriceSegInd;
            protected  int beginBdms01XrefSegInd;
            protected  int beginBdms01DescSegInd;
            protected  int beginBdms01SpecialistSegInd;
            protected  int beginBdms01FrozenChillSegInd;
            protected  int beginBdms01IncomeSegInd;
            protected  int beginBdms01RatingSegInd;
            protected  int beginBdms01ConvertibleSegInd;
            protected  int beginBdms01StockSegInd;
            protected  int beginBdms01OptionSegInd;
            protected  int beginBdms01BondBasicSegInd;
            protected  int beginBdms01BondFeatureSegInd;
            protected  int beginBdms01BondFactorSegInd;
            protected  int beginBdms01BondCmoSegInd;
            protected  int beginBdms01OidSegInd;
            protected  int beginBdms01UitSegInd;
            protected  int beginBdms01MortBackedSegInd;
            protected  int beginBdms01GetpriceSegInd;
            protected  int beginBdms01DivQualifyInd;
            protected  int beginBdms01TaxSegInd;
            protected  int beginBdms01UnitsSegInd;
            protected  int beginBdms01TcontrolSegInd;
            protected  int beginBdms01SecurityPrivSegInd;
            protected  int beginBdms01CvrsnSegInd;
            protected  int beginBdms01CanadaBondSegInd;
            protected  int beginBdms01OptUnderlXrefSegInd;
            protected  int beginBdms01ReqPriceRegion;
            protected  int beginBdms01SearchKeyIsinCntry;
            protected  int beginBdms01LogError;
            protected  int beginBdms01ProgramName;
	
	/**
	* Constructor for Bdms01InputDataSerialized
	**/
    public Bdms01InputDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01InputDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01InputDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01InputDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Bdms01InputDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Bdms01InputDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_INPUT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01Db2Function = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01SearchKeyField = getStartOffset() + 1;	// set offset for serialization
  
  
  
             beginBdms01SearchKeyWiCode = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01SearchKeyType = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01AdpMasterSegInd = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01BaseSecuritySegInd = getStartOffset() + 17;	// set offset for serialization
  
             beginBdms01SecurityTypeSegInd = getStartOffset() + 18;	// set offset for serialization
  
             beginBdms01PriceSegInd = getStartOffset() + 19;	// set offset for serialization
  
             beginBdms01XrefSegInd = getStartOffset() + 20;	// set offset for serialization
  
             beginBdms01DescSegInd = getStartOffset() + 21;	// set offset for serialization
  
             beginBdms01SpecialistSegInd = getStartOffset() + 22;	// set offset for serialization
  
             beginBdms01FrozenChillSegInd = getStartOffset() + 23;	// set offset for serialization
  
             beginBdms01IncomeSegInd = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01RatingSegInd = getStartOffset() + 25;	// set offset for serialization
  
             beginBdms01ConvertibleSegInd = getStartOffset() + 26;	// set offset for serialization
  
             beginBdms01StockSegInd = getStartOffset() + 27;	// set offset for serialization
  
             beginBdms01OptionSegInd = getStartOffset() + 28;	// set offset for serialization
  
             beginBdms01BondBasicSegInd = getStartOffset() + 29;	// set offset for serialization
  
             beginBdms01BondFeatureSegInd = getStartOffset() + 30;	// set offset for serialization
  
             beginBdms01BondFactorSegInd = getStartOffset() + 31;	// set offset for serialization
  
             beginBdms01BondCmoSegInd = getStartOffset() + 32;	// set offset for serialization
  
             beginBdms01OidSegInd = getStartOffset() + 33;	// set offset for serialization
  
             beginBdms01UitSegInd = getStartOffset() + 34;	// set offset for serialization
  
             beginBdms01MortBackedSegInd = getStartOffset() + 35;	// set offset for serialization
  
             beginBdms01GetpriceSegInd = getStartOffset() + 36;	// set offset for serialization
  
             beginBdms01DivQualifyInd = getStartOffset() + 37;	// set offset for serialization
  
             beginBdms01TaxSegInd = getStartOffset() + 38;	// set offset for serialization
  
             beginBdms01UnitsSegInd = getStartOffset() + 39;	// set offset for serialization
  
             beginBdms01TcontrolSegInd = getStartOffset() + 40;	// set offset for serialization
  
             beginBdms01SecurityPrivSegInd = getStartOffset() + 41;	// set offset for serialization
  
             beginBdms01CvrsnSegInd = getStartOffset() + 42;	// set offset for serialization
  
             beginBdms01CanadaBondSegInd = getStartOffset() + 43;	// set offset for serialization
  
             beginBdms01OptUnderlXrefSegInd = getStartOffset() + 44;	// set offset for serialization
  
  
             beginBdms01ReqPriceRegion = getStartOffset() + 73;	// set offset for serialization
  
  
             beginBdms01SearchKeyIsinCntry = getStartOffset() + 89;	// set offset for serialization
  
             beginBdms01LogError = getStartOffset() + 91;	// set offset for serialization
  
             beginBdms01ProgramName = getStartOffset() + 92;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01Db2FunctionCounter = -1;
     public boolean isBdms01Db2FunctionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Db2FunctionCounter != sharedCounter;
         localBdms01Db2FunctionCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DB_2_FUNCTION_LEN = 1;
	/**
	 * 	serialize this Bdms01Db2Function
	 */
   protected void serializeBdms01Db2Function(char[] bdms01Db2Function) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Db2Function,0,getStringValue(),beginBdms01Db2Function,BDMS_01_DB_2_FUNCTION_LEN);
       localBdms01Db2FunctionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Db2FunctionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Db2Function is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Db2Function() {	 
   		return (substring(getStringValue(),beginBdms01Db2Function,beginBdms01Db2Function + BDMS_01_DB_2_FUNCTION_LEN));
   	}
     int localBdms01SearchKeyFieldCounter = -1;
     public boolean isBdms01SearchKeyFieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyFieldCounter != sharedCounter;
         localBdms01SearchKeyFieldCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_KEY_FIELD_LEN = 12;
	/**
	 * 	serialize this Bdms01SearchKeyField
	 */
   protected void serializeBdms01SearchKeyField(char[] bdms01SearchKeyField) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchKeyField,0,getStringValue(),beginBdms01SearchKeyField,BDMS_01_SEARCH_KEY_FIELD_LEN);
       localBdms01SearchKeyFieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchKeyFieldConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01SearchKeyField is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchKeyField() {	 
   		return (substring(getStringValue(),beginBdms01SearchKeyField,beginBdms01SearchKeyField + BDMS_01_SEARCH_KEY_FIELD_LEN));
   	}
     int localBdms01SearchKeyWiCodeCounter = -1;
     public boolean isBdms01SearchKeyWiCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyWiCodeCounter != sharedCounter;
         localBdms01SearchKeyWiCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_KEY_WI_CODE_LEN = 1;
	/**
	 * 	serialize this Bdms01SearchKeyWiCode
	 */
   protected void serializeBdms01SearchKeyWiCode(char[] bdms01SearchKeyWiCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchKeyWiCode,0,getStringValue(),beginBdms01SearchKeyWiCode,BDMS_01_SEARCH_KEY_WI_CODE_LEN);
       localBdms01SearchKeyWiCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchKeyWiCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SearchKeyWiCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchKeyWiCode() {	 
   		return (substring(getStringValue(),beginBdms01SearchKeyWiCode,beginBdms01SearchKeyWiCode + BDMS_01_SEARCH_KEY_WI_CODE_LEN));
   	}
     int localBdms01SearchKeyTypeCounter = -1;
     public boolean isBdms01SearchKeyTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyTypeCounter != sharedCounter;
         localBdms01SearchKeyTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_KEY_TYPE_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchKeyType
	 */
   protected void serializeBdms01SearchKeyType(char[] bdms01SearchKeyType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchKeyType,0,getStringValue(),beginBdms01SearchKeyType,BDMS_01_SEARCH_KEY_TYPE_LEN);
       localBdms01SearchKeyTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchKeyTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchKeyType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchKeyType() {	 
   		return (substring(getStringValue(),beginBdms01SearchKeyType,beginBdms01SearchKeyType + BDMS_01_SEARCH_KEY_TYPE_LEN));
   	}
     int localBdms01AdpMasterSegIndCounter = -1;
     public boolean isBdms01AdpMasterSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AdpMasterSegIndCounter != sharedCounter;
         localBdms01AdpMasterSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ADP_MASTER_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01AdpMasterSegInd
	 */
   protected void serializeBdms01AdpMasterSegInd(char[] bdms01AdpMasterSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AdpMasterSegInd,0,getStringValue(),beginBdms01AdpMasterSegInd,BDMS_01_ADP_MASTER_SEG_IND_LEN);
       localBdms01AdpMasterSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AdpMasterSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01AdpMasterSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AdpMasterSegInd() {	 
   		return (substring(getStringValue(),beginBdms01AdpMasterSegInd,beginBdms01AdpMasterSegInd + BDMS_01_ADP_MASTER_SEG_IND_LEN));
   	}
     int localBdms01BaseSecuritySegIndCounter = -1;
     public boolean isBdms01BaseSecuritySegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BaseSecuritySegIndCounter != sharedCounter;
         localBdms01BaseSecuritySegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BASE_SECURITY_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BaseSecuritySegInd
	 */
   protected void serializeBdms01BaseSecuritySegInd(char[] bdms01BaseSecuritySegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BaseSecuritySegInd,0,getStringValue(),beginBdms01BaseSecuritySegInd,BDMS_01_BASE_SECURITY_SEG_IND_LEN);
       localBdms01BaseSecuritySegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BaseSecuritySegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BaseSecuritySegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BaseSecuritySegInd() {	 
   		return (substring(getStringValue(),beginBdms01BaseSecuritySegInd,beginBdms01BaseSecuritySegInd + BDMS_01_BASE_SECURITY_SEG_IND_LEN));
   	}
     int localBdms01SecurityTypeSegIndCounter = -1;
     public boolean isBdms01SecurityTypeSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityTypeSegIndCounter != sharedCounter;
         localBdms01SecurityTypeSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_TYPE_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SecurityTypeSegInd
	 */
   protected void serializeBdms01SecurityTypeSegInd(char[] bdms01SecurityTypeSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityTypeSegInd,0,getStringValue(),beginBdms01SecurityTypeSegInd,BDMS_01_SECURITY_TYPE_SEG_IND_LEN);
       localBdms01SecurityTypeSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityTypeSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityTypeSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityTypeSegInd() {	 
   		return (substring(getStringValue(),beginBdms01SecurityTypeSegInd,beginBdms01SecurityTypeSegInd + BDMS_01_SECURITY_TYPE_SEG_IND_LEN));
   	}
     int localBdms01PriceSegIndCounter = -1;
     public boolean isBdms01PriceSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceSegIndCounter != sharedCounter;
         localBdms01PriceSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PriceSegInd
	 */
   protected void serializeBdms01PriceSegInd(char[] bdms01PriceSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceSegInd,0,getStringValue(),beginBdms01PriceSegInd,BDMS_01_PRICE_SEG_IND_LEN);
       localBdms01PriceSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PriceSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceSegInd() {	 
   		return (substring(getStringValue(),beginBdms01PriceSegInd,beginBdms01PriceSegInd + BDMS_01_PRICE_SEG_IND_LEN));
   	}
     int localBdms01XrefSegIndCounter = -1;
     public boolean isBdms01XrefSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01XrefSegIndCounter != sharedCounter;
         localBdms01XrefSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_XREF_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01XrefSegInd
	 */
   protected void serializeBdms01XrefSegInd(char[] bdms01XrefSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01XrefSegInd,0,getStringValue(),beginBdms01XrefSegInd,BDMS_01_XREF_SEG_IND_LEN);
       localBdms01XrefSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01XrefSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01XrefSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01XrefSegInd() {	 
   		return (substring(getStringValue(),beginBdms01XrefSegInd,beginBdms01XrefSegInd + BDMS_01_XREF_SEG_IND_LEN));
   	}
     int localBdms01DescSegIndCounter = -1;
     public boolean isBdms01DescSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DescSegIndCounter != sharedCounter;
         localBdms01DescSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DESC_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DescSegInd
	 */
   protected void serializeBdms01DescSegInd(char[] bdms01DescSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DescSegInd,0,getStringValue(),beginBdms01DescSegInd,BDMS_01_DESC_SEG_IND_LEN);
       localBdms01DescSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DescSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DescSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DescSegInd() {	 
   		return (substring(getStringValue(),beginBdms01DescSegInd,beginBdms01DescSegInd + BDMS_01_DESC_SEG_IND_LEN));
   	}
     int localBdms01SpecialistSegIndCounter = -1;
     public boolean isBdms01SpecialistSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SpecialistSegIndCounter != sharedCounter;
         localBdms01SpecialistSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPECIALIST_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SpecialistSegInd
	 */
   protected void serializeBdms01SpecialistSegInd(char[] bdms01SpecialistSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SpecialistSegInd,0,getStringValue(),beginBdms01SpecialistSegInd,BDMS_01_SPECIALIST_SEG_IND_LEN);
       localBdms01SpecialistSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SpecialistSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SpecialistSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SpecialistSegInd() {	 
   		return (substring(getStringValue(),beginBdms01SpecialistSegInd,beginBdms01SpecialistSegInd + BDMS_01_SPECIALIST_SEG_IND_LEN));
   	}
     int localBdms01FrozenChillSegIndCounter = -1;
     public boolean isBdms01FrozenChillSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FrozenChillSegIndCounter != sharedCounter;
         localBdms01FrozenChillSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FROZEN_CHILL_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01FrozenChillSegInd
	 */
   protected void serializeBdms01FrozenChillSegInd(char[] bdms01FrozenChillSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FrozenChillSegInd,0,getStringValue(),beginBdms01FrozenChillSegInd,BDMS_01_FROZEN_CHILL_SEG_IND_LEN);
       localBdms01FrozenChillSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FrozenChillSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FrozenChillSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FrozenChillSegInd() {	 
   		return (substring(getStringValue(),beginBdms01FrozenChillSegInd,beginBdms01FrozenChillSegInd + BDMS_01_FROZEN_CHILL_SEG_IND_LEN));
   	}
     int localBdms01IncomeSegIndCounter = -1;
     public boolean isBdms01IncomeSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IncomeSegIndCounter != sharedCounter;
         localBdms01IncomeSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INCOME_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01IncomeSegInd
	 */
   protected void serializeBdms01IncomeSegInd(char[] bdms01IncomeSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IncomeSegInd,0,getStringValue(),beginBdms01IncomeSegInd,BDMS_01_INCOME_SEG_IND_LEN);
       localBdms01IncomeSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IncomeSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IncomeSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IncomeSegInd() {	 
   		return (substring(getStringValue(),beginBdms01IncomeSegInd,beginBdms01IncomeSegInd + BDMS_01_INCOME_SEG_IND_LEN));
   	}
     int localBdms01RatingSegIndCounter = -1;
     public boolean isBdms01RatingSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RatingSegIndCounter != sharedCounter;
         localBdms01RatingSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RATING_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RatingSegInd
	 */
   protected void serializeBdms01RatingSegInd(char[] bdms01RatingSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RatingSegInd,0,getStringValue(),beginBdms01RatingSegInd,BDMS_01_RATING_SEG_IND_LEN);
       localBdms01RatingSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RatingSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RatingSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RatingSegInd() {	 
   		return (substring(getStringValue(),beginBdms01RatingSegInd,beginBdms01RatingSegInd + BDMS_01_RATING_SEG_IND_LEN));
   	}
     int localBdms01ConvertibleSegIndCounter = -1;
     public boolean isBdms01ConvertibleSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ConvertibleSegIndCounter != sharedCounter;
         localBdms01ConvertibleSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CONVERTIBLE_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ConvertibleSegInd
	 */
   protected void serializeBdms01ConvertibleSegInd(char[] bdms01ConvertibleSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ConvertibleSegInd,0,getStringValue(),beginBdms01ConvertibleSegInd,BDMS_01_CONVERTIBLE_SEG_IND_LEN);
       localBdms01ConvertibleSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ConvertibleSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ConvertibleSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ConvertibleSegInd() {	 
   		return (substring(getStringValue(),beginBdms01ConvertibleSegInd,beginBdms01ConvertibleSegInd + BDMS_01_CONVERTIBLE_SEG_IND_LEN));
   	}
     int localBdms01StockSegIndCounter = -1;
     public boolean isBdms01StockSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockSegIndCounter != sharedCounter;
         localBdms01StockSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01StockSegInd
	 */
   protected void serializeBdms01StockSegInd(char[] bdms01StockSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockSegInd,0,getStringValue(),beginBdms01StockSegInd,BDMS_01_STOCK_SEG_IND_LEN);
       localBdms01StockSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StockSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockSegInd() {	 
   		return (substring(getStringValue(),beginBdms01StockSegInd,beginBdms01StockSegInd + BDMS_01_STOCK_SEG_IND_LEN));
   	}
     int localBdms01OptionSegIndCounter = -1;
     public boolean isBdms01OptionSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionSegIndCounter != sharedCounter;
         localBdms01OptionSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPTION_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OptionSegInd
	 */
   protected void serializeBdms01OptionSegInd(char[] bdms01OptionSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptionSegInd,0,getStringValue(),beginBdms01OptionSegInd,BDMS_01_OPTION_SEG_IND_LEN);
       localBdms01OptionSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptionSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OptionSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptionSegInd() {	 
   		return (substring(getStringValue(),beginBdms01OptionSegInd,beginBdms01OptionSegInd + BDMS_01_OPTION_SEG_IND_LEN));
   	}
     int localBdms01BondBasicSegIndCounter = -1;
     public boolean isBdms01BondBasicSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondBasicSegIndCounter != sharedCounter;
         localBdms01BondBasicSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BOND_BASIC_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BondBasicSegInd
	 */
   protected void serializeBdms01BondBasicSegInd(char[] bdms01BondBasicSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BondBasicSegInd,0,getStringValue(),beginBdms01BondBasicSegInd,BDMS_01_BOND_BASIC_SEG_IND_LEN);
       localBdms01BondBasicSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BondBasicSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BondBasicSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BondBasicSegInd() {	 
   		return (substring(getStringValue(),beginBdms01BondBasicSegInd,beginBdms01BondBasicSegInd + BDMS_01_BOND_BASIC_SEG_IND_LEN));
   	}
     int localBdms01BondFeatureSegIndCounter = -1;
     public boolean isBdms01BondFeatureSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondFeatureSegIndCounter != sharedCounter;
         localBdms01BondFeatureSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BOND_FEATURE_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BondFeatureSegInd
	 */
   protected void serializeBdms01BondFeatureSegInd(char[] bdms01BondFeatureSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BondFeatureSegInd,0,getStringValue(),beginBdms01BondFeatureSegInd,BDMS_01_BOND_FEATURE_SEG_IND_LEN);
       localBdms01BondFeatureSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BondFeatureSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BondFeatureSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BondFeatureSegInd() {	 
   		return (substring(getStringValue(),beginBdms01BondFeatureSegInd,beginBdms01BondFeatureSegInd + BDMS_01_BOND_FEATURE_SEG_IND_LEN));
   	}
     int localBdms01BondFactorSegIndCounter = -1;
     public boolean isBdms01BondFactorSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondFactorSegIndCounter != sharedCounter;
         localBdms01BondFactorSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BOND_FACTOR_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BondFactorSegInd
	 */
   protected void serializeBdms01BondFactorSegInd(char[] bdms01BondFactorSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BondFactorSegInd,0,getStringValue(),beginBdms01BondFactorSegInd,BDMS_01_BOND_FACTOR_SEG_IND_LEN);
       localBdms01BondFactorSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BondFactorSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BondFactorSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BondFactorSegInd() {	 
   		return (substring(getStringValue(),beginBdms01BondFactorSegInd,beginBdms01BondFactorSegInd + BDMS_01_BOND_FACTOR_SEG_IND_LEN));
   	}
     int localBdms01BondCmoSegIndCounter = -1;
     public boolean isBdms01BondCmoSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondCmoSegIndCounter != sharedCounter;
         localBdms01BondCmoSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BOND_CMO_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BondCmoSegInd
	 */
   protected void serializeBdms01BondCmoSegInd(char[] bdms01BondCmoSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BondCmoSegInd,0,getStringValue(),beginBdms01BondCmoSegInd,BDMS_01_BOND_CMO_SEG_IND_LEN);
       localBdms01BondCmoSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BondCmoSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BondCmoSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BondCmoSegInd() {	 
   		return (substring(getStringValue(),beginBdms01BondCmoSegInd,beginBdms01BondCmoSegInd + BDMS_01_BOND_CMO_SEG_IND_LEN));
   	}
     int localBdms01OidSegIndCounter = -1;
     public boolean isBdms01OidSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OidSegIndCounter != sharedCounter;
         localBdms01OidSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OID_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OidSegInd
	 */
   protected void serializeBdms01OidSegInd(char[] bdms01OidSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OidSegInd,0,getStringValue(),beginBdms01OidSegInd,BDMS_01_OID_SEG_IND_LEN);
       localBdms01OidSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OidSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OidSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OidSegInd() {	 
   		return (substring(getStringValue(),beginBdms01OidSegInd,beginBdms01OidSegInd + BDMS_01_OID_SEG_IND_LEN));
   	}
     int localBdms01UitSegIndCounter = -1;
     public boolean isBdms01UitSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UitSegIndCounter != sharedCounter;
         localBdms01UitSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UIT_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01UitSegInd
	 */
   protected void serializeBdms01UitSegInd(char[] bdms01UitSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UitSegInd,0,getStringValue(),beginBdms01UitSegInd,BDMS_01_UIT_SEG_IND_LEN);
       localBdms01UitSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UitSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01UitSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UitSegInd() {	 
   		return (substring(getStringValue(),beginBdms01UitSegInd,beginBdms01UitSegInd + BDMS_01_UIT_SEG_IND_LEN));
   	}
     int localBdms01MortBackedSegIndCounter = -1;
     public boolean isBdms01MortBackedSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MortBackedSegIndCounter != sharedCounter;
         localBdms01MortBackedSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MORT_BACKED_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MortBackedSegInd
	 */
   protected void serializeBdms01MortBackedSegInd(char[] bdms01MortBackedSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MortBackedSegInd,0,getStringValue(),beginBdms01MortBackedSegInd,BDMS_01_MORT_BACKED_SEG_IND_LEN);
       localBdms01MortBackedSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MortBackedSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MortBackedSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MortBackedSegInd() {	 
   		return (substring(getStringValue(),beginBdms01MortBackedSegInd,beginBdms01MortBackedSegInd + BDMS_01_MORT_BACKED_SEG_IND_LEN));
   	}
     int localBdms01GetpriceSegIndCounter = -1;
     public boolean isBdms01GetpriceSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetpriceSegIndCounter != sharedCounter;
         localBdms01GetpriceSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRICE_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01GetpriceSegInd
	 */
   protected void serializeBdms01GetpriceSegInd(char[] bdms01GetpriceSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetpriceSegInd,0,getStringValue(),beginBdms01GetpriceSegInd,BDMS_01_GETPRICE_SEG_IND_LEN);
       localBdms01GetpriceSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetpriceSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01GetpriceSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetpriceSegInd() {	 
   		return (substring(getStringValue(),beginBdms01GetpriceSegInd,beginBdms01GetpriceSegInd + BDMS_01_GETPRICE_SEG_IND_LEN));
   	}
     int localBdms01DivQualifyIndCounter = -1;
     public boolean isBdms01DivQualifyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DivQualifyIndCounter != sharedCounter;
         localBdms01DivQualifyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DIV_QUALIFY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DivQualifyInd
	 */
   protected void serializeBdms01DivQualifyInd(char[] bdms01DivQualifyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DivQualifyInd,0,getStringValue(),beginBdms01DivQualifyInd,BDMS_01_DIV_QUALIFY_IND_LEN);
       localBdms01DivQualifyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DivQualifyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DivQualifyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DivQualifyInd() {	 
   		return (substring(getStringValue(),beginBdms01DivQualifyInd,beginBdms01DivQualifyInd + BDMS_01_DIV_QUALIFY_IND_LEN));
   	}
     int localBdms01TaxSegIndCounter = -1;
     public boolean isBdms01TaxSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxSegIndCounter != sharedCounter;
         localBdms01TaxSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TAX_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TaxSegInd
	 */
   protected void serializeBdms01TaxSegInd(char[] bdms01TaxSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TaxSegInd,0,getStringValue(),beginBdms01TaxSegInd,BDMS_01_TAX_SEG_IND_LEN);
       localBdms01TaxSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TaxSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TaxSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TaxSegInd() {	 
   		return (substring(getStringValue(),beginBdms01TaxSegInd,beginBdms01TaxSegInd + BDMS_01_TAX_SEG_IND_LEN));
   	}
     int localBdms01UnitsSegIndCounter = -1;
     public boolean isBdms01UnitsSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UnitsSegIndCounter != sharedCounter;
         localBdms01UnitsSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNITS_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01UnitsSegInd
	 */
   protected void serializeBdms01UnitsSegInd(char[] bdms01UnitsSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UnitsSegInd,0,getStringValue(),beginBdms01UnitsSegInd,BDMS_01_UNITS_SEG_IND_LEN);
       localBdms01UnitsSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UnitsSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01UnitsSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UnitsSegInd() {	 
   		return (substring(getStringValue(),beginBdms01UnitsSegInd,beginBdms01UnitsSegInd + BDMS_01_UNITS_SEG_IND_LEN));
   	}
     int localBdms01TcontrolSegIndCounter = -1;
     public boolean isBdms01TcontrolSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TcontrolSegIndCounter != sharedCounter;
         localBdms01TcontrolSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TCONTROL_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TcontrolSegInd
	 */
   protected void serializeBdms01TcontrolSegInd(char[] bdms01TcontrolSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TcontrolSegInd,0,getStringValue(),beginBdms01TcontrolSegInd,BDMS_01_TCONTROL_SEG_IND_LEN);
       localBdms01TcontrolSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TcontrolSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TcontrolSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TcontrolSegInd() {	 
   		return (substring(getStringValue(),beginBdms01TcontrolSegInd,beginBdms01TcontrolSegInd + BDMS_01_TCONTROL_SEG_IND_LEN));
   	}
     int localBdms01SecurityPrivSegIndCounter = -1;
     public boolean isBdms01SecurityPrivSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityPrivSegIndCounter != sharedCounter;
         localBdms01SecurityPrivSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_PRIV_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SecurityPrivSegInd
	 */
   protected void serializeBdms01SecurityPrivSegInd(char[] bdms01SecurityPrivSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityPrivSegInd,0,getStringValue(),beginBdms01SecurityPrivSegInd,BDMS_01_SECURITY_PRIV_SEG_IND_LEN);
       localBdms01SecurityPrivSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityPrivSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityPrivSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityPrivSegInd() {	 
   		return (substring(getStringValue(),beginBdms01SecurityPrivSegInd,beginBdms01SecurityPrivSegInd + BDMS_01_SECURITY_PRIV_SEG_IND_LEN));
   	}
     int localBdms01CvrsnSegIndCounter = -1;
     public boolean isBdms01CvrsnSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnSegIndCounter != sharedCounter;
         localBdms01CvrsnSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CvrsnSegInd
	 */
   protected void serializeBdms01CvrsnSegInd(char[] bdms01CvrsnSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnSegInd,0,getStringValue(),beginBdms01CvrsnSegInd,BDMS_01_CVRSN_SEG_IND_LEN);
       localBdms01CvrsnSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnSegInd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnSegInd,beginBdms01CvrsnSegInd + BDMS_01_CVRSN_SEG_IND_LEN));
   	}
     int localBdms01CanadaBondSegIndCounter = -1;
     public boolean isBdms01CanadaBondSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CanadaBondSegIndCounter != sharedCounter;
         localBdms01CanadaBondSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CANADA_BOND_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CanadaBondSegInd
	 */
   protected void serializeBdms01CanadaBondSegInd(char[] bdms01CanadaBondSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CanadaBondSegInd,0,getStringValue(),beginBdms01CanadaBondSegInd,BDMS_01_CANADA_BOND_SEG_IND_LEN);
       localBdms01CanadaBondSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CanadaBondSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CanadaBondSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CanadaBondSegInd() {	 
   		return (substring(getStringValue(),beginBdms01CanadaBondSegInd,beginBdms01CanadaBondSegInd + BDMS_01_CANADA_BOND_SEG_IND_LEN));
   	}
     int localBdms01OptUnderlXrefSegIndCounter = -1;
     public boolean isBdms01OptUnderlXrefSegIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptUnderlXrefSegIndCounter != sharedCounter;
         localBdms01OptUnderlXrefSegIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPT_UNDERL_XREF_SEG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OptUnderlXrefSegInd
	 */
   protected void serializeBdms01OptUnderlXrefSegInd(char[] bdms01OptUnderlXrefSegInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptUnderlXrefSegInd,0,getStringValue(),beginBdms01OptUnderlXrefSegInd,BDMS_01_OPT_UNDERL_XREF_SEG_IND_LEN);
       localBdms01OptUnderlXrefSegIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptUnderlXrefSegIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OptUnderlXrefSegInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptUnderlXrefSegInd() {	 
   		return (substring(getStringValue(),beginBdms01OptUnderlXrefSegInd,beginBdms01OptUnderlXrefSegInd + BDMS_01_OPT_UNDERL_XREF_SEG_IND_LEN));
   	}
     int localBdms01ReqPriceRegionCounter = -1;
     public boolean isBdms01ReqPriceRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ReqPriceRegionCounter != sharedCounter;
         localBdms01ReqPriceRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REQ_PRICE_REGION_LEN = 1;
	/**
	 * 	serialize this Bdms01ReqPriceRegion
	 */
   protected void serializeBdms01ReqPriceRegion(char[] bdms01ReqPriceRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ReqPriceRegion,0,getStringValue(),beginBdms01ReqPriceRegion,BDMS_01_REQ_PRICE_REGION_LEN);
       localBdms01ReqPriceRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ReqPriceRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ReqPriceRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ReqPriceRegion() {	 
   		return (substring(getStringValue(),beginBdms01ReqPriceRegion,beginBdms01ReqPriceRegion + BDMS_01_REQ_PRICE_REGION_LEN));
   	}
     int localBdms01SearchKeyIsinCntryCounter = -1;
     public boolean isBdms01SearchKeyIsinCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyIsinCntryCounter != sharedCounter;
         localBdms01SearchKeyIsinCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_KEY_ISIN_CNTRY_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchKeyIsinCntry
	 */
   protected void serializeBdms01SearchKeyIsinCntry(char[] bdms01SearchKeyIsinCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchKeyIsinCntry,0,getStringValue(),beginBdms01SearchKeyIsinCntry,BDMS_01_SEARCH_KEY_ISIN_CNTRY_LEN);
       localBdms01SearchKeyIsinCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchKeyIsinCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchKeyIsinCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchKeyIsinCntry() {	 
   		return (substring(getStringValue(),beginBdms01SearchKeyIsinCntry,beginBdms01SearchKeyIsinCntry + BDMS_01_SEARCH_KEY_ISIN_CNTRY_LEN));
   	}
     int localBdms01LogErrorCounter = -1;
     public boolean isBdms01LogErrorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LogErrorCounter != sharedCounter;
         localBdms01LogErrorCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LOG_ERROR_LEN = 1;
	/**
	 * 	serialize this Bdms01LogError
	 */
   protected void serializeBdms01LogError(char[] bdms01LogError) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LogError,0,getStringValue(),beginBdms01LogError,BDMS_01_LOG_ERROR_LEN);
       localBdms01LogErrorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LogErrorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01LogError is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LogError() {	 
   		return (substring(getStringValue(),beginBdms01LogError,beginBdms01LogError + BDMS_01_LOG_ERROR_LEN));
   	}
     int localBdms01ProgramNameCounter = -1;
     public boolean isBdms01ProgramNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ProgramNameCounter != sharedCounter;
         localBdms01ProgramNameCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PROGRAM_NAME_LEN = 8;
	/**
	 * 	serialize this Bdms01ProgramName
	 */
   protected void serializeBdms01ProgramName(char[] bdms01ProgramName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ProgramName,0,getStringValue(),beginBdms01ProgramName,BDMS_01_PROGRAM_NAME_LEN);
       localBdms01ProgramNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ProgramNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01ProgramName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ProgramName() {	 
   		return (substring(getStringValue(),beginBdms01ProgramName,beginBdms01ProgramName + BDMS_01_PROGRAM_NAME_LEN));
   	}




}
  
