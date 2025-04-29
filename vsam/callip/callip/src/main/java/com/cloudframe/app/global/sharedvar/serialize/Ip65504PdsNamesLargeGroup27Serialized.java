package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_27_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P807ReservdS;
            protected  int beginIp65504P807ReservdL;
            protected  int beginIp65504P808ReservdS;
            protected  int beginIp65504P808ReservdL;
            protected  int beginIp65504P809ReservdS;
            protected  int beginIp65504P809ReservdL;
            protected  int beginIp65504P810ReservdS;
            protected  int beginIp65504P810ReservdL;
            protected  int beginIp65504P811ReservdS;
            protected  int beginIp65504P811ReservdL;
            protected  int beginIp65504P812ReservdS;
            protected  int beginIp65504P812ReservdL;
            protected  int beginIp65504P813ReservdS;
            protected  int beginIp65504P813ReservdL;
            protected  int beginIp65504P814ReservdS;
            protected  int beginIp65504P814ReservdL;
            protected  int beginIp65504P815ReservdS;
            protected  int beginIp65504P815ReservdL;
            protected  int beginIp65504P816ReservdS;
            protected  int beginIp65504P816ReservdL;
            protected  int beginIp65504P817ReservdS;
            protected  int beginIp65504P817ReservdL;
            protected  int beginIp65504P818ReservdS;
            protected  int beginIp65504P818ReservdL;
            protected  int beginIp65504P819ReservdS;
            protected  int beginIp65504P819ReservdL;
            protected  int beginIp65504P820ReservdS;
            protected  int beginIp65504P820ReservdL;
            protected  int beginIp65504P821ReservdS;
            protected  int beginIp65504P821ReservdL;
            protected  int beginIp65504P822ReservdS;
            protected  int beginIp65504P822ReservdL;
            protected  int beginIp65504P823ReservdS;
            protected  int beginIp65504P823ReservdL;
            protected  int beginIp65504P824ReservdS;
            protected  int beginIp65504P824ReservdL;
            protected  int beginIp65504P825ReservdS;
            protected  int beginIp65504P825ReservdL;
            protected  int beginIp65504P826ReservdS;
            protected  int beginIp65504P826ReservdL;
            protected  int beginIp65504P827ReservdS;
            protected  int beginIp65504P827ReservdL;
            protected  int beginIp65504P828ReservdS;
            protected  int beginIp65504P828ReservdL;
            protected  int beginIp65504P829ReservdS;
            protected  int beginIp65504P829ReservdL;
            protected  int beginIp65504P830ReservdS;
            protected  int beginIp65504P830ReservdL;
            protected  int beginIp65504P831ReservdS;
            protected  int beginIp65504P831ReservdL;
            protected  int beginIp65504P832ReservdS;
            protected  int beginIp65504P832ReservdL;
            protected  int beginIp65504P833ReservdS;
            protected  int beginIp65504P833ReservdL;
            protected  int beginIp65504P834ReservdS;
            protected  int beginIp65504P834ReservdL;
            protected  int beginIp65504P835ReservdS;
            protected  int beginIp65504P835ReservdL;
            protected  int beginIp65504P836ReservdS;
            protected  int beginIp65504P836ReservdL;
            protected  int beginIp65504P837ReservdS;
            protected  int beginIp65504P837ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup27Serialized
	**/
    public Ip65504PdsNamesLargeGroup27Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup27Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup27Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup27Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,6444); // serialize this field at offset 6444 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup27Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 6444 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P807ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P807ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P808ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P808ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P809ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P809ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P810ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P810ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P811ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P811ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P812ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P812ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P813ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P813ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P814ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P814ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P815ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P815ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P816ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P816ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P817ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P817ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P818ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P818ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P819ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P819ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P820ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P820ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P821ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P821ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P822ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P822ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P823ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P823ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P824ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P824ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P825ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P825ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P826ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P826ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P827ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P827ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P828ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P828ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P829ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P829ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P830ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P830ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P831ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P831ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P832ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P832ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P833ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P833ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P834ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P834ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P835ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P835ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P836ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P836ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P837ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P837ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P807ReservdSCounter = -1;
         public boolean isIp65504P807ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P807ReservdSCounter != sharedCounter;
            localIp65504P807ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_807_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P807ReservdS
	 */
	protected void serializeIp65504P807ReservdS(short ip65504P807ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P807ReservdS,IP_65504_P_807_RESERVD_S_LEN)
                  ,beginIp65504P807ReservdS
                  ,IP_65504_P_807_RESERVD_S_LEN
                 );
            localIp65504P807ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P807ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P807ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P807ReservdS() {	 
			return (getShort(beginIp65504P807ReservdS));
   	}
         int localIp65504P807ReservdLCounter = -1;
         public boolean isIp65504P807ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P807ReservdLCounter != sharedCounter;
            localIp65504P807ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_807_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P807ReservdL
	 */
	protected void serializeIp65504P807ReservdL(short ip65504P807ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P807ReservdL,IP_65504_P_807_RESERVD_L_LEN)
                  ,beginIp65504P807ReservdL
                  ,IP_65504_P_807_RESERVD_L_LEN
                 );
            localIp65504P807ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P807ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P807ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P807ReservdL() {	 
			return (getShort(beginIp65504P807ReservdL));
   	}
         int localIp65504P808ReservdSCounter = -1;
         public boolean isIp65504P808ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P808ReservdSCounter != sharedCounter;
            localIp65504P808ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_808_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P808ReservdS
	 */
	protected void serializeIp65504P808ReservdS(short ip65504P808ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P808ReservdS,IP_65504_P_808_RESERVD_S_LEN)
                  ,beginIp65504P808ReservdS
                  ,IP_65504_P_808_RESERVD_S_LEN
                 );
            localIp65504P808ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P808ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P808ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P808ReservdS() {	 
			return (getShort(beginIp65504P808ReservdS));
   	}
         int localIp65504P808ReservdLCounter = -1;
         public boolean isIp65504P808ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P808ReservdLCounter != sharedCounter;
            localIp65504P808ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_808_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P808ReservdL
	 */
	protected void serializeIp65504P808ReservdL(short ip65504P808ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P808ReservdL,IP_65504_P_808_RESERVD_L_LEN)
                  ,beginIp65504P808ReservdL
                  ,IP_65504_P_808_RESERVD_L_LEN
                 );
            localIp65504P808ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P808ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P808ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P808ReservdL() {	 
			return (getShort(beginIp65504P808ReservdL));
   	}
         int localIp65504P809ReservdSCounter = -1;
         public boolean isIp65504P809ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P809ReservdSCounter != sharedCounter;
            localIp65504P809ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_809_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P809ReservdS
	 */
	protected void serializeIp65504P809ReservdS(short ip65504P809ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P809ReservdS,IP_65504_P_809_RESERVD_S_LEN)
                  ,beginIp65504P809ReservdS
                  ,IP_65504_P_809_RESERVD_S_LEN
                 );
            localIp65504P809ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P809ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P809ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P809ReservdS() {	 
			return (getShort(beginIp65504P809ReservdS));
   	}
         int localIp65504P809ReservdLCounter = -1;
         public boolean isIp65504P809ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P809ReservdLCounter != sharedCounter;
            localIp65504P809ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_809_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P809ReservdL
	 */
	protected void serializeIp65504P809ReservdL(short ip65504P809ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P809ReservdL,IP_65504_P_809_RESERVD_L_LEN)
                  ,beginIp65504P809ReservdL
                  ,IP_65504_P_809_RESERVD_L_LEN
                 );
            localIp65504P809ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P809ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P809ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P809ReservdL() {	 
			return (getShort(beginIp65504P809ReservdL));
   	}
         int localIp65504P810ReservdSCounter = -1;
         public boolean isIp65504P810ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P810ReservdSCounter != sharedCounter;
            localIp65504P810ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_810_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P810ReservdS
	 */
	protected void serializeIp65504P810ReservdS(short ip65504P810ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P810ReservdS,IP_65504_P_810_RESERVD_S_LEN)
                  ,beginIp65504P810ReservdS
                  ,IP_65504_P_810_RESERVD_S_LEN
                 );
            localIp65504P810ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P810ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P810ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P810ReservdS() {	 
			return (getShort(beginIp65504P810ReservdS));
   	}
         int localIp65504P810ReservdLCounter = -1;
         public boolean isIp65504P810ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P810ReservdLCounter != sharedCounter;
            localIp65504P810ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_810_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P810ReservdL
	 */
	protected void serializeIp65504P810ReservdL(short ip65504P810ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P810ReservdL,IP_65504_P_810_RESERVD_L_LEN)
                  ,beginIp65504P810ReservdL
                  ,IP_65504_P_810_RESERVD_L_LEN
                 );
            localIp65504P810ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P810ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P810ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P810ReservdL() {	 
			return (getShort(beginIp65504P810ReservdL));
   	}
         int localIp65504P811ReservdSCounter = -1;
         public boolean isIp65504P811ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P811ReservdSCounter != sharedCounter;
            localIp65504P811ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_811_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P811ReservdS
	 */
	protected void serializeIp65504P811ReservdS(short ip65504P811ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P811ReservdS,IP_65504_P_811_RESERVD_S_LEN)
                  ,beginIp65504P811ReservdS
                  ,IP_65504_P_811_RESERVD_S_LEN
                 );
            localIp65504P811ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P811ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P811ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P811ReservdS() {	 
			return (getShort(beginIp65504P811ReservdS));
   	}
         int localIp65504P811ReservdLCounter = -1;
         public boolean isIp65504P811ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P811ReservdLCounter != sharedCounter;
            localIp65504P811ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_811_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P811ReservdL
	 */
	protected void serializeIp65504P811ReservdL(short ip65504P811ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P811ReservdL,IP_65504_P_811_RESERVD_L_LEN)
                  ,beginIp65504P811ReservdL
                  ,IP_65504_P_811_RESERVD_L_LEN
                 );
            localIp65504P811ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P811ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P811ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P811ReservdL() {	 
			return (getShort(beginIp65504P811ReservdL));
   	}
         int localIp65504P812ReservdSCounter = -1;
         public boolean isIp65504P812ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P812ReservdSCounter != sharedCounter;
            localIp65504P812ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_812_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P812ReservdS
	 */
	protected void serializeIp65504P812ReservdS(short ip65504P812ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P812ReservdS,IP_65504_P_812_RESERVD_S_LEN)
                  ,beginIp65504P812ReservdS
                  ,IP_65504_P_812_RESERVD_S_LEN
                 );
            localIp65504P812ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P812ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P812ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P812ReservdS() {	 
			return (getShort(beginIp65504P812ReservdS));
   	}
         int localIp65504P812ReservdLCounter = -1;
         public boolean isIp65504P812ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P812ReservdLCounter != sharedCounter;
            localIp65504P812ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_812_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P812ReservdL
	 */
	protected void serializeIp65504P812ReservdL(short ip65504P812ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P812ReservdL,IP_65504_P_812_RESERVD_L_LEN)
                  ,beginIp65504P812ReservdL
                  ,IP_65504_P_812_RESERVD_L_LEN
                 );
            localIp65504P812ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P812ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P812ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P812ReservdL() {	 
			return (getShort(beginIp65504P812ReservdL));
   	}
         int localIp65504P813ReservdSCounter = -1;
         public boolean isIp65504P813ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P813ReservdSCounter != sharedCounter;
            localIp65504P813ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_813_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P813ReservdS
	 */
	protected void serializeIp65504P813ReservdS(short ip65504P813ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P813ReservdS,IP_65504_P_813_RESERVD_S_LEN)
                  ,beginIp65504P813ReservdS
                  ,IP_65504_P_813_RESERVD_S_LEN
                 );
            localIp65504P813ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P813ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P813ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P813ReservdS() {	 
			return (getShort(beginIp65504P813ReservdS));
   	}
         int localIp65504P813ReservdLCounter = -1;
         public boolean isIp65504P813ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P813ReservdLCounter != sharedCounter;
            localIp65504P813ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_813_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P813ReservdL
	 */
	protected void serializeIp65504P813ReservdL(short ip65504P813ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P813ReservdL,IP_65504_P_813_RESERVD_L_LEN)
                  ,beginIp65504P813ReservdL
                  ,IP_65504_P_813_RESERVD_L_LEN
                 );
            localIp65504P813ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P813ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P813ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P813ReservdL() {	 
			return (getShort(beginIp65504P813ReservdL));
   	}
         int localIp65504P814ReservdSCounter = -1;
         public boolean isIp65504P814ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P814ReservdSCounter != sharedCounter;
            localIp65504P814ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_814_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P814ReservdS
	 */
	protected void serializeIp65504P814ReservdS(short ip65504P814ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P814ReservdS,IP_65504_P_814_RESERVD_S_LEN)
                  ,beginIp65504P814ReservdS
                  ,IP_65504_P_814_RESERVD_S_LEN
                 );
            localIp65504P814ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P814ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P814ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P814ReservdS() {	 
			return (getShort(beginIp65504P814ReservdS));
   	}
         int localIp65504P814ReservdLCounter = -1;
         public boolean isIp65504P814ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P814ReservdLCounter != sharedCounter;
            localIp65504P814ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_814_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P814ReservdL
	 */
	protected void serializeIp65504P814ReservdL(short ip65504P814ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P814ReservdL,IP_65504_P_814_RESERVD_L_LEN)
                  ,beginIp65504P814ReservdL
                  ,IP_65504_P_814_RESERVD_L_LEN
                 );
            localIp65504P814ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P814ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P814ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P814ReservdL() {	 
			return (getShort(beginIp65504P814ReservdL));
   	}
         int localIp65504P815ReservdSCounter = -1;
         public boolean isIp65504P815ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P815ReservdSCounter != sharedCounter;
            localIp65504P815ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_815_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P815ReservdS
	 */
	protected void serializeIp65504P815ReservdS(short ip65504P815ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P815ReservdS,IP_65504_P_815_RESERVD_S_LEN)
                  ,beginIp65504P815ReservdS
                  ,IP_65504_P_815_RESERVD_S_LEN
                 );
            localIp65504P815ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P815ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P815ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P815ReservdS() {	 
			return (getShort(beginIp65504P815ReservdS));
   	}
         int localIp65504P815ReservdLCounter = -1;
         public boolean isIp65504P815ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P815ReservdLCounter != sharedCounter;
            localIp65504P815ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_815_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P815ReservdL
	 */
	protected void serializeIp65504P815ReservdL(short ip65504P815ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P815ReservdL,IP_65504_P_815_RESERVD_L_LEN)
                  ,beginIp65504P815ReservdL
                  ,IP_65504_P_815_RESERVD_L_LEN
                 );
            localIp65504P815ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P815ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P815ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P815ReservdL() {	 
			return (getShort(beginIp65504P815ReservdL));
   	}
         int localIp65504P816ReservdSCounter = -1;
         public boolean isIp65504P816ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P816ReservdSCounter != sharedCounter;
            localIp65504P816ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_816_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P816ReservdS
	 */
	protected void serializeIp65504P816ReservdS(short ip65504P816ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P816ReservdS,IP_65504_P_816_RESERVD_S_LEN)
                  ,beginIp65504P816ReservdS
                  ,IP_65504_P_816_RESERVD_S_LEN
                 );
            localIp65504P816ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P816ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P816ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P816ReservdS() {	 
			return (getShort(beginIp65504P816ReservdS));
   	}
         int localIp65504P816ReservdLCounter = -1;
         public boolean isIp65504P816ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P816ReservdLCounter != sharedCounter;
            localIp65504P816ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_816_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P816ReservdL
	 */
	protected void serializeIp65504P816ReservdL(short ip65504P816ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P816ReservdL,IP_65504_P_816_RESERVD_L_LEN)
                  ,beginIp65504P816ReservdL
                  ,IP_65504_P_816_RESERVD_L_LEN
                 );
            localIp65504P816ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P816ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P816ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P816ReservdL() {	 
			return (getShort(beginIp65504P816ReservdL));
   	}
         int localIp65504P817ReservdSCounter = -1;
         public boolean isIp65504P817ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P817ReservdSCounter != sharedCounter;
            localIp65504P817ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_817_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P817ReservdS
	 */
	protected void serializeIp65504P817ReservdS(short ip65504P817ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P817ReservdS,IP_65504_P_817_RESERVD_S_LEN)
                  ,beginIp65504P817ReservdS
                  ,IP_65504_P_817_RESERVD_S_LEN
                 );
            localIp65504P817ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P817ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P817ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P817ReservdS() {	 
			return (getShort(beginIp65504P817ReservdS));
   	}
         int localIp65504P817ReservdLCounter = -1;
         public boolean isIp65504P817ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P817ReservdLCounter != sharedCounter;
            localIp65504P817ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_817_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P817ReservdL
	 */
	protected void serializeIp65504P817ReservdL(short ip65504P817ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P817ReservdL,IP_65504_P_817_RESERVD_L_LEN)
                  ,beginIp65504P817ReservdL
                  ,IP_65504_P_817_RESERVD_L_LEN
                 );
            localIp65504P817ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P817ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P817ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P817ReservdL() {	 
			return (getShort(beginIp65504P817ReservdL));
   	}
         int localIp65504P818ReservdSCounter = -1;
         public boolean isIp65504P818ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P818ReservdSCounter != sharedCounter;
            localIp65504P818ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_818_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P818ReservdS
	 */
	protected void serializeIp65504P818ReservdS(short ip65504P818ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P818ReservdS,IP_65504_P_818_RESERVD_S_LEN)
                  ,beginIp65504P818ReservdS
                  ,IP_65504_P_818_RESERVD_S_LEN
                 );
            localIp65504P818ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P818ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P818ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P818ReservdS() {	 
			return (getShort(beginIp65504P818ReservdS));
   	}
         int localIp65504P818ReservdLCounter = -1;
         public boolean isIp65504P818ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P818ReservdLCounter != sharedCounter;
            localIp65504P818ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_818_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P818ReservdL
	 */
	protected void serializeIp65504P818ReservdL(short ip65504P818ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P818ReservdL,IP_65504_P_818_RESERVD_L_LEN)
                  ,beginIp65504P818ReservdL
                  ,IP_65504_P_818_RESERVD_L_LEN
                 );
            localIp65504P818ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P818ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P818ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P818ReservdL() {	 
			return (getShort(beginIp65504P818ReservdL));
   	}
         int localIp65504P819ReservdSCounter = -1;
         public boolean isIp65504P819ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P819ReservdSCounter != sharedCounter;
            localIp65504P819ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_819_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P819ReservdS
	 */
	protected void serializeIp65504P819ReservdS(short ip65504P819ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P819ReservdS,IP_65504_P_819_RESERVD_S_LEN)
                  ,beginIp65504P819ReservdS
                  ,IP_65504_P_819_RESERVD_S_LEN
                 );
            localIp65504P819ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P819ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P819ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P819ReservdS() {	 
			return (getShort(beginIp65504P819ReservdS));
   	}
         int localIp65504P819ReservdLCounter = -1;
         public boolean isIp65504P819ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P819ReservdLCounter != sharedCounter;
            localIp65504P819ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_819_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P819ReservdL
	 */
	protected void serializeIp65504P819ReservdL(short ip65504P819ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P819ReservdL,IP_65504_P_819_RESERVD_L_LEN)
                  ,beginIp65504P819ReservdL
                  ,IP_65504_P_819_RESERVD_L_LEN
                 );
            localIp65504P819ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P819ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P819ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P819ReservdL() {	 
			return (getShort(beginIp65504P819ReservdL));
   	}
         int localIp65504P820ReservdSCounter = -1;
         public boolean isIp65504P820ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P820ReservdSCounter != sharedCounter;
            localIp65504P820ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_820_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P820ReservdS
	 */
	protected void serializeIp65504P820ReservdS(short ip65504P820ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P820ReservdS,IP_65504_P_820_RESERVD_S_LEN)
                  ,beginIp65504P820ReservdS
                  ,IP_65504_P_820_RESERVD_S_LEN
                 );
            localIp65504P820ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P820ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P820ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P820ReservdS() {	 
			return (getShort(beginIp65504P820ReservdS));
   	}
         int localIp65504P820ReservdLCounter = -1;
         public boolean isIp65504P820ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P820ReservdLCounter != sharedCounter;
            localIp65504P820ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_820_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P820ReservdL
	 */
	protected void serializeIp65504P820ReservdL(short ip65504P820ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P820ReservdL,IP_65504_P_820_RESERVD_L_LEN)
                  ,beginIp65504P820ReservdL
                  ,IP_65504_P_820_RESERVD_L_LEN
                 );
            localIp65504P820ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P820ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P820ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P820ReservdL() {	 
			return (getShort(beginIp65504P820ReservdL));
   	}
         int localIp65504P821ReservdSCounter = -1;
         public boolean isIp65504P821ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P821ReservdSCounter != sharedCounter;
            localIp65504P821ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_821_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P821ReservdS
	 */
	protected void serializeIp65504P821ReservdS(short ip65504P821ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P821ReservdS,IP_65504_P_821_RESERVD_S_LEN)
                  ,beginIp65504P821ReservdS
                  ,IP_65504_P_821_RESERVD_S_LEN
                 );
            localIp65504P821ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P821ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P821ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P821ReservdS() {	 
			return (getShort(beginIp65504P821ReservdS));
   	}
         int localIp65504P821ReservdLCounter = -1;
         public boolean isIp65504P821ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P821ReservdLCounter != sharedCounter;
            localIp65504P821ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_821_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P821ReservdL
	 */
	protected void serializeIp65504P821ReservdL(short ip65504P821ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P821ReservdL,IP_65504_P_821_RESERVD_L_LEN)
                  ,beginIp65504P821ReservdL
                  ,IP_65504_P_821_RESERVD_L_LEN
                 );
            localIp65504P821ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P821ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P821ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P821ReservdL() {	 
			return (getShort(beginIp65504P821ReservdL));
   	}
         int localIp65504P822ReservdSCounter = -1;
         public boolean isIp65504P822ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P822ReservdSCounter != sharedCounter;
            localIp65504P822ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_822_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P822ReservdS
	 */
	protected void serializeIp65504P822ReservdS(short ip65504P822ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P822ReservdS,IP_65504_P_822_RESERVD_S_LEN)
                  ,beginIp65504P822ReservdS
                  ,IP_65504_P_822_RESERVD_S_LEN
                 );
            localIp65504P822ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P822ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P822ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P822ReservdS() {	 
			return (getShort(beginIp65504P822ReservdS));
   	}
         int localIp65504P822ReservdLCounter = -1;
         public boolean isIp65504P822ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P822ReservdLCounter != sharedCounter;
            localIp65504P822ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_822_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P822ReservdL
	 */
	protected void serializeIp65504P822ReservdL(short ip65504P822ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P822ReservdL,IP_65504_P_822_RESERVD_L_LEN)
                  ,beginIp65504P822ReservdL
                  ,IP_65504_P_822_RESERVD_L_LEN
                 );
            localIp65504P822ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P822ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P822ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P822ReservdL() {	 
			return (getShort(beginIp65504P822ReservdL));
   	}
         int localIp65504P823ReservdSCounter = -1;
         public boolean isIp65504P823ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P823ReservdSCounter != sharedCounter;
            localIp65504P823ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_823_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P823ReservdS
	 */
	protected void serializeIp65504P823ReservdS(short ip65504P823ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P823ReservdS,IP_65504_P_823_RESERVD_S_LEN)
                  ,beginIp65504P823ReservdS
                  ,IP_65504_P_823_RESERVD_S_LEN
                 );
            localIp65504P823ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P823ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P823ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P823ReservdS() {	 
			return (getShort(beginIp65504P823ReservdS));
   	}
         int localIp65504P823ReservdLCounter = -1;
         public boolean isIp65504P823ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P823ReservdLCounter != sharedCounter;
            localIp65504P823ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_823_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P823ReservdL
	 */
	protected void serializeIp65504P823ReservdL(short ip65504P823ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P823ReservdL,IP_65504_P_823_RESERVD_L_LEN)
                  ,beginIp65504P823ReservdL
                  ,IP_65504_P_823_RESERVD_L_LEN
                 );
            localIp65504P823ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P823ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P823ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P823ReservdL() {	 
			return (getShort(beginIp65504P823ReservdL));
   	}
         int localIp65504P824ReservdSCounter = -1;
         public boolean isIp65504P824ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P824ReservdSCounter != sharedCounter;
            localIp65504P824ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_824_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P824ReservdS
	 */
	protected void serializeIp65504P824ReservdS(short ip65504P824ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P824ReservdS,IP_65504_P_824_RESERVD_S_LEN)
                  ,beginIp65504P824ReservdS
                  ,IP_65504_P_824_RESERVD_S_LEN
                 );
            localIp65504P824ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P824ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P824ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P824ReservdS() {	 
			return (getShort(beginIp65504P824ReservdS));
   	}
         int localIp65504P824ReservdLCounter = -1;
         public boolean isIp65504P824ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P824ReservdLCounter != sharedCounter;
            localIp65504P824ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_824_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P824ReservdL
	 */
	protected void serializeIp65504P824ReservdL(short ip65504P824ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P824ReservdL,IP_65504_P_824_RESERVD_L_LEN)
                  ,beginIp65504P824ReservdL
                  ,IP_65504_P_824_RESERVD_L_LEN
                 );
            localIp65504P824ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P824ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P824ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P824ReservdL() {	 
			return (getShort(beginIp65504P824ReservdL));
   	}
         int localIp65504P825ReservdSCounter = -1;
         public boolean isIp65504P825ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P825ReservdSCounter != sharedCounter;
            localIp65504P825ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_825_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P825ReservdS
	 */
	protected void serializeIp65504P825ReservdS(short ip65504P825ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P825ReservdS,IP_65504_P_825_RESERVD_S_LEN)
                  ,beginIp65504P825ReservdS
                  ,IP_65504_P_825_RESERVD_S_LEN
                 );
            localIp65504P825ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P825ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P825ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P825ReservdS() {	 
			return (getShort(beginIp65504P825ReservdS));
   	}
         int localIp65504P825ReservdLCounter = -1;
         public boolean isIp65504P825ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P825ReservdLCounter != sharedCounter;
            localIp65504P825ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_825_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P825ReservdL
	 */
	protected void serializeIp65504P825ReservdL(short ip65504P825ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P825ReservdL,IP_65504_P_825_RESERVD_L_LEN)
                  ,beginIp65504P825ReservdL
                  ,IP_65504_P_825_RESERVD_L_LEN
                 );
            localIp65504P825ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P825ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P825ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P825ReservdL() {	 
			return (getShort(beginIp65504P825ReservdL));
   	}
         int localIp65504P826ReservdSCounter = -1;
         public boolean isIp65504P826ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P826ReservdSCounter != sharedCounter;
            localIp65504P826ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_826_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P826ReservdS
	 */
	protected void serializeIp65504P826ReservdS(short ip65504P826ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P826ReservdS,IP_65504_P_826_RESERVD_S_LEN)
                  ,beginIp65504P826ReservdS
                  ,IP_65504_P_826_RESERVD_S_LEN
                 );
            localIp65504P826ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P826ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P826ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P826ReservdS() {	 
			return (getShort(beginIp65504P826ReservdS));
   	}
         int localIp65504P826ReservdLCounter = -1;
         public boolean isIp65504P826ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P826ReservdLCounter != sharedCounter;
            localIp65504P826ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_826_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P826ReservdL
	 */
	protected void serializeIp65504P826ReservdL(short ip65504P826ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P826ReservdL,IP_65504_P_826_RESERVD_L_LEN)
                  ,beginIp65504P826ReservdL
                  ,IP_65504_P_826_RESERVD_L_LEN
                 );
            localIp65504P826ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P826ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P826ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P826ReservdL() {	 
			return (getShort(beginIp65504P826ReservdL));
   	}
         int localIp65504P827ReservdSCounter = -1;
         public boolean isIp65504P827ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P827ReservdSCounter != sharedCounter;
            localIp65504P827ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_827_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P827ReservdS
	 */
	protected void serializeIp65504P827ReservdS(short ip65504P827ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P827ReservdS,IP_65504_P_827_RESERVD_S_LEN)
                  ,beginIp65504P827ReservdS
                  ,IP_65504_P_827_RESERVD_S_LEN
                 );
            localIp65504P827ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P827ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P827ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P827ReservdS() {	 
			return (getShort(beginIp65504P827ReservdS));
   	}
         int localIp65504P827ReservdLCounter = -1;
         public boolean isIp65504P827ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P827ReservdLCounter != sharedCounter;
            localIp65504P827ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_827_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P827ReservdL
	 */
	protected void serializeIp65504P827ReservdL(short ip65504P827ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P827ReservdL,IP_65504_P_827_RESERVD_L_LEN)
                  ,beginIp65504P827ReservdL
                  ,IP_65504_P_827_RESERVD_L_LEN
                 );
            localIp65504P827ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P827ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P827ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P827ReservdL() {	 
			return (getShort(beginIp65504P827ReservdL));
   	}
         int localIp65504P828ReservdSCounter = -1;
         public boolean isIp65504P828ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P828ReservdSCounter != sharedCounter;
            localIp65504P828ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_828_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P828ReservdS
	 */
	protected void serializeIp65504P828ReservdS(short ip65504P828ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P828ReservdS,IP_65504_P_828_RESERVD_S_LEN)
                  ,beginIp65504P828ReservdS
                  ,IP_65504_P_828_RESERVD_S_LEN
                 );
            localIp65504P828ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P828ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P828ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P828ReservdS() {	 
			return (getShort(beginIp65504P828ReservdS));
   	}
         int localIp65504P828ReservdLCounter = -1;
         public boolean isIp65504P828ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P828ReservdLCounter != sharedCounter;
            localIp65504P828ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_828_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P828ReservdL
	 */
	protected void serializeIp65504P828ReservdL(short ip65504P828ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P828ReservdL,IP_65504_P_828_RESERVD_L_LEN)
                  ,beginIp65504P828ReservdL
                  ,IP_65504_P_828_RESERVD_L_LEN
                 );
            localIp65504P828ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P828ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P828ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P828ReservdL() {	 
			return (getShort(beginIp65504P828ReservdL));
   	}
         int localIp65504P829ReservdSCounter = -1;
         public boolean isIp65504P829ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P829ReservdSCounter != sharedCounter;
            localIp65504P829ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_829_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P829ReservdS
	 */
	protected void serializeIp65504P829ReservdS(short ip65504P829ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P829ReservdS,IP_65504_P_829_RESERVD_S_LEN)
                  ,beginIp65504P829ReservdS
                  ,IP_65504_P_829_RESERVD_S_LEN
                 );
            localIp65504P829ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P829ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P829ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P829ReservdS() {	 
			return (getShort(beginIp65504P829ReservdS));
   	}
         int localIp65504P829ReservdLCounter = -1;
         public boolean isIp65504P829ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P829ReservdLCounter != sharedCounter;
            localIp65504P829ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_829_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P829ReservdL
	 */
	protected void serializeIp65504P829ReservdL(short ip65504P829ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P829ReservdL,IP_65504_P_829_RESERVD_L_LEN)
                  ,beginIp65504P829ReservdL
                  ,IP_65504_P_829_RESERVD_L_LEN
                 );
            localIp65504P829ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P829ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P829ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P829ReservdL() {	 
			return (getShort(beginIp65504P829ReservdL));
   	}
         int localIp65504P830ReservdSCounter = -1;
         public boolean isIp65504P830ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P830ReservdSCounter != sharedCounter;
            localIp65504P830ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_830_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P830ReservdS
	 */
	protected void serializeIp65504P830ReservdS(short ip65504P830ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P830ReservdS,IP_65504_P_830_RESERVD_S_LEN)
                  ,beginIp65504P830ReservdS
                  ,IP_65504_P_830_RESERVD_S_LEN
                 );
            localIp65504P830ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P830ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P830ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P830ReservdS() {	 
			return (getShort(beginIp65504P830ReservdS));
   	}
         int localIp65504P830ReservdLCounter = -1;
         public boolean isIp65504P830ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P830ReservdLCounter != sharedCounter;
            localIp65504P830ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_830_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P830ReservdL
	 */
	protected void serializeIp65504P830ReservdL(short ip65504P830ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P830ReservdL,IP_65504_P_830_RESERVD_L_LEN)
                  ,beginIp65504P830ReservdL
                  ,IP_65504_P_830_RESERVD_L_LEN
                 );
            localIp65504P830ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P830ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P830ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P830ReservdL() {	 
			return (getShort(beginIp65504P830ReservdL));
   	}
         int localIp65504P831ReservdSCounter = -1;
         public boolean isIp65504P831ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P831ReservdSCounter != sharedCounter;
            localIp65504P831ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_831_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P831ReservdS
	 */
	protected void serializeIp65504P831ReservdS(short ip65504P831ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P831ReservdS,IP_65504_P_831_RESERVD_S_LEN)
                  ,beginIp65504P831ReservdS
                  ,IP_65504_P_831_RESERVD_S_LEN
                 );
            localIp65504P831ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P831ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P831ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P831ReservdS() {	 
			return (getShort(beginIp65504P831ReservdS));
   	}
         int localIp65504P831ReservdLCounter = -1;
         public boolean isIp65504P831ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P831ReservdLCounter != sharedCounter;
            localIp65504P831ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_831_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P831ReservdL
	 */
	protected void serializeIp65504P831ReservdL(short ip65504P831ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P831ReservdL,IP_65504_P_831_RESERVD_L_LEN)
                  ,beginIp65504P831ReservdL
                  ,IP_65504_P_831_RESERVD_L_LEN
                 );
            localIp65504P831ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P831ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P831ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P831ReservdL() {	 
			return (getShort(beginIp65504P831ReservdL));
   	}
         int localIp65504P832ReservdSCounter = -1;
         public boolean isIp65504P832ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P832ReservdSCounter != sharedCounter;
            localIp65504P832ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_832_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P832ReservdS
	 */
	protected void serializeIp65504P832ReservdS(short ip65504P832ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P832ReservdS,IP_65504_P_832_RESERVD_S_LEN)
                  ,beginIp65504P832ReservdS
                  ,IP_65504_P_832_RESERVD_S_LEN
                 );
            localIp65504P832ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P832ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P832ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P832ReservdS() {	 
			return (getShort(beginIp65504P832ReservdS));
   	}
         int localIp65504P832ReservdLCounter = -1;
         public boolean isIp65504P832ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P832ReservdLCounter != sharedCounter;
            localIp65504P832ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_832_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P832ReservdL
	 */
	protected void serializeIp65504P832ReservdL(short ip65504P832ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P832ReservdL,IP_65504_P_832_RESERVD_L_LEN)
                  ,beginIp65504P832ReservdL
                  ,IP_65504_P_832_RESERVD_L_LEN
                 );
            localIp65504P832ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P832ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P832ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P832ReservdL() {	 
			return (getShort(beginIp65504P832ReservdL));
   	}
         int localIp65504P833ReservdSCounter = -1;
         public boolean isIp65504P833ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P833ReservdSCounter != sharedCounter;
            localIp65504P833ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_833_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P833ReservdS
	 */
	protected void serializeIp65504P833ReservdS(short ip65504P833ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P833ReservdS,IP_65504_P_833_RESERVD_S_LEN)
                  ,beginIp65504P833ReservdS
                  ,IP_65504_P_833_RESERVD_S_LEN
                 );
            localIp65504P833ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P833ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P833ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P833ReservdS() {	 
			return (getShort(beginIp65504P833ReservdS));
   	}
         int localIp65504P833ReservdLCounter = -1;
         public boolean isIp65504P833ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P833ReservdLCounter != sharedCounter;
            localIp65504P833ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_833_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P833ReservdL
	 */
	protected void serializeIp65504P833ReservdL(short ip65504P833ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P833ReservdL,IP_65504_P_833_RESERVD_L_LEN)
                  ,beginIp65504P833ReservdL
                  ,IP_65504_P_833_RESERVD_L_LEN
                 );
            localIp65504P833ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P833ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P833ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P833ReservdL() {	 
			return (getShort(beginIp65504P833ReservdL));
   	}
         int localIp65504P834ReservdSCounter = -1;
         public boolean isIp65504P834ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P834ReservdSCounter != sharedCounter;
            localIp65504P834ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_834_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P834ReservdS
	 */
	protected void serializeIp65504P834ReservdS(short ip65504P834ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P834ReservdS,IP_65504_P_834_RESERVD_S_LEN)
                  ,beginIp65504P834ReservdS
                  ,IP_65504_P_834_RESERVD_S_LEN
                 );
            localIp65504P834ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P834ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P834ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P834ReservdS() {	 
			return (getShort(beginIp65504P834ReservdS));
   	}
         int localIp65504P834ReservdLCounter = -1;
         public boolean isIp65504P834ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P834ReservdLCounter != sharedCounter;
            localIp65504P834ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_834_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P834ReservdL
	 */
	protected void serializeIp65504P834ReservdL(short ip65504P834ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P834ReservdL,IP_65504_P_834_RESERVD_L_LEN)
                  ,beginIp65504P834ReservdL
                  ,IP_65504_P_834_RESERVD_L_LEN
                 );
            localIp65504P834ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P834ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P834ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P834ReservdL() {	 
			return (getShort(beginIp65504P834ReservdL));
   	}
         int localIp65504P835ReservdSCounter = -1;
         public boolean isIp65504P835ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P835ReservdSCounter != sharedCounter;
            localIp65504P835ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_835_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P835ReservdS
	 */
	protected void serializeIp65504P835ReservdS(short ip65504P835ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P835ReservdS,IP_65504_P_835_RESERVD_S_LEN)
                  ,beginIp65504P835ReservdS
                  ,IP_65504_P_835_RESERVD_S_LEN
                 );
            localIp65504P835ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P835ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P835ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P835ReservdS() {	 
			return (getShort(beginIp65504P835ReservdS));
   	}
         int localIp65504P835ReservdLCounter = -1;
         public boolean isIp65504P835ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P835ReservdLCounter != sharedCounter;
            localIp65504P835ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_835_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P835ReservdL
	 */
	protected void serializeIp65504P835ReservdL(short ip65504P835ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P835ReservdL,IP_65504_P_835_RESERVD_L_LEN)
                  ,beginIp65504P835ReservdL
                  ,IP_65504_P_835_RESERVD_L_LEN
                 );
            localIp65504P835ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P835ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P835ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P835ReservdL() {	 
			return (getShort(beginIp65504P835ReservdL));
   	}
         int localIp65504P836ReservdSCounter = -1;
         public boolean isIp65504P836ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P836ReservdSCounter != sharedCounter;
            localIp65504P836ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_836_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P836ReservdS
	 */
	protected void serializeIp65504P836ReservdS(short ip65504P836ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P836ReservdS,IP_65504_P_836_RESERVD_S_LEN)
                  ,beginIp65504P836ReservdS
                  ,IP_65504_P_836_RESERVD_S_LEN
                 );
            localIp65504P836ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P836ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P836ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P836ReservdS() {	 
			return (getShort(beginIp65504P836ReservdS));
   	}
         int localIp65504P836ReservdLCounter = -1;
         public boolean isIp65504P836ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P836ReservdLCounter != sharedCounter;
            localIp65504P836ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_836_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P836ReservdL
	 */
	protected void serializeIp65504P836ReservdL(short ip65504P836ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P836ReservdL,IP_65504_P_836_RESERVD_L_LEN)
                  ,beginIp65504P836ReservdL
                  ,IP_65504_P_836_RESERVD_L_LEN
                 );
            localIp65504P836ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P836ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P836ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P836ReservdL() {	 
			return (getShort(beginIp65504P836ReservdL));
   	}
         int localIp65504P837ReservdSCounter = -1;
         public boolean isIp65504P837ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P837ReservdSCounter != sharedCounter;
            localIp65504P837ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_837_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P837ReservdS
	 */
	protected void serializeIp65504P837ReservdS(short ip65504P837ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P837ReservdS,IP_65504_P_837_RESERVD_S_LEN)
                  ,beginIp65504P837ReservdS
                  ,IP_65504_P_837_RESERVD_S_LEN
                 );
            localIp65504P837ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P837ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P837ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P837ReservdS() {	 
			return (getShort(beginIp65504P837ReservdS));
   	}
         int localIp65504P837ReservdLCounter = -1;
         public boolean isIp65504P837ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P837ReservdLCounter != sharedCounter;
            localIp65504P837ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_837_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P837ReservdL
	 */
	protected void serializeIp65504P837ReservdL(short ip65504P837ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P837ReservdL,IP_65504_P_837_RESERVD_L_LEN)
                  ,beginIp65504P837ReservdL
                  ,IP_65504_P_837_RESERVD_L_LEN
                 );
            localIp65504P837ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P837ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P837ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P837ReservdL() {	 
			return (getShort(beginIp65504P837ReservdL));
   	}




}
  
