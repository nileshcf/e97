package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_14_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P404ReservdS;
            protected  int beginIp65504P404ReservdL;
            protected  int beginIp65504P405ReservdS;
            protected  int beginIp65504P405ReservdL;
            protected  int beginIp65504P406ReservdS;
            protected  int beginIp65504P406ReservdL;
            protected  int beginIp65504P407ReservdS;
            protected  int beginIp65504P407ReservdL;
            protected  int beginIp65504P408ReservdS;
            protected  int beginIp65504P408ReservdL;
            protected  int beginIp65504P409ReservdS;
            protected  int beginIp65504P409ReservdL;
            protected  int beginIp65504P410ReservdS;
            protected  int beginIp65504P410ReservdL;
            protected  int beginIp65504P411ReservdS;
            protected  int beginIp65504P411ReservdL;
            protected  int beginIp65504P412ReservdS;
            protected  int beginIp65504P412ReservdL;
            protected  int beginIp65504P413ReservdS;
            protected  int beginIp65504P413ReservdL;
            protected  int beginIp65504P414ReservdS;
            protected  int beginIp65504P414ReservdL;
            protected  int beginIp65504P415ReservdS;
            protected  int beginIp65504P415ReservdL;
            protected  int beginIp65504P416ReservdS;
            protected  int beginIp65504P416ReservdL;
            protected  int beginIp65504P417ReservdS;
            protected  int beginIp65504P417ReservdL;
            protected  int beginIp65504P418ReservdS;
            protected  int beginIp65504P418ReservdL;
            protected  int beginIp65504P419ReservdS;
            protected  int beginIp65504P419ReservdL;
            protected  int beginIp65504P420ReservdS;
            protected  int beginIp65504P420ReservdL;
            protected  int beginIp65504P421ReservdS;
            protected  int beginIp65504P421ReservdL;
            protected  int beginIp65504P422ReservdS;
            protected  int beginIp65504P422ReservdL;
            protected  int beginIp65504P423ReservdS;
            protected  int beginIp65504P423ReservdL;
            protected  int beginIp65504P424ReservdS;
            protected  int beginIp65504P424ReservdL;
            protected  int beginIp65504P425ReservdS;
            protected  int beginIp65504P425ReservdL;
            protected  int beginIp65504P426ReservdS;
            protected  int beginIp65504P426ReservdL;
            protected  int beginIp65504P427ReservdS;
            protected  int beginIp65504P427ReservdL;
            protected  int beginIp65504P428ReservdS;
            protected  int beginIp65504P428ReservdL;
            protected  int beginIp65504P429ReservdS;
            protected  int beginIp65504P429ReservdL;
            protected  int beginIp65504P430ReservdS;
            protected  int beginIp65504P430ReservdL;
            protected  int beginIp65504P431ReservdS;
            protected  int beginIp65504P431ReservdL;
            protected  int beginIp65504P432ReservdS;
            protected  int beginIp65504P432ReservdL;
            protected  int beginIp65504P433ReservdS;
            protected  int beginIp65504P433ReservdL;
            protected  int beginIp65504P434ReservdS;
            protected  int beginIp65504P434ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup14Serialized
	**/
    public Ip65504PdsNamesLargeGroup14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3220); // serialize this field at offset 3220 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3220 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P404ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P404ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P405ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P405ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P406ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P406ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P407ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P407ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P408ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P408ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P409ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P409ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P410ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P410ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P411ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P411ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P412ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P412ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P413ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P413ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P414ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P414ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P415ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P415ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P416ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P416ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P417ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P417ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P418ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P418ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P419ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P419ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P420ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P420ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P421ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P421ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P422ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P422ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P423ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P423ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P424ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P424ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P425ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P425ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P426ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P426ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P427ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P427ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P428ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P428ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P429ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P429ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P430ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P430ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P431ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P431ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P432ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P432ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P433ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P433ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P434ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P434ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P404ReservdSCounter = -1;
         public boolean isIp65504P404ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P404ReservdSCounter != sharedCounter;
            localIp65504P404ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_404_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P404ReservdS
	 */
	protected void serializeIp65504P404ReservdS(short ip65504P404ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P404ReservdS,IP_65504_P_404_RESERVD_S_LEN)
                  ,beginIp65504P404ReservdS
                  ,IP_65504_P_404_RESERVD_S_LEN
                 );
            localIp65504P404ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P404ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P404ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P404ReservdS() {	 
			return (getShort(beginIp65504P404ReservdS));
   	}
         int localIp65504P404ReservdLCounter = -1;
         public boolean isIp65504P404ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P404ReservdLCounter != sharedCounter;
            localIp65504P404ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_404_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P404ReservdL
	 */
	protected void serializeIp65504P404ReservdL(short ip65504P404ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P404ReservdL,IP_65504_P_404_RESERVD_L_LEN)
                  ,beginIp65504P404ReservdL
                  ,IP_65504_P_404_RESERVD_L_LEN
                 );
            localIp65504P404ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P404ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P404ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P404ReservdL() {	 
			return (getShort(beginIp65504P404ReservdL));
   	}
         int localIp65504P405ReservdSCounter = -1;
         public boolean isIp65504P405ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P405ReservdSCounter != sharedCounter;
            localIp65504P405ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_405_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P405ReservdS
	 */
	protected void serializeIp65504P405ReservdS(short ip65504P405ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P405ReservdS,IP_65504_P_405_RESERVD_S_LEN)
                  ,beginIp65504P405ReservdS
                  ,IP_65504_P_405_RESERVD_S_LEN
                 );
            localIp65504P405ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P405ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P405ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P405ReservdS() {	 
			return (getShort(beginIp65504P405ReservdS));
   	}
         int localIp65504P405ReservdLCounter = -1;
         public boolean isIp65504P405ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P405ReservdLCounter != sharedCounter;
            localIp65504P405ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_405_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P405ReservdL
	 */
	protected void serializeIp65504P405ReservdL(short ip65504P405ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P405ReservdL,IP_65504_P_405_RESERVD_L_LEN)
                  ,beginIp65504P405ReservdL
                  ,IP_65504_P_405_RESERVD_L_LEN
                 );
            localIp65504P405ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P405ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P405ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P405ReservdL() {	 
			return (getShort(beginIp65504P405ReservdL));
   	}
         int localIp65504P406ReservdSCounter = -1;
         public boolean isIp65504P406ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P406ReservdSCounter != sharedCounter;
            localIp65504P406ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_406_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P406ReservdS
	 */
	protected void serializeIp65504P406ReservdS(short ip65504P406ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P406ReservdS,IP_65504_P_406_RESERVD_S_LEN)
                  ,beginIp65504P406ReservdS
                  ,IP_65504_P_406_RESERVD_S_LEN
                 );
            localIp65504P406ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P406ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P406ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P406ReservdS() {	 
			return (getShort(beginIp65504P406ReservdS));
   	}
         int localIp65504P406ReservdLCounter = -1;
         public boolean isIp65504P406ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P406ReservdLCounter != sharedCounter;
            localIp65504P406ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_406_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P406ReservdL
	 */
	protected void serializeIp65504P406ReservdL(short ip65504P406ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P406ReservdL,IP_65504_P_406_RESERVD_L_LEN)
                  ,beginIp65504P406ReservdL
                  ,IP_65504_P_406_RESERVD_L_LEN
                 );
            localIp65504P406ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P406ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P406ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P406ReservdL() {	 
			return (getShort(beginIp65504P406ReservdL));
   	}
         int localIp65504P407ReservdSCounter = -1;
         public boolean isIp65504P407ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P407ReservdSCounter != sharedCounter;
            localIp65504P407ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_407_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P407ReservdS
	 */
	protected void serializeIp65504P407ReservdS(short ip65504P407ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P407ReservdS,IP_65504_P_407_RESERVD_S_LEN)
                  ,beginIp65504P407ReservdS
                  ,IP_65504_P_407_RESERVD_S_LEN
                 );
            localIp65504P407ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P407ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P407ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P407ReservdS() {	 
			return (getShort(beginIp65504P407ReservdS));
   	}
         int localIp65504P407ReservdLCounter = -1;
         public boolean isIp65504P407ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P407ReservdLCounter != sharedCounter;
            localIp65504P407ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_407_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P407ReservdL
	 */
	protected void serializeIp65504P407ReservdL(short ip65504P407ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P407ReservdL,IP_65504_P_407_RESERVD_L_LEN)
                  ,beginIp65504P407ReservdL
                  ,IP_65504_P_407_RESERVD_L_LEN
                 );
            localIp65504P407ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P407ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P407ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P407ReservdL() {	 
			return (getShort(beginIp65504P407ReservdL));
   	}
         int localIp65504P408ReservdSCounter = -1;
         public boolean isIp65504P408ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P408ReservdSCounter != sharedCounter;
            localIp65504P408ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_408_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P408ReservdS
	 */
	protected void serializeIp65504P408ReservdS(short ip65504P408ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P408ReservdS,IP_65504_P_408_RESERVD_S_LEN)
                  ,beginIp65504P408ReservdS
                  ,IP_65504_P_408_RESERVD_S_LEN
                 );
            localIp65504P408ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P408ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P408ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P408ReservdS() {	 
			return (getShort(beginIp65504P408ReservdS));
   	}
         int localIp65504P408ReservdLCounter = -1;
         public boolean isIp65504P408ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P408ReservdLCounter != sharedCounter;
            localIp65504P408ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_408_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P408ReservdL
	 */
	protected void serializeIp65504P408ReservdL(short ip65504P408ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P408ReservdL,IP_65504_P_408_RESERVD_L_LEN)
                  ,beginIp65504P408ReservdL
                  ,IP_65504_P_408_RESERVD_L_LEN
                 );
            localIp65504P408ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P408ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P408ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P408ReservdL() {	 
			return (getShort(beginIp65504P408ReservdL));
   	}
         int localIp65504P409ReservdSCounter = -1;
         public boolean isIp65504P409ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P409ReservdSCounter != sharedCounter;
            localIp65504P409ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_409_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P409ReservdS
	 */
	protected void serializeIp65504P409ReservdS(short ip65504P409ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P409ReservdS,IP_65504_P_409_RESERVD_S_LEN)
                  ,beginIp65504P409ReservdS
                  ,IP_65504_P_409_RESERVD_S_LEN
                 );
            localIp65504P409ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P409ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P409ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P409ReservdS() {	 
			return (getShort(beginIp65504P409ReservdS));
   	}
         int localIp65504P409ReservdLCounter = -1;
         public boolean isIp65504P409ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P409ReservdLCounter != sharedCounter;
            localIp65504P409ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_409_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P409ReservdL
	 */
	protected void serializeIp65504P409ReservdL(short ip65504P409ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P409ReservdL,IP_65504_P_409_RESERVD_L_LEN)
                  ,beginIp65504P409ReservdL
                  ,IP_65504_P_409_RESERVD_L_LEN
                 );
            localIp65504P409ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P409ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P409ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P409ReservdL() {	 
			return (getShort(beginIp65504P409ReservdL));
   	}
         int localIp65504P410ReservdSCounter = -1;
         public boolean isIp65504P410ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P410ReservdSCounter != sharedCounter;
            localIp65504P410ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_410_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P410ReservdS
	 */
	protected void serializeIp65504P410ReservdS(short ip65504P410ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P410ReservdS,IP_65504_P_410_RESERVD_S_LEN)
                  ,beginIp65504P410ReservdS
                  ,IP_65504_P_410_RESERVD_S_LEN
                 );
            localIp65504P410ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P410ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P410ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P410ReservdS() {	 
			return (getShort(beginIp65504P410ReservdS));
   	}
         int localIp65504P410ReservdLCounter = -1;
         public boolean isIp65504P410ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P410ReservdLCounter != sharedCounter;
            localIp65504P410ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_410_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P410ReservdL
	 */
	protected void serializeIp65504P410ReservdL(short ip65504P410ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P410ReservdL,IP_65504_P_410_RESERVD_L_LEN)
                  ,beginIp65504P410ReservdL
                  ,IP_65504_P_410_RESERVD_L_LEN
                 );
            localIp65504P410ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P410ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P410ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P410ReservdL() {	 
			return (getShort(beginIp65504P410ReservdL));
   	}
         int localIp65504P411ReservdSCounter = -1;
         public boolean isIp65504P411ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P411ReservdSCounter != sharedCounter;
            localIp65504P411ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_411_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P411ReservdS
	 */
	protected void serializeIp65504P411ReservdS(short ip65504P411ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P411ReservdS,IP_65504_P_411_RESERVD_S_LEN)
                  ,beginIp65504P411ReservdS
                  ,IP_65504_P_411_RESERVD_S_LEN
                 );
            localIp65504P411ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P411ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P411ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P411ReservdS() {	 
			return (getShort(beginIp65504P411ReservdS));
   	}
         int localIp65504P411ReservdLCounter = -1;
         public boolean isIp65504P411ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P411ReservdLCounter != sharedCounter;
            localIp65504P411ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_411_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P411ReservdL
	 */
	protected void serializeIp65504P411ReservdL(short ip65504P411ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P411ReservdL,IP_65504_P_411_RESERVD_L_LEN)
                  ,beginIp65504P411ReservdL
                  ,IP_65504_P_411_RESERVD_L_LEN
                 );
            localIp65504P411ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P411ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P411ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P411ReservdL() {	 
			return (getShort(beginIp65504P411ReservdL));
   	}
         int localIp65504P412ReservdSCounter = -1;
         public boolean isIp65504P412ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P412ReservdSCounter != sharedCounter;
            localIp65504P412ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_412_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P412ReservdS
	 */
	protected void serializeIp65504P412ReservdS(short ip65504P412ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P412ReservdS,IP_65504_P_412_RESERVD_S_LEN)
                  ,beginIp65504P412ReservdS
                  ,IP_65504_P_412_RESERVD_S_LEN
                 );
            localIp65504P412ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P412ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P412ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P412ReservdS() {	 
			return (getShort(beginIp65504P412ReservdS));
   	}
         int localIp65504P412ReservdLCounter = -1;
         public boolean isIp65504P412ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P412ReservdLCounter != sharedCounter;
            localIp65504P412ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_412_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P412ReservdL
	 */
	protected void serializeIp65504P412ReservdL(short ip65504P412ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P412ReservdL,IP_65504_P_412_RESERVD_L_LEN)
                  ,beginIp65504P412ReservdL
                  ,IP_65504_P_412_RESERVD_L_LEN
                 );
            localIp65504P412ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P412ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P412ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P412ReservdL() {	 
			return (getShort(beginIp65504P412ReservdL));
   	}
         int localIp65504P413ReservdSCounter = -1;
         public boolean isIp65504P413ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P413ReservdSCounter != sharedCounter;
            localIp65504P413ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_413_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P413ReservdS
	 */
	protected void serializeIp65504P413ReservdS(short ip65504P413ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P413ReservdS,IP_65504_P_413_RESERVD_S_LEN)
                  ,beginIp65504P413ReservdS
                  ,IP_65504_P_413_RESERVD_S_LEN
                 );
            localIp65504P413ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P413ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P413ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P413ReservdS() {	 
			return (getShort(beginIp65504P413ReservdS));
   	}
         int localIp65504P413ReservdLCounter = -1;
         public boolean isIp65504P413ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P413ReservdLCounter != sharedCounter;
            localIp65504P413ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_413_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P413ReservdL
	 */
	protected void serializeIp65504P413ReservdL(short ip65504P413ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P413ReservdL,IP_65504_P_413_RESERVD_L_LEN)
                  ,beginIp65504P413ReservdL
                  ,IP_65504_P_413_RESERVD_L_LEN
                 );
            localIp65504P413ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P413ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P413ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P413ReservdL() {	 
			return (getShort(beginIp65504P413ReservdL));
   	}
         int localIp65504P414ReservdSCounter = -1;
         public boolean isIp65504P414ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P414ReservdSCounter != sharedCounter;
            localIp65504P414ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_414_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P414ReservdS
	 */
	protected void serializeIp65504P414ReservdS(short ip65504P414ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P414ReservdS,IP_65504_P_414_RESERVD_S_LEN)
                  ,beginIp65504P414ReservdS
                  ,IP_65504_P_414_RESERVD_S_LEN
                 );
            localIp65504P414ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P414ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P414ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P414ReservdS() {	 
			return (getShort(beginIp65504P414ReservdS));
   	}
         int localIp65504P414ReservdLCounter = -1;
         public boolean isIp65504P414ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P414ReservdLCounter != sharedCounter;
            localIp65504P414ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_414_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P414ReservdL
	 */
	protected void serializeIp65504P414ReservdL(short ip65504P414ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P414ReservdL,IP_65504_P_414_RESERVD_L_LEN)
                  ,beginIp65504P414ReservdL
                  ,IP_65504_P_414_RESERVD_L_LEN
                 );
            localIp65504P414ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P414ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P414ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P414ReservdL() {	 
			return (getShort(beginIp65504P414ReservdL));
   	}
         int localIp65504P415ReservdSCounter = -1;
         public boolean isIp65504P415ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P415ReservdSCounter != sharedCounter;
            localIp65504P415ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_415_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P415ReservdS
	 */
	protected void serializeIp65504P415ReservdS(short ip65504P415ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P415ReservdS,IP_65504_P_415_RESERVD_S_LEN)
                  ,beginIp65504P415ReservdS
                  ,IP_65504_P_415_RESERVD_S_LEN
                 );
            localIp65504P415ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P415ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P415ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P415ReservdS() {	 
			return (getShort(beginIp65504P415ReservdS));
   	}
         int localIp65504P415ReservdLCounter = -1;
         public boolean isIp65504P415ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P415ReservdLCounter != sharedCounter;
            localIp65504P415ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_415_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P415ReservdL
	 */
	protected void serializeIp65504P415ReservdL(short ip65504P415ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P415ReservdL,IP_65504_P_415_RESERVD_L_LEN)
                  ,beginIp65504P415ReservdL
                  ,IP_65504_P_415_RESERVD_L_LEN
                 );
            localIp65504P415ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P415ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P415ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P415ReservdL() {	 
			return (getShort(beginIp65504P415ReservdL));
   	}
         int localIp65504P416ReservdSCounter = -1;
         public boolean isIp65504P416ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P416ReservdSCounter != sharedCounter;
            localIp65504P416ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_416_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P416ReservdS
	 */
	protected void serializeIp65504P416ReservdS(short ip65504P416ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P416ReservdS,IP_65504_P_416_RESERVD_S_LEN)
                  ,beginIp65504P416ReservdS
                  ,IP_65504_P_416_RESERVD_S_LEN
                 );
            localIp65504P416ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P416ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P416ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P416ReservdS() {	 
			return (getShort(beginIp65504P416ReservdS));
   	}
         int localIp65504P416ReservdLCounter = -1;
         public boolean isIp65504P416ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P416ReservdLCounter != sharedCounter;
            localIp65504P416ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_416_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P416ReservdL
	 */
	protected void serializeIp65504P416ReservdL(short ip65504P416ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P416ReservdL,IP_65504_P_416_RESERVD_L_LEN)
                  ,beginIp65504P416ReservdL
                  ,IP_65504_P_416_RESERVD_L_LEN
                 );
            localIp65504P416ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P416ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P416ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P416ReservdL() {	 
			return (getShort(beginIp65504P416ReservdL));
   	}
         int localIp65504P417ReservdSCounter = -1;
         public boolean isIp65504P417ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P417ReservdSCounter != sharedCounter;
            localIp65504P417ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_417_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P417ReservdS
	 */
	protected void serializeIp65504P417ReservdS(short ip65504P417ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P417ReservdS,IP_65504_P_417_RESERVD_S_LEN)
                  ,beginIp65504P417ReservdS
                  ,IP_65504_P_417_RESERVD_S_LEN
                 );
            localIp65504P417ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P417ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P417ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P417ReservdS() {	 
			return (getShort(beginIp65504P417ReservdS));
   	}
         int localIp65504P417ReservdLCounter = -1;
         public boolean isIp65504P417ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P417ReservdLCounter != sharedCounter;
            localIp65504P417ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_417_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P417ReservdL
	 */
	protected void serializeIp65504P417ReservdL(short ip65504P417ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P417ReservdL,IP_65504_P_417_RESERVD_L_LEN)
                  ,beginIp65504P417ReservdL
                  ,IP_65504_P_417_RESERVD_L_LEN
                 );
            localIp65504P417ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P417ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P417ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P417ReservdL() {	 
			return (getShort(beginIp65504P417ReservdL));
   	}
         int localIp65504P418ReservdSCounter = -1;
         public boolean isIp65504P418ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P418ReservdSCounter != sharedCounter;
            localIp65504P418ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_418_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P418ReservdS
	 */
	protected void serializeIp65504P418ReservdS(short ip65504P418ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P418ReservdS,IP_65504_P_418_RESERVD_S_LEN)
                  ,beginIp65504P418ReservdS
                  ,IP_65504_P_418_RESERVD_S_LEN
                 );
            localIp65504P418ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P418ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P418ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P418ReservdS() {	 
			return (getShort(beginIp65504P418ReservdS));
   	}
         int localIp65504P418ReservdLCounter = -1;
         public boolean isIp65504P418ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P418ReservdLCounter != sharedCounter;
            localIp65504P418ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_418_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P418ReservdL
	 */
	protected void serializeIp65504P418ReservdL(short ip65504P418ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P418ReservdL,IP_65504_P_418_RESERVD_L_LEN)
                  ,beginIp65504P418ReservdL
                  ,IP_65504_P_418_RESERVD_L_LEN
                 );
            localIp65504P418ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P418ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P418ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P418ReservdL() {	 
			return (getShort(beginIp65504P418ReservdL));
   	}
         int localIp65504P419ReservdSCounter = -1;
         public boolean isIp65504P419ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P419ReservdSCounter != sharedCounter;
            localIp65504P419ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_419_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P419ReservdS
	 */
	protected void serializeIp65504P419ReservdS(short ip65504P419ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P419ReservdS,IP_65504_P_419_RESERVD_S_LEN)
                  ,beginIp65504P419ReservdS
                  ,IP_65504_P_419_RESERVD_S_LEN
                 );
            localIp65504P419ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P419ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P419ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P419ReservdS() {	 
			return (getShort(beginIp65504P419ReservdS));
   	}
         int localIp65504P419ReservdLCounter = -1;
         public boolean isIp65504P419ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P419ReservdLCounter != sharedCounter;
            localIp65504P419ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_419_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P419ReservdL
	 */
	protected void serializeIp65504P419ReservdL(short ip65504P419ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P419ReservdL,IP_65504_P_419_RESERVD_L_LEN)
                  ,beginIp65504P419ReservdL
                  ,IP_65504_P_419_RESERVD_L_LEN
                 );
            localIp65504P419ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P419ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P419ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P419ReservdL() {	 
			return (getShort(beginIp65504P419ReservdL));
   	}
         int localIp65504P420ReservdSCounter = -1;
         public boolean isIp65504P420ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P420ReservdSCounter != sharedCounter;
            localIp65504P420ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_420_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P420ReservdS
	 */
	protected void serializeIp65504P420ReservdS(short ip65504P420ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P420ReservdS,IP_65504_P_420_RESERVD_S_LEN)
                  ,beginIp65504P420ReservdS
                  ,IP_65504_P_420_RESERVD_S_LEN
                 );
            localIp65504P420ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P420ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P420ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P420ReservdS() {	 
			return (getShort(beginIp65504P420ReservdS));
   	}
         int localIp65504P420ReservdLCounter = -1;
         public boolean isIp65504P420ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P420ReservdLCounter != sharedCounter;
            localIp65504P420ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_420_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P420ReservdL
	 */
	protected void serializeIp65504P420ReservdL(short ip65504P420ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P420ReservdL,IP_65504_P_420_RESERVD_L_LEN)
                  ,beginIp65504P420ReservdL
                  ,IP_65504_P_420_RESERVD_L_LEN
                 );
            localIp65504P420ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P420ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P420ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P420ReservdL() {	 
			return (getShort(beginIp65504P420ReservdL));
   	}
         int localIp65504P421ReservdSCounter = -1;
         public boolean isIp65504P421ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P421ReservdSCounter != sharedCounter;
            localIp65504P421ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_421_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P421ReservdS
	 */
	protected void serializeIp65504P421ReservdS(short ip65504P421ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P421ReservdS,IP_65504_P_421_RESERVD_S_LEN)
                  ,beginIp65504P421ReservdS
                  ,IP_65504_P_421_RESERVD_S_LEN
                 );
            localIp65504P421ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P421ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P421ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P421ReservdS() {	 
			return (getShort(beginIp65504P421ReservdS));
   	}
         int localIp65504P421ReservdLCounter = -1;
         public boolean isIp65504P421ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P421ReservdLCounter != sharedCounter;
            localIp65504P421ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_421_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P421ReservdL
	 */
	protected void serializeIp65504P421ReservdL(short ip65504P421ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P421ReservdL,IP_65504_P_421_RESERVD_L_LEN)
                  ,beginIp65504P421ReservdL
                  ,IP_65504_P_421_RESERVD_L_LEN
                 );
            localIp65504P421ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P421ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P421ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P421ReservdL() {	 
			return (getShort(beginIp65504P421ReservdL));
   	}
         int localIp65504P422ReservdSCounter = -1;
         public boolean isIp65504P422ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P422ReservdSCounter != sharedCounter;
            localIp65504P422ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_422_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P422ReservdS
	 */
	protected void serializeIp65504P422ReservdS(short ip65504P422ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P422ReservdS,IP_65504_P_422_RESERVD_S_LEN)
                  ,beginIp65504P422ReservdS
                  ,IP_65504_P_422_RESERVD_S_LEN
                 );
            localIp65504P422ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P422ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P422ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P422ReservdS() {	 
			return (getShort(beginIp65504P422ReservdS));
   	}
         int localIp65504P422ReservdLCounter = -1;
         public boolean isIp65504P422ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P422ReservdLCounter != sharedCounter;
            localIp65504P422ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_422_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P422ReservdL
	 */
	protected void serializeIp65504P422ReservdL(short ip65504P422ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P422ReservdL,IP_65504_P_422_RESERVD_L_LEN)
                  ,beginIp65504P422ReservdL
                  ,IP_65504_P_422_RESERVD_L_LEN
                 );
            localIp65504P422ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P422ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P422ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P422ReservdL() {	 
			return (getShort(beginIp65504P422ReservdL));
   	}
         int localIp65504P423ReservdSCounter = -1;
         public boolean isIp65504P423ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P423ReservdSCounter != sharedCounter;
            localIp65504P423ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_423_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P423ReservdS
	 */
	protected void serializeIp65504P423ReservdS(short ip65504P423ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P423ReservdS,IP_65504_P_423_RESERVD_S_LEN)
                  ,beginIp65504P423ReservdS
                  ,IP_65504_P_423_RESERVD_S_LEN
                 );
            localIp65504P423ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P423ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P423ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P423ReservdS() {	 
			return (getShort(beginIp65504P423ReservdS));
   	}
         int localIp65504P423ReservdLCounter = -1;
         public boolean isIp65504P423ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P423ReservdLCounter != sharedCounter;
            localIp65504P423ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_423_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P423ReservdL
	 */
	protected void serializeIp65504P423ReservdL(short ip65504P423ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P423ReservdL,IP_65504_P_423_RESERVD_L_LEN)
                  ,beginIp65504P423ReservdL
                  ,IP_65504_P_423_RESERVD_L_LEN
                 );
            localIp65504P423ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P423ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P423ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P423ReservdL() {	 
			return (getShort(beginIp65504P423ReservdL));
   	}
         int localIp65504P424ReservdSCounter = -1;
         public boolean isIp65504P424ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P424ReservdSCounter != sharedCounter;
            localIp65504P424ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_424_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P424ReservdS
	 */
	protected void serializeIp65504P424ReservdS(short ip65504P424ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P424ReservdS,IP_65504_P_424_RESERVD_S_LEN)
                  ,beginIp65504P424ReservdS
                  ,IP_65504_P_424_RESERVD_S_LEN
                 );
            localIp65504P424ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P424ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P424ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P424ReservdS() {	 
			return (getShort(beginIp65504P424ReservdS));
   	}
         int localIp65504P424ReservdLCounter = -1;
         public boolean isIp65504P424ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P424ReservdLCounter != sharedCounter;
            localIp65504P424ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_424_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P424ReservdL
	 */
	protected void serializeIp65504P424ReservdL(short ip65504P424ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P424ReservdL,IP_65504_P_424_RESERVD_L_LEN)
                  ,beginIp65504P424ReservdL
                  ,IP_65504_P_424_RESERVD_L_LEN
                 );
            localIp65504P424ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P424ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P424ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P424ReservdL() {	 
			return (getShort(beginIp65504P424ReservdL));
   	}
         int localIp65504P425ReservdSCounter = -1;
         public boolean isIp65504P425ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P425ReservdSCounter != sharedCounter;
            localIp65504P425ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_425_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P425ReservdS
	 */
	protected void serializeIp65504P425ReservdS(short ip65504P425ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P425ReservdS,IP_65504_P_425_RESERVD_S_LEN)
                  ,beginIp65504P425ReservdS
                  ,IP_65504_P_425_RESERVD_S_LEN
                 );
            localIp65504P425ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P425ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P425ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P425ReservdS() {	 
			return (getShort(beginIp65504P425ReservdS));
   	}
         int localIp65504P425ReservdLCounter = -1;
         public boolean isIp65504P425ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P425ReservdLCounter != sharedCounter;
            localIp65504P425ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_425_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P425ReservdL
	 */
	protected void serializeIp65504P425ReservdL(short ip65504P425ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P425ReservdL,IP_65504_P_425_RESERVD_L_LEN)
                  ,beginIp65504P425ReservdL
                  ,IP_65504_P_425_RESERVD_L_LEN
                 );
            localIp65504P425ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P425ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P425ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P425ReservdL() {	 
			return (getShort(beginIp65504P425ReservdL));
   	}
         int localIp65504P426ReservdSCounter = -1;
         public boolean isIp65504P426ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P426ReservdSCounter != sharedCounter;
            localIp65504P426ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_426_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P426ReservdS
	 */
	protected void serializeIp65504P426ReservdS(short ip65504P426ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P426ReservdS,IP_65504_P_426_RESERVD_S_LEN)
                  ,beginIp65504P426ReservdS
                  ,IP_65504_P_426_RESERVD_S_LEN
                 );
            localIp65504P426ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P426ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P426ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P426ReservdS() {	 
			return (getShort(beginIp65504P426ReservdS));
   	}
         int localIp65504P426ReservdLCounter = -1;
         public boolean isIp65504P426ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P426ReservdLCounter != sharedCounter;
            localIp65504P426ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_426_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P426ReservdL
	 */
	protected void serializeIp65504P426ReservdL(short ip65504P426ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P426ReservdL,IP_65504_P_426_RESERVD_L_LEN)
                  ,beginIp65504P426ReservdL
                  ,IP_65504_P_426_RESERVD_L_LEN
                 );
            localIp65504P426ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P426ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P426ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P426ReservdL() {	 
			return (getShort(beginIp65504P426ReservdL));
   	}
         int localIp65504P427ReservdSCounter = -1;
         public boolean isIp65504P427ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P427ReservdSCounter != sharedCounter;
            localIp65504P427ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_427_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P427ReservdS
	 */
	protected void serializeIp65504P427ReservdS(short ip65504P427ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P427ReservdS,IP_65504_P_427_RESERVD_S_LEN)
                  ,beginIp65504P427ReservdS
                  ,IP_65504_P_427_RESERVD_S_LEN
                 );
            localIp65504P427ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P427ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P427ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P427ReservdS() {	 
			return (getShort(beginIp65504P427ReservdS));
   	}
         int localIp65504P427ReservdLCounter = -1;
         public boolean isIp65504P427ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P427ReservdLCounter != sharedCounter;
            localIp65504P427ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_427_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P427ReservdL
	 */
	protected void serializeIp65504P427ReservdL(short ip65504P427ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P427ReservdL,IP_65504_P_427_RESERVD_L_LEN)
                  ,beginIp65504P427ReservdL
                  ,IP_65504_P_427_RESERVD_L_LEN
                 );
            localIp65504P427ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P427ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P427ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P427ReservdL() {	 
			return (getShort(beginIp65504P427ReservdL));
   	}
         int localIp65504P428ReservdSCounter = -1;
         public boolean isIp65504P428ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P428ReservdSCounter != sharedCounter;
            localIp65504P428ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_428_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P428ReservdS
	 */
	protected void serializeIp65504P428ReservdS(short ip65504P428ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P428ReservdS,IP_65504_P_428_RESERVD_S_LEN)
                  ,beginIp65504P428ReservdS
                  ,IP_65504_P_428_RESERVD_S_LEN
                 );
            localIp65504P428ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P428ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P428ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P428ReservdS() {	 
			return (getShort(beginIp65504P428ReservdS));
   	}
         int localIp65504P428ReservdLCounter = -1;
         public boolean isIp65504P428ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P428ReservdLCounter != sharedCounter;
            localIp65504P428ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_428_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P428ReservdL
	 */
	protected void serializeIp65504P428ReservdL(short ip65504P428ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P428ReservdL,IP_65504_P_428_RESERVD_L_LEN)
                  ,beginIp65504P428ReservdL
                  ,IP_65504_P_428_RESERVD_L_LEN
                 );
            localIp65504P428ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P428ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P428ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P428ReservdL() {	 
			return (getShort(beginIp65504P428ReservdL));
   	}
         int localIp65504P429ReservdSCounter = -1;
         public boolean isIp65504P429ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P429ReservdSCounter != sharedCounter;
            localIp65504P429ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_429_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P429ReservdS
	 */
	protected void serializeIp65504P429ReservdS(short ip65504P429ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P429ReservdS,IP_65504_P_429_RESERVD_S_LEN)
                  ,beginIp65504P429ReservdS
                  ,IP_65504_P_429_RESERVD_S_LEN
                 );
            localIp65504P429ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P429ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P429ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P429ReservdS() {	 
			return (getShort(beginIp65504P429ReservdS));
   	}
         int localIp65504P429ReservdLCounter = -1;
         public boolean isIp65504P429ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P429ReservdLCounter != sharedCounter;
            localIp65504P429ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_429_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P429ReservdL
	 */
	protected void serializeIp65504P429ReservdL(short ip65504P429ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P429ReservdL,IP_65504_P_429_RESERVD_L_LEN)
                  ,beginIp65504P429ReservdL
                  ,IP_65504_P_429_RESERVD_L_LEN
                 );
            localIp65504P429ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P429ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P429ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P429ReservdL() {	 
			return (getShort(beginIp65504P429ReservdL));
   	}
         int localIp65504P430ReservdSCounter = -1;
         public boolean isIp65504P430ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P430ReservdSCounter != sharedCounter;
            localIp65504P430ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_430_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P430ReservdS
	 */
	protected void serializeIp65504P430ReservdS(short ip65504P430ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P430ReservdS,IP_65504_P_430_RESERVD_S_LEN)
                  ,beginIp65504P430ReservdS
                  ,IP_65504_P_430_RESERVD_S_LEN
                 );
            localIp65504P430ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P430ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P430ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P430ReservdS() {	 
			return (getShort(beginIp65504P430ReservdS));
   	}
         int localIp65504P430ReservdLCounter = -1;
         public boolean isIp65504P430ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P430ReservdLCounter != sharedCounter;
            localIp65504P430ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_430_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P430ReservdL
	 */
	protected void serializeIp65504P430ReservdL(short ip65504P430ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P430ReservdL,IP_65504_P_430_RESERVD_L_LEN)
                  ,beginIp65504P430ReservdL
                  ,IP_65504_P_430_RESERVD_L_LEN
                 );
            localIp65504P430ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P430ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P430ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P430ReservdL() {	 
			return (getShort(beginIp65504P430ReservdL));
   	}
         int localIp65504P431ReservdSCounter = -1;
         public boolean isIp65504P431ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P431ReservdSCounter != sharedCounter;
            localIp65504P431ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_431_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P431ReservdS
	 */
	protected void serializeIp65504P431ReservdS(short ip65504P431ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P431ReservdS,IP_65504_P_431_RESERVD_S_LEN)
                  ,beginIp65504P431ReservdS
                  ,IP_65504_P_431_RESERVD_S_LEN
                 );
            localIp65504P431ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P431ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P431ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P431ReservdS() {	 
			return (getShort(beginIp65504P431ReservdS));
   	}
         int localIp65504P431ReservdLCounter = -1;
         public boolean isIp65504P431ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P431ReservdLCounter != sharedCounter;
            localIp65504P431ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_431_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P431ReservdL
	 */
	protected void serializeIp65504P431ReservdL(short ip65504P431ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P431ReservdL,IP_65504_P_431_RESERVD_L_LEN)
                  ,beginIp65504P431ReservdL
                  ,IP_65504_P_431_RESERVD_L_LEN
                 );
            localIp65504P431ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P431ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P431ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P431ReservdL() {	 
			return (getShort(beginIp65504P431ReservdL));
   	}
         int localIp65504P432ReservdSCounter = -1;
         public boolean isIp65504P432ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P432ReservdSCounter != sharedCounter;
            localIp65504P432ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_432_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P432ReservdS
	 */
	protected void serializeIp65504P432ReservdS(short ip65504P432ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P432ReservdS,IP_65504_P_432_RESERVD_S_LEN)
                  ,beginIp65504P432ReservdS
                  ,IP_65504_P_432_RESERVD_S_LEN
                 );
            localIp65504P432ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P432ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P432ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P432ReservdS() {	 
			return (getShort(beginIp65504P432ReservdS));
   	}
         int localIp65504P432ReservdLCounter = -1;
         public boolean isIp65504P432ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P432ReservdLCounter != sharedCounter;
            localIp65504P432ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_432_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P432ReservdL
	 */
	protected void serializeIp65504P432ReservdL(short ip65504P432ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P432ReservdL,IP_65504_P_432_RESERVD_L_LEN)
                  ,beginIp65504P432ReservdL
                  ,IP_65504_P_432_RESERVD_L_LEN
                 );
            localIp65504P432ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P432ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P432ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P432ReservdL() {	 
			return (getShort(beginIp65504P432ReservdL));
   	}
         int localIp65504P433ReservdSCounter = -1;
         public boolean isIp65504P433ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P433ReservdSCounter != sharedCounter;
            localIp65504P433ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_433_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P433ReservdS
	 */
	protected void serializeIp65504P433ReservdS(short ip65504P433ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P433ReservdS,IP_65504_P_433_RESERVD_S_LEN)
                  ,beginIp65504P433ReservdS
                  ,IP_65504_P_433_RESERVD_S_LEN
                 );
            localIp65504P433ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P433ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P433ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P433ReservdS() {	 
			return (getShort(beginIp65504P433ReservdS));
   	}
         int localIp65504P433ReservdLCounter = -1;
         public boolean isIp65504P433ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P433ReservdLCounter != sharedCounter;
            localIp65504P433ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_433_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P433ReservdL
	 */
	protected void serializeIp65504P433ReservdL(short ip65504P433ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P433ReservdL,IP_65504_P_433_RESERVD_L_LEN)
                  ,beginIp65504P433ReservdL
                  ,IP_65504_P_433_RESERVD_L_LEN
                 );
            localIp65504P433ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P433ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P433ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P433ReservdL() {	 
			return (getShort(beginIp65504P433ReservdL));
   	}
         int localIp65504P434ReservdSCounter = -1;
         public boolean isIp65504P434ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P434ReservdSCounter != sharedCounter;
            localIp65504P434ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_434_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P434ReservdS
	 */
	protected void serializeIp65504P434ReservdS(short ip65504P434ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P434ReservdS,IP_65504_P_434_RESERVD_S_LEN)
                  ,beginIp65504P434ReservdS
                  ,IP_65504_P_434_RESERVD_S_LEN
                 );
            localIp65504P434ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P434ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P434ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P434ReservdS() {	 
			return (getShort(beginIp65504P434ReservdS));
   	}
         int localIp65504P434ReservdLCounter = -1;
         public boolean isIp65504P434ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P434ReservdLCounter != sharedCounter;
            localIp65504P434ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_434_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P434ReservdL
	 */
	protected void serializeIp65504P434ReservdL(short ip65504P434ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P434ReservdL,IP_65504_P_434_RESERVD_L_LEN)
                  ,beginIp65504P434ReservdL
                  ,IP_65504_P_434_RESERVD_L_LEN
                 );
            localIp65504P434ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P434ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P434ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P434ReservdL() {	 
			return (getShort(beginIp65504P434ReservdL));
   	}




}
  
