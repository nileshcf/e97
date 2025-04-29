package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00164TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00164TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00164TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00164_TABLE_DATA_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00164LicensedProdId;
            protected  int beginIp00164ProdId;
            protected  int beginIp00164Ab;
            protected  int beginIp00164ProdClass;
            protected  int beginIp00164ProdType;
            protected  int beginIp00164ProdCatCd;
            protected  int beginIp00164EuroProdCatCd;
            protected  int beginIp00164CmrclProductInd;
            protected  int beginIp00164Filler;
	
	/**
	* Constructor for Ip00164TableDataSerialized
	**/
    public Ip00164TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00164TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00164TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00164TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00164TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00164TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00164_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00164LicensedProdId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00164ProdId = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00164Ab = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00164ProdClass = getStartOffset() + 9;	// set offset for serialization
  
             beginIp00164ProdType = getStartOffset() + 12;	// set offset for serialization
  
             beginIp00164ProdCatCd = getStartOffset() + 13;	// set offset for serialization
  
             beginIp00164EuroProdCatCd = getStartOffset() + 14;	// set offset for serialization
  
             beginIp00164CmrclProductInd = getStartOffset() + 15;	// set offset for serialization
  
             beginIp00164Filler = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00164LicensedProdIdCounter = -1;
     public boolean isIp00164LicensedProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164LicensedProdIdCounter != sharedCounter;
         localIp00164LicensedProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_LICENSED_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip00164LicensedProdId
	 */
   protected void serializeIp00164LicensedProdId(char[] ip00164LicensedProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164LicensedProdId,0,getStringValue(),beginIp00164LicensedProdId,IP_00164_LICENSED_PROD_ID_LEN);
       localIp00164LicensedProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164LicensedProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00164LicensedProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164LicensedProdId() {	 
   		return (substring(getStringValue(),beginIp00164LicensedProdId,beginIp00164LicensedProdId + IP_00164_LICENSED_PROD_ID_LEN));
   	}
     int localIp00164ProdIdCounter = -1;
     public boolean isIp00164ProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164ProdIdCounter != sharedCounter;
         localIp00164ProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip00164ProdId
	 */
   protected void serializeIp00164ProdId(char[] ip00164ProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164ProdId,0,getStringValue(),beginIp00164ProdId,IP_00164_PROD_ID_LEN);
       localIp00164ProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164ProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00164ProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164ProdId() {	 
   		return (substring(getStringValue(),beginIp00164ProdId,beginIp00164ProdId + IP_00164_PROD_ID_LEN));
   	}
     int localIp00164AbCounter = -1;
     public boolean isIp00164AbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164AbCounter != sharedCounter;
         localIp00164AbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_AB_LEN = 3;
	/**
	 * 	serialize this Ip00164Ab
	 */
   protected void serializeIp00164Ab(char[] ip00164Ab) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164Ab,0,getStringValue(),beginIp00164Ab,IP_00164_AB_LEN);
       localIp00164AbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164AbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00164Ab is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164Ab() {	 
   		return (substring(getStringValue(),beginIp00164Ab,beginIp00164Ab + IP_00164_AB_LEN));
   	}
     int localIp00164ProdClassCounter = -1;
     public boolean isIp00164ProdClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164ProdClassCounter != sharedCounter;
         localIp00164ProdClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_PROD_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip00164ProdClass
	 */
   protected void serializeIp00164ProdClass(char[] ip00164ProdClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164ProdClass,0,getStringValue(),beginIp00164ProdClass,IP_00164_PROD_CLASS_LEN);
       localIp00164ProdClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164ProdClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00164ProdClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164ProdClass() {	 
   		return (substring(getStringValue(),beginIp00164ProdClass,beginIp00164ProdClass + IP_00164_PROD_CLASS_LEN));
   	}
     int localIp00164ProdTypeCounter = -1;
     public boolean isIp00164ProdTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164ProdTypeCounter != sharedCounter;
         localIp00164ProdTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_PROD_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip00164ProdType
	 */
   protected void serializeIp00164ProdType(char[] ip00164ProdType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164ProdType,0,getStringValue(),beginIp00164ProdType,IP_00164_PROD_TYPE_LEN);
       localIp00164ProdTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164ProdTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00164ProdType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164ProdType() {	 
   		return (substring(getStringValue(),beginIp00164ProdType,beginIp00164ProdType + IP_00164_PROD_TYPE_LEN));
   	}
     int localIp00164ProdCatCdCounter = -1;
     public boolean isIp00164ProdCatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164ProdCatCdCounter != sharedCounter;
         localIp00164ProdCatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_PROD_CAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip00164ProdCatCd
	 */
   protected void serializeIp00164ProdCatCd(char[] ip00164ProdCatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164ProdCatCd,0,getStringValue(),beginIp00164ProdCatCd,IP_00164_PROD_CAT_CD_LEN);
       localIp00164ProdCatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164ProdCatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00164ProdCatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164ProdCatCd() {	 
   		return (substring(getStringValue(),beginIp00164ProdCatCd,beginIp00164ProdCatCd + IP_00164_PROD_CAT_CD_LEN));
   	}
     int localIp00164EuroProdCatCdCounter = -1;
     public boolean isIp00164EuroProdCatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164EuroProdCatCdCounter != sharedCounter;
         localIp00164EuroProdCatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_EURO_PROD_CAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip00164EuroProdCatCd
	 */
   protected void serializeIp00164EuroProdCatCd(char[] ip00164EuroProdCatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164EuroProdCatCd,0,getStringValue(),beginIp00164EuroProdCatCd,IP_00164_EURO_PROD_CAT_CD_LEN);
       localIp00164EuroProdCatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164EuroProdCatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00164EuroProdCatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164EuroProdCatCd() {	 
   		return (substring(getStringValue(),beginIp00164EuroProdCatCd,beginIp00164EuroProdCatCd + IP_00164_EURO_PROD_CAT_CD_LEN));
   	}
     int localIp00164CmrclProductIndCounter = -1;
     public boolean isIp00164CmrclProductIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164CmrclProductIndCounter != sharedCounter;
         localIp00164CmrclProductIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_CMRCL_PRODUCT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00164CmrclProductInd
	 */
   protected void serializeIp00164CmrclProductInd(char[] ip00164CmrclProductInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164CmrclProductInd,0,getStringValue(),beginIp00164CmrclProductInd,IP_00164_CMRCL_PRODUCT_IND_LEN);
       localIp00164CmrclProductIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164CmrclProductIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00164CmrclProductInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164CmrclProductInd() {	 
   		return (substring(getStringValue(),beginIp00164CmrclProductInd,beginIp00164CmrclProductInd + IP_00164_CMRCL_PRODUCT_IND_LEN));
   	}
     int localIp00164FillerCounter = -1;
     public boolean isIp00164FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00164FillerCounter != sharedCounter;
         localIp00164FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00164_FILLER_LEN = 6;
	/**
	 * 	serialize this Ip00164Filler
	 */
   protected void serializeIp00164Filler(char[] ip00164Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00164Filler,0,getStringValue(),beginIp00164Filler,IP_00164_FILLER_LEN);
       localIp00164FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00164FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp00164Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00164Filler() {	 
   		return (substring(getStringValue(),beginIp00164Filler,beginIp00164Filler + IP_00164_FILLER_LEN));
   	}




}
  
