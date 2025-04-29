package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup44Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup44Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup44Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_44_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1334S;
            protected  int beginIp65504P1334L;
            protected  int beginIp65504P1335S;
            protected  int beginIp65504P1335L;
            protected  int beginIp65504P1336S;
            protected  int beginIp65504P1336L;
            protected  int beginIp65504P1337S;
            protected  int beginIp65504P1337L;
            protected  int beginIp65504P1338S;
            protected  int beginIp65504P1338L;
            protected  int beginIp65504P1339S;
            protected  int beginIp65504P1339L;
            protected  int beginIp65504P1340S;
            protected  int beginIp65504P1340L;
            protected  int beginIp65504P1341S;
            protected  int beginIp65504P1341L;
            protected  int beginIp65504P1342S;
            protected  int beginIp65504P1342L;
            protected  int beginIp65504P1343S;
            protected  int beginIp65504P1343L;
            protected  int beginIp65504P1344S;
            protected  int beginIp65504P1344L;
            protected  int beginIp65504P1345S;
            protected  int beginIp65504P1345L;
            protected  int beginIp65504P1346S;
            protected  int beginIp65504P1346L;
            protected  int beginIp65504P1347S;
            protected  int beginIp65504P1347L;
            protected  int beginIp65504P1348S;
            protected  int beginIp65504P1348L;
            protected  int beginIp65504P1349S;
            protected  int beginIp65504P1349L;
            protected  int beginIp65504P1350S;
            protected  int beginIp65504P1350L;
            protected  int beginIp65504P1351S;
            protected  int beginIp65504P1351L;
            protected  int beginIp65504P1352S;
            protected  int beginIp65504P1352L;
            protected  int beginIp65504P1353S;
            protected  int beginIp65504P1353L;
            protected  int beginIp65504P1354S;
            protected  int beginIp65504P1354L;
            protected  int beginIp65504P1355S;
            protected  int beginIp65504P1355L;
            protected  int beginIp65504P1356S;
            protected  int beginIp65504P1356L;
            protected  int beginIp65504P1357S;
            protected  int beginIp65504P1357L;
            protected  int beginIp65504P1358S;
            protected  int beginIp65504P1358L;
            protected  int beginIp65504P1359S;
            protected  int beginIp65504P1359L;
            protected  int beginIp65504P1360S;
            protected  int beginIp65504P1360L;
            protected  int beginIp65504P1361S;
            protected  int beginIp65504P1361L;
            protected  int beginIp65504P1362S;
            protected  int beginIp65504P1362L;
            protected  int beginIp65504P1363S;
            protected  int beginIp65504P1363L;
            protected  int beginIp65504P1364S;
            protected  int beginIp65504P1364L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup44Serialized
	**/
    public Ip65504PdsNamesLargeGroup44Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup44Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup44Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup44Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10660); // serialize this field at offset 10660 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup44Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10660 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup44Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_44_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1334S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1334L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1335S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1335L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1336S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1336L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1337S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1337L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1338S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1338L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1339S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1339L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1340S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1340L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1341S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1341L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1342S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1342L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1343S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1343L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1344S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1344L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1345S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1345L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1346S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1346L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1347S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1347L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1348S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1348L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1349S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1349L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1350S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1350L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1351S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1351L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1352S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1352L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1353S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1353L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1354S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1354L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1355S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1355L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1356S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1356L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1357S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1357L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1358S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1358L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1359S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1359L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1360S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1360L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1361S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1361L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1362S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1362L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1363S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1363L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1364S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1364L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1334SCounter = -1;
         public boolean isIp65504P1334SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1334SCounter != sharedCounter;
            localIp65504P1334SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1334_S_LEN = 2;
  	/**
	 * serializeIp65504P1334S
	 */
	protected void serializeIp65504P1334S(short ip65504P1334S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1334S,IP_65504_P_1334_S_LEN)
                  ,beginIp65504P1334S
                  ,IP_65504_P_1334_S_LEN
                 );
            localIp65504P1334SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1334SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1334S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1334S() {	 
			return (getShort(beginIp65504P1334S));
   	}
         int localIp65504P1334LCounter = -1;
         public boolean isIp65504P1334LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1334LCounter != sharedCounter;
            localIp65504P1334LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1334_L_LEN = 2;
  	/**
	 * serializeIp65504P1334L
	 */
	protected void serializeIp65504P1334L(short ip65504P1334L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1334L,IP_65504_P_1334_L_LEN)
                  ,beginIp65504P1334L
                  ,IP_65504_P_1334_L_LEN
                 );
            localIp65504P1334LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1334LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1334L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1334L() {	 
			return (getShort(beginIp65504P1334L));
   	}
         int localIp65504P1335SCounter = -1;
         public boolean isIp65504P1335SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1335SCounter != sharedCounter;
            localIp65504P1335SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1335_S_LEN = 2;
  	/**
	 * serializeIp65504P1335S
	 */
	protected void serializeIp65504P1335S(short ip65504P1335S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1335S,IP_65504_P_1335_S_LEN)
                  ,beginIp65504P1335S
                  ,IP_65504_P_1335_S_LEN
                 );
            localIp65504P1335SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1335SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1335S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1335S() {	 
			return (getShort(beginIp65504P1335S));
   	}
         int localIp65504P1335LCounter = -1;
         public boolean isIp65504P1335LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1335LCounter != sharedCounter;
            localIp65504P1335LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1335_L_LEN = 2;
  	/**
	 * serializeIp65504P1335L
	 */
	protected void serializeIp65504P1335L(short ip65504P1335L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1335L,IP_65504_P_1335_L_LEN)
                  ,beginIp65504P1335L
                  ,IP_65504_P_1335_L_LEN
                 );
            localIp65504P1335LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1335LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1335L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1335L() {	 
			return (getShort(beginIp65504P1335L));
   	}
         int localIp65504P1336SCounter = -1;
         public boolean isIp65504P1336SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1336SCounter != sharedCounter;
            localIp65504P1336SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1336_S_LEN = 2;
  	/**
	 * serializeIp65504P1336S
	 */
	protected void serializeIp65504P1336S(short ip65504P1336S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1336S,IP_65504_P_1336_S_LEN)
                  ,beginIp65504P1336S
                  ,IP_65504_P_1336_S_LEN
                 );
            localIp65504P1336SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1336SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1336S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1336S() {	 
			return (getShort(beginIp65504P1336S));
   	}
         int localIp65504P1336LCounter = -1;
         public boolean isIp65504P1336LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1336LCounter != sharedCounter;
            localIp65504P1336LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1336_L_LEN = 2;
  	/**
	 * serializeIp65504P1336L
	 */
	protected void serializeIp65504P1336L(short ip65504P1336L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1336L,IP_65504_P_1336_L_LEN)
                  ,beginIp65504P1336L
                  ,IP_65504_P_1336_L_LEN
                 );
            localIp65504P1336LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1336LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1336L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1336L() {	 
			return (getShort(beginIp65504P1336L));
   	}
         int localIp65504P1337SCounter = -1;
         public boolean isIp65504P1337SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1337SCounter != sharedCounter;
            localIp65504P1337SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1337_S_LEN = 2;
  	/**
	 * serializeIp65504P1337S
	 */
	protected void serializeIp65504P1337S(short ip65504P1337S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1337S,IP_65504_P_1337_S_LEN)
                  ,beginIp65504P1337S
                  ,IP_65504_P_1337_S_LEN
                 );
            localIp65504P1337SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1337SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1337S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1337S() {	 
			return (getShort(beginIp65504P1337S));
   	}
         int localIp65504P1337LCounter = -1;
         public boolean isIp65504P1337LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1337LCounter != sharedCounter;
            localIp65504P1337LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1337_L_LEN = 2;
  	/**
	 * serializeIp65504P1337L
	 */
	protected void serializeIp65504P1337L(short ip65504P1337L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1337L,IP_65504_P_1337_L_LEN)
                  ,beginIp65504P1337L
                  ,IP_65504_P_1337_L_LEN
                 );
            localIp65504P1337LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1337LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1337L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1337L() {	 
			return (getShort(beginIp65504P1337L));
   	}
         int localIp65504P1338SCounter = -1;
         public boolean isIp65504P1338SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1338SCounter != sharedCounter;
            localIp65504P1338SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1338_S_LEN = 2;
  	/**
	 * serializeIp65504P1338S
	 */
	protected void serializeIp65504P1338S(short ip65504P1338S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1338S,IP_65504_P_1338_S_LEN)
                  ,beginIp65504P1338S
                  ,IP_65504_P_1338_S_LEN
                 );
            localIp65504P1338SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1338SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1338S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1338S() {	 
			return (getShort(beginIp65504P1338S));
   	}
         int localIp65504P1338LCounter = -1;
         public boolean isIp65504P1338LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1338LCounter != sharedCounter;
            localIp65504P1338LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1338_L_LEN = 2;
  	/**
	 * serializeIp65504P1338L
	 */
	protected void serializeIp65504P1338L(short ip65504P1338L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1338L,IP_65504_P_1338_L_LEN)
                  ,beginIp65504P1338L
                  ,IP_65504_P_1338_L_LEN
                 );
            localIp65504P1338LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1338LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1338L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1338L() {	 
			return (getShort(beginIp65504P1338L));
   	}
         int localIp65504P1339SCounter = -1;
         public boolean isIp65504P1339SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1339SCounter != sharedCounter;
            localIp65504P1339SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1339_S_LEN = 2;
  	/**
	 * serializeIp65504P1339S
	 */
	protected void serializeIp65504P1339S(short ip65504P1339S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1339S,IP_65504_P_1339_S_LEN)
                  ,beginIp65504P1339S
                  ,IP_65504_P_1339_S_LEN
                 );
            localIp65504P1339SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1339SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1339S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1339S() {	 
			return (getShort(beginIp65504P1339S));
   	}
         int localIp65504P1339LCounter = -1;
         public boolean isIp65504P1339LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1339LCounter != sharedCounter;
            localIp65504P1339LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1339_L_LEN = 2;
  	/**
	 * serializeIp65504P1339L
	 */
	protected void serializeIp65504P1339L(short ip65504P1339L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1339L,IP_65504_P_1339_L_LEN)
                  ,beginIp65504P1339L
                  ,IP_65504_P_1339_L_LEN
                 );
            localIp65504P1339LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1339LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1339L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1339L() {	 
			return (getShort(beginIp65504P1339L));
   	}
         int localIp65504P1340SCounter = -1;
         public boolean isIp65504P1340SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1340SCounter != sharedCounter;
            localIp65504P1340SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1340_S_LEN = 2;
  	/**
	 * serializeIp65504P1340S
	 */
	protected void serializeIp65504P1340S(short ip65504P1340S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1340S,IP_65504_P_1340_S_LEN)
                  ,beginIp65504P1340S
                  ,IP_65504_P_1340_S_LEN
                 );
            localIp65504P1340SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1340SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1340S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1340S() {	 
			return (getShort(beginIp65504P1340S));
   	}
         int localIp65504P1340LCounter = -1;
         public boolean isIp65504P1340LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1340LCounter != sharedCounter;
            localIp65504P1340LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1340_L_LEN = 2;
  	/**
	 * serializeIp65504P1340L
	 */
	protected void serializeIp65504P1340L(short ip65504P1340L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1340L,IP_65504_P_1340_L_LEN)
                  ,beginIp65504P1340L
                  ,IP_65504_P_1340_L_LEN
                 );
            localIp65504P1340LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1340LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1340L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1340L() {	 
			return (getShort(beginIp65504P1340L));
   	}
         int localIp65504P1341SCounter = -1;
         public boolean isIp65504P1341SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1341SCounter != sharedCounter;
            localIp65504P1341SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1341_S_LEN = 2;
  	/**
	 * serializeIp65504P1341S
	 */
	protected void serializeIp65504P1341S(short ip65504P1341S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1341S,IP_65504_P_1341_S_LEN)
                  ,beginIp65504P1341S
                  ,IP_65504_P_1341_S_LEN
                 );
            localIp65504P1341SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1341SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1341S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1341S() {	 
			return (getShort(beginIp65504P1341S));
   	}
         int localIp65504P1341LCounter = -1;
         public boolean isIp65504P1341LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1341LCounter != sharedCounter;
            localIp65504P1341LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1341_L_LEN = 2;
  	/**
	 * serializeIp65504P1341L
	 */
	protected void serializeIp65504P1341L(short ip65504P1341L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1341L,IP_65504_P_1341_L_LEN)
                  ,beginIp65504P1341L
                  ,IP_65504_P_1341_L_LEN
                 );
            localIp65504P1341LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1341LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1341L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1341L() {	 
			return (getShort(beginIp65504P1341L));
   	}
         int localIp65504P1342SCounter = -1;
         public boolean isIp65504P1342SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1342SCounter != sharedCounter;
            localIp65504P1342SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1342_S_LEN = 2;
  	/**
	 * serializeIp65504P1342S
	 */
	protected void serializeIp65504P1342S(short ip65504P1342S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1342S,IP_65504_P_1342_S_LEN)
                  ,beginIp65504P1342S
                  ,IP_65504_P_1342_S_LEN
                 );
            localIp65504P1342SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1342SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1342S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1342S() {	 
			return (getShort(beginIp65504P1342S));
   	}
         int localIp65504P1342LCounter = -1;
         public boolean isIp65504P1342LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1342LCounter != sharedCounter;
            localIp65504P1342LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1342_L_LEN = 2;
  	/**
	 * serializeIp65504P1342L
	 */
	protected void serializeIp65504P1342L(short ip65504P1342L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1342L,IP_65504_P_1342_L_LEN)
                  ,beginIp65504P1342L
                  ,IP_65504_P_1342_L_LEN
                 );
            localIp65504P1342LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1342LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1342L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1342L() {	 
			return (getShort(beginIp65504P1342L));
   	}
         int localIp65504P1343SCounter = -1;
         public boolean isIp65504P1343SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1343SCounter != sharedCounter;
            localIp65504P1343SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1343_S_LEN = 2;
  	/**
	 * serializeIp65504P1343S
	 */
	protected void serializeIp65504P1343S(short ip65504P1343S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1343S,IP_65504_P_1343_S_LEN)
                  ,beginIp65504P1343S
                  ,IP_65504_P_1343_S_LEN
                 );
            localIp65504P1343SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1343SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1343S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1343S() {	 
			return (getShort(beginIp65504P1343S));
   	}
         int localIp65504P1343LCounter = -1;
         public boolean isIp65504P1343LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1343LCounter != sharedCounter;
            localIp65504P1343LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1343_L_LEN = 2;
  	/**
	 * serializeIp65504P1343L
	 */
	protected void serializeIp65504P1343L(short ip65504P1343L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1343L,IP_65504_P_1343_L_LEN)
                  ,beginIp65504P1343L
                  ,IP_65504_P_1343_L_LEN
                 );
            localIp65504P1343LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1343LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1343L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1343L() {	 
			return (getShort(beginIp65504P1343L));
   	}
         int localIp65504P1344SCounter = -1;
         public boolean isIp65504P1344SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1344SCounter != sharedCounter;
            localIp65504P1344SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1344_S_LEN = 2;
  	/**
	 * serializeIp65504P1344S
	 */
	protected void serializeIp65504P1344S(short ip65504P1344S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1344S,IP_65504_P_1344_S_LEN)
                  ,beginIp65504P1344S
                  ,IP_65504_P_1344_S_LEN
                 );
            localIp65504P1344SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1344SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1344S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1344S() {	 
			return (getShort(beginIp65504P1344S));
   	}
         int localIp65504P1344LCounter = -1;
         public boolean isIp65504P1344LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1344LCounter != sharedCounter;
            localIp65504P1344LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1344_L_LEN = 2;
  	/**
	 * serializeIp65504P1344L
	 */
	protected void serializeIp65504P1344L(short ip65504P1344L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1344L,IP_65504_P_1344_L_LEN)
                  ,beginIp65504P1344L
                  ,IP_65504_P_1344_L_LEN
                 );
            localIp65504P1344LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1344LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1344L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1344L() {	 
			return (getShort(beginIp65504P1344L));
   	}
         int localIp65504P1345SCounter = -1;
         public boolean isIp65504P1345SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1345SCounter != sharedCounter;
            localIp65504P1345SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1345_S_LEN = 2;
  	/**
	 * serializeIp65504P1345S
	 */
	protected void serializeIp65504P1345S(short ip65504P1345S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1345S,IP_65504_P_1345_S_LEN)
                  ,beginIp65504P1345S
                  ,IP_65504_P_1345_S_LEN
                 );
            localIp65504P1345SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1345SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1345S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1345S() {	 
			return (getShort(beginIp65504P1345S));
   	}
         int localIp65504P1345LCounter = -1;
         public boolean isIp65504P1345LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1345LCounter != sharedCounter;
            localIp65504P1345LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1345_L_LEN = 2;
  	/**
	 * serializeIp65504P1345L
	 */
	protected void serializeIp65504P1345L(short ip65504P1345L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1345L,IP_65504_P_1345_L_LEN)
                  ,beginIp65504P1345L
                  ,IP_65504_P_1345_L_LEN
                 );
            localIp65504P1345LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1345LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1345L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1345L() {	 
			return (getShort(beginIp65504P1345L));
   	}
         int localIp65504P1346SCounter = -1;
         public boolean isIp65504P1346SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1346SCounter != sharedCounter;
            localIp65504P1346SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1346_S_LEN = 2;
  	/**
	 * serializeIp65504P1346S
	 */
	protected void serializeIp65504P1346S(short ip65504P1346S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1346S,IP_65504_P_1346_S_LEN)
                  ,beginIp65504P1346S
                  ,IP_65504_P_1346_S_LEN
                 );
            localIp65504P1346SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1346SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1346S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1346S() {	 
			return (getShort(beginIp65504P1346S));
   	}
         int localIp65504P1346LCounter = -1;
         public boolean isIp65504P1346LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1346LCounter != sharedCounter;
            localIp65504P1346LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1346_L_LEN = 2;
  	/**
	 * serializeIp65504P1346L
	 */
	protected void serializeIp65504P1346L(short ip65504P1346L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1346L,IP_65504_P_1346_L_LEN)
                  ,beginIp65504P1346L
                  ,IP_65504_P_1346_L_LEN
                 );
            localIp65504P1346LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1346LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1346L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1346L() {	 
			return (getShort(beginIp65504P1346L));
   	}
         int localIp65504P1347SCounter = -1;
         public boolean isIp65504P1347SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1347SCounter != sharedCounter;
            localIp65504P1347SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1347_S_LEN = 2;
  	/**
	 * serializeIp65504P1347S
	 */
	protected void serializeIp65504P1347S(short ip65504P1347S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1347S,IP_65504_P_1347_S_LEN)
                  ,beginIp65504P1347S
                  ,IP_65504_P_1347_S_LEN
                 );
            localIp65504P1347SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1347SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1347S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1347S() {	 
			return (getShort(beginIp65504P1347S));
   	}
         int localIp65504P1347LCounter = -1;
         public boolean isIp65504P1347LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1347LCounter != sharedCounter;
            localIp65504P1347LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1347_L_LEN = 2;
  	/**
	 * serializeIp65504P1347L
	 */
	protected void serializeIp65504P1347L(short ip65504P1347L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1347L,IP_65504_P_1347_L_LEN)
                  ,beginIp65504P1347L
                  ,IP_65504_P_1347_L_LEN
                 );
            localIp65504P1347LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1347LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1347L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1347L() {	 
			return (getShort(beginIp65504P1347L));
   	}
         int localIp65504P1348SCounter = -1;
         public boolean isIp65504P1348SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1348SCounter != sharedCounter;
            localIp65504P1348SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1348_S_LEN = 2;
  	/**
	 * serializeIp65504P1348S
	 */
	protected void serializeIp65504P1348S(short ip65504P1348S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1348S,IP_65504_P_1348_S_LEN)
                  ,beginIp65504P1348S
                  ,IP_65504_P_1348_S_LEN
                 );
            localIp65504P1348SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1348SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1348S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1348S() {	 
			return (getShort(beginIp65504P1348S));
   	}
         int localIp65504P1348LCounter = -1;
         public boolean isIp65504P1348LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1348LCounter != sharedCounter;
            localIp65504P1348LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1348_L_LEN = 2;
  	/**
	 * serializeIp65504P1348L
	 */
	protected void serializeIp65504P1348L(short ip65504P1348L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1348L,IP_65504_P_1348_L_LEN)
                  ,beginIp65504P1348L
                  ,IP_65504_P_1348_L_LEN
                 );
            localIp65504P1348LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1348LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1348L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1348L() {	 
			return (getShort(beginIp65504P1348L));
   	}
         int localIp65504P1349SCounter = -1;
         public boolean isIp65504P1349SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1349SCounter != sharedCounter;
            localIp65504P1349SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1349_S_LEN = 2;
  	/**
	 * serializeIp65504P1349S
	 */
	protected void serializeIp65504P1349S(short ip65504P1349S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1349S,IP_65504_P_1349_S_LEN)
                  ,beginIp65504P1349S
                  ,IP_65504_P_1349_S_LEN
                 );
            localIp65504P1349SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1349SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1349S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1349S() {	 
			return (getShort(beginIp65504P1349S));
   	}
         int localIp65504P1349LCounter = -1;
         public boolean isIp65504P1349LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1349LCounter != sharedCounter;
            localIp65504P1349LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1349_L_LEN = 2;
  	/**
	 * serializeIp65504P1349L
	 */
	protected void serializeIp65504P1349L(short ip65504P1349L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1349L,IP_65504_P_1349_L_LEN)
                  ,beginIp65504P1349L
                  ,IP_65504_P_1349_L_LEN
                 );
            localIp65504P1349LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1349LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1349L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1349L() {	 
			return (getShort(beginIp65504P1349L));
   	}
         int localIp65504P1350SCounter = -1;
         public boolean isIp65504P1350SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1350SCounter != sharedCounter;
            localIp65504P1350SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1350_S_LEN = 2;
  	/**
	 * serializeIp65504P1350S
	 */
	protected void serializeIp65504P1350S(short ip65504P1350S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1350S,IP_65504_P_1350_S_LEN)
                  ,beginIp65504P1350S
                  ,IP_65504_P_1350_S_LEN
                 );
            localIp65504P1350SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1350SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1350S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1350S() {	 
			return (getShort(beginIp65504P1350S));
   	}
         int localIp65504P1350LCounter = -1;
         public boolean isIp65504P1350LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1350LCounter != sharedCounter;
            localIp65504P1350LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1350_L_LEN = 2;
  	/**
	 * serializeIp65504P1350L
	 */
	protected void serializeIp65504P1350L(short ip65504P1350L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1350L,IP_65504_P_1350_L_LEN)
                  ,beginIp65504P1350L
                  ,IP_65504_P_1350_L_LEN
                 );
            localIp65504P1350LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1350LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1350L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1350L() {	 
			return (getShort(beginIp65504P1350L));
   	}
         int localIp65504P1351SCounter = -1;
         public boolean isIp65504P1351SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1351SCounter != sharedCounter;
            localIp65504P1351SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1351_S_LEN = 2;
  	/**
	 * serializeIp65504P1351S
	 */
	protected void serializeIp65504P1351S(short ip65504P1351S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1351S,IP_65504_P_1351_S_LEN)
                  ,beginIp65504P1351S
                  ,IP_65504_P_1351_S_LEN
                 );
            localIp65504P1351SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1351SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1351S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1351S() {	 
			return (getShort(beginIp65504P1351S));
   	}
         int localIp65504P1351LCounter = -1;
         public boolean isIp65504P1351LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1351LCounter != sharedCounter;
            localIp65504P1351LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1351_L_LEN = 2;
  	/**
	 * serializeIp65504P1351L
	 */
	protected void serializeIp65504P1351L(short ip65504P1351L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1351L,IP_65504_P_1351_L_LEN)
                  ,beginIp65504P1351L
                  ,IP_65504_P_1351_L_LEN
                 );
            localIp65504P1351LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1351LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1351L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1351L() {	 
			return (getShort(beginIp65504P1351L));
   	}
         int localIp65504P1352SCounter = -1;
         public boolean isIp65504P1352SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1352SCounter != sharedCounter;
            localIp65504P1352SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1352_S_LEN = 2;
  	/**
	 * serializeIp65504P1352S
	 */
	protected void serializeIp65504P1352S(short ip65504P1352S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1352S,IP_65504_P_1352_S_LEN)
                  ,beginIp65504P1352S
                  ,IP_65504_P_1352_S_LEN
                 );
            localIp65504P1352SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1352SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1352S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1352S() {	 
			return (getShort(beginIp65504P1352S));
   	}
         int localIp65504P1352LCounter = -1;
         public boolean isIp65504P1352LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1352LCounter != sharedCounter;
            localIp65504P1352LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1352_L_LEN = 2;
  	/**
	 * serializeIp65504P1352L
	 */
	protected void serializeIp65504P1352L(short ip65504P1352L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1352L,IP_65504_P_1352_L_LEN)
                  ,beginIp65504P1352L
                  ,IP_65504_P_1352_L_LEN
                 );
            localIp65504P1352LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1352LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1352L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1352L() {	 
			return (getShort(beginIp65504P1352L));
   	}
         int localIp65504P1353SCounter = -1;
         public boolean isIp65504P1353SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1353SCounter != sharedCounter;
            localIp65504P1353SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1353_S_LEN = 2;
  	/**
	 * serializeIp65504P1353S
	 */
	protected void serializeIp65504P1353S(short ip65504P1353S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1353S,IP_65504_P_1353_S_LEN)
                  ,beginIp65504P1353S
                  ,IP_65504_P_1353_S_LEN
                 );
            localIp65504P1353SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1353SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1353S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1353S() {	 
			return (getShort(beginIp65504P1353S));
   	}
         int localIp65504P1353LCounter = -1;
         public boolean isIp65504P1353LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1353LCounter != sharedCounter;
            localIp65504P1353LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1353_L_LEN = 2;
  	/**
	 * serializeIp65504P1353L
	 */
	protected void serializeIp65504P1353L(short ip65504P1353L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1353L,IP_65504_P_1353_L_LEN)
                  ,beginIp65504P1353L
                  ,IP_65504_P_1353_L_LEN
                 );
            localIp65504P1353LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1353LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1353L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1353L() {	 
			return (getShort(beginIp65504P1353L));
   	}
         int localIp65504P1354SCounter = -1;
         public boolean isIp65504P1354SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1354SCounter != sharedCounter;
            localIp65504P1354SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1354_S_LEN = 2;
  	/**
	 * serializeIp65504P1354S
	 */
	protected void serializeIp65504P1354S(short ip65504P1354S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1354S,IP_65504_P_1354_S_LEN)
                  ,beginIp65504P1354S
                  ,IP_65504_P_1354_S_LEN
                 );
            localIp65504P1354SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1354SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1354S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1354S() {	 
			return (getShort(beginIp65504P1354S));
   	}
         int localIp65504P1354LCounter = -1;
         public boolean isIp65504P1354LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1354LCounter != sharedCounter;
            localIp65504P1354LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1354_L_LEN = 2;
  	/**
	 * serializeIp65504P1354L
	 */
	protected void serializeIp65504P1354L(short ip65504P1354L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1354L,IP_65504_P_1354_L_LEN)
                  ,beginIp65504P1354L
                  ,IP_65504_P_1354_L_LEN
                 );
            localIp65504P1354LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1354LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1354L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1354L() {	 
			return (getShort(beginIp65504P1354L));
   	}
         int localIp65504P1355SCounter = -1;
         public boolean isIp65504P1355SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1355SCounter != sharedCounter;
            localIp65504P1355SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1355_S_LEN = 2;
  	/**
	 * serializeIp65504P1355S
	 */
	protected void serializeIp65504P1355S(short ip65504P1355S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1355S,IP_65504_P_1355_S_LEN)
                  ,beginIp65504P1355S
                  ,IP_65504_P_1355_S_LEN
                 );
            localIp65504P1355SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1355SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1355S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1355S() {	 
			return (getShort(beginIp65504P1355S));
   	}
         int localIp65504P1355LCounter = -1;
         public boolean isIp65504P1355LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1355LCounter != sharedCounter;
            localIp65504P1355LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1355_L_LEN = 2;
  	/**
	 * serializeIp65504P1355L
	 */
	protected void serializeIp65504P1355L(short ip65504P1355L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1355L,IP_65504_P_1355_L_LEN)
                  ,beginIp65504P1355L
                  ,IP_65504_P_1355_L_LEN
                 );
            localIp65504P1355LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1355LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1355L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1355L() {	 
			return (getShort(beginIp65504P1355L));
   	}
         int localIp65504P1356SCounter = -1;
         public boolean isIp65504P1356SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1356SCounter != sharedCounter;
            localIp65504P1356SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1356_S_LEN = 2;
  	/**
	 * serializeIp65504P1356S
	 */
	protected void serializeIp65504P1356S(short ip65504P1356S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1356S,IP_65504_P_1356_S_LEN)
                  ,beginIp65504P1356S
                  ,IP_65504_P_1356_S_LEN
                 );
            localIp65504P1356SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1356SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1356S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1356S() {	 
			return (getShort(beginIp65504P1356S));
   	}
         int localIp65504P1356LCounter = -1;
         public boolean isIp65504P1356LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1356LCounter != sharedCounter;
            localIp65504P1356LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1356_L_LEN = 2;
  	/**
	 * serializeIp65504P1356L
	 */
	protected void serializeIp65504P1356L(short ip65504P1356L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1356L,IP_65504_P_1356_L_LEN)
                  ,beginIp65504P1356L
                  ,IP_65504_P_1356_L_LEN
                 );
            localIp65504P1356LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1356LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1356L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1356L() {	 
			return (getShort(beginIp65504P1356L));
   	}
         int localIp65504P1357SCounter = -1;
         public boolean isIp65504P1357SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1357SCounter != sharedCounter;
            localIp65504P1357SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1357_S_LEN = 2;
  	/**
	 * serializeIp65504P1357S
	 */
	protected void serializeIp65504P1357S(short ip65504P1357S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1357S,IP_65504_P_1357_S_LEN)
                  ,beginIp65504P1357S
                  ,IP_65504_P_1357_S_LEN
                 );
            localIp65504P1357SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1357SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1357S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1357S() {	 
			return (getShort(beginIp65504P1357S));
   	}
         int localIp65504P1357LCounter = -1;
         public boolean isIp65504P1357LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1357LCounter != sharedCounter;
            localIp65504P1357LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1357_L_LEN = 2;
  	/**
	 * serializeIp65504P1357L
	 */
	protected void serializeIp65504P1357L(short ip65504P1357L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1357L,IP_65504_P_1357_L_LEN)
                  ,beginIp65504P1357L
                  ,IP_65504_P_1357_L_LEN
                 );
            localIp65504P1357LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1357LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1357L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1357L() {	 
			return (getShort(beginIp65504P1357L));
   	}
         int localIp65504P1358SCounter = -1;
         public boolean isIp65504P1358SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1358SCounter != sharedCounter;
            localIp65504P1358SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1358_S_LEN = 2;
  	/**
	 * serializeIp65504P1358S
	 */
	protected void serializeIp65504P1358S(short ip65504P1358S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1358S,IP_65504_P_1358_S_LEN)
                  ,beginIp65504P1358S
                  ,IP_65504_P_1358_S_LEN
                 );
            localIp65504P1358SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1358SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1358S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1358S() {	 
			return (getShort(beginIp65504P1358S));
   	}
         int localIp65504P1358LCounter = -1;
         public boolean isIp65504P1358LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1358LCounter != sharedCounter;
            localIp65504P1358LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1358_L_LEN = 2;
  	/**
	 * serializeIp65504P1358L
	 */
	protected void serializeIp65504P1358L(short ip65504P1358L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1358L,IP_65504_P_1358_L_LEN)
                  ,beginIp65504P1358L
                  ,IP_65504_P_1358_L_LEN
                 );
            localIp65504P1358LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1358LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1358L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1358L() {	 
			return (getShort(beginIp65504P1358L));
   	}
         int localIp65504P1359SCounter = -1;
         public boolean isIp65504P1359SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1359SCounter != sharedCounter;
            localIp65504P1359SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1359_S_LEN = 2;
  	/**
	 * serializeIp65504P1359S
	 */
	protected void serializeIp65504P1359S(short ip65504P1359S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1359S,IP_65504_P_1359_S_LEN)
                  ,beginIp65504P1359S
                  ,IP_65504_P_1359_S_LEN
                 );
            localIp65504P1359SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1359SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1359S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1359S() {	 
			return (getShort(beginIp65504P1359S));
   	}
         int localIp65504P1359LCounter = -1;
         public boolean isIp65504P1359LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1359LCounter != sharedCounter;
            localIp65504P1359LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1359_L_LEN = 2;
  	/**
	 * serializeIp65504P1359L
	 */
	protected void serializeIp65504P1359L(short ip65504P1359L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1359L,IP_65504_P_1359_L_LEN)
                  ,beginIp65504P1359L
                  ,IP_65504_P_1359_L_LEN
                 );
            localIp65504P1359LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1359LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1359L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1359L() {	 
			return (getShort(beginIp65504P1359L));
   	}
         int localIp65504P1360SCounter = -1;
         public boolean isIp65504P1360SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1360SCounter != sharedCounter;
            localIp65504P1360SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1360_S_LEN = 2;
  	/**
	 * serializeIp65504P1360S
	 */
	protected void serializeIp65504P1360S(short ip65504P1360S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1360S,IP_65504_P_1360_S_LEN)
                  ,beginIp65504P1360S
                  ,IP_65504_P_1360_S_LEN
                 );
            localIp65504P1360SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1360SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1360S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1360S() {	 
			return (getShort(beginIp65504P1360S));
   	}
         int localIp65504P1360LCounter = -1;
         public boolean isIp65504P1360LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1360LCounter != sharedCounter;
            localIp65504P1360LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1360_L_LEN = 2;
  	/**
	 * serializeIp65504P1360L
	 */
	protected void serializeIp65504P1360L(short ip65504P1360L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1360L,IP_65504_P_1360_L_LEN)
                  ,beginIp65504P1360L
                  ,IP_65504_P_1360_L_LEN
                 );
            localIp65504P1360LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1360LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1360L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1360L() {	 
			return (getShort(beginIp65504P1360L));
   	}
         int localIp65504P1361SCounter = -1;
         public boolean isIp65504P1361SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1361SCounter != sharedCounter;
            localIp65504P1361SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1361_S_LEN = 2;
  	/**
	 * serializeIp65504P1361S
	 */
	protected void serializeIp65504P1361S(short ip65504P1361S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1361S,IP_65504_P_1361_S_LEN)
                  ,beginIp65504P1361S
                  ,IP_65504_P_1361_S_LEN
                 );
            localIp65504P1361SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1361SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1361S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1361S() {	 
			return (getShort(beginIp65504P1361S));
   	}
         int localIp65504P1361LCounter = -1;
         public boolean isIp65504P1361LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1361LCounter != sharedCounter;
            localIp65504P1361LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1361_L_LEN = 2;
  	/**
	 * serializeIp65504P1361L
	 */
	protected void serializeIp65504P1361L(short ip65504P1361L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1361L,IP_65504_P_1361_L_LEN)
                  ,beginIp65504P1361L
                  ,IP_65504_P_1361_L_LEN
                 );
            localIp65504P1361LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1361LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1361L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1361L() {	 
			return (getShort(beginIp65504P1361L));
   	}
         int localIp65504P1362SCounter = -1;
         public boolean isIp65504P1362SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1362SCounter != sharedCounter;
            localIp65504P1362SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1362_S_LEN = 2;
  	/**
	 * serializeIp65504P1362S
	 */
	protected void serializeIp65504P1362S(short ip65504P1362S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1362S,IP_65504_P_1362_S_LEN)
                  ,beginIp65504P1362S
                  ,IP_65504_P_1362_S_LEN
                 );
            localIp65504P1362SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1362SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1362S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1362S() {	 
			return (getShort(beginIp65504P1362S));
   	}
         int localIp65504P1362LCounter = -1;
         public boolean isIp65504P1362LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1362LCounter != sharedCounter;
            localIp65504P1362LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1362_L_LEN = 2;
  	/**
	 * serializeIp65504P1362L
	 */
	protected void serializeIp65504P1362L(short ip65504P1362L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1362L,IP_65504_P_1362_L_LEN)
                  ,beginIp65504P1362L
                  ,IP_65504_P_1362_L_LEN
                 );
            localIp65504P1362LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1362LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1362L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1362L() {	 
			return (getShort(beginIp65504P1362L));
   	}
         int localIp65504P1363SCounter = -1;
         public boolean isIp65504P1363SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1363SCounter != sharedCounter;
            localIp65504P1363SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1363_S_LEN = 2;
  	/**
	 * serializeIp65504P1363S
	 */
	protected void serializeIp65504P1363S(short ip65504P1363S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1363S,IP_65504_P_1363_S_LEN)
                  ,beginIp65504P1363S
                  ,IP_65504_P_1363_S_LEN
                 );
            localIp65504P1363SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1363SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1363S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1363S() {	 
			return (getShort(beginIp65504P1363S));
   	}
         int localIp65504P1363LCounter = -1;
         public boolean isIp65504P1363LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1363LCounter != sharedCounter;
            localIp65504P1363LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1363_L_LEN = 2;
  	/**
	 * serializeIp65504P1363L
	 */
	protected void serializeIp65504P1363L(short ip65504P1363L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1363L,IP_65504_P_1363_L_LEN)
                  ,beginIp65504P1363L
                  ,IP_65504_P_1363_L_LEN
                 );
            localIp65504P1363LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1363LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1363L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1363L() {	 
			return (getShort(beginIp65504P1363L));
   	}
         int localIp65504P1364SCounter = -1;
         public boolean isIp65504P1364SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1364SCounter != sharedCounter;
            localIp65504P1364SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1364_S_LEN = 2;
  	/**
	 * serializeIp65504P1364S
	 */
	protected void serializeIp65504P1364S(short ip65504P1364S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1364S,IP_65504_P_1364_S_LEN)
                  ,beginIp65504P1364S
                  ,IP_65504_P_1364_S_LEN
                 );
            localIp65504P1364SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1364SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1364S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1364S() {	 
			return (getShort(beginIp65504P1364S));
   	}
         int localIp65504P1364LCounter = -1;
         public boolean isIp65504P1364LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1364LCounter != sharedCounter;
            localIp65504P1364LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1364_L_LEN = 2;
  	/**
	 * serializeIp65504P1364L
	 */
	protected void serializeIp65504P1364L(short ip65504P1364L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1364L,IP_65504_P_1364_L_LEN)
                  ,beginIp65504P1364L
                  ,IP_65504_P_1364_L_LEN
                 );
            localIp65504P1364LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1364LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1364L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1364L() {	 
			return (getShort(beginIp65504P1364L));
   	}




}
  
