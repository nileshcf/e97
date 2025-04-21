package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004DataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004DataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004DataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_DATA_LENGTH = 442;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004Items;
            protected  int beginCf20004PtrToIp2000t2;
	
	/**
	* Constructor for Cf20004DataSerialized
	**/
    public Cf20004DataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004DataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004DataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004DataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Cf20004DataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Cf20004DataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginCf20004Items = getStartOffset() + 15;	// set offset for serialization
  
             beginCf20004PtrToIp2000t2 = getStartOffset() + 440;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCf20004ItemsCounter = -1;
     public boolean isCf20004ItemsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004ItemsCounter != sharedCounter;
         localCf20004ItemsCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_ITEMS_LEN = 425;
	/**
	 * 	serialize this Cf20004Items
	 */
   protected void serializeCf20004Items(char[] cf20004Items) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004Items,0,getStringValue(),beginCf20004Items,CF_20004_ITEMS_LEN);
       localCf20004ItemsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004ItemsConstraints(char[] value) {
   			return super.checkConstraints(value , 425 ,false, false);
   }
    /**
	 *	refreshCf20004Items is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004Items() {	 
   		return (substring(getStringValue(),beginCf20004Items,beginCf20004Items + CF_20004_ITEMS_LEN));
   	}
         int localCf20004PtrToIp2000t2Counter = -1;
         public boolean isCf20004PtrToIp2000t2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCf20004PtrToIp2000t2Counter != sharedCounter;
            localCf20004PtrToIp2000t2Counter = sharedCounter; return hasModified; 
         }
   protected static final int CF_20004_PTR_TO_IP_2000T_2_LEN = 2;
  	/**
	 * serializeCf20004PtrToIp2000t2
	 */
	protected void serializeCf20004PtrToIp2000t2(int cf20004PtrToIp2000t2) {
           replaceValue( //  save the value as string
                   getBinaryString( cf20004PtrToIp2000t2,CF_20004_PTR_TO_IP_2000T_2_LEN)
                  ,beginCf20004PtrToIp2000t2
                  ,CF_20004_PTR_TO_IP_2000T_2_LEN
                 );
            localCf20004PtrToIp2000t2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCf20004PtrToIp2000t2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCf20004PtrToIp2000t2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004PtrToIp2000t2() {	 
			return (getUnsignedShort(beginCf20004PtrToIp2000t2));
   	}




}
  
