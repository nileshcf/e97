package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup31Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup31Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup31Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_31_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P931ReservdS;
            protected  int beginIp65504P931ReservdL;
            protected  int beginIp65504P932ReservdS;
            protected  int beginIp65504P932ReservdL;
            protected  int beginIp65504P933ReservdS;
            protected  int beginIp65504P933ReservdL;
            protected  int beginIp65504P934ReservdS;
            protected  int beginIp65504P934ReservdL;
            protected  int beginIp65504P935ReservdS;
            protected  int beginIp65504P935ReservdL;
            protected  int beginIp65504P936ReservdS;
            protected  int beginIp65504P936ReservdL;
            protected  int beginIp65504P937ReservdS;
            protected  int beginIp65504P937ReservdL;
            protected  int beginIp65504P938ReservdS;
            protected  int beginIp65504P938ReservdL;
            protected  int beginIp65504P939ReservdS;
            protected  int beginIp65504P939ReservdL;
            protected  int beginIp65504P940ReservdS;
            protected  int beginIp65504P940ReservdL;
            protected  int beginIp65504P941ReservdS;
            protected  int beginIp65504P941ReservdL;
            protected  int beginIp65504P942ReservdS;
            protected  int beginIp65504P942ReservdL;
            protected  int beginIp65504P943ReservdS;
            protected  int beginIp65504P943ReservdL;
            protected  int beginIp65504P944ReservdS;
            protected  int beginIp65504P944ReservdL;
            protected  int beginIp65504P945ReservdS;
            protected  int beginIp65504P945ReservdL;
            protected  int beginIp65504P946ReservdS;
            protected  int beginIp65504P946ReservdL;
            protected  int beginIp65504P947ReservdS;
            protected  int beginIp65504P947ReservdL;
            protected  int beginIp65504P948ReservdS;
            protected  int beginIp65504P948ReservdL;
            protected  int beginIp65504P949ReservdS;
            protected  int beginIp65504P949ReservdL;
            protected  int beginIp65504P950ReservdS;
            protected  int beginIp65504P950ReservdL;
            protected  int beginIp65504P951ReservdS;
            protected  int beginIp65504P951ReservdL;
            protected  int beginIp65504P952ReservdS;
            protected  int beginIp65504P952ReservdL;
            protected  int beginIp65504P953ReservdS;
            protected  int beginIp65504P953ReservdL;
            protected  int beginIp65504P954ReservdS;
            protected  int beginIp65504P954ReservdL;
            protected  int beginIp65504P955ReservdS;
            protected  int beginIp65504P955ReservdL;
            protected  int beginIp65504P956ReservdS;
            protected  int beginIp65504P956ReservdL;
            protected  int beginIp65504P957ReservdS;
            protected  int beginIp65504P957ReservdL;
            protected  int beginIp65504P958ReservdS;
            protected  int beginIp65504P958ReservdL;
            protected  int beginIp65504P959ReservdS;
            protected  int beginIp65504P959ReservdL;
            protected  int beginIp65504P960ReservdS;
            protected  int beginIp65504P960ReservdL;
            protected  int beginIp65504P961ReservdS;
            protected  int beginIp65504P961ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup31Serialized
	**/
    public Ip65504PdsNamesLargeGroup31Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup31Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup31Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup31Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7436); // serialize this field at offset 7436 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup31Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7436 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup31Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_31_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P931ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P931ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P932ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P932ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P933ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P933ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P934ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P934ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P935ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P935ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P936ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P936ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P937ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P937ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P938ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P938ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P939ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P939ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P940ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P940ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P941ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P941ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P942ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P942ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P943ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P943ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P944ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P944ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P945ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P945ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P946ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P946ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P947ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P947ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P948ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P948ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P949ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P949ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P950ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P950ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P951ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P951ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P952ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P952ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P953ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P953ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P954ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P954ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P955ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P955ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P956ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P956ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P957ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P957ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P958ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P958ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P959ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P959ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P960ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P960ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P961ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P961ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P931ReservdSCounter = -1;
         public boolean isIp65504P931ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P931ReservdSCounter != sharedCounter;
            localIp65504P931ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_931_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P931ReservdS
	 */
	protected void serializeIp65504P931ReservdS(short ip65504P931ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P931ReservdS,IP_65504_P_931_RESERVD_S_LEN)
                  ,beginIp65504P931ReservdS
                  ,IP_65504_P_931_RESERVD_S_LEN
                 );
            localIp65504P931ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P931ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P931ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P931ReservdS() {	 
			return (getShort(beginIp65504P931ReservdS));
   	}
         int localIp65504P931ReservdLCounter = -1;
         public boolean isIp65504P931ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P931ReservdLCounter != sharedCounter;
            localIp65504P931ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_931_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P931ReservdL
	 */
	protected void serializeIp65504P931ReservdL(short ip65504P931ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P931ReservdL,IP_65504_P_931_RESERVD_L_LEN)
                  ,beginIp65504P931ReservdL
                  ,IP_65504_P_931_RESERVD_L_LEN
                 );
            localIp65504P931ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P931ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P931ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P931ReservdL() {	 
			return (getShort(beginIp65504P931ReservdL));
   	}
         int localIp65504P932ReservdSCounter = -1;
         public boolean isIp65504P932ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P932ReservdSCounter != sharedCounter;
            localIp65504P932ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_932_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P932ReservdS
	 */
	protected void serializeIp65504P932ReservdS(short ip65504P932ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P932ReservdS,IP_65504_P_932_RESERVD_S_LEN)
                  ,beginIp65504P932ReservdS
                  ,IP_65504_P_932_RESERVD_S_LEN
                 );
            localIp65504P932ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P932ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P932ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P932ReservdS() {	 
			return (getShort(beginIp65504P932ReservdS));
   	}
         int localIp65504P932ReservdLCounter = -1;
         public boolean isIp65504P932ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P932ReservdLCounter != sharedCounter;
            localIp65504P932ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_932_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P932ReservdL
	 */
	protected void serializeIp65504P932ReservdL(short ip65504P932ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P932ReservdL,IP_65504_P_932_RESERVD_L_LEN)
                  ,beginIp65504P932ReservdL
                  ,IP_65504_P_932_RESERVD_L_LEN
                 );
            localIp65504P932ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P932ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P932ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P932ReservdL() {	 
			return (getShort(beginIp65504P932ReservdL));
   	}
         int localIp65504P933ReservdSCounter = -1;
         public boolean isIp65504P933ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P933ReservdSCounter != sharedCounter;
            localIp65504P933ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_933_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P933ReservdS
	 */
	protected void serializeIp65504P933ReservdS(short ip65504P933ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P933ReservdS,IP_65504_P_933_RESERVD_S_LEN)
                  ,beginIp65504P933ReservdS
                  ,IP_65504_P_933_RESERVD_S_LEN
                 );
            localIp65504P933ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P933ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P933ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P933ReservdS() {	 
			return (getShort(beginIp65504P933ReservdS));
   	}
         int localIp65504P933ReservdLCounter = -1;
         public boolean isIp65504P933ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P933ReservdLCounter != sharedCounter;
            localIp65504P933ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_933_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P933ReservdL
	 */
	protected void serializeIp65504P933ReservdL(short ip65504P933ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P933ReservdL,IP_65504_P_933_RESERVD_L_LEN)
                  ,beginIp65504P933ReservdL
                  ,IP_65504_P_933_RESERVD_L_LEN
                 );
            localIp65504P933ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P933ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P933ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P933ReservdL() {	 
			return (getShort(beginIp65504P933ReservdL));
   	}
         int localIp65504P934ReservdSCounter = -1;
         public boolean isIp65504P934ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P934ReservdSCounter != sharedCounter;
            localIp65504P934ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_934_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P934ReservdS
	 */
	protected void serializeIp65504P934ReservdS(short ip65504P934ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P934ReservdS,IP_65504_P_934_RESERVD_S_LEN)
                  ,beginIp65504P934ReservdS
                  ,IP_65504_P_934_RESERVD_S_LEN
                 );
            localIp65504P934ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P934ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P934ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P934ReservdS() {	 
			return (getShort(beginIp65504P934ReservdS));
   	}
         int localIp65504P934ReservdLCounter = -1;
         public boolean isIp65504P934ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P934ReservdLCounter != sharedCounter;
            localIp65504P934ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_934_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P934ReservdL
	 */
	protected void serializeIp65504P934ReservdL(short ip65504P934ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P934ReservdL,IP_65504_P_934_RESERVD_L_LEN)
                  ,beginIp65504P934ReservdL
                  ,IP_65504_P_934_RESERVD_L_LEN
                 );
            localIp65504P934ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P934ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P934ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P934ReservdL() {	 
			return (getShort(beginIp65504P934ReservdL));
   	}
         int localIp65504P935ReservdSCounter = -1;
         public boolean isIp65504P935ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P935ReservdSCounter != sharedCounter;
            localIp65504P935ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_935_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P935ReservdS
	 */
	protected void serializeIp65504P935ReservdS(short ip65504P935ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P935ReservdS,IP_65504_P_935_RESERVD_S_LEN)
                  ,beginIp65504P935ReservdS
                  ,IP_65504_P_935_RESERVD_S_LEN
                 );
            localIp65504P935ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P935ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P935ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P935ReservdS() {	 
			return (getShort(beginIp65504P935ReservdS));
   	}
         int localIp65504P935ReservdLCounter = -1;
         public boolean isIp65504P935ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P935ReservdLCounter != sharedCounter;
            localIp65504P935ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_935_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P935ReservdL
	 */
	protected void serializeIp65504P935ReservdL(short ip65504P935ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P935ReservdL,IP_65504_P_935_RESERVD_L_LEN)
                  ,beginIp65504P935ReservdL
                  ,IP_65504_P_935_RESERVD_L_LEN
                 );
            localIp65504P935ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P935ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P935ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P935ReservdL() {	 
			return (getShort(beginIp65504P935ReservdL));
   	}
         int localIp65504P936ReservdSCounter = -1;
         public boolean isIp65504P936ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P936ReservdSCounter != sharedCounter;
            localIp65504P936ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_936_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P936ReservdS
	 */
	protected void serializeIp65504P936ReservdS(short ip65504P936ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P936ReservdS,IP_65504_P_936_RESERVD_S_LEN)
                  ,beginIp65504P936ReservdS
                  ,IP_65504_P_936_RESERVD_S_LEN
                 );
            localIp65504P936ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P936ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P936ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P936ReservdS() {	 
			return (getShort(beginIp65504P936ReservdS));
   	}
         int localIp65504P936ReservdLCounter = -1;
         public boolean isIp65504P936ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P936ReservdLCounter != sharedCounter;
            localIp65504P936ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_936_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P936ReservdL
	 */
	protected void serializeIp65504P936ReservdL(short ip65504P936ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P936ReservdL,IP_65504_P_936_RESERVD_L_LEN)
                  ,beginIp65504P936ReservdL
                  ,IP_65504_P_936_RESERVD_L_LEN
                 );
            localIp65504P936ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P936ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P936ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P936ReservdL() {	 
			return (getShort(beginIp65504P936ReservdL));
   	}
         int localIp65504P937ReservdSCounter = -1;
         public boolean isIp65504P937ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P937ReservdSCounter != sharedCounter;
            localIp65504P937ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_937_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P937ReservdS
	 */
	protected void serializeIp65504P937ReservdS(short ip65504P937ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P937ReservdS,IP_65504_P_937_RESERVD_S_LEN)
                  ,beginIp65504P937ReservdS
                  ,IP_65504_P_937_RESERVD_S_LEN
                 );
            localIp65504P937ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P937ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P937ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P937ReservdS() {	 
			return (getShort(beginIp65504P937ReservdS));
   	}
         int localIp65504P937ReservdLCounter = -1;
         public boolean isIp65504P937ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P937ReservdLCounter != sharedCounter;
            localIp65504P937ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_937_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P937ReservdL
	 */
	protected void serializeIp65504P937ReservdL(short ip65504P937ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P937ReservdL,IP_65504_P_937_RESERVD_L_LEN)
                  ,beginIp65504P937ReservdL
                  ,IP_65504_P_937_RESERVD_L_LEN
                 );
            localIp65504P937ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P937ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P937ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P937ReservdL() {	 
			return (getShort(beginIp65504P937ReservdL));
   	}
         int localIp65504P938ReservdSCounter = -1;
         public boolean isIp65504P938ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P938ReservdSCounter != sharedCounter;
            localIp65504P938ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_938_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P938ReservdS
	 */
	protected void serializeIp65504P938ReservdS(short ip65504P938ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P938ReservdS,IP_65504_P_938_RESERVD_S_LEN)
                  ,beginIp65504P938ReservdS
                  ,IP_65504_P_938_RESERVD_S_LEN
                 );
            localIp65504P938ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P938ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P938ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P938ReservdS() {	 
			return (getShort(beginIp65504P938ReservdS));
   	}
         int localIp65504P938ReservdLCounter = -1;
         public boolean isIp65504P938ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P938ReservdLCounter != sharedCounter;
            localIp65504P938ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_938_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P938ReservdL
	 */
	protected void serializeIp65504P938ReservdL(short ip65504P938ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P938ReservdL,IP_65504_P_938_RESERVD_L_LEN)
                  ,beginIp65504P938ReservdL
                  ,IP_65504_P_938_RESERVD_L_LEN
                 );
            localIp65504P938ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P938ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P938ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P938ReservdL() {	 
			return (getShort(beginIp65504P938ReservdL));
   	}
         int localIp65504P939ReservdSCounter = -1;
         public boolean isIp65504P939ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P939ReservdSCounter != sharedCounter;
            localIp65504P939ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_939_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P939ReservdS
	 */
	protected void serializeIp65504P939ReservdS(short ip65504P939ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P939ReservdS,IP_65504_P_939_RESERVD_S_LEN)
                  ,beginIp65504P939ReservdS
                  ,IP_65504_P_939_RESERVD_S_LEN
                 );
            localIp65504P939ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P939ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P939ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P939ReservdS() {	 
			return (getShort(beginIp65504P939ReservdS));
   	}
         int localIp65504P939ReservdLCounter = -1;
         public boolean isIp65504P939ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P939ReservdLCounter != sharedCounter;
            localIp65504P939ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_939_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P939ReservdL
	 */
	protected void serializeIp65504P939ReservdL(short ip65504P939ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P939ReservdL,IP_65504_P_939_RESERVD_L_LEN)
                  ,beginIp65504P939ReservdL
                  ,IP_65504_P_939_RESERVD_L_LEN
                 );
            localIp65504P939ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P939ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P939ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P939ReservdL() {	 
			return (getShort(beginIp65504P939ReservdL));
   	}
         int localIp65504P940ReservdSCounter = -1;
         public boolean isIp65504P940ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P940ReservdSCounter != sharedCounter;
            localIp65504P940ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_940_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P940ReservdS
	 */
	protected void serializeIp65504P940ReservdS(short ip65504P940ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P940ReservdS,IP_65504_P_940_RESERVD_S_LEN)
                  ,beginIp65504P940ReservdS
                  ,IP_65504_P_940_RESERVD_S_LEN
                 );
            localIp65504P940ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P940ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P940ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P940ReservdS() {	 
			return (getShort(beginIp65504P940ReservdS));
   	}
         int localIp65504P940ReservdLCounter = -1;
         public boolean isIp65504P940ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P940ReservdLCounter != sharedCounter;
            localIp65504P940ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_940_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P940ReservdL
	 */
	protected void serializeIp65504P940ReservdL(short ip65504P940ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P940ReservdL,IP_65504_P_940_RESERVD_L_LEN)
                  ,beginIp65504P940ReservdL
                  ,IP_65504_P_940_RESERVD_L_LEN
                 );
            localIp65504P940ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P940ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P940ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P940ReservdL() {	 
			return (getShort(beginIp65504P940ReservdL));
   	}
         int localIp65504P941ReservdSCounter = -1;
         public boolean isIp65504P941ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P941ReservdSCounter != sharedCounter;
            localIp65504P941ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_941_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P941ReservdS
	 */
	protected void serializeIp65504P941ReservdS(short ip65504P941ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P941ReservdS,IP_65504_P_941_RESERVD_S_LEN)
                  ,beginIp65504P941ReservdS
                  ,IP_65504_P_941_RESERVD_S_LEN
                 );
            localIp65504P941ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P941ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P941ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P941ReservdS() {	 
			return (getShort(beginIp65504P941ReservdS));
   	}
         int localIp65504P941ReservdLCounter = -1;
         public boolean isIp65504P941ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P941ReservdLCounter != sharedCounter;
            localIp65504P941ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_941_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P941ReservdL
	 */
	protected void serializeIp65504P941ReservdL(short ip65504P941ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P941ReservdL,IP_65504_P_941_RESERVD_L_LEN)
                  ,beginIp65504P941ReservdL
                  ,IP_65504_P_941_RESERVD_L_LEN
                 );
            localIp65504P941ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P941ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P941ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P941ReservdL() {	 
			return (getShort(beginIp65504P941ReservdL));
   	}
         int localIp65504P942ReservdSCounter = -1;
         public boolean isIp65504P942ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P942ReservdSCounter != sharedCounter;
            localIp65504P942ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_942_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P942ReservdS
	 */
	protected void serializeIp65504P942ReservdS(short ip65504P942ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P942ReservdS,IP_65504_P_942_RESERVD_S_LEN)
                  ,beginIp65504P942ReservdS
                  ,IP_65504_P_942_RESERVD_S_LEN
                 );
            localIp65504P942ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P942ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P942ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P942ReservdS() {	 
			return (getShort(beginIp65504P942ReservdS));
   	}
         int localIp65504P942ReservdLCounter = -1;
         public boolean isIp65504P942ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P942ReservdLCounter != sharedCounter;
            localIp65504P942ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_942_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P942ReservdL
	 */
	protected void serializeIp65504P942ReservdL(short ip65504P942ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P942ReservdL,IP_65504_P_942_RESERVD_L_LEN)
                  ,beginIp65504P942ReservdL
                  ,IP_65504_P_942_RESERVD_L_LEN
                 );
            localIp65504P942ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P942ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P942ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P942ReservdL() {	 
			return (getShort(beginIp65504P942ReservdL));
   	}
         int localIp65504P943ReservdSCounter = -1;
         public boolean isIp65504P943ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P943ReservdSCounter != sharedCounter;
            localIp65504P943ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_943_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P943ReservdS
	 */
	protected void serializeIp65504P943ReservdS(short ip65504P943ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P943ReservdS,IP_65504_P_943_RESERVD_S_LEN)
                  ,beginIp65504P943ReservdS
                  ,IP_65504_P_943_RESERVD_S_LEN
                 );
            localIp65504P943ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P943ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P943ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P943ReservdS() {	 
			return (getShort(beginIp65504P943ReservdS));
   	}
         int localIp65504P943ReservdLCounter = -1;
         public boolean isIp65504P943ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P943ReservdLCounter != sharedCounter;
            localIp65504P943ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_943_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P943ReservdL
	 */
	protected void serializeIp65504P943ReservdL(short ip65504P943ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P943ReservdL,IP_65504_P_943_RESERVD_L_LEN)
                  ,beginIp65504P943ReservdL
                  ,IP_65504_P_943_RESERVD_L_LEN
                 );
            localIp65504P943ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P943ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P943ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P943ReservdL() {	 
			return (getShort(beginIp65504P943ReservdL));
   	}
         int localIp65504P944ReservdSCounter = -1;
         public boolean isIp65504P944ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P944ReservdSCounter != sharedCounter;
            localIp65504P944ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_944_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P944ReservdS
	 */
	protected void serializeIp65504P944ReservdS(short ip65504P944ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P944ReservdS,IP_65504_P_944_RESERVD_S_LEN)
                  ,beginIp65504P944ReservdS
                  ,IP_65504_P_944_RESERVD_S_LEN
                 );
            localIp65504P944ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P944ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P944ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P944ReservdS() {	 
			return (getShort(beginIp65504P944ReservdS));
   	}
         int localIp65504P944ReservdLCounter = -1;
         public boolean isIp65504P944ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P944ReservdLCounter != sharedCounter;
            localIp65504P944ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_944_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P944ReservdL
	 */
	protected void serializeIp65504P944ReservdL(short ip65504P944ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P944ReservdL,IP_65504_P_944_RESERVD_L_LEN)
                  ,beginIp65504P944ReservdL
                  ,IP_65504_P_944_RESERVD_L_LEN
                 );
            localIp65504P944ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P944ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P944ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P944ReservdL() {	 
			return (getShort(beginIp65504P944ReservdL));
   	}
         int localIp65504P945ReservdSCounter = -1;
         public boolean isIp65504P945ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P945ReservdSCounter != sharedCounter;
            localIp65504P945ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_945_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P945ReservdS
	 */
	protected void serializeIp65504P945ReservdS(short ip65504P945ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P945ReservdS,IP_65504_P_945_RESERVD_S_LEN)
                  ,beginIp65504P945ReservdS
                  ,IP_65504_P_945_RESERVD_S_LEN
                 );
            localIp65504P945ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P945ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P945ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P945ReservdS() {	 
			return (getShort(beginIp65504P945ReservdS));
   	}
         int localIp65504P945ReservdLCounter = -1;
         public boolean isIp65504P945ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P945ReservdLCounter != sharedCounter;
            localIp65504P945ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_945_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P945ReservdL
	 */
	protected void serializeIp65504P945ReservdL(short ip65504P945ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P945ReservdL,IP_65504_P_945_RESERVD_L_LEN)
                  ,beginIp65504P945ReservdL
                  ,IP_65504_P_945_RESERVD_L_LEN
                 );
            localIp65504P945ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P945ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P945ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P945ReservdL() {	 
			return (getShort(beginIp65504P945ReservdL));
   	}
         int localIp65504P946ReservdSCounter = -1;
         public boolean isIp65504P946ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P946ReservdSCounter != sharedCounter;
            localIp65504P946ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_946_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P946ReservdS
	 */
	protected void serializeIp65504P946ReservdS(short ip65504P946ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P946ReservdS,IP_65504_P_946_RESERVD_S_LEN)
                  ,beginIp65504P946ReservdS
                  ,IP_65504_P_946_RESERVD_S_LEN
                 );
            localIp65504P946ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P946ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P946ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P946ReservdS() {	 
			return (getShort(beginIp65504P946ReservdS));
   	}
         int localIp65504P946ReservdLCounter = -1;
         public boolean isIp65504P946ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P946ReservdLCounter != sharedCounter;
            localIp65504P946ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_946_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P946ReservdL
	 */
	protected void serializeIp65504P946ReservdL(short ip65504P946ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P946ReservdL,IP_65504_P_946_RESERVD_L_LEN)
                  ,beginIp65504P946ReservdL
                  ,IP_65504_P_946_RESERVD_L_LEN
                 );
            localIp65504P946ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P946ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P946ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P946ReservdL() {	 
			return (getShort(beginIp65504P946ReservdL));
   	}
         int localIp65504P947ReservdSCounter = -1;
         public boolean isIp65504P947ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P947ReservdSCounter != sharedCounter;
            localIp65504P947ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_947_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P947ReservdS
	 */
	protected void serializeIp65504P947ReservdS(short ip65504P947ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P947ReservdS,IP_65504_P_947_RESERVD_S_LEN)
                  ,beginIp65504P947ReservdS
                  ,IP_65504_P_947_RESERVD_S_LEN
                 );
            localIp65504P947ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P947ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P947ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P947ReservdS() {	 
			return (getShort(beginIp65504P947ReservdS));
   	}
         int localIp65504P947ReservdLCounter = -1;
         public boolean isIp65504P947ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P947ReservdLCounter != sharedCounter;
            localIp65504P947ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_947_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P947ReservdL
	 */
	protected void serializeIp65504P947ReservdL(short ip65504P947ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P947ReservdL,IP_65504_P_947_RESERVD_L_LEN)
                  ,beginIp65504P947ReservdL
                  ,IP_65504_P_947_RESERVD_L_LEN
                 );
            localIp65504P947ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P947ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P947ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P947ReservdL() {	 
			return (getShort(beginIp65504P947ReservdL));
   	}
         int localIp65504P948ReservdSCounter = -1;
         public boolean isIp65504P948ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P948ReservdSCounter != sharedCounter;
            localIp65504P948ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_948_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P948ReservdS
	 */
	protected void serializeIp65504P948ReservdS(short ip65504P948ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P948ReservdS,IP_65504_P_948_RESERVD_S_LEN)
                  ,beginIp65504P948ReservdS
                  ,IP_65504_P_948_RESERVD_S_LEN
                 );
            localIp65504P948ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P948ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P948ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P948ReservdS() {	 
			return (getShort(beginIp65504P948ReservdS));
   	}
         int localIp65504P948ReservdLCounter = -1;
         public boolean isIp65504P948ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P948ReservdLCounter != sharedCounter;
            localIp65504P948ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_948_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P948ReservdL
	 */
	protected void serializeIp65504P948ReservdL(short ip65504P948ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P948ReservdL,IP_65504_P_948_RESERVD_L_LEN)
                  ,beginIp65504P948ReservdL
                  ,IP_65504_P_948_RESERVD_L_LEN
                 );
            localIp65504P948ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P948ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P948ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P948ReservdL() {	 
			return (getShort(beginIp65504P948ReservdL));
   	}
         int localIp65504P949ReservdSCounter = -1;
         public boolean isIp65504P949ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P949ReservdSCounter != sharedCounter;
            localIp65504P949ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_949_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P949ReservdS
	 */
	protected void serializeIp65504P949ReservdS(short ip65504P949ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P949ReservdS,IP_65504_P_949_RESERVD_S_LEN)
                  ,beginIp65504P949ReservdS
                  ,IP_65504_P_949_RESERVD_S_LEN
                 );
            localIp65504P949ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P949ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P949ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P949ReservdS() {	 
			return (getShort(beginIp65504P949ReservdS));
   	}
         int localIp65504P949ReservdLCounter = -1;
         public boolean isIp65504P949ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P949ReservdLCounter != sharedCounter;
            localIp65504P949ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_949_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P949ReservdL
	 */
	protected void serializeIp65504P949ReservdL(short ip65504P949ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P949ReservdL,IP_65504_P_949_RESERVD_L_LEN)
                  ,beginIp65504P949ReservdL
                  ,IP_65504_P_949_RESERVD_L_LEN
                 );
            localIp65504P949ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P949ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P949ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P949ReservdL() {	 
			return (getShort(beginIp65504P949ReservdL));
   	}
         int localIp65504P950ReservdSCounter = -1;
         public boolean isIp65504P950ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P950ReservdSCounter != sharedCounter;
            localIp65504P950ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_950_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P950ReservdS
	 */
	protected void serializeIp65504P950ReservdS(short ip65504P950ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P950ReservdS,IP_65504_P_950_RESERVD_S_LEN)
                  ,beginIp65504P950ReservdS
                  ,IP_65504_P_950_RESERVD_S_LEN
                 );
            localIp65504P950ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P950ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P950ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P950ReservdS() {	 
			return (getShort(beginIp65504P950ReservdS));
   	}
         int localIp65504P950ReservdLCounter = -1;
         public boolean isIp65504P950ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P950ReservdLCounter != sharedCounter;
            localIp65504P950ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_950_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P950ReservdL
	 */
	protected void serializeIp65504P950ReservdL(short ip65504P950ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P950ReservdL,IP_65504_P_950_RESERVD_L_LEN)
                  ,beginIp65504P950ReservdL
                  ,IP_65504_P_950_RESERVD_L_LEN
                 );
            localIp65504P950ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P950ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P950ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P950ReservdL() {	 
			return (getShort(beginIp65504P950ReservdL));
   	}
         int localIp65504P951ReservdSCounter = -1;
         public boolean isIp65504P951ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P951ReservdSCounter != sharedCounter;
            localIp65504P951ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_951_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P951ReservdS
	 */
	protected void serializeIp65504P951ReservdS(short ip65504P951ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P951ReservdS,IP_65504_P_951_RESERVD_S_LEN)
                  ,beginIp65504P951ReservdS
                  ,IP_65504_P_951_RESERVD_S_LEN
                 );
            localIp65504P951ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P951ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P951ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P951ReservdS() {	 
			return (getShort(beginIp65504P951ReservdS));
   	}
         int localIp65504P951ReservdLCounter = -1;
         public boolean isIp65504P951ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P951ReservdLCounter != sharedCounter;
            localIp65504P951ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_951_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P951ReservdL
	 */
	protected void serializeIp65504P951ReservdL(short ip65504P951ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P951ReservdL,IP_65504_P_951_RESERVD_L_LEN)
                  ,beginIp65504P951ReservdL
                  ,IP_65504_P_951_RESERVD_L_LEN
                 );
            localIp65504P951ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P951ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P951ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P951ReservdL() {	 
			return (getShort(beginIp65504P951ReservdL));
   	}
         int localIp65504P952ReservdSCounter = -1;
         public boolean isIp65504P952ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P952ReservdSCounter != sharedCounter;
            localIp65504P952ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_952_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P952ReservdS
	 */
	protected void serializeIp65504P952ReservdS(short ip65504P952ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P952ReservdS,IP_65504_P_952_RESERVD_S_LEN)
                  ,beginIp65504P952ReservdS
                  ,IP_65504_P_952_RESERVD_S_LEN
                 );
            localIp65504P952ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P952ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P952ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P952ReservdS() {	 
			return (getShort(beginIp65504P952ReservdS));
   	}
         int localIp65504P952ReservdLCounter = -1;
         public boolean isIp65504P952ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P952ReservdLCounter != sharedCounter;
            localIp65504P952ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_952_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P952ReservdL
	 */
	protected void serializeIp65504P952ReservdL(short ip65504P952ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P952ReservdL,IP_65504_P_952_RESERVD_L_LEN)
                  ,beginIp65504P952ReservdL
                  ,IP_65504_P_952_RESERVD_L_LEN
                 );
            localIp65504P952ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P952ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P952ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P952ReservdL() {	 
			return (getShort(beginIp65504P952ReservdL));
   	}
         int localIp65504P953ReservdSCounter = -1;
         public boolean isIp65504P953ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P953ReservdSCounter != sharedCounter;
            localIp65504P953ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_953_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P953ReservdS
	 */
	protected void serializeIp65504P953ReservdS(short ip65504P953ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P953ReservdS,IP_65504_P_953_RESERVD_S_LEN)
                  ,beginIp65504P953ReservdS
                  ,IP_65504_P_953_RESERVD_S_LEN
                 );
            localIp65504P953ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P953ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P953ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P953ReservdS() {	 
			return (getShort(beginIp65504P953ReservdS));
   	}
         int localIp65504P953ReservdLCounter = -1;
         public boolean isIp65504P953ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P953ReservdLCounter != sharedCounter;
            localIp65504P953ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_953_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P953ReservdL
	 */
	protected void serializeIp65504P953ReservdL(short ip65504P953ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P953ReservdL,IP_65504_P_953_RESERVD_L_LEN)
                  ,beginIp65504P953ReservdL
                  ,IP_65504_P_953_RESERVD_L_LEN
                 );
            localIp65504P953ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P953ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P953ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P953ReservdL() {	 
			return (getShort(beginIp65504P953ReservdL));
   	}
         int localIp65504P954ReservdSCounter = -1;
         public boolean isIp65504P954ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P954ReservdSCounter != sharedCounter;
            localIp65504P954ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_954_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P954ReservdS
	 */
	protected void serializeIp65504P954ReservdS(short ip65504P954ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P954ReservdS,IP_65504_P_954_RESERVD_S_LEN)
                  ,beginIp65504P954ReservdS
                  ,IP_65504_P_954_RESERVD_S_LEN
                 );
            localIp65504P954ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P954ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P954ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P954ReservdS() {	 
			return (getShort(beginIp65504P954ReservdS));
   	}
         int localIp65504P954ReservdLCounter = -1;
         public boolean isIp65504P954ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P954ReservdLCounter != sharedCounter;
            localIp65504P954ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_954_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P954ReservdL
	 */
	protected void serializeIp65504P954ReservdL(short ip65504P954ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P954ReservdL,IP_65504_P_954_RESERVD_L_LEN)
                  ,beginIp65504P954ReservdL
                  ,IP_65504_P_954_RESERVD_L_LEN
                 );
            localIp65504P954ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P954ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P954ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P954ReservdL() {	 
			return (getShort(beginIp65504P954ReservdL));
   	}
         int localIp65504P955ReservdSCounter = -1;
         public boolean isIp65504P955ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P955ReservdSCounter != sharedCounter;
            localIp65504P955ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_955_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P955ReservdS
	 */
	protected void serializeIp65504P955ReservdS(short ip65504P955ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P955ReservdS,IP_65504_P_955_RESERVD_S_LEN)
                  ,beginIp65504P955ReservdS
                  ,IP_65504_P_955_RESERVD_S_LEN
                 );
            localIp65504P955ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P955ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P955ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P955ReservdS() {	 
			return (getShort(beginIp65504P955ReservdS));
   	}
         int localIp65504P955ReservdLCounter = -1;
         public boolean isIp65504P955ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P955ReservdLCounter != sharedCounter;
            localIp65504P955ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_955_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P955ReservdL
	 */
	protected void serializeIp65504P955ReservdL(short ip65504P955ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P955ReservdL,IP_65504_P_955_RESERVD_L_LEN)
                  ,beginIp65504P955ReservdL
                  ,IP_65504_P_955_RESERVD_L_LEN
                 );
            localIp65504P955ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P955ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P955ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P955ReservdL() {	 
			return (getShort(beginIp65504P955ReservdL));
   	}
         int localIp65504P956ReservdSCounter = -1;
         public boolean isIp65504P956ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P956ReservdSCounter != sharedCounter;
            localIp65504P956ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_956_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P956ReservdS
	 */
	protected void serializeIp65504P956ReservdS(short ip65504P956ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P956ReservdS,IP_65504_P_956_RESERVD_S_LEN)
                  ,beginIp65504P956ReservdS
                  ,IP_65504_P_956_RESERVD_S_LEN
                 );
            localIp65504P956ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P956ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P956ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P956ReservdS() {	 
			return (getShort(beginIp65504P956ReservdS));
   	}
         int localIp65504P956ReservdLCounter = -1;
         public boolean isIp65504P956ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P956ReservdLCounter != sharedCounter;
            localIp65504P956ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_956_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P956ReservdL
	 */
	protected void serializeIp65504P956ReservdL(short ip65504P956ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P956ReservdL,IP_65504_P_956_RESERVD_L_LEN)
                  ,beginIp65504P956ReservdL
                  ,IP_65504_P_956_RESERVD_L_LEN
                 );
            localIp65504P956ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P956ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P956ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P956ReservdL() {	 
			return (getShort(beginIp65504P956ReservdL));
   	}
         int localIp65504P957ReservdSCounter = -1;
         public boolean isIp65504P957ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P957ReservdSCounter != sharedCounter;
            localIp65504P957ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_957_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P957ReservdS
	 */
	protected void serializeIp65504P957ReservdS(short ip65504P957ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P957ReservdS,IP_65504_P_957_RESERVD_S_LEN)
                  ,beginIp65504P957ReservdS
                  ,IP_65504_P_957_RESERVD_S_LEN
                 );
            localIp65504P957ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P957ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P957ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P957ReservdS() {	 
			return (getShort(beginIp65504P957ReservdS));
   	}
         int localIp65504P957ReservdLCounter = -1;
         public boolean isIp65504P957ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P957ReservdLCounter != sharedCounter;
            localIp65504P957ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_957_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P957ReservdL
	 */
	protected void serializeIp65504P957ReservdL(short ip65504P957ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P957ReservdL,IP_65504_P_957_RESERVD_L_LEN)
                  ,beginIp65504P957ReservdL
                  ,IP_65504_P_957_RESERVD_L_LEN
                 );
            localIp65504P957ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P957ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P957ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P957ReservdL() {	 
			return (getShort(beginIp65504P957ReservdL));
   	}
         int localIp65504P958ReservdSCounter = -1;
         public boolean isIp65504P958ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P958ReservdSCounter != sharedCounter;
            localIp65504P958ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_958_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P958ReservdS
	 */
	protected void serializeIp65504P958ReservdS(short ip65504P958ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P958ReservdS,IP_65504_P_958_RESERVD_S_LEN)
                  ,beginIp65504P958ReservdS
                  ,IP_65504_P_958_RESERVD_S_LEN
                 );
            localIp65504P958ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P958ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P958ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P958ReservdS() {	 
			return (getShort(beginIp65504P958ReservdS));
   	}
         int localIp65504P958ReservdLCounter = -1;
         public boolean isIp65504P958ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P958ReservdLCounter != sharedCounter;
            localIp65504P958ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_958_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P958ReservdL
	 */
	protected void serializeIp65504P958ReservdL(short ip65504P958ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P958ReservdL,IP_65504_P_958_RESERVD_L_LEN)
                  ,beginIp65504P958ReservdL
                  ,IP_65504_P_958_RESERVD_L_LEN
                 );
            localIp65504P958ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P958ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P958ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P958ReservdL() {	 
			return (getShort(beginIp65504P958ReservdL));
   	}
         int localIp65504P959ReservdSCounter = -1;
         public boolean isIp65504P959ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P959ReservdSCounter != sharedCounter;
            localIp65504P959ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_959_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P959ReservdS
	 */
	protected void serializeIp65504P959ReservdS(short ip65504P959ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P959ReservdS,IP_65504_P_959_RESERVD_S_LEN)
                  ,beginIp65504P959ReservdS
                  ,IP_65504_P_959_RESERVD_S_LEN
                 );
            localIp65504P959ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P959ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P959ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P959ReservdS() {	 
			return (getShort(beginIp65504P959ReservdS));
   	}
         int localIp65504P959ReservdLCounter = -1;
         public boolean isIp65504P959ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P959ReservdLCounter != sharedCounter;
            localIp65504P959ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_959_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P959ReservdL
	 */
	protected void serializeIp65504P959ReservdL(short ip65504P959ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P959ReservdL,IP_65504_P_959_RESERVD_L_LEN)
                  ,beginIp65504P959ReservdL
                  ,IP_65504_P_959_RESERVD_L_LEN
                 );
            localIp65504P959ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P959ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P959ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P959ReservdL() {	 
			return (getShort(beginIp65504P959ReservdL));
   	}
         int localIp65504P960ReservdSCounter = -1;
         public boolean isIp65504P960ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P960ReservdSCounter != sharedCounter;
            localIp65504P960ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_960_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P960ReservdS
	 */
	protected void serializeIp65504P960ReservdS(short ip65504P960ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P960ReservdS,IP_65504_P_960_RESERVD_S_LEN)
                  ,beginIp65504P960ReservdS
                  ,IP_65504_P_960_RESERVD_S_LEN
                 );
            localIp65504P960ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P960ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P960ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P960ReservdS() {	 
			return (getShort(beginIp65504P960ReservdS));
   	}
         int localIp65504P960ReservdLCounter = -1;
         public boolean isIp65504P960ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P960ReservdLCounter != sharedCounter;
            localIp65504P960ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_960_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P960ReservdL
	 */
	protected void serializeIp65504P960ReservdL(short ip65504P960ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P960ReservdL,IP_65504_P_960_RESERVD_L_LEN)
                  ,beginIp65504P960ReservdL
                  ,IP_65504_P_960_RESERVD_L_LEN
                 );
            localIp65504P960ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P960ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P960ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P960ReservdL() {	 
			return (getShort(beginIp65504P960ReservdL));
   	}
         int localIp65504P961ReservdSCounter = -1;
         public boolean isIp65504P961ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P961ReservdSCounter != sharedCounter;
            localIp65504P961ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_961_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P961ReservdS
	 */
	protected void serializeIp65504P961ReservdS(short ip65504P961ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P961ReservdS,IP_65504_P_961_RESERVD_S_LEN)
                  ,beginIp65504P961ReservdS
                  ,IP_65504_P_961_RESERVD_S_LEN
                 );
            localIp65504P961ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P961ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P961ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P961ReservdS() {	 
			return (getShort(beginIp65504P961ReservdS));
   	}
         int localIp65504P961ReservdLCounter = -1;
         public boolean isIp65504P961ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P961ReservdLCounter != sharedCounter;
            localIp65504P961ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_961_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P961ReservdL
	 */
	protected void serializeIp65504P961ReservdL(short ip65504P961ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P961ReservdL,IP_65504_P_961_RESERVD_L_LEN)
                  ,beginIp65504P961ReservdL
                  ,IP_65504_P_961_RESERVD_L_LEN
                 );
            localIp65504P961ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P961ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P961ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P961ReservdL() {	 
			return (getShort(beginIp65504P961ReservdL));
   	}




}
  
