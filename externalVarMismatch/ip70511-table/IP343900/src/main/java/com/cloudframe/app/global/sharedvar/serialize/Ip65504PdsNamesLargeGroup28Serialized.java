package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup28Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup28Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup28Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_28_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P838ReservdS;
            protected  int beginIp65504P838ReservdL;
            protected  int beginIp65504P839ReservdS;
            protected  int beginIp65504P839ReservdL;
            protected  int beginIp65504P840ReservdS;
            protected  int beginIp65504P840ReservdL;
            protected  int beginIp65504P841ReservdS;
            protected  int beginIp65504P841ReservdL;
            protected  int beginIp65504P842ReservdS;
            protected  int beginIp65504P842ReservdL;
            protected  int beginIp65504P843ReservdS;
            protected  int beginIp65504P843ReservdL;
            protected  int beginIp65504P844ReservdS;
            protected  int beginIp65504P844ReservdL;
            protected  int beginIp65504P845ReservdS;
            protected  int beginIp65504P845ReservdL;
            protected  int beginIp65504P846ReservdS;
            protected  int beginIp65504P846ReservdL;
            protected  int beginIp65504P847ReservdS;
            protected  int beginIp65504P847ReservdL;
            protected  int beginIp65504P848ReservdS;
            protected  int beginIp65504P848ReservdL;
            protected  int beginIp65504P849ReservdS;
            protected  int beginIp65504P849ReservdL;
            protected  int beginIp65504P850ReservdS;
            protected  int beginIp65504P850ReservdL;
            protected  int beginIp65504P851ReservdS;
            protected  int beginIp65504P851ReservdL;
            protected  int beginIp65504P852ReservdS;
            protected  int beginIp65504P852ReservdL;
            protected  int beginIp65504P853ReservdS;
            protected  int beginIp65504P853ReservdL;
            protected  int beginIp65504P854ReservdS;
            protected  int beginIp65504P854ReservdL;
            protected  int beginIp65504P855ReservdS;
            protected  int beginIp65504P855ReservdL;
            protected  int beginIp65504P856ReservdS;
            protected  int beginIp65504P856ReservdL;
            protected  int beginIp65504P857ReservdS;
            protected  int beginIp65504P857ReservdL;
            protected  int beginIp65504P858ReservdS;
            protected  int beginIp65504P858ReservdL;
            protected  int beginIp65504P859ReservdS;
            protected  int beginIp65504P859ReservdL;
            protected  int beginIp65504P860ReservdS;
            protected  int beginIp65504P860ReservdL;
            protected  int beginIp65504P861ReservdS;
            protected  int beginIp65504P861ReservdL;
            protected  int beginIp65504P862ReservdS;
            protected  int beginIp65504P862ReservdL;
            protected  int beginIp65504P863ReservdS;
            protected  int beginIp65504P863ReservdL;
            protected  int beginIp65504P864ReservdS;
            protected  int beginIp65504P864ReservdL;
            protected  int beginIp65504P865ReservdS;
            protected  int beginIp65504P865ReservdL;
            protected  int beginIp65504P866ReservdS;
            protected  int beginIp65504P866ReservdL;
            protected  int beginIp65504P867ReservdS;
            protected  int beginIp65504P867ReservdL;
            protected  int beginIp65504P868ReservdS;
            protected  int beginIp65504P868ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup28Serialized
	**/
    public Ip65504PdsNamesLargeGroup28Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup28Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup28Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup28Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,6692); // serialize this field at offset 6692 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup28Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 6692 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup28Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_28_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P838ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P838ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P839ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P839ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P840ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P840ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P841ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P841ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P842ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P842ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P843ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P843ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P844ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P844ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P845ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P845ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P846ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P846ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P847ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P847ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P848ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P848ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P849ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P849ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P850ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P850ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P851ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P851ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P852ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P852ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P853ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P853ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P854ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P854ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P855ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P855ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P856ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P856ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P857ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P857ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P858ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P858ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P859ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P859ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P860ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P860ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P861ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P861ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P862ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P862ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P863ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P863ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P864ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P864ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P865ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P865ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P866ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P866ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P867ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P867ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P868ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P868ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P838ReservdSCounter = -1;
         public boolean isIp65504P838ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P838ReservdSCounter != sharedCounter;
            localIp65504P838ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_838_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P838ReservdS
	 */
	protected void serializeIp65504P838ReservdS(short ip65504P838ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P838ReservdS,IP_65504_P_838_RESERVD_S_LEN)
                  ,beginIp65504P838ReservdS
                  ,IP_65504_P_838_RESERVD_S_LEN
                 );
            localIp65504P838ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P838ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P838ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P838ReservdS() {	 
			return (getShort(beginIp65504P838ReservdS));
   	}
         int localIp65504P838ReservdLCounter = -1;
         public boolean isIp65504P838ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P838ReservdLCounter != sharedCounter;
            localIp65504P838ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_838_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P838ReservdL
	 */
	protected void serializeIp65504P838ReservdL(short ip65504P838ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P838ReservdL,IP_65504_P_838_RESERVD_L_LEN)
                  ,beginIp65504P838ReservdL
                  ,IP_65504_P_838_RESERVD_L_LEN
                 );
            localIp65504P838ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P838ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P838ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P838ReservdL() {	 
			return (getShort(beginIp65504P838ReservdL));
   	}
         int localIp65504P839ReservdSCounter = -1;
         public boolean isIp65504P839ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P839ReservdSCounter != sharedCounter;
            localIp65504P839ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_839_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P839ReservdS
	 */
	protected void serializeIp65504P839ReservdS(short ip65504P839ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P839ReservdS,IP_65504_P_839_RESERVD_S_LEN)
                  ,beginIp65504P839ReservdS
                  ,IP_65504_P_839_RESERVD_S_LEN
                 );
            localIp65504P839ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P839ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P839ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P839ReservdS() {	 
			return (getShort(beginIp65504P839ReservdS));
   	}
         int localIp65504P839ReservdLCounter = -1;
         public boolean isIp65504P839ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P839ReservdLCounter != sharedCounter;
            localIp65504P839ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_839_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P839ReservdL
	 */
	protected void serializeIp65504P839ReservdL(short ip65504P839ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P839ReservdL,IP_65504_P_839_RESERVD_L_LEN)
                  ,beginIp65504P839ReservdL
                  ,IP_65504_P_839_RESERVD_L_LEN
                 );
            localIp65504P839ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P839ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P839ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P839ReservdL() {	 
			return (getShort(beginIp65504P839ReservdL));
   	}
         int localIp65504P840ReservdSCounter = -1;
         public boolean isIp65504P840ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P840ReservdSCounter != sharedCounter;
            localIp65504P840ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_840_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P840ReservdS
	 */
	protected void serializeIp65504P840ReservdS(short ip65504P840ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P840ReservdS,IP_65504_P_840_RESERVD_S_LEN)
                  ,beginIp65504P840ReservdS
                  ,IP_65504_P_840_RESERVD_S_LEN
                 );
            localIp65504P840ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P840ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P840ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P840ReservdS() {	 
			return (getShort(beginIp65504P840ReservdS));
   	}
         int localIp65504P840ReservdLCounter = -1;
         public boolean isIp65504P840ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P840ReservdLCounter != sharedCounter;
            localIp65504P840ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_840_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P840ReservdL
	 */
	protected void serializeIp65504P840ReservdL(short ip65504P840ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P840ReservdL,IP_65504_P_840_RESERVD_L_LEN)
                  ,beginIp65504P840ReservdL
                  ,IP_65504_P_840_RESERVD_L_LEN
                 );
            localIp65504P840ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P840ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P840ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P840ReservdL() {	 
			return (getShort(beginIp65504P840ReservdL));
   	}
         int localIp65504P841ReservdSCounter = -1;
         public boolean isIp65504P841ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P841ReservdSCounter != sharedCounter;
            localIp65504P841ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_841_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P841ReservdS
	 */
	protected void serializeIp65504P841ReservdS(short ip65504P841ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P841ReservdS,IP_65504_P_841_RESERVD_S_LEN)
                  ,beginIp65504P841ReservdS
                  ,IP_65504_P_841_RESERVD_S_LEN
                 );
            localIp65504P841ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P841ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P841ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P841ReservdS() {	 
			return (getShort(beginIp65504P841ReservdS));
   	}
         int localIp65504P841ReservdLCounter = -1;
         public boolean isIp65504P841ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P841ReservdLCounter != sharedCounter;
            localIp65504P841ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_841_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P841ReservdL
	 */
	protected void serializeIp65504P841ReservdL(short ip65504P841ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P841ReservdL,IP_65504_P_841_RESERVD_L_LEN)
                  ,beginIp65504P841ReservdL
                  ,IP_65504_P_841_RESERVD_L_LEN
                 );
            localIp65504P841ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P841ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P841ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P841ReservdL() {	 
			return (getShort(beginIp65504P841ReservdL));
   	}
         int localIp65504P842ReservdSCounter = -1;
         public boolean isIp65504P842ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P842ReservdSCounter != sharedCounter;
            localIp65504P842ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_842_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P842ReservdS
	 */
	protected void serializeIp65504P842ReservdS(short ip65504P842ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P842ReservdS,IP_65504_P_842_RESERVD_S_LEN)
                  ,beginIp65504P842ReservdS
                  ,IP_65504_P_842_RESERVD_S_LEN
                 );
            localIp65504P842ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P842ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P842ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P842ReservdS() {	 
			return (getShort(beginIp65504P842ReservdS));
   	}
         int localIp65504P842ReservdLCounter = -1;
         public boolean isIp65504P842ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P842ReservdLCounter != sharedCounter;
            localIp65504P842ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_842_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P842ReservdL
	 */
	protected void serializeIp65504P842ReservdL(short ip65504P842ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P842ReservdL,IP_65504_P_842_RESERVD_L_LEN)
                  ,beginIp65504P842ReservdL
                  ,IP_65504_P_842_RESERVD_L_LEN
                 );
            localIp65504P842ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P842ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P842ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P842ReservdL() {	 
			return (getShort(beginIp65504P842ReservdL));
   	}
         int localIp65504P843ReservdSCounter = -1;
         public boolean isIp65504P843ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P843ReservdSCounter != sharedCounter;
            localIp65504P843ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_843_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P843ReservdS
	 */
	protected void serializeIp65504P843ReservdS(short ip65504P843ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P843ReservdS,IP_65504_P_843_RESERVD_S_LEN)
                  ,beginIp65504P843ReservdS
                  ,IP_65504_P_843_RESERVD_S_LEN
                 );
            localIp65504P843ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P843ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P843ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P843ReservdS() {	 
			return (getShort(beginIp65504P843ReservdS));
   	}
         int localIp65504P843ReservdLCounter = -1;
         public boolean isIp65504P843ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P843ReservdLCounter != sharedCounter;
            localIp65504P843ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_843_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P843ReservdL
	 */
	protected void serializeIp65504P843ReservdL(short ip65504P843ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P843ReservdL,IP_65504_P_843_RESERVD_L_LEN)
                  ,beginIp65504P843ReservdL
                  ,IP_65504_P_843_RESERVD_L_LEN
                 );
            localIp65504P843ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P843ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P843ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P843ReservdL() {	 
			return (getShort(beginIp65504P843ReservdL));
   	}
         int localIp65504P844ReservdSCounter = -1;
         public boolean isIp65504P844ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P844ReservdSCounter != sharedCounter;
            localIp65504P844ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_844_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P844ReservdS
	 */
	protected void serializeIp65504P844ReservdS(short ip65504P844ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P844ReservdS,IP_65504_P_844_RESERVD_S_LEN)
                  ,beginIp65504P844ReservdS
                  ,IP_65504_P_844_RESERVD_S_LEN
                 );
            localIp65504P844ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P844ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P844ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P844ReservdS() {	 
			return (getShort(beginIp65504P844ReservdS));
   	}
         int localIp65504P844ReservdLCounter = -1;
         public boolean isIp65504P844ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P844ReservdLCounter != sharedCounter;
            localIp65504P844ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_844_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P844ReservdL
	 */
	protected void serializeIp65504P844ReservdL(short ip65504P844ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P844ReservdL,IP_65504_P_844_RESERVD_L_LEN)
                  ,beginIp65504P844ReservdL
                  ,IP_65504_P_844_RESERVD_L_LEN
                 );
            localIp65504P844ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P844ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P844ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P844ReservdL() {	 
			return (getShort(beginIp65504P844ReservdL));
   	}
         int localIp65504P845ReservdSCounter = -1;
         public boolean isIp65504P845ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P845ReservdSCounter != sharedCounter;
            localIp65504P845ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_845_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P845ReservdS
	 */
	protected void serializeIp65504P845ReservdS(short ip65504P845ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P845ReservdS,IP_65504_P_845_RESERVD_S_LEN)
                  ,beginIp65504P845ReservdS
                  ,IP_65504_P_845_RESERVD_S_LEN
                 );
            localIp65504P845ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P845ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P845ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P845ReservdS() {	 
			return (getShort(beginIp65504P845ReservdS));
   	}
         int localIp65504P845ReservdLCounter = -1;
         public boolean isIp65504P845ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P845ReservdLCounter != sharedCounter;
            localIp65504P845ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_845_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P845ReservdL
	 */
	protected void serializeIp65504P845ReservdL(short ip65504P845ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P845ReservdL,IP_65504_P_845_RESERVD_L_LEN)
                  ,beginIp65504P845ReservdL
                  ,IP_65504_P_845_RESERVD_L_LEN
                 );
            localIp65504P845ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P845ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P845ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P845ReservdL() {	 
			return (getShort(beginIp65504P845ReservdL));
   	}
         int localIp65504P846ReservdSCounter = -1;
         public boolean isIp65504P846ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P846ReservdSCounter != sharedCounter;
            localIp65504P846ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_846_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P846ReservdS
	 */
	protected void serializeIp65504P846ReservdS(short ip65504P846ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P846ReservdS,IP_65504_P_846_RESERVD_S_LEN)
                  ,beginIp65504P846ReservdS
                  ,IP_65504_P_846_RESERVD_S_LEN
                 );
            localIp65504P846ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P846ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P846ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P846ReservdS() {	 
			return (getShort(beginIp65504P846ReservdS));
   	}
         int localIp65504P846ReservdLCounter = -1;
         public boolean isIp65504P846ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P846ReservdLCounter != sharedCounter;
            localIp65504P846ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_846_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P846ReservdL
	 */
	protected void serializeIp65504P846ReservdL(short ip65504P846ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P846ReservdL,IP_65504_P_846_RESERVD_L_LEN)
                  ,beginIp65504P846ReservdL
                  ,IP_65504_P_846_RESERVD_L_LEN
                 );
            localIp65504P846ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P846ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P846ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P846ReservdL() {	 
			return (getShort(beginIp65504P846ReservdL));
   	}
         int localIp65504P847ReservdSCounter = -1;
         public boolean isIp65504P847ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P847ReservdSCounter != sharedCounter;
            localIp65504P847ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_847_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P847ReservdS
	 */
	protected void serializeIp65504P847ReservdS(short ip65504P847ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P847ReservdS,IP_65504_P_847_RESERVD_S_LEN)
                  ,beginIp65504P847ReservdS
                  ,IP_65504_P_847_RESERVD_S_LEN
                 );
            localIp65504P847ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P847ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P847ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P847ReservdS() {	 
			return (getShort(beginIp65504P847ReservdS));
   	}
         int localIp65504P847ReservdLCounter = -1;
         public boolean isIp65504P847ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P847ReservdLCounter != sharedCounter;
            localIp65504P847ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_847_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P847ReservdL
	 */
	protected void serializeIp65504P847ReservdL(short ip65504P847ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P847ReservdL,IP_65504_P_847_RESERVD_L_LEN)
                  ,beginIp65504P847ReservdL
                  ,IP_65504_P_847_RESERVD_L_LEN
                 );
            localIp65504P847ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P847ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P847ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P847ReservdL() {	 
			return (getShort(beginIp65504P847ReservdL));
   	}
         int localIp65504P848ReservdSCounter = -1;
         public boolean isIp65504P848ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P848ReservdSCounter != sharedCounter;
            localIp65504P848ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_848_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P848ReservdS
	 */
	protected void serializeIp65504P848ReservdS(short ip65504P848ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P848ReservdS,IP_65504_P_848_RESERVD_S_LEN)
                  ,beginIp65504P848ReservdS
                  ,IP_65504_P_848_RESERVD_S_LEN
                 );
            localIp65504P848ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P848ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P848ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P848ReservdS() {	 
			return (getShort(beginIp65504P848ReservdS));
   	}
         int localIp65504P848ReservdLCounter = -1;
         public boolean isIp65504P848ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P848ReservdLCounter != sharedCounter;
            localIp65504P848ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_848_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P848ReservdL
	 */
	protected void serializeIp65504P848ReservdL(short ip65504P848ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P848ReservdL,IP_65504_P_848_RESERVD_L_LEN)
                  ,beginIp65504P848ReservdL
                  ,IP_65504_P_848_RESERVD_L_LEN
                 );
            localIp65504P848ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P848ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P848ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P848ReservdL() {	 
			return (getShort(beginIp65504P848ReservdL));
   	}
         int localIp65504P849ReservdSCounter = -1;
         public boolean isIp65504P849ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P849ReservdSCounter != sharedCounter;
            localIp65504P849ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_849_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P849ReservdS
	 */
	protected void serializeIp65504P849ReservdS(short ip65504P849ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P849ReservdS,IP_65504_P_849_RESERVD_S_LEN)
                  ,beginIp65504P849ReservdS
                  ,IP_65504_P_849_RESERVD_S_LEN
                 );
            localIp65504P849ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P849ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P849ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P849ReservdS() {	 
			return (getShort(beginIp65504P849ReservdS));
   	}
         int localIp65504P849ReservdLCounter = -1;
         public boolean isIp65504P849ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P849ReservdLCounter != sharedCounter;
            localIp65504P849ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_849_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P849ReservdL
	 */
	protected void serializeIp65504P849ReservdL(short ip65504P849ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P849ReservdL,IP_65504_P_849_RESERVD_L_LEN)
                  ,beginIp65504P849ReservdL
                  ,IP_65504_P_849_RESERVD_L_LEN
                 );
            localIp65504P849ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P849ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P849ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P849ReservdL() {	 
			return (getShort(beginIp65504P849ReservdL));
   	}
         int localIp65504P850ReservdSCounter = -1;
         public boolean isIp65504P850ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P850ReservdSCounter != sharedCounter;
            localIp65504P850ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_850_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P850ReservdS
	 */
	protected void serializeIp65504P850ReservdS(short ip65504P850ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P850ReservdS,IP_65504_P_850_RESERVD_S_LEN)
                  ,beginIp65504P850ReservdS
                  ,IP_65504_P_850_RESERVD_S_LEN
                 );
            localIp65504P850ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P850ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P850ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P850ReservdS() {	 
			return (getShort(beginIp65504P850ReservdS));
   	}
         int localIp65504P850ReservdLCounter = -1;
         public boolean isIp65504P850ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P850ReservdLCounter != sharedCounter;
            localIp65504P850ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_850_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P850ReservdL
	 */
	protected void serializeIp65504P850ReservdL(short ip65504P850ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P850ReservdL,IP_65504_P_850_RESERVD_L_LEN)
                  ,beginIp65504P850ReservdL
                  ,IP_65504_P_850_RESERVD_L_LEN
                 );
            localIp65504P850ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P850ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P850ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P850ReservdL() {	 
			return (getShort(beginIp65504P850ReservdL));
   	}
         int localIp65504P851ReservdSCounter = -1;
         public boolean isIp65504P851ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P851ReservdSCounter != sharedCounter;
            localIp65504P851ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_851_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P851ReservdS
	 */
	protected void serializeIp65504P851ReservdS(short ip65504P851ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P851ReservdS,IP_65504_P_851_RESERVD_S_LEN)
                  ,beginIp65504P851ReservdS
                  ,IP_65504_P_851_RESERVD_S_LEN
                 );
            localIp65504P851ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P851ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P851ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P851ReservdS() {	 
			return (getShort(beginIp65504P851ReservdS));
   	}
         int localIp65504P851ReservdLCounter = -1;
         public boolean isIp65504P851ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P851ReservdLCounter != sharedCounter;
            localIp65504P851ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_851_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P851ReservdL
	 */
	protected void serializeIp65504P851ReservdL(short ip65504P851ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P851ReservdL,IP_65504_P_851_RESERVD_L_LEN)
                  ,beginIp65504P851ReservdL
                  ,IP_65504_P_851_RESERVD_L_LEN
                 );
            localIp65504P851ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P851ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P851ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P851ReservdL() {	 
			return (getShort(beginIp65504P851ReservdL));
   	}
         int localIp65504P852ReservdSCounter = -1;
         public boolean isIp65504P852ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P852ReservdSCounter != sharedCounter;
            localIp65504P852ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_852_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P852ReservdS
	 */
	protected void serializeIp65504P852ReservdS(short ip65504P852ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P852ReservdS,IP_65504_P_852_RESERVD_S_LEN)
                  ,beginIp65504P852ReservdS
                  ,IP_65504_P_852_RESERVD_S_LEN
                 );
            localIp65504P852ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P852ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P852ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P852ReservdS() {	 
			return (getShort(beginIp65504P852ReservdS));
   	}
         int localIp65504P852ReservdLCounter = -1;
         public boolean isIp65504P852ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P852ReservdLCounter != sharedCounter;
            localIp65504P852ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_852_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P852ReservdL
	 */
	protected void serializeIp65504P852ReservdL(short ip65504P852ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P852ReservdL,IP_65504_P_852_RESERVD_L_LEN)
                  ,beginIp65504P852ReservdL
                  ,IP_65504_P_852_RESERVD_L_LEN
                 );
            localIp65504P852ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P852ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P852ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P852ReservdL() {	 
			return (getShort(beginIp65504P852ReservdL));
   	}
         int localIp65504P853ReservdSCounter = -1;
         public boolean isIp65504P853ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P853ReservdSCounter != sharedCounter;
            localIp65504P853ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_853_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P853ReservdS
	 */
	protected void serializeIp65504P853ReservdS(short ip65504P853ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P853ReservdS,IP_65504_P_853_RESERVD_S_LEN)
                  ,beginIp65504P853ReservdS
                  ,IP_65504_P_853_RESERVD_S_LEN
                 );
            localIp65504P853ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P853ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P853ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P853ReservdS() {	 
			return (getShort(beginIp65504P853ReservdS));
   	}
         int localIp65504P853ReservdLCounter = -1;
         public boolean isIp65504P853ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P853ReservdLCounter != sharedCounter;
            localIp65504P853ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_853_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P853ReservdL
	 */
	protected void serializeIp65504P853ReservdL(short ip65504P853ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P853ReservdL,IP_65504_P_853_RESERVD_L_LEN)
                  ,beginIp65504P853ReservdL
                  ,IP_65504_P_853_RESERVD_L_LEN
                 );
            localIp65504P853ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P853ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P853ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P853ReservdL() {	 
			return (getShort(beginIp65504P853ReservdL));
   	}
         int localIp65504P854ReservdSCounter = -1;
         public boolean isIp65504P854ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P854ReservdSCounter != sharedCounter;
            localIp65504P854ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_854_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P854ReservdS
	 */
	protected void serializeIp65504P854ReservdS(short ip65504P854ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P854ReservdS,IP_65504_P_854_RESERVD_S_LEN)
                  ,beginIp65504P854ReservdS
                  ,IP_65504_P_854_RESERVD_S_LEN
                 );
            localIp65504P854ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P854ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P854ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P854ReservdS() {	 
			return (getShort(beginIp65504P854ReservdS));
   	}
         int localIp65504P854ReservdLCounter = -1;
         public boolean isIp65504P854ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P854ReservdLCounter != sharedCounter;
            localIp65504P854ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_854_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P854ReservdL
	 */
	protected void serializeIp65504P854ReservdL(short ip65504P854ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P854ReservdL,IP_65504_P_854_RESERVD_L_LEN)
                  ,beginIp65504P854ReservdL
                  ,IP_65504_P_854_RESERVD_L_LEN
                 );
            localIp65504P854ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P854ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P854ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P854ReservdL() {	 
			return (getShort(beginIp65504P854ReservdL));
   	}
         int localIp65504P855ReservdSCounter = -1;
         public boolean isIp65504P855ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P855ReservdSCounter != sharedCounter;
            localIp65504P855ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_855_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P855ReservdS
	 */
	protected void serializeIp65504P855ReservdS(short ip65504P855ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P855ReservdS,IP_65504_P_855_RESERVD_S_LEN)
                  ,beginIp65504P855ReservdS
                  ,IP_65504_P_855_RESERVD_S_LEN
                 );
            localIp65504P855ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P855ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P855ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P855ReservdS() {	 
			return (getShort(beginIp65504P855ReservdS));
   	}
         int localIp65504P855ReservdLCounter = -1;
         public boolean isIp65504P855ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P855ReservdLCounter != sharedCounter;
            localIp65504P855ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_855_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P855ReservdL
	 */
	protected void serializeIp65504P855ReservdL(short ip65504P855ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P855ReservdL,IP_65504_P_855_RESERVD_L_LEN)
                  ,beginIp65504P855ReservdL
                  ,IP_65504_P_855_RESERVD_L_LEN
                 );
            localIp65504P855ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P855ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P855ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P855ReservdL() {	 
			return (getShort(beginIp65504P855ReservdL));
   	}
         int localIp65504P856ReservdSCounter = -1;
         public boolean isIp65504P856ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P856ReservdSCounter != sharedCounter;
            localIp65504P856ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_856_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P856ReservdS
	 */
	protected void serializeIp65504P856ReservdS(short ip65504P856ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P856ReservdS,IP_65504_P_856_RESERVD_S_LEN)
                  ,beginIp65504P856ReservdS
                  ,IP_65504_P_856_RESERVD_S_LEN
                 );
            localIp65504P856ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P856ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P856ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P856ReservdS() {	 
			return (getShort(beginIp65504P856ReservdS));
   	}
         int localIp65504P856ReservdLCounter = -1;
         public boolean isIp65504P856ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P856ReservdLCounter != sharedCounter;
            localIp65504P856ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_856_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P856ReservdL
	 */
	protected void serializeIp65504P856ReservdL(short ip65504P856ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P856ReservdL,IP_65504_P_856_RESERVD_L_LEN)
                  ,beginIp65504P856ReservdL
                  ,IP_65504_P_856_RESERVD_L_LEN
                 );
            localIp65504P856ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P856ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P856ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P856ReservdL() {	 
			return (getShort(beginIp65504P856ReservdL));
   	}
         int localIp65504P857ReservdSCounter = -1;
         public boolean isIp65504P857ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P857ReservdSCounter != sharedCounter;
            localIp65504P857ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_857_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P857ReservdS
	 */
	protected void serializeIp65504P857ReservdS(short ip65504P857ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P857ReservdS,IP_65504_P_857_RESERVD_S_LEN)
                  ,beginIp65504P857ReservdS
                  ,IP_65504_P_857_RESERVD_S_LEN
                 );
            localIp65504P857ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P857ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P857ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P857ReservdS() {	 
			return (getShort(beginIp65504P857ReservdS));
   	}
         int localIp65504P857ReservdLCounter = -1;
         public boolean isIp65504P857ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P857ReservdLCounter != sharedCounter;
            localIp65504P857ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_857_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P857ReservdL
	 */
	protected void serializeIp65504P857ReservdL(short ip65504P857ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P857ReservdL,IP_65504_P_857_RESERVD_L_LEN)
                  ,beginIp65504P857ReservdL
                  ,IP_65504_P_857_RESERVD_L_LEN
                 );
            localIp65504P857ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P857ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P857ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P857ReservdL() {	 
			return (getShort(beginIp65504P857ReservdL));
   	}
         int localIp65504P858ReservdSCounter = -1;
         public boolean isIp65504P858ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P858ReservdSCounter != sharedCounter;
            localIp65504P858ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_858_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P858ReservdS
	 */
	protected void serializeIp65504P858ReservdS(short ip65504P858ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P858ReservdS,IP_65504_P_858_RESERVD_S_LEN)
                  ,beginIp65504P858ReservdS
                  ,IP_65504_P_858_RESERVD_S_LEN
                 );
            localIp65504P858ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P858ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P858ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P858ReservdS() {	 
			return (getShort(beginIp65504P858ReservdS));
   	}
         int localIp65504P858ReservdLCounter = -1;
         public boolean isIp65504P858ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P858ReservdLCounter != sharedCounter;
            localIp65504P858ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_858_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P858ReservdL
	 */
	protected void serializeIp65504P858ReservdL(short ip65504P858ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P858ReservdL,IP_65504_P_858_RESERVD_L_LEN)
                  ,beginIp65504P858ReservdL
                  ,IP_65504_P_858_RESERVD_L_LEN
                 );
            localIp65504P858ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P858ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P858ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P858ReservdL() {	 
			return (getShort(beginIp65504P858ReservdL));
   	}
         int localIp65504P859ReservdSCounter = -1;
         public boolean isIp65504P859ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P859ReservdSCounter != sharedCounter;
            localIp65504P859ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_859_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P859ReservdS
	 */
	protected void serializeIp65504P859ReservdS(short ip65504P859ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P859ReservdS,IP_65504_P_859_RESERVD_S_LEN)
                  ,beginIp65504P859ReservdS
                  ,IP_65504_P_859_RESERVD_S_LEN
                 );
            localIp65504P859ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P859ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P859ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P859ReservdS() {	 
			return (getShort(beginIp65504P859ReservdS));
   	}
         int localIp65504P859ReservdLCounter = -1;
         public boolean isIp65504P859ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P859ReservdLCounter != sharedCounter;
            localIp65504P859ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_859_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P859ReservdL
	 */
	protected void serializeIp65504P859ReservdL(short ip65504P859ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P859ReservdL,IP_65504_P_859_RESERVD_L_LEN)
                  ,beginIp65504P859ReservdL
                  ,IP_65504_P_859_RESERVD_L_LEN
                 );
            localIp65504P859ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P859ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P859ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P859ReservdL() {	 
			return (getShort(beginIp65504P859ReservdL));
   	}
         int localIp65504P860ReservdSCounter = -1;
         public boolean isIp65504P860ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P860ReservdSCounter != sharedCounter;
            localIp65504P860ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_860_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P860ReservdS
	 */
	protected void serializeIp65504P860ReservdS(short ip65504P860ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P860ReservdS,IP_65504_P_860_RESERVD_S_LEN)
                  ,beginIp65504P860ReservdS
                  ,IP_65504_P_860_RESERVD_S_LEN
                 );
            localIp65504P860ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P860ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P860ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P860ReservdS() {	 
			return (getShort(beginIp65504P860ReservdS));
   	}
         int localIp65504P860ReservdLCounter = -1;
         public boolean isIp65504P860ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P860ReservdLCounter != sharedCounter;
            localIp65504P860ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_860_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P860ReservdL
	 */
	protected void serializeIp65504P860ReservdL(short ip65504P860ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P860ReservdL,IP_65504_P_860_RESERVD_L_LEN)
                  ,beginIp65504P860ReservdL
                  ,IP_65504_P_860_RESERVD_L_LEN
                 );
            localIp65504P860ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P860ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P860ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P860ReservdL() {	 
			return (getShort(beginIp65504P860ReservdL));
   	}
         int localIp65504P861ReservdSCounter = -1;
         public boolean isIp65504P861ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P861ReservdSCounter != sharedCounter;
            localIp65504P861ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_861_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P861ReservdS
	 */
	protected void serializeIp65504P861ReservdS(short ip65504P861ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P861ReservdS,IP_65504_P_861_RESERVD_S_LEN)
                  ,beginIp65504P861ReservdS
                  ,IP_65504_P_861_RESERVD_S_LEN
                 );
            localIp65504P861ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P861ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P861ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P861ReservdS() {	 
			return (getShort(beginIp65504P861ReservdS));
   	}
         int localIp65504P861ReservdLCounter = -1;
         public boolean isIp65504P861ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P861ReservdLCounter != sharedCounter;
            localIp65504P861ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_861_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P861ReservdL
	 */
	protected void serializeIp65504P861ReservdL(short ip65504P861ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P861ReservdL,IP_65504_P_861_RESERVD_L_LEN)
                  ,beginIp65504P861ReservdL
                  ,IP_65504_P_861_RESERVD_L_LEN
                 );
            localIp65504P861ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P861ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P861ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P861ReservdL() {	 
			return (getShort(beginIp65504P861ReservdL));
   	}
         int localIp65504P862ReservdSCounter = -1;
         public boolean isIp65504P862ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P862ReservdSCounter != sharedCounter;
            localIp65504P862ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_862_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P862ReservdS
	 */
	protected void serializeIp65504P862ReservdS(short ip65504P862ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P862ReservdS,IP_65504_P_862_RESERVD_S_LEN)
                  ,beginIp65504P862ReservdS
                  ,IP_65504_P_862_RESERVD_S_LEN
                 );
            localIp65504P862ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P862ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P862ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P862ReservdS() {	 
			return (getShort(beginIp65504P862ReservdS));
   	}
         int localIp65504P862ReservdLCounter = -1;
         public boolean isIp65504P862ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P862ReservdLCounter != sharedCounter;
            localIp65504P862ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_862_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P862ReservdL
	 */
	protected void serializeIp65504P862ReservdL(short ip65504P862ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P862ReservdL,IP_65504_P_862_RESERVD_L_LEN)
                  ,beginIp65504P862ReservdL
                  ,IP_65504_P_862_RESERVD_L_LEN
                 );
            localIp65504P862ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P862ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P862ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P862ReservdL() {	 
			return (getShort(beginIp65504P862ReservdL));
   	}
         int localIp65504P863ReservdSCounter = -1;
         public boolean isIp65504P863ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P863ReservdSCounter != sharedCounter;
            localIp65504P863ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_863_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P863ReservdS
	 */
	protected void serializeIp65504P863ReservdS(short ip65504P863ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P863ReservdS,IP_65504_P_863_RESERVD_S_LEN)
                  ,beginIp65504P863ReservdS
                  ,IP_65504_P_863_RESERVD_S_LEN
                 );
            localIp65504P863ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P863ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P863ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P863ReservdS() {	 
			return (getShort(beginIp65504P863ReservdS));
   	}
         int localIp65504P863ReservdLCounter = -1;
         public boolean isIp65504P863ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P863ReservdLCounter != sharedCounter;
            localIp65504P863ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_863_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P863ReservdL
	 */
	protected void serializeIp65504P863ReservdL(short ip65504P863ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P863ReservdL,IP_65504_P_863_RESERVD_L_LEN)
                  ,beginIp65504P863ReservdL
                  ,IP_65504_P_863_RESERVD_L_LEN
                 );
            localIp65504P863ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P863ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P863ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P863ReservdL() {	 
			return (getShort(beginIp65504P863ReservdL));
   	}
         int localIp65504P864ReservdSCounter = -1;
         public boolean isIp65504P864ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P864ReservdSCounter != sharedCounter;
            localIp65504P864ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_864_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P864ReservdS
	 */
	protected void serializeIp65504P864ReservdS(short ip65504P864ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P864ReservdS,IP_65504_P_864_RESERVD_S_LEN)
                  ,beginIp65504P864ReservdS
                  ,IP_65504_P_864_RESERVD_S_LEN
                 );
            localIp65504P864ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P864ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P864ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P864ReservdS() {	 
			return (getShort(beginIp65504P864ReservdS));
   	}
         int localIp65504P864ReservdLCounter = -1;
         public boolean isIp65504P864ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P864ReservdLCounter != sharedCounter;
            localIp65504P864ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_864_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P864ReservdL
	 */
	protected void serializeIp65504P864ReservdL(short ip65504P864ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P864ReservdL,IP_65504_P_864_RESERVD_L_LEN)
                  ,beginIp65504P864ReservdL
                  ,IP_65504_P_864_RESERVD_L_LEN
                 );
            localIp65504P864ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P864ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P864ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P864ReservdL() {	 
			return (getShort(beginIp65504P864ReservdL));
   	}
         int localIp65504P865ReservdSCounter = -1;
         public boolean isIp65504P865ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P865ReservdSCounter != sharedCounter;
            localIp65504P865ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_865_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P865ReservdS
	 */
	protected void serializeIp65504P865ReservdS(short ip65504P865ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P865ReservdS,IP_65504_P_865_RESERVD_S_LEN)
                  ,beginIp65504P865ReservdS
                  ,IP_65504_P_865_RESERVD_S_LEN
                 );
            localIp65504P865ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P865ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P865ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P865ReservdS() {	 
			return (getShort(beginIp65504P865ReservdS));
   	}
         int localIp65504P865ReservdLCounter = -1;
         public boolean isIp65504P865ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P865ReservdLCounter != sharedCounter;
            localIp65504P865ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_865_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P865ReservdL
	 */
	protected void serializeIp65504P865ReservdL(short ip65504P865ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P865ReservdL,IP_65504_P_865_RESERVD_L_LEN)
                  ,beginIp65504P865ReservdL
                  ,IP_65504_P_865_RESERVD_L_LEN
                 );
            localIp65504P865ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P865ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P865ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P865ReservdL() {	 
			return (getShort(beginIp65504P865ReservdL));
   	}
         int localIp65504P866ReservdSCounter = -1;
         public boolean isIp65504P866ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P866ReservdSCounter != sharedCounter;
            localIp65504P866ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_866_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P866ReservdS
	 */
	protected void serializeIp65504P866ReservdS(short ip65504P866ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P866ReservdS,IP_65504_P_866_RESERVD_S_LEN)
                  ,beginIp65504P866ReservdS
                  ,IP_65504_P_866_RESERVD_S_LEN
                 );
            localIp65504P866ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P866ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P866ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P866ReservdS() {	 
			return (getShort(beginIp65504P866ReservdS));
   	}
         int localIp65504P866ReservdLCounter = -1;
         public boolean isIp65504P866ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P866ReservdLCounter != sharedCounter;
            localIp65504P866ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_866_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P866ReservdL
	 */
	protected void serializeIp65504P866ReservdL(short ip65504P866ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P866ReservdL,IP_65504_P_866_RESERVD_L_LEN)
                  ,beginIp65504P866ReservdL
                  ,IP_65504_P_866_RESERVD_L_LEN
                 );
            localIp65504P866ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P866ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P866ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P866ReservdL() {	 
			return (getShort(beginIp65504P866ReservdL));
   	}
         int localIp65504P867ReservdSCounter = -1;
         public boolean isIp65504P867ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P867ReservdSCounter != sharedCounter;
            localIp65504P867ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_867_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P867ReservdS
	 */
	protected void serializeIp65504P867ReservdS(short ip65504P867ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P867ReservdS,IP_65504_P_867_RESERVD_S_LEN)
                  ,beginIp65504P867ReservdS
                  ,IP_65504_P_867_RESERVD_S_LEN
                 );
            localIp65504P867ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P867ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P867ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P867ReservdS() {	 
			return (getShort(beginIp65504P867ReservdS));
   	}
         int localIp65504P867ReservdLCounter = -1;
         public boolean isIp65504P867ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P867ReservdLCounter != sharedCounter;
            localIp65504P867ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_867_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P867ReservdL
	 */
	protected void serializeIp65504P867ReservdL(short ip65504P867ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P867ReservdL,IP_65504_P_867_RESERVD_L_LEN)
                  ,beginIp65504P867ReservdL
                  ,IP_65504_P_867_RESERVD_L_LEN
                 );
            localIp65504P867ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P867ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P867ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P867ReservdL() {	 
			return (getShort(beginIp65504P867ReservdL));
   	}
         int localIp65504P868ReservdSCounter = -1;
         public boolean isIp65504P868ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P868ReservdSCounter != sharedCounter;
            localIp65504P868ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_868_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P868ReservdS
	 */
	protected void serializeIp65504P868ReservdS(short ip65504P868ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P868ReservdS,IP_65504_P_868_RESERVD_S_LEN)
                  ,beginIp65504P868ReservdS
                  ,IP_65504_P_868_RESERVD_S_LEN
                 );
            localIp65504P868ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P868ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P868ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P868ReservdS() {	 
			return (getShort(beginIp65504P868ReservdS));
   	}
         int localIp65504P868ReservdLCounter = -1;
         public boolean isIp65504P868ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P868ReservdLCounter != sharedCounter;
            localIp65504P868ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_868_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P868ReservdL
	 */
	protected void serializeIp65504P868ReservdL(short ip65504P868ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P868ReservdL,IP_65504_P_868_RESERVD_L_LEN)
                  ,beginIp65504P868ReservdL
                  ,IP_65504_P_868_RESERVD_L_LEN
                 );
            localIp65504P868ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P868ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P868ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P868ReservdL() {	 
			return (getShort(beginIp65504P868ReservdL));
   	}




}
  
