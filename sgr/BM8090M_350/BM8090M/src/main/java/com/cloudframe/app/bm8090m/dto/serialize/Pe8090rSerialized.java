package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class Pe8090rSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Pe8090rSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pe8090rSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PE_8090R_LENGTH = 233;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIndtipidef;
            protected  int beginDesnombre;
            protected  int beginDespriapel;
            protected  int beginDessegapel;
            protected  int beginSepapell;
            protected  int beginIndidioma;
	
	/**
	* Constructor for Pe8090rSerialized
	**/
    public Pe8090rSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pe8090rSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090rSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pe8090rSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Pe8090rSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Pe8090rSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PE_8090R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIndtipidef = getStartOffset() + 0;	// set offset for serialization
  
             beginDesnombre = getStartOffset() + 10;	// set offset for serialization
  
             beginDespriapel = getStartOffset() + 70;	// set offset for serialization
  
             beginDessegapel = getStartOffset() + 170;	// set offset for serialization
  
             beginSepapell = getStartOffset() + 230;	// set offset for serialization
  
             beginIndidioma = getStartOffset() + 231;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localIndtipidefCounter = -1;
        public boolean isIndtipidefModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIndtipidefCounter != sharedCounter;
           localIndtipidefCounter = sharedCounter; return hasModified; 
        }
	    public boolean indtipidefIsNumeric() {
	      return decimalIsNumeric(beginIndtipidef,INDTIPIDEF_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int INDTIPIDEF_LEN = 2;
  	/**
	 * 	serializeIndtipidef
	 */
	protected void serializeIndtipidef(short indtipidef) {
		   putDecimal(beginIndtipidef,indtipidef,INDTIPIDEF_LEN,true);
   }
   

   protected short checkIndtipidefMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIndtipidef is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIndtipidef() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIndtipidef,INDTIPIDEF_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("indtipidef", beginIndtipidef,INDTIPIDEF_LEN);
     }
   	}
     int localDesnombreCounter = -1;
     public boolean isDesnombreModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesnombreCounter != sharedCounter;
         localDesnombreCounter = sharedCounter; return hasModified;
     }
	protected static final int DESNOMBRE_LEN = 60;
	/**
	 * 	serialize this Desnombre
	 */
   protected void serializeDesnombre(char[] desnombre) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(desnombre,0,getStringValue(),beginDesnombre,DESNOMBRE_LEN);
       localDesnombreCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDesnombreConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshDesnombre is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDesnombre() {	 
   		return (substring(getStringValue(),beginDesnombre,beginDesnombre + DESNOMBRE_LEN));
   	}
     int localDespriapelCounter = -1;
     public boolean isDespriapelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDespriapelCounter != sharedCounter;
         localDespriapelCounter = sharedCounter; return hasModified;
     }
	protected static final int DESPRIAPEL_LEN = 100;
	/**
	 * 	serialize this Despriapel
	 */
   protected void serializeDespriapel(char[] despriapel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(despriapel,0,getStringValue(),beginDespriapel,DESPRIAPEL_LEN);
       localDespriapelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDespriapelConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshDespriapel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDespriapel() {	 
   		return (substring(getStringValue(),beginDespriapel,beginDespriapel + DESPRIAPEL_LEN));
   	}
     int localDessegapelCounter = -1;
     public boolean isDessegapelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDessegapelCounter != sharedCounter;
         localDessegapelCounter = sharedCounter; return hasModified;
     }
	protected static final int DESSEGAPEL_LEN = 60;
	/**
	 * 	serialize this Dessegapel
	 */
   protected void serializeDessegapel(char[] dessegapel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dessegapel,0,getStringValue(),beginDessegapel,DESSEGAPEL_LEN);
       localDessegapelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDessegapelConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshDessegapel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDessegapel() {	 
   		return (substring(getStringValue(),beginDessegapel,beginDessegapel + DESSEGAPEL_LEN));
   	}
     int localSepapellCounter = -1;
     public boolean isSepapellModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSepapellCounter != sharedCounter;
         localSepapellCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPAPELL_LEN = 1;
	/**
	 * 	serialize this Sepapell
	 */
   protected void serializeSepapell(char[] sepapell) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sepapell,0,getStringValue(),beginSepapell,SEPAPELL_LEN);
       localSepapellCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSepapellConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSepapell is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSepapell() {	 
   		return (substring(getStringValue(),beginSepapell,beginSepapell + SEPAPELL_LEN));
   	}
     int localIndidiomaCounter = -1;
     public boolean isIndidiomaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndidiomaCounter != sharedCounter;
         localIndidiomaCounter = sharedCounter; return hasModified;
     }
	protected static final int INDIDIOMA_LEN = 2;
	/**
	 * 	serialize this Indidioma
	 */
   protected void serializeIndidioma(char[] indidioma) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(indidioma,0,getStringValue(),beginIndidioma,INDIDIOMA_LEN);
       localIndidiomaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndidiomaConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIndidioma is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndidioma() {	 
   		return (substring(getStringValue(),beginIndidioma,beginIndidioma + INDIDIOMA_LEN));
   	}




}
  
